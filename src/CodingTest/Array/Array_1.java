package CodingTest.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_1 {
    // 1. 큰 수 출력하기
    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1])
                answer.add(arr[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        Array_1 main = new Array_1();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        for (int x : main.solution(arr)) {
            System.out.print(x + " ");
        }
    }
}
