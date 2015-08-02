package jparsec.util;

import java.io.BufferedInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.FileTime;
import java.util.Date;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.DateUtils;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class ProcessSKY {
    /**
     * The url used to update the Padova-Asiago SN catalogue.
     */
    public static final String URL_PADOVA_ASIAGO_SN_CAT = "http://graspa.oapd.inaf.it/asnc/cat.txt";
    /**
     * The url used to update the galactic novae SN catalogue.
     */
    public static final String URL_NOVAE = "http://projectpluto.com/galnovae/galnovae.txt";

    public static void main(String[] args) throws Exception {
        Path targetDir = Paths.get(args[0]);
        Files.createDirectories(targetDir);

        CloseableHttpClient hc = HttpClients.createDefault();

        saveFileFromURL(hc, targetDir, URL_PADOVA_ASIAGO_SN_CAT, "Padova-Asiago sn cat.txt");
        saveFileFromURL(hc, targetDir, URL_NOVAE, "galnovae.txt");
    }

    private static void saveFileFromURL(CloseableHttpClient hc, Path path, String url, String catalogName) throws Exception {
        HttpGet get = new HttpGet(url);
        CloseableHttpResponse response = hc.execute(get);
        HttpEntity entity = response.getEntity();

        long length = entity.getContentLength();
        Path outFile = path.resolve(catalogName);

        if (Files.notExists(outFile) || length != Files.size(outFile)) {
            BufferedInputStream bis = new BufferedInputStream(entity.getContent());
            Files.copy(bis, outFile, StandardCopyOption.REPLACE_EXISTING);
        }

        EntityUtils.consume(entity);

        Header header = response.getFirstHeader("Last-Modified");
        String lastModified = header.getValue();
        Date date = DateUtils.parseDate(lastModified);
        FileTime time = FileTime.from(date.toInstant());
        Files.setLastModifiedTime(outFile, time);
    }
}
