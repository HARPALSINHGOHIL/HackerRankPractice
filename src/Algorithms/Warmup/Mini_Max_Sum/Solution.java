package Algorithms.Warmup.Mini_Max_Sum;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] ar = new int[5];
        for (int arr_i = 0; arr_i < 5; arr_i++) {
            ar[arr_i] = in.nextInt();
        }
        int max = ar[0];
        int min = ar[0];
        long sum = ar[0];
        for (int i = 1; i < 5; i++) {
            if (ar[i] > max)
                max = ar[i];
            if (ar[i] < min)
                min = ar[i];
            sum += ar[i];
        }
        System.out.println((sum - max) + " " + (sum - min));
    }
}
