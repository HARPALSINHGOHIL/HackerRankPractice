package Algorithms.Strings.Separate_the_Numbers;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String separateNumbers(String s) {
        for (int i = 1; i <= s.length() / 2; i++) {
            int index = i;
            int increment = i;
            Long a = Long.parseLong(s.substring(0, increment));
            if (!String.valueOf(a).equals(s.substring(0, increment)))
                continue;
            while (index + increment <= s.length()) {
                if (a % 10 == 9)
                    increment = String.valueOf(a + 1).length();
                Long temp = Long.parseLong(s.substring(index, index + increment));
                if (a + 1 != temp)
                    break;
                index += increment;
                a = temp;
            }
            if (index == s.length())
                return "YES " + s.substring(0, i);
        }
        return "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for (int a0 = 0; a0 < q; a0++) {
            String s = in.next();
            System.out.println(separateNumbers(s));
        }
        in.close();
    }
}