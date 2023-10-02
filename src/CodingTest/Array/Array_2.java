package CodingTest.Array;

import java.util.Scanner;

public class Array_2 {
    //2. 보이는 학생
    public int solution(int[] arr) {
        int answer = 1;
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                answer++;
                max = arr[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Array_2 main = new Array_2();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(main.solution(arr));

    }
}
