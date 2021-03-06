package Algorithms.Implementation.Kangaroo;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String kangaroo(int x1, int v1, int x2, int v2) {
        if (x1 == x2)
            return "YES";
        if (v1 == v2)
            return "NO";
        if (v1 < v2) {
            if (x1 < x2)
                return "NO";
            else
                return kangaroo(x1 + v1, v1, x2 + v2, v2);
        } else {
            if (x1 > x2)
                return "NO";
            else
                return kangaroo(x1 + v1, v1, x2 + v2, v2);
        }
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