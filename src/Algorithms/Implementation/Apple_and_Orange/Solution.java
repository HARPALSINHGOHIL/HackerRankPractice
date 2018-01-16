package Algorithms.Implementation.Apple_and_Orange;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void appleAndOrange(int s, int t, int a, int b, int[] apple, int[] orange) {
        int appleCount = 0;
        for (int i = 0; i < apple.length; i++)
            if (s <= a + apple[i] && a + apple[i] <= t)
                appleCount++;
        System.out.println(appleCount);

        int orangeCount = 0;
        for (int i = 0; i < orange.length; i++)
            if (s <= b + orange[i] && b + orange[i] <= t)
                orangeCount++;
        System.out.println(orangeCount);
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
        for (int apple_i = 0; apple_i < m; apple_i++) {
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for (int orange_i = 0; orange_i < n; orange_i++) {
            orange[orange_i] = in.nextInt();
        }

        appleAndOrange(s, t, a, b, apple, orange);

        in.close();
    }
}
