package Algorithms.Strings.Weighted_Uniform_Strings;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int arr[] = new int[26];
        int max = 1;
        char lc = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            char c = s.charAt(i);
            if (lc == c) {
                max++;
            } else {
                arr[lc - 'a'] = Math.max(max, arr[lc - 'a']);
                max = 1;
                lc = c;
            }
        }
        arr[lc - 'a'] = Math.max(max, arr[lc - 'a']);
        Set<Integer> weightSets=new HashSet<>();
        for (int i=0;i<26;i++)
            for(int j=1;j<=arr[i];j++)
                weightSets.add(j*(i+1));
        int n = in.nextInt();
        for (int a0 = 0; a0 < n; a0++) {
            int x = in.nextInt();
            System.out.println(weightSets.contains(x) ? "Yes" : "No");
        }
    }
}
