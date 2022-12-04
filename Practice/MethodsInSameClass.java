// Calling methods within the same class
//Illustrate how to call static method a class from a method in same class

public class MethodsInSameClass{
	public static void main(String args[]){
		printOne();
		printOne();
		printTwo();
	}

	public static void printOne(){
		System.out.println("Hello World");	
	}

	public static void printTwo(){
		printOne();
		printOne();
	}
}