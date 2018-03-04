package Algorithms.Strings.Pangrams;

import java.util.Scanner;

public class Solution {

    static boolean checkForPangram(String s) {
        int count = 0;
        int arr[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetter(c))
                if (arr[Character.toLowerCase(c) - 'a']++ == 0)
                    count++;
        }
        return count == 26;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        boolean isPangram = checkForPangram(sentence);
        System.out.println((isPangram ? "" : "not ") + "pangram");
    }
}
