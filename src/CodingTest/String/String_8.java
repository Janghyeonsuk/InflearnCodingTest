package CodingTest.String;

import java.util.Scanner;

public class String_8 {
    //8. 유효한 팰린드롬
    public String solution(String str) {

        /*
        // 알파벳만 추출후 직접 비교 방법
        str = str.toUpperCase();
        StringBuilder sb = new StringBuilder();
        char[] charArray = str.toCharArray();

        for (char c : charArray) {
            if (Character.isAlphabetic(c))
                sb.append(c);
        }

        int lt = 0, rt = sb.length() - 1;
        while (lt < rt) {
            if (sb.charAt(lt) == sb.charAt(rt)) {
                lt++;
                rt--;
            } else
                return "NO";
        }*/

        // 정규식 사용 방법
        String answer = "No";
        str = str.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(str).reverse().toString();
        if (str.equals(tmp))
            answer = "Yes";

        return answer;
    }

    public static void main(String[] args) {
        String_8 main = new String_8();
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(main.solution(str));
    }
}

