package CodingTest.Array;

import java.util.Scanner;

public class Array_4 {
    // 4. 피보나치 수열
    public int[] solution(int n) {
        int[] answer = new int[n];
        answer[0] = 1;
        answer[1] = 1;

        for (int i = 2; i < n; i++) {
            answer[i] = answer[i - 2] + answer[i - 1];
        }
        // 손코딩
        /*public void solution(int n) {
            int a=1,b=1,c;
            System.out.println(a+ " " + b + " ");
            for (int i = 2; i < n; i++) {
                c = a + b;
                System.out.println(c + " ");
                a = b;
                b = c;
            }
        }*/

        return answer;
    }

    public static void main(String[] args) {
        Array_4 main = new Array_4();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i : main.solution(n)) {
            System.out.print(i + " ");
        }
    }
}
