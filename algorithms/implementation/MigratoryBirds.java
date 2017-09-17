import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.stream.Collectors;

public class MigratoryBirds {

    static int migratoryBirds(int n, int[] ar) {
        // Complete this function
        int[] birds = new int[5];
        for(int type : ar) {
            birds[type-1]++;
        }

        List birdsList = Arrays.stream(birds).boxed().collect(Collectors.toList());
        return birdsList.indexOf(Collections.max(birdsList)) + 1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }
}
