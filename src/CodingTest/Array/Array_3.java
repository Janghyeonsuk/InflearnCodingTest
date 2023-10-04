package CodingTest.Array;

import java.util.Scanner;

public class Array_3 {
    // 3. 가위바위보
    public String solution(int n, int[] a, int[] b) {
        String answer = "";

        for (int i = 0; i < n; i++) {
            if (a[i] == b[i])
                answer += "D";
            else if ((a[i] == 1 && b[i] == 3)
                    || (a[i] == 2 && b[i] == 1)
                    || (a[i] == 3 && b[i] == 2))
                answer += "A";
            else
                answer += "B";
        }

        return answer;
    }

    public static void main(String[] args) {
        Array_3 main = new Array_3();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        for (int i = 0; i < n; i++) {
            b[i] = in.nextInt();
        }

        for (char c : main.solution(n, a, b).toCharArray()) {
            System.out.println(c);
        }

    }
}
