/**
    1. b) Find all the roots of a quadratic equation.
    Name of the Program: _1bQuadratic.java
*/

import java.util.*;

class SolvingEqn {
    static void eqn(double a, double b, double c) {
        if (a == 0) {
            System.err.println("Check the entered co-efficients ('a' cannot be zero)");
            return;
        }

        double r1, r2;
        double disc = (b * b) - (4 * a * c);
        r1 = ((-b) + Math.sqrt(disc)) / (2 * a);
        r2 = ((-b) - Math.sqrt(disc)) / (2 * a);

        if (disc > 0) {
            System.out.println("Roots are real and not equal");
            System.out.println("Root 1: " + r1 + " and Root 2: " + r2);
        } else if (disc == 0) {
            System.out.println("Roots are real and equal");
            System.out.println("Root 1: " + r1 + " and Root 2: " + r2);
        } else {
            System.out.println("Roots are composite");
            double real = (-b) / (2 * a);
            double img = Math.sqrt((4 * a * c) - (b * b)) / (2 * a);
            System.out.println("Root 1: (" + (float) real + ")+i(" + (float) img + ")");
            System.out.println("Root 2: (" + (float) real + ")-i(" + (float) img + ")");
        }

        System.out.println("\nGiven Quadratic Equation solved Successfully!");
    }
}

public class q1b {
    public static void main(String[] args) {
        System.out.println("Enter the co-efficients of the Quadratic Equation: ");
        Scanner sp = new Scanner(System.in);
        double a = sp.nextDouble();
        double b = sp.nextDouble();
        double c = sp.nextDouble();
        sp.close();

        SolvingEqn.eqn(a, b, c);
    }
}