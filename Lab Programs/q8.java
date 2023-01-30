import java.util.Scanner;

class Book {
    Scanner sc = new Scanner(System.in);

    String name;
    int code, quantity;
    double unitPrice, totalPrice;

    void inputData() {
        System.out.print("Enter the name of the Book: ");
        name = sc.nextLine();
        System.out.print("Enter the code of Book: ");
        code = sc.nextInt();
        System.out.print("Enter the Price of Book: ");
        unitPrice = sc.nextDouble();
        System.out.print("Enter the number of Books: ");
        quantity = sc.nextInt();

        totalPrice = quantity * unitPrice;
    }

    void outputData() {
        System.out.println(name + "\t" + code + "\t" + unitPrice + "\t\t" + quantity + "\t\t" + totalPrice);
    }
}

public class q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of Books: ");
        int u = sc.nextInt();

        Book[] books = new Book[u];
        for (int i = 0; i < u; i++) {
            books[i] = new Book();
            System.out.println("\nEnter the details of Book- " + (i + 1));
            books[i].inputData();
        }

        System.out.println("\nName\tCode\tUnitPrice\tQuantity\tTotalPrice");
        for (int i = 0; i < u; i++)
            books[i].outputData();

        sc.close();
    }
}