package CodingTest.String;

import java.util.Scanner;

public class String_10 {
    //10. 가장 짧은 문자 거리

    public int[] solution(String str, char c) {
        int[] answer = new int[str.length()];
        int diff = 1000;

        //왼쪽으로 부터의 거리 표시
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                diff = 0;
            } else {
                diff++;
            }
            answer[i] = diff;
        }

        //오른쪽부터의 거리 표시
        diff = 1000;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == c)
                diff = 0;
            else {
                diff++;
                answer[i] = Math.min(answer[i], diff);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String_10 main = new String_10();
        Scanner in = new Scanner(System.in);
        String str = in.next();
        char c = in.next().charAt(0);
        for (int x : main.solution(str, c)) {
            System.out.print(x + " ");
        }
    }
}

