package Algorithms.Warmup.Diagonal_Difference;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int finalSum = 0;
        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
                if (i == j)
                    finalSum += arr[i][j];
                if (i + j == (n - 1))
                    finalSum -= arr[i][j];
            }
        }
        System.out.println(Math.abs(finalSum));
    }
}