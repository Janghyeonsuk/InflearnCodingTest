package CodingTest.String;

import java.util.Scanner;

public class String_12 {
    //12. 암호
    public String solution(int n, String str) {
        String answer = "";
        /*for (int i = 0; i < n; i++) {
            String sub = str.substring(i * 7, (i * 7) + 7)
                    .replaceAll("#", "1").replaceAll("\\*", "0");
            int num = Integer.parseInt(sub, 2);
            answer += (char) num;
        }*/
        for (int i = 0; i < n; i++) {
            String tmp = str.substring(0, 7)
                    .replaceAll("#", "1").replaceAll("\\*", "0");
            int num = Integer.parseInt(tmp, 2);
            answer += (char) num;
            str = str.substring(7); // 7뒤에 문자열로 초기화
        }

        return answer;
    }

    public static void main(String[] args) {
        String_12 main = new String_12();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String str = in.next();
        System.out.print(main.solution(n, str));
    }
}
