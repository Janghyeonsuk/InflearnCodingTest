package CodingTest.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_6 {
    // 6.뒤집은 소수
    public boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    // 6.뒤집은 소수
    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int tmp = arr[i];
            int res = 0;
            while (tmp > 0) {
                int t = tmp % 10;
                res = res * 10 + t;
                tmp /= 10;
            }

            if (isPrime(res))
                answer.add(res);
        }

        return answer;
    }

    public static void main(String[] args) {
        Array_6 main = new Array_6();
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
