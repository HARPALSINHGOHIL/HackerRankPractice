package Algorithms.Strings.Strong_Password;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
        int minimumLength = 6;
        Boolean arr[] = {false, false, false, false};
        for (int i = 0; i < n; i++) {
            char c = password.charAt(i);
            if (Character.isUpperCase(c))
                arr[0] = true;
            else if (Character.isLowerCase(c))
                arr[1] = true;
            else if (Character.isDigit(c))
                arr[2] = true;
            else
                arr[3] = true;
        }
        int countTrue = 0;
        for (int i = 0; i < arr.length; i++)
            if (arr[i])
                countTrue++;

        int remainingConditions = arr.length - countTrue;
        return (minimumLength <= n) ? remainingConditions : Math.max(remainingConditions, minimumLength - n);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String password = in.next();
        int answer = minimumNumber(n, password);
        System.out.println(answer);
        in.close();
    }
}