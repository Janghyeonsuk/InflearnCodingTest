package CodingTest.Array;

import java.util.Scanner;

public class Array_10 {
    // 10. 봉우리
    public int solution(int n, int[][] arr) {
        int answer = 0;
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean flag = true;
                for (int k = 0; k < 4; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if (nx >= 0 && nx < n && ny >= 0 && ny < n &&
                            arr[nx][ny] > arr[i][j]) {
                        flag = false;
                        break;
                    }
                }
                if (flag) answer++;
            }
        }
        /*int[][] mountain = new int[n + 2][n + 2];

        for (int i = 0; i < n + 2; i++) {
            mountain[i][0] = 0;
            mountain[0][i] = 0;
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                mountain[i][j] = arr[i - 1][j - 1];
            }
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                int top = mountain[i][j];
                if (top > mountain[i - 1][j]
                        && top > mountain[i + 1][j]
                        && top > mountain[i][j - 1]
                        && top > mountain[i][j + 1]
                )
                    answer++;
            }
        }*/

        return answer;
    }

    public static void main(String[] args) {
        Array_10 main = new Array_10();
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
