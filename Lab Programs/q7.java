import java.util.*;

class Student {
    String result, usn, name;
    double s1, s2, s3, total;
    char grade;

    void read() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter USN: ");
        usn = sc.next();
        System.out.print("Enter Student Name: ");
        name = sc.next();
        System.out.print("Subject-1 marks: ");
        s1 = sc.nextDouble();
        System.out.print("Subject-2 marks: ");
        s2 = sc.nextDouble();
        System.out.print("Subject-3 marks: ");
        s3 = sc.nextDouble();
    }

    void result() {
        double avg;
        total = s1 + s2 + s3;
        avg = total / 3.0;

        if (s1 < 35 || s2 < 35 || s3 < 35 || avg < 35)
            result = "FAIL";
        else
            result = "PASS";

        if (result.equals("FAIL"))
            grade = 'E';
        else {
            if (avg <= 40)
                grade = 'D';
            else if (avg > 40 && avg <= 60)
                grade = 'C';
            else if (avg > 60 && avg <= 75)
                grade = 'B';
            else if (avg > 75 && avg <= 90)
                grade = 'A';
            else if (avg > 90)
                grade = 'S';
        }
    }

    void display() {
        System.out.println(
                usn + "\t" + name + "\t" + s1 + "\t" + s2 + "\t" + s3 + "\t" + total + "\t" + result + "\t" + grade);
    }
}

public class q7 {
    public static void main(String[] args) {
        int n, i;
        double hs1, hs2, hs3, t;

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter number of students: ");
        n = sc.nextInt();

        Student[] s = new Student[n];
        for (i = 0; i < n; i++) {
            s[i] = new Student();
            System.out.println("\nEnter student-" + (i + 1) + " Details: ");
            s[i].read();
            s[i].result();
        }

        hs1 = s[0].s1;
        hs2 = s[0].s2;
        hs3 = s[0].s3;
        t = s[0].total;
        for (i = 1; i < s.length; i++) {
            if (hs1 < s[i].s1)
                hs1 = s[i].s1;
            if (hs2 < s[i].s2)
                hs2 = s[i].s2;
            if (hs3 < s[i].s3)
                hs3 = s[i].s3;
            if (t < s[i].total)
                t = s[i].total;
        }

        System.out.println("\nUSN\tName\tSub-1\tSub-2\tSub-3\tTotal\tResult\tGrade");
        for (i = 0; i < s.length; i++)
            s[i].display();

        for (i = 0; i < s.length; i++) {
            if (hs1 == s[i].s1)
                System.out.println("\nSubject-1 Topper's USN is " + s[i].usn + " and has secured " + hs1 + " marks!");
            if (hs2 == s[i].s2)
                System.out.println("Subject-2 Topper's USN is " + s[i].usn + " and has secured " + hs2 + " marks!");
            if (hs3 == s[i].s3)
                System.out.println("Subject-3 Topper's USN is " + s[i].usn + " and has secured " + hs3 + " marks!");
            if (t == s[i].total)
                System.out.println("Batch Topper's USN is " + s[i].usn + " and has secured " + t + " marks!");
        }
    }
}