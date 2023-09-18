package CodingTest.String;

import java.util.Scanner;

// 2.대소문자 변환
public class String_2 {
    public String solution(String str) {
        StringBuilder answer = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (Character.isLowerCase(c))
                answer.append(Character.toUpperCase(c));
            else
                answer.append(Character.toLowerCase(c));
        }
        return answer.toString();
    }

    // 아스키 코드 값 사용
        /*for (char c : str.toCharArray()) {
            if (c >= 97 && c <= 122)
                answer.append((char) (c - 32));
            else
                answer.append((char) (c + 32));
        }*/

    public static void main(String[] args) {
        String_2 main = new String_2();
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        System.out.println(main.solution(str));
    }
}