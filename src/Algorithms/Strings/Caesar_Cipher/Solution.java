package Algorithms.Strings.Caesar_Cipher;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String caesarCipher(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray())
            if (Character.isUpperCase(c))
                sb.append((char) (((c - 'A' + k) % 26) + 'A'));
            else if (Character.isLowerCase(c))
                sb.append((char) (((c - 'a' + k) % 26) + 'a'));
            else sb.append(c);
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int k = in.nextInt();
        String result = caesarCipher(s, k);
        System.out.println(result);
        in.close();
    }
}