import java.util.Scanner;

public class Pattern{
	public static void main(String args[]){
		int n;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of * in base: ");
		n = in.nextInt();
		for(int i = 0; i<n; i++){
			System.out.println();
			for(int j = n-i; j>1; j--){
				System.out.print(" ");
			}
			for(int j = 0; j<=i; j++){
				System.out.print("* ");
			}
			System.out.println();
		}
		in.close();
	}
}