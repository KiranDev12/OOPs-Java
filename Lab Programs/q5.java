
/**
 5)     Given are two one dimensional array A and B which are sorted in ascending
    order. Develop an application to merge them into a single sorted array C that
    contains every item form A and B, in ascending order.

    Name of the program: _5MergeArray.java
 */

import java.util.Scanner;

class SortArray {
    void sort(int[] a, int[] b, int[] c, int m, int n) {
        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            if (a[i] <= b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }

        for (; i < m; i++) {
            c[k++] = a[i];
        }
        for (; j < n; j++) {
            c[k++] = b[j];
        }
    }

    void input(int[] a, int m) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + m + " elements of array(IN ASCENDING ORDER)");
        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt();
        }
    }

    void display(int[] a, int m) {
        for (int i = 0; i < m; i++) {
            System.out.print(a[i] + " ");
        }
    }
}

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SortArray arr = new SortArray();
        System.out.println("Enter the size of 1st array");
        int m = sc.nextInt();
        int[] a = new int[m];
        arr.input(a, m);
        System.out.println("Enter the size of 2nd array");
        int n = sc.nextInt();
        int[] b = new int[n];
        arr.input(b, n);
        int o = n + m;
        int[] c = new int[o];
        arr.sort(a, b, c, m, n);
        System.out.println("Merged and Sorted array is");
        arr.display(c, o);
    }
}