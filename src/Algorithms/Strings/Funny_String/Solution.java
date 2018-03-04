package Algorithms.Strings.Funny_String;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String funnyString(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        for (int i = 0; i <= s.length() / 2; i++) {
            int abs1 = Math.abs(s.charAt(i) - s.charAt(i + 1));
            int abs2 = Math.abs(sb.charAt(i) - sb.charAt(i + 1));
            if (abs1 != abs2)
                return "Not Funny";
        }
        return "Funny";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for (int a0 = 0; a0 < q; a0++) {
            String s = in.next();
            String result = funnyString(s);
            System.out.println(result);
        }
    }
}

