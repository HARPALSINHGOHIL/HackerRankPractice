package Algorithms.Warmup.Plus_Minus;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ar[] = new int[n];
        double posno = 0, negno = 0, zero = 0;
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
            if (ar[i] > 0)
                posno++;
            else if (ar[i] == 0)
                zero++;
            else
                negno++;
        }
        System.out.println(posno / n);
        System.out.println(negno / n);
        System.out.println(zero / n);
    }
}
