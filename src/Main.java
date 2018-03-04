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
        String s1 = "hackerrank";
        int index1=s1.indexOf('r');//returns the index of is substring
        int index2=s1.indexOf('r',index1+1);//returns the index of index substring
        System.out.println(index1+"  "+index2);//2 8

//passing substring with from index
        int index3=s1.indexOf('a',index1+1);//returns the index of is substring after 4th index
        System.out.println(index3);//5 i.e. the index of another is

//passing char value
        int index4=s1.indexOf('b',index2);//returns the index of s char value
        System.out.println(index4);//3
    }
}
