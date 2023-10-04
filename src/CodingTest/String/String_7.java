package CodingTest.String;

import java.util.Scanner;

public class String_7 {
    //7. 회문 문자열
    public String solution(String str) {
        String answer = "YES";
        str = str.toUpperCase();
        String tmp = new StringBuilder(str).reverse().toString();
        if (!str.equals(tmp))
            answer = "NO";

        /*char[] charArr = str.toCharArray();
        int lt = 0, rt = str.length() - 1;
        while (lt < rt) {
            if (charArr[lt] == charArr[rt]) {
                lt++;
                rt--;
            } else
                answer = "NO";
        }*/

        return answer;
    }

    public static void main(String[] args) {
        String_7 main = new String_7();
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.print(main.solution(str));
    }
}
