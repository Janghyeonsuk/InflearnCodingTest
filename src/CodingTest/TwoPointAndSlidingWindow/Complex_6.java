package CodingTest.TwoPointAndSlidingWindow;

import java.util.Scanner;

public class Complex_6 {
    //6. 최대 길이 연속 부분 수열
    public int solution(int n, int k, int[] arr) {
        int answer = 0;
        int cnt = 0;
        int lt = 0;

        for (int rt = 0; rt < n; rt++) {
            if (arr[rt] == 0)
                cnt++;
            while (cnt > k) {
                if (arr[lt] == 0)
                    cnt--;
                lt++;
            }
            answer = Math.max(answer, rt - lt + 1);
        }

        return answer;
    }

    public static void main(String[] args) {
        Complex_6 main = new Complex_6();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(main.solution(n, k, arr));
    }
}
