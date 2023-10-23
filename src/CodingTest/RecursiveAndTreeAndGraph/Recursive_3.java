package CodingTest.RecursiveAndTreeAndGraph;

import java.util.Scanner;

public class Recursive_3 {
    // 3. 팩토리얼
    public int factorial(int n) {

        if (n == 1)
            return 1;
        else
            return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Recursive_3 main = new Recursive_3();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.print(main.factorial(n));
    }
}
