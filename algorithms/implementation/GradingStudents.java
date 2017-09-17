import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class GradingStudents {

    private static int calculateRoundedGrade(int grade) {
        if(grade >= 38) {
            int nextMultiple = (int) (Math.ceil(grade/5.0) * 5);
            if(nextMultiple - grade < 3) {
                return nextMultiple;
            }
        }
        return grade;
    }

    static int[] solve(int[] grades){
        // Complete this function
        int[] results = new int[grades.length];
        for(int i = 0; i < grades.length; i++) {
            results[i] = calculateRoundedGrade(grades[i]);
        }
        return results;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");


    }
}
