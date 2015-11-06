package jparsec.time.calendar;

public class EgyptianTest {
    /**
     * For unit testing only.
     *
     * @param args Not used.
     */
    public static void main(final String args[]) throws Exception {
        System.out.println("Egyptian Test");

        double jd = new Gregorian(2010, 1, 12).julianDate;
        long fixed = new Gregorian(2010, 1, 12).fixed;

        Egyptian h = new Egyptian(jd);
        System.out.println("JD " + h.julianDate + ' ' + h.fixed + " = " + h);

        Egyptian h2 = new Egyptian(h.year, h.month, h.day);
        System.out.println("JD " + h2.julianDate + ' ' + h2.fixed + " = " + h2);

        System.out.println(Julian.toFixed(-747, 2, 26));
        System.out.println(Calendar.fixedFromJD(1448638D));

        //System.out.println(Calendar.nameFromMonth(h2.month, Egyptian.MONTH_NAMES));
        //System.out.println(CalendarGenericConversion.getDayOfWeekName(jd, CalendarGenericConversion.EGYPTIAN));
    }
}
