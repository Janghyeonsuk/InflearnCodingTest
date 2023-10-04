package CodingTest.Array;

import java.util.Scanner;

public class Array_7 {
    // 7.점수 계산
    public int solution(int[] arr) {
        int answer = 0;
        int score = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                score++;
                answer += score;
            } else
                score = 0;
        }
        return answer;
    }

    public static void main(String[] args) {
        Array_7 main = new Array_7();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(main.solution(arr));
    }
}
