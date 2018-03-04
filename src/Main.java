import java.util.Scanner;

public class Main {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(removeNotPossibleCharacter(s));
    }
}
