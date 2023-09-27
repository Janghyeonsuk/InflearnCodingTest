package CodingTest.String;

import java.util.Scanner;

public class String_5 {
    // 5. 특정 문자 뒤집기
    public String solution(String str) {
        String answer = "";
        char[] charArray = str.toCharArray();
        int lt = 0, rt = charArray.length - 1;

        while (lt < rt) {
            if (!Character.isAlphabetic(charArray[lt])) lt++;
            else if (!Character.isAlphabetic(charArray[rt])) rt--;
            else {
                char tmp = charArray[lt];
                charArray[lt] = charArray[rt];
                charArray[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(charArray);

        return answer;
    }

    public static void main(String[] args) {
        String_5 main = new String_5();
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        System.out.println(main.solution(str));
    }
}