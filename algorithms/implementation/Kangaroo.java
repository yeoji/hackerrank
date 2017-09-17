import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Kangaroo {

    static String kangaroo(int x1, int v1, int x2, int v2) {
        // if startingLoc is less, the jump rate has to be faster
        boolean hasPotential = (x1 < x2 && v1 > v2);
        if(hasPotential) {
            // stop once the first kangaroo's loc is greater than second kangaroo's loc
            while(x1 < x2) {
                x1 += v1;
                x2 += v2;
                if(x1 == x2) {
                    return "YES";
                }
            }
        }
        return "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
    }
}
