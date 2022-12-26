/**
    Java program to read the side length of three cubes and to print their volume and outer area
    Name of the program: _6CubeApp.java
*/

import java.util.Scanner;

class CUBE {
    private double length;

    void setLength(double l) {
        length = l;
    }

    double Volume() {
        return length * length * length;
    }

    double Area() {
        return 6 * length * length;
    }

    Scanner sc = new Scanner(System.in);

    void input(CUBE obj, int i) {
        System.out.print("Cube-" + i + ": ");
        obj.setLength(sc.nextDouble());
    }

    void display(CUBE obj, int i) {
        System.out.println("\nCube-" + i + " Volume: " + (float) obj.Volume() + " cubic units and Outer Area: "
                + (float) obj.Area() + " sq units");
    }
}

public class q6 {
    public static void main(String[] args) {
        CUBE obj1 = new CUBE();
        CUBE obj2 = new CUBE();
        CUBE obj3 = new CUBE();

        System.out.println("\nEnter the side length of ~ ");
        obj1.input(obj1, 1);
        obj2.input(obj2, 2);
        obj3.input(obj3, 3);

        obj1.display(obj1, 1);
        obj1.display(obj2, 2);
        obj1.display(obj3, 3);
    }
}

/*
 * Output:
 * 
 * Enter the side length of ~
 * Cube-1: 5
 * Cube-2: 2
 * Cube-3: 3
 * 
 * Cube-1 Volume: 125.0 cubic units and Outer Area: 150.0 sq units
 * 
 * Cube-2 Volume: 8.0 cubic units and Outer Area: 24.0 sq units
 * 
 * Cube-3 Volume: 27.0 cubic units and Outer Area: 54.0 sq units
 * 
 */
