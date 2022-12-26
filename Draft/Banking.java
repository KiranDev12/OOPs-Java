import java.util.Scanner;

class Account{

	private String accNo;
	private String name;
	private long balance;
	private String accType;
	
	Scanner in = new Scanner(System.in);

	Account(){
		//Just a dummy constructor class
	}

	void openAccount(){
		System.out.print("Enter Account No: ");
		this.accNo = in.next();
		System.out.print("Enter name: ");
		this.name = in.next();
		System.out.print("Enter initial amount you want to deposit: ");
		this.balance = in.nextLong();
		System.out.print("Enter account type: ");
		this.accType = in.next();
	}

	void showAccount(){
		System.out.println("AccNo \t Name \t Balance \t AccType ");
		System.out.println(this.accNo + "\t" + this.name + "\t" + this.balance + "\t" + this.accType);
	}

	void deposit(){
		long amt;
		System.out.print("Enter amount you want to deposit: ");
		amt = in.nextLong();
		balance = balance + amt;
	}

	void withdrawl(){
		long amt;
		System.out.print("Enter amount you want to withdraw: ");
		amt = in.nextLong();		
		if(balance>=amt){
			balance = balance - amt;
		}
		else{
			System.out.println("Less balance...transaction failed.");
		}
	}

	boolean search(String acn){
		if(accNo.equals(acn)){
			showAccount();
			return (true);
		}
		else{
			return (false);
		}
	}
}

public class Banking{

	public static void main(String args[]){

		Scanner in = new Scanner(System.in);

		System.out.print("How many costumer you want to input: ");
		int n = in.nextInt();

		Account c[] = new Account[n];

		for(int i = 0; i<c.length ; i++){
			c[i] = new Account();
			c[i].openAccount();
		}

		int ch;

		do{
			System.out.println("Main Menu: \n1.Display All\n2.Search by account\n3.Deposit\n4.Withdraw\n5.Exit");
			System.out.println("Your choice: ");
			ch = in.nextInt();
			
			switch(ch){

				case 1:
					for(int i = 0; i<c.length; i++){
						c[i].showAccount();
					}
					break;

				case 2:
					System.out.println("Enter AccNo. you want to search...");
					String acn = in.next();
					boolean found = false;
					for(int i = 0; i<c.length; i++){
						found = c[i].search(acn);
						if(found){
							break;
						}
					}
					if(!found){
						System.out.println("Search failed... Account doesnt exist...");
					}
					break;

				case 3:
					System.out.println("Enter account No: ");
					acn = in.next();
					found = false;
					for(int i = 0; i < c.length; i++){
						found = c[i].search(acn);
						if(found){
							c[i].deposit();
							break;
						}
					}
					if(!found){
						System.out.println("Search failed... Account doesnt exist...");
					}
					break;

				case 4:
					System.out.println("Enter account No: ");
					acn = in.next();
					found = false;
					for(int i = 0; i<c.length; i++){
						found = c[i].search(acn);
						if(found){
							c[i].withdrawl();
							break;	
						}
					}
					if(!found){
						System.out.println("Search failed");
					}
					break;

				case 5:
					System.out.println("Thank you!");
					break;
			}

		}while(ch!=5);
		in.close();
	}
}










