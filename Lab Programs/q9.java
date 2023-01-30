import java.util.Scanner;

class Employee {
    Scanner sc = new Scanner(System.in);
    private String ID;
    private String name;
    private String department;
    private double basicPay;
    private double grossPay;
    private double netPay;
    private double totalTax;

    // Reading details of an employee and computing his/her gross pay and net pay.
    void readDetails() {
        System.out.print("Enter employee-ID: ");
        ID = sc.nextLine();
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter department: ");
        department = sc.nextLine();
        System.out.print("Enter basic pay: ");
        basicPay = sc.nextDouble();
        sc.close();
        grossPay = computeGrossPay();
        netPay = computeNetPay();
    }

    // Method to compute Gross Pay
    double computeGrossPay() {
        double DA = (0.58 * basicPay);
        double HRA = (0.16 * basicPay);
        return (basicPay + DA + HRA);
    }

    // Method to compute Net Pay
    double computeNetPay() {
        if (grossPay <= 200000) {
            totalTax = 0;
        } else if (grossPay <= 300000) {
            totalTax = (0.10 * grossPay);
        } else if (grossPay <= 500000) {
            totalTax = (.15 * grossPay);
        } else {
            double tax = (.30 * grossPay);
            totalTax = (tax + (0.02 * tax));
        }
        return (grossPay - totalTax);
    }

    void displayDetails() {
        System.out.println(name + "\t" + ID + "\t" + department + "\t" + basicPay + "\t" + totalTax + "\t" + netPay);
    }
}

public class q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of employees in a company: ");
        int numberOfEmployees = sc.nextInt();

        // Declaring an array that holds details of Employee type objects
        Employee[] employeeDetails = new Employee[numberOfEmployees];

        // Reading details of N employees
        for (int i = 0; i < numberOfEmployees; i++) {
            employeeDetails[i] = new Employee();
            System.out.println("\nEnter details of Employee-" + (i + 1));
            employeeDetails[i].readDetails();
        }
        sc.close();

        // Displaying details of N employees
        System.out.println("\n\t\t\t***Details of Employees*");
        System.out.println("Name\tID\t     Department\tBasic Pay\tIncome Tax\tNet Pay");
        for (int i = 0; i < numberOfEmployees; i++) {
            employeeDetails[i].displayDetails();
        }
    }
}
