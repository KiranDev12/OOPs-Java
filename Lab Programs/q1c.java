
/**
    1. c) Print ‘N’ Fibonacci numbers
    Name of the Program: _1cFibonacci.java
 */

import java.util.*;

class Numbers {
    static void num(int n) {
        int a = 0, b = 1;
        if (n > 0) {
            System.out.print(a + " ");
            for (int i = 2; i <= n; i++) {
                System.out.print(b + " ");
                int temp = b;
                b = a + b;
                a = temp;
            }
            System.out.println();
        } else {
            System.err.println("Check the entered value! It can not be zero");
        }
    }
}

public class q1c{
    public static void main(String[] args) {
        System.out.print("Enter a positive integer: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        System.out.println("First " + n + " Fibonacci terms are:");
        Numbers.num(n);
    }
}
