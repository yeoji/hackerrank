import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BetweenTwoSets {

    private static boolean checkBetweenSets(int[] aArr, int[] bArr, int num) {
        for(int a : aArr) {
            if(num % a != 0) return false;
        }

        for(int b : bArr) {
            if(b % num != 0) return false;
        }

        return true;
    }

    static int getTotalX(int[] a, int[] b) {
        // Complete this function
        int min = a[a.length - 1];
        int max = b[0];

        int betweenSets = 0;
        for(int i=min; i<=max; i++) {
            if(checkBetweenSets(a, b, i)) {
                betweenSets++;
            }
        }
        return betweenSets;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i = 0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        int total = getTotalX(a, b);
        System.out.println(total);
        in.close();
    }
}
