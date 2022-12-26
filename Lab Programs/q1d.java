/** Java program to print pyramid shape using * symbols
    Name of the program : _1dPyramid.java
*/

import java.util.*;

public class q1d {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter number of lines in pyramid : ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        sc.close();
    }
}