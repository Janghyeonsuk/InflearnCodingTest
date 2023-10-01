package CodingTest.String;

import java.util.Scanner;

public class String_9 {
    // 9.숫자만 추출
    public int solution(String str) {
        StringBuilder sb = new StringBuilder();
        char[] charArr = str.toCharArray();

        for (char c : charArr) {
            if (Character.isDigit(c))
                sb.append(c);
        }
        return Integer.parseInt(sb.toString());

        /*
        int answer = 0;
        for (char c : charArr) {
            if (c >= 48 && c <= 57)
                // 처음 나온 문자열을 10의 자리씩 증가시키며 자연수로 만듦
                answer = answer * 10 + (c - 48);
        }
        return answer;
        */
    }

    public static void main(String[] args) {
        String_9 main = new String_9();
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(main.solution(str));
    }
}






