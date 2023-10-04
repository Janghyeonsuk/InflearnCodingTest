package CodingTest.Array;

import java.util.Scanner;

public class Array_9 {
    // 9. 격자판 최대합
    public int solution(int n, int[][] arr) {
        int answer = Integer.MIN_VALUE;
        int sum1; // 행의 합
        int sum2; // 열의 합

        for (int i = 0; i < n; i++) {
            sum1 = sum2 = 0;
            for (int j = 0; j < n; j++) {
                sum1 += arr[i][j];
                sum2 += arr[j][i];
            }
            answer = Math.max(sum1, answer);
            answer = Math.max(sum2, answer);
        }

        sum1 = sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum1 += arr[i][i];
            sum2 += arr[n - i - 1][i];
        }
        answer = Math.max(sum1, answer);
        answer = Math.max(sum2, answer);

        return answer;
    }

    public static void main(String[] args) {
        Array_9 main = new Array_9();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println(main.solution(n, arr));
    }
}
