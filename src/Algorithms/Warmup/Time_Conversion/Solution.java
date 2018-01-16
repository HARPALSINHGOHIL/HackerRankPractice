package Algorithms.Warmup.Time_Conversion;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String timeConversion(String s) {
        String tim = s.substring(0, s.length() - 2);
        String arr[] = tim.split(":");
        String ampm = s.substring(s.length() - 2);

        int addition = 0;
        if (ampm.equals("AM") && arr[0].equals("12"))
            addition = -12;
        else if (ampm.equals("PM") && (!arr[0].equals("12")))
            addition = 12;

        int hh = Integer.parseInt(arr[0]);
        hh += addition;

        arr[0] = String.valueOf(hh);
        if (arr[0].length() == 1) {
            arr[0] = "0" + arr[0];
        }
        return String.join(":", arr);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
