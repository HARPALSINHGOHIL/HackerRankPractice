package Algorithms.Strings.HackerRank_in_a_String;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static boolean usingRegex(String s, String word) {
        String regWord = "[a-zA-z]*";
        for (int i = 0; i < word.length(); i++)
            regWord += word.charAt(i) + "[a-zA-z]*";
        return Pattern.matches(regWord, s);
    }

    static String hackerrankInString(String s) {
        boolean flag = usingRegex(s, "hackerrank");
        return flag ? "YES" : "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for (int a0 = 0; a0 < q; a0++) {
            String s = in.next();
            String result = hackerrankInString(s);
            System.out.println(result);
        }
        in.close();
    }
}