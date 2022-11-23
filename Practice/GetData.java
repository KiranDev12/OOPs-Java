//Java program to read data of various types

import java.util.*;
import java.util.Scanner;

public class ReadData{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your name");
		String name = sc.nextLine();

		System.out.println("Enter your gender (M/F)");
		char gender = sc.next().charAt(0);

		System.out.println("Enter age, Mobile Number and CGPA");
		int age = sc.nextInt();
		long mobileNo = sc.nextLong();
		double cgpa = sc.nextDouble();

		System.out.println("STUDENT DETAILS: ");
		System.out.println("Name: "+name);
		System.out.println("Gender: "+gender);
		System.out.println("Age: "+age);
		System.out.println("Number: "+mobileNo);
		System.out.println("CGPA: "+cgpa);
	}
}