package Algorithms.Strings.Super_Reduced_String;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String super_reduced_string(String s) {
        StringBuilder sb = new StringBuilder(s);
        int index = 0;
        for (int i = 0; i < s.length() - 1; i++, index++)
            if (sb.charAt(index) == sb.charAt(index + 1)) {
                sb.delete(index, index-- + 2);
                i++;
            }
        if (sb.toString().equals(s))
            return sb.length() == 0 ? "Empty String" : sb.toString();
        else
            return super_reduced_string(sb.toString());
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = super_reduced_string(s);
        System.out.println(result);
    }
}