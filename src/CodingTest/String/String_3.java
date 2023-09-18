package CodingTest.String;

import java.util.Scanner;

// 3.문장 속 단어
public class String_3 {
    public String solution(String str) {
        String answer = "";
        int maxLen = Integer.MIN_VALUE;

        /*
        String[] strArray = str.split(" ");
        for (String s : strArray) {
            int len = s.length();
            if (len > maxLen) {
                maxLen = s.length();
                answer = s;
            }
        }
        */

        // index, substring use
        int pos;

        while ((pos = str.indexOf(' ')) != -1) {
            String tmp = str.substring(0, pos);
            int len = tmp.length();

            if (len > maxLen) {
                maxLen = len;
                answer = tmp;
            }

            str = str.substring(pos + 1);
        }
        if (str.length() > maxLen)
            answer = str;
        return answer;
    }

    public static void main(String[] args) {
        String_3 main = new String_3();
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        System.out.println(main.solution(str));
    }
}