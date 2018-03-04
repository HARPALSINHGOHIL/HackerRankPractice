package Algorithms.Strings.Mars_Exploration;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int marsExploration(String s) {
        String matchSting = "SOS";
        int distortedCharacters = 0;
        for (int i = 0; i < s.length(); i++) {
            char matchingChar = matchSting.charAt(i % 3);
            if (matchingChar!=s.charAt(i))
                distortedCharacters++;
        }
        return distortedCharacters;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int result = marsExploration(s);
        System.out.println(result);
        in.close();
    }
}
