package CodingTest.Array;

import java.util.Scanner;

public class Array_5 {
    // 5. 소수(에라토스테네스체)
    public int solution(int n) {
        int answer = 0;
        int[] ch = new int[n + 1];

        for (int i = 2; i <= n; i++) {
            if (ch[i] == 0)
                answer++;
            for (int j = i; j <= n; j = j + i)
                ch[j] = 1;
        }

        return answer;
    }

    public static void main(String[] args) {
        Array_5 main = new Array_5();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(main.solution(n));
    }
}
