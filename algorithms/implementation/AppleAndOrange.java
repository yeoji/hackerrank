import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AppleAndOrange {

    private static void calculateFruitsOnHouse(int s, int t, int treePos, int[] fruitsDelta) {
        int onHouse = 0;
        for(int fruitDelta : fruitsDelta) {
            int fruitPos = treePos + fruitDelta;
            if(fruitPos >= s && fruitPos <= t) {
                onHouse++;
            }
        }
        System.out.println(onHouse);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        calculateFruitsOnHouse(s, t, a, apple);

        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }
        calculateFruitsOnHouse(s, t, b, orange);
    }
}
