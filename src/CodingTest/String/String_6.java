package CodingTest.String;

import java.util.Scanner;

public class String_6 {
    // 6.중복 문자 제거
    public String solution(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if(str.indexOf(str.charAt(i)) == i)
                sb.append(str.charAt(i));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String_6 main = new String_6();
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        System.out.println(main.solution(str));
    }
}