
/**
 5)     Given are two one dimensional array A and B which are sorted in ascending
    order. Develop an application to merge them into a single sorted array C that
    contains every item form A and B, in ascending order.

    Name of the program: _5MergeArray.java
 */

import java.util.*;

class ArrayInAndSort {
    static void sort(int[] A, int[] B, int[] C, int m, int n) {
        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            if (A[i] < B[j]) {
                C[k++] = A[i++];
            } else {
                C[k++] = B[j++];
            }
        }
        for (; i < m; i++) {
            C[k++] = A[i];
        }
        for (; j < n; j++) {
            C[k++] = B[j];
        }
    }

    static void input(int[] Arr, int n) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + n + " elements of the array (In ASCENDING ORDER only): ");
        for (int i = 0; i < n; i++) {
            Arr[i] = sc.nextInt();
        }
        sc.close();
    }

    static void displaySorted(int[] Arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(Arr[i] + " ");
        }
        System.out.println();
    }
}

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array~A: ");
        int n1 = sc.nextInt();
        int[] A = new int[n1];
        ArrayInAndSort.input(A, n1);

        System.out.print("Enter the size of array~B: ");
        int n2 = sc.nextInt();
        int[] B = new int[n2];
        ArrayInAndSort.input(B, n2);

        int n3 = n1 + n2;
        int[] C = new int[n3];
        ArrayInAndSort.sort(A, B, C, n1, n2);
        System.out.print("Merged Sorted Array~C is: ");
        ArrayInAndSort.displaySorted(C, n3);
        sc.close();
    }
}
