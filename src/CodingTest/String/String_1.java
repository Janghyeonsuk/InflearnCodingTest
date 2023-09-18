package CodingTest.String;

import java.util.Scanner;

// 1.문자 찾기
public class String_1 {
    public int solution(String str, char c) {
        int answer = 0;
        str = str.toUpperCase();
        c = Character.toUpperCase(c);

        for (char x : str.toCharArray()) {
            if (x == c) answer++;
        }

        /*
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) answer++;
        }
        */

        return answer;
    }

    public static void main(String[] args) {
        String_1 main = new String_1();
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        char c = in.nextLine().charAt(0);

        System.out.println(main.solution(str, c));
    }

}