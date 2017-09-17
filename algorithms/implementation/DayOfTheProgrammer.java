import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DayOfTheProgrammer {

    private static String leapYr = "12.09.";
    private static String normalYr = "13.09.";
    private static String switchYr = "";

    private static String getJulianProgrammerDay(int year) {
        if(year % 4 == 0) {
            // leap year!
            return leapYr + year;
        }
        return normalYr + year;
    }

    private static String getGregorianProgrammerDay(int year) {
        if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            return leapYr + year;
        }
        return normalYr + year;
    }

    static String solve(int year){
        // Complete this function
        if(year < 1918) {
            return getJulianProgrammerDay(year);
        } else if(year == 1918) {
            // switchover day
            // feb 14 is the 32nd day of the year
            if(switchYr.isEmpty()) {
                int[] remainingDays = new int[]{0, 14, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
                int currDay = 32;
                for(int i=0; i<remainingDays.length; i++) {
                    currDay += remainingDays[i];
                    if(currDay >= 256) {
                        int excess = currDay - 256;
                        int day = remainingDays[i] - excess;
                        Calendar c = new GregorianCalendar(year, i, day);
                        switchYr = String.format("%1$td.%1$tm.%1$tY", c);
                        break;
                    }
                }
            }
            return switchYr;
        }
        return getGregorianProgrammerDay(year);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        String result = solve(year);
        System.out.println(result);
    }
}
