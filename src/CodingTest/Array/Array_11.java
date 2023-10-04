package CodingTest.Array;

import java.util.Scanner;

public class Array_11 {
    // 11. 임시 반장 구하기
    public int solution(int n, int[][] arr) {
        int answer = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            int count = 0;
            for (int j = 1; j <= n; j++) {
                if (i != j) {
                    for (int k = 1; k <= 5; k++) {
                        if (arr[i][k] == arr[j][k]) {
                            count++;
                            break;
                        }
                    }
                }
            }
            if (count > max) {
                max = count;
                answer = i;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Array_11 main = new Array_11();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n + 1][6];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 5; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println(main.solution(n, arr));
    }
}
