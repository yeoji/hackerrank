import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BreakingTheRecords {

    static int[] getRecord(int[] scores){
        // Complete this function
        int high = scores[0], low = scores[0];
        int numHighs = 0, numLows = 0;

        for(int s : scores) {
            if(s > high) {
                high = s;
                numHighs++;
            } else if(s < low) {
                low = s;
                numLows++;
            }
        }
        return new int[]{numHighs, numLows};
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int[] result = getRecord(s);
        String separator = "", delimiter = " ";
        for (Integer val : result) {
            System.out.print(separator + val);
            separator = delimiter;
        }
        System.out.println("");
    }
}
