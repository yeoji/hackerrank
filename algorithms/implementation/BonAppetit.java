import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BonAppetit {

    static void bonAppetit(int n, int k, int b, int[] ar) {
        // Complete this function
        int total = Arrays.stream(ar).sum();
        if(b == total/2) {
            System.out.println(ar[k]/2);
        } else {
            System.out.println("Bon Appetit");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int b = in.nextInt();
        bonAppetit(n, k, b, ar);
    }
}
