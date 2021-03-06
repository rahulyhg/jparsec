package jparsec.ephem.probes;

import java.util.ArrayList;
import jparsec.ephem.EphemerisElement;
import jparsec.ephem.Functions;
import jparsec.ephem.Target;
import jparsec.graph.DataSet;
import jparsec.io.ReadFile;
import jparsec.math.Constant;
import jparsec.observer.City;
import jparsec.observer.Observatory;
import jparsec.observer.ObserverElement;
import jparsec.time.AstroDate;
import jparsec.time.TimeElement;
import jparsec.time.TimeFormat;
import jparsec.time.TimeScale;

public class SDP8_SGP8Test {
    /**
     * Test program.
     *
     * @param args Not used.
     */
    public static void main(String args[]) throws Exception {
        AstroDate astro = new AstroDate(2011, AstroDate.OCTOBER, 27, 13, 29, 0);
        TimeElement time = new TimeElement(astro, TimeElement.SCALE.LOCAL_TIME);
        ObserverElement observer = ObserverElement.parseCity(City.findCity("Madrid"));

        SatelliteEphem.setSatellitesFromExternalFile(DataSet.arrayListToStringArray(ReadFile.readAnyExternalFile("/home/alonso/eclipse/libreria_jparsec/ephem/test/visual.txt")));
        String name = "ISS";
        int index = SatelliteEphem.getArtificialSatelliteTargetIndex(name);

        EphemerisElement eph = new EphemerisElement(
            Target.TARGET.NOT_A_PLANET,
            EphemerisElement.COORDINATES_TYPE.APPARENT,
            EphemerisElement.EQUINOX_OF_DATE,
            EphemerisElement.TOPOCENTRIC,
            EphemerisElement.REDUCTION_METHOD.IAU_2006,
            EphemerisElement.FRAME.ICRF);
        eph.algorithm = EphemerisElement.ALGORITHM.ARTIFICIAL_SATELLITE;

        eph.targetBody.setIndex(index);
        SatelliteEphemElement ephem = SDP4_SGP4.satEphemeris(time, observer, eph, true);

        name = SatelliteEphem.getArtificialSatelliteName(index);
        double JD = TimeScale.getJD(time, observer, eph, TimeElement.SCALE.TERRESTRIAL_TIME);
        System.out.println("JD " + JD + " / index " + index);
        System.out.println("Using PLAN-13 by J. Miller");
        System.out.println("" + name + " RA: " + Functions.formatRA(ephem.rightAscension));
        System.out.println("" + name + " DEC: " + Functions.formatDEC(ephem.declination));
        System.out.println("" + name + " dist: " + ephem.distance);
        System.out.println("" + name + " elong: " + ephem.elongation * Constant.RAD_TO_DEG);
        System.out.println("" + name + " azi: " + ephem.azimuth * Constant.RAD_TO_DEG);
        System.out.println("" + name + " alt: " + ephem.elevation * Constant.RAD_TO_DEG);
        System.out.println("" + name + " ilum: " + ephem.illumination);
        System.out.println("" + name + " sub. E. lon:  " + Functions.formatAngle(ephem.subEarthLongitude, 3));
        System.out.println("" + name + " sub. E. lat:  " + Functions.formatAngle(ephem.subEarthLatitude, 3));
        System.out.println("" + name + " sub. E. dist: " + ephem.subEarthDistance);
        System.out.println("" + name + " speed: " + ephem.topocentricSpeed);
        System.out.println("" + name + " revolution: " + ephem.revolutionsCompleted);
        System.out.println("" + name + " eclipsed: " + ephem.isEclipsed);
        System.out.println("" + name + " next pass: " + TimeFormat.formatJulianDayAsDateAndTime(Math.abs(ephem.nextPass), TimeElement.SCALE.LOCAL_TIME));

        if (ephem.rise != null) {
            for (int i = 0; i < ephem.rise.length; i++) {
                System.out.println("RISE:      " + TimeFormat.formatJulianDayAsDateAndTime(ephem.rise[i], TimeElement.SCALE.LOCAL_TIME));
                System.out.println("TRANSIT:   " + TimeFormat.formatJulianDayAsDateAndTime(ephem.transit[i], TimeElement.SCALE.LOCAL_TIME));
                System.out.println("MAX_ELEV:  " + Functions.formatAngle(ephem.transitElevation[i], 3));
                System.out.println("SET:       " + TimeFormat.formatJulianDayAsDateAndTime(ephem.set[i], TimeElement.SCALE.LOCAL_TIME));
            }
        }

        // Now the same with SDP8/SGP8
        System.out.println();
        System.out.println("Using SDP8/SGP8");
        //SDP8 s = new SDP8(SatelliteEphem.getArtificialSatelliteOrbitalElement(index));
        //ephem = s.calcSatellite(time, observer, eph);
        ephem = SDP8_SGP8.satEphemeris(time, observer, eph, true);
        System.out.println("" + name + " RA: " + Functions.formatRA(ephem.rightAscension));
        System.out.println("" + name + " DEC: " + Functions.formatDEC(ephem.declination));
        System.out.println("" + name + " dist: " + ephem.distance);
        System.out.println("" + name + " elong: " + ephem.elongation * Constant.RAD_TO_DEG);
        System.out.println("" + name + " azi: " + ephem.azimuth * Constant.RAD_TO_DEG);
        System.out.println("" + name + " alt: " + ephem.elevation * Constant.RAD_TO_DEG);
        System.out.println("" + name + " ilum: " + ephem.illumination);
        System.out.println("" + name + " sub. E. lon:  " + Functions.formatAngle(ephem.subEarthLongitude, 3));
        System.out.println("" + name + " sub. E. lat:  " + Functions.formatAngle(ephem.subEarthLatitude, 3));
        System.out.println("" + name + " sub. E. dist: " + ephem.subEarthDistance);
        System.out.println("" + name + " speed: " + ephem.topocentricSpeed);
        System.out.println("" + name + " revolution: " + ephem.revolutionsCompleted);
        System.out.println("" + name + " eclipsed: " + ephem.isEclipsed);
        System.out.println("" + name + " next pass: " + TimeFormat.formatJulianDayAsDateAndTime(Math.abs(ephem.nextPass), TimeElement.SCALE.LOCAL_TIME));

        if (ephem.rise != null) {
            for (int i = 0; i < ephem.rise.length; i++) {
                System.out.println("RISE:      " + TimeFormat.formatJulianDayAsDateAndTime(ephem.rise[i], TimeElement.SCALE.LOCAL_TIME));
                System.out.println("TRANSIT:   " + TimeFormat.formatJulianDayAsDateAndTime(ephem.transit[i], TimeElement.SCALE.LOCAL_TIME));
                System.out.println("MAX_ELEV:  " + Functions.formatAngle(ephem.transitElevation[i], 3));
                System.out.println("SET:       " + TimeFormat.formatJulianDayAsDateAndTime(ephem.set[i], TimeElement.SCALE.LOCAL_TIME));
            }
        }

        // TEST IRIDIUM FLARES
        // Download from http://www.tle.info/data/iridium.txt
        SatelliteEphem.setSatellitesFromExternalFile(DataSet.arrayListToStringArray(ReadFile.readAnyExternalFile("/home/alonso/eclipse/libreria_jparsec/ephem/test/iridium.txt")));

        //name = "IRIDIUM 31";
        //astro = new AstroDate(2011, AstroDate.OCTOBER, 26, 14, 51, 21);
        //name = "IRIDIUM 5";
        //astro = new AstroDate(2011, AstroDate.OCTOBER, 26, 16, 47, 42);
        name = "IRIDIUM 62";
        astro = new AstroDate(2011, AstroDate.OCTOBER, 27, 9, 24, 38);

        time = new TimeElement(astro, TimeElement.SCALE.UNIVERSAL_TIME_UTC);
        observer = ObserverElement.parseObservatory(Observatory.findObservatorybyCode(1169));

        System.out.println("");
        System.out.println("Testing iridium flares");
        index = SatelliteEphem.getArtificialSatelliteTargetIndex(name);
        eph.targetBody.setIndex(index);
        SDP8_SGP8 s = new SDP8_SGP8(SatelliteEphem.getArtificialSatelliteOrbitalElement(index));
        ephem = s.calcSatellite(time, observer, eph);
        System.out.println("" + name + " RA: " + Functions.formatRA(ephem.rightAscension));
        System.out.println("" + name + " DEC: " + Functions.formatDEC(ephem.declination));
        System.out.println("" + name + " dist: " + ephem.distance);
        System.out.println("" + name + " elong: " + ephem.elongation * Constant.RAD_TO_DEG);
        System.out.println("" + name + " azi: " + ephem.azimuth * Constant.RAD_TO_DEG);
        System.out.println("" + name + " alt: " + ephem.elevation * Constant.RAD_TO_DEG);
        System.out.println("" + name + " ilum: " + ephem.illumination);
        System.out.println("" + name + " sub. E. lon:  " + Functions.formatAngle(ephem.subEarthLongitude, 3));
        System.out.println("" + name + " sub. E. lat:  " + Functions.formatAngle(ephem.subEarthLatitude, 3));
        System.out.println("" + name + " sub. E. dist: " + ephem.subEarthDistance);
        System.out.println("" + name + " speed: " + ephem.topocentricSpeed);
        System.out.println("" + name + " revolution: " + ephem.revolutionsCompleted);
        System.out.println("" + name + " eclipsed: " + ephem.isEclipsed);
        System.out.println("" + name + " iridium angle: " + ephem.iridiumAngle);
        System.out.println("" + name + " next pass: " + TimeFormat.formatJulianDayAsDateAndTime(Math.abs(ephem.nextPass), TimeElement.SCALE.LOCAL_TIME));

        astro = new AstroDate(2011, AstroDate.OCTOBER, 26, 12, 0, 0);
        time = new TimeElement(astro, TimeElement.SCALE.UNIVERSAL_TIME_UTC);
        double min_elevation = 0.0, maxDays = 1.0;
        int precision = 5;
        boolean current = true;
        long t0 = System.currentTimeMillis();
        int nmax = SatelliteEphem.getArtificialSatelliteCount();
        eph.correctForEOP = false;

        for (int n = 0; n < nmax; n++) {
            eph.targetBody.setIndex(n);
            s = new SDP8_SGP8(SatelliteEphem.getArtificialSatelliteOrbitalElement(n));
            ArrayList<Object[]> flares = SDP8_SGP8.getNextIridiumFlares(time, observer, eph, s.getSat(), min_elevation, maxDays, current, precision);

            if (flares != null) {
                for (int i = 0; i < flares.size(); i++) {
                    Object o[] = flares.get(i);
                    SatelliteEphemElement start = (SatelliteEphemElement) o[4];
                    SatelliteEphemElement end = (SatelliteEphemElement) o[5];
                    SatelliteEphemElement max = (SatelliteEphemElement) o[6];
                    String fs = " (" + Functions.formatAngleAsDegrees(start.azimuth, 1) + ", " + Functions.formatAngleAsDegrees(start.elevation, 1) + ")";
                    String fe = " (" + Functions.formatAngleAsDegrees(end.azimuth, 1) + ", " + Functions.formatAngleAsDegrees(end.elevation, 1) + ")";
                    String fm = " (" + Functions.formatAngleAsDegrees(max.azimuth, 1) + ", " + Functions.formatAngleAsDegrees(max.elevation, 1) + ")";
                    System.out.println(SatelliteEphem.getArtificialSatelliteName(n) + ": " + TimeFormat.formatJulianDayAsDateAndTime((Double) o[0], null) + fs + "/" + TimeFormat.formatJulianDayAsDateAndTime((Double) o[1], null) + fe + "/" + TimeFormat.formatJulianDayAsDateAndTime((Double) o[2], null) + fm + "/" + (Double) o[3]);
                }

                if (flares.isEmpty())
                    System.out.println(SatelliteEphem.getArtificialSatelliteName(n));
            } else {
                System.out.println(SatelliteEphem.getArtificialSatelliteName(n));
            }
        }

        long t1 = System.currentTimeMillis();
        System.out.println("Done in " + (float) ((t1 - t0) / 1000.0) + "s");

        /*
Test data from http://www.chiandh.me.uk/ephem/iriday.shtml (2011, 10, 26)
name			start	(hour, azimut 0=N, elevation)		peak			end
IRIDIUM 31 [+] 14:51:18  258.5 &deg;  42.6 &deg;  14:51:21  257.0 &deg;  42.3 &deg;  1.7 &deg;  14:51:25  255.0 &deg;  41.9 &deg;
IRIDIUM  5 [+] 16:47:33  212.1 &deg;  31.4 &deg;  16:47:42  210.5 &deg;  29.8 &deg;  0.2 &deg;  16:47:52  209.0 &deg;  28.1 &deg;
IRIDIUM  4 [+] 04:49:01    7.8 &deg;  27.5 &deg;  04:49:12    7.6 &deg;  25.6 &deg;  1.5 &deg;  04:49:25    7.4 &deg;  23.5 &deg;
IRIDIUM 56 [+] 06:59:41    2.6 &deg;  68.2 &deg;  06:59:45    2.7 &deg;  66.3 &deg;  0.9 &deg;  06:59:49    2.9 &deg;  64.5 &deg;
IRIDIUM 17 [-] 09:02:33  187.2 &deg;  77.2 &deg;  09:02:35  187.5 &deg;  78.3 &deg;  1.7 &deg;  09:02:37  187.8 &deg;  79.3 &deg;
IRIDIUM 62 [+] 09:24:33   92.4 &deg;  60.2 &deg;  09:24:38   97.0 &deg;  59.7 &deg;  0.4 &deg;  09:24:43  101.5 &deg;  59.0 &deg;
         */
    }
}
