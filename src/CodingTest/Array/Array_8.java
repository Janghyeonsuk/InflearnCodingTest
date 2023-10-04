package CodingTest.Array;

import java.util.Scanner;

public class Array_8 {
    // 8. 등수 구하기
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int rank = 1;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j])
                    rank++;
            }
            answer[i] = rank;
        }

        return answer;
    }

    public static void main(String[] args) {
        Array_8 main = new Array_8();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        for (int i : main.solution(arr)) {
            System.out.print(i + " ");
        }
    }
}
