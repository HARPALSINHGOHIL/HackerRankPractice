package Algorithms.Strings.Two_Characters;

import com.sun.corba.se.impl.oa.poa.ActiveObjectMap;

import javax.swing.*;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String removeNotPossibleCharacter(String s) {
        if (s.length() <= 1)
            return s;
        int i = 1;
        for (; i < s.length(); i++)
            if (s.charAt(i - 1) == s.charAt(i))
                break;
        if (i == s.length())
            return s;
        else
            return removeNotPossibleCharacter(s.replaceAll(s.charAt(i - 1) + "", ""));
    }

    static String getStringOfCustomChar(String s, char a, char b) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray())
            if (c == a || c == b)
                sb.append(c);
        return sb.toString();
    }

    static boolean stringSatisfyConstraint(String s) {
        char c = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == c)
                return false;
            c = s.charAt(i);
        }
        return true;
    }


    static int twoCharaters(String s) {
        // Complete this function
        s = removeNotPossibleCharacter(s);
        if (s.length() <= 1)
            return 0;
        Map<Character, Integer> myMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (myMap.containsKey(c))
                myMap.put(c, myMap.get(c) + 1);
            else
                myMap.put(c, 1);
        }
        int maxLength = 0;
        for (Character i : myMap.keySet()) {
            for (Character j : myMap.keySet()) {
                if (i == j)
                    continue;
                int len1 = myMap.get(i);
                int len2 = myMap.get(j);
                int diff = Math.abs(len1 - len2);
                if (diff > 1)
                    continue;
                String ij = getStringOfCustomChar(s, i, j);
                if (stringSatisfyConstraint(ij))
                    maxLength = maxLength < ij.length() ? ij.length() : maxLength;
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        String s = in.next();
        int result = twoCharaters(s);
        System.out.println(result);
        in.close();
    }
}