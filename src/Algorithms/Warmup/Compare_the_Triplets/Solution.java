package Algorithms.Warmup.Compare_the_Triplets;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int a = 0, b = 0;
        if (a0 != b0)
            if (a0 < b0)
                b++;
            else
                a++;
        if (a1 != b1)
            if (a1 < b1)
                b++;
            else
                a++;
        if (a2 != b2)
            if (a2 < b2)
                b++;
            else
                a++;
        System.out.println(a + " " + b);

    }
}
