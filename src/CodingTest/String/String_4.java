package CodingTest.String;

import java.util.ArrayList;
import java.util.Scanner;

// 4.단어 뒤집기
public class String_4 {
    public ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        // StringBuilder reverse() 사용하기
//        for (String x : str) {
//            String tmp = new StringBuilder(x).reverse().toString();
//            answer.add(tmp);
//        }

        // 직접 뒤집는 알고리즘
        for(String x : str) {
            char[] s = x.toCharArray();
            int lt = 0, rt = s.length - 1;
            while (lt<rt) {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(s); // 클래스 메서드
            answer.add(tmp);
        }

        return answer;
    }

    public static void main(String[] args) {
        String_4 main = new String_4();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] strArr = new String[n];

        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = in.next();
        }

        for (String solution : main.solution(n, strArr)) {
            System.out.println(solution);
        }
    }
}
