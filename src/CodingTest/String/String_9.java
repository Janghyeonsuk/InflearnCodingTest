package CodingTest.String;

import java.util.Scanner;

public class String_9 {
    // 9.숫자만 추출
    public int solution(String str) {
        StringBuilder sb = new StringBuilder();
        char[] charArray = str.toCharArray();
        for (char c : charArray) {
            if (Character.isDigit(c)) {
                sb.append(c);
            }
        }

        int answer = Integer.parseInt(sb.toString());
        return answer;
    }

    public static void main(String[] args) {
        String_9 main = new String_9();
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(main.solution(str));
    }
}






