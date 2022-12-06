package p2;

import java.util.Scanner;

public class ATM {
	
	Scanner sc = new Scanner(System.in);
	
	static int balance;
	
	public void addAmount() {
		
		try {
			
			System.out.println("\nEnter the Amount your want to Deposit:");
			
			int amount = sc.nextInt();
			
			balance += amount;
			
			Thread.sleep(2000);
			
			System.out.println("\nBalance credited successessfully!");
			
		} catch (Exception e) {
			
			System.out.println(e);
			
			System.out.println("\nInvalid Input");
		}
	}
	
	public void withdrawAmount() {
		
		try {
			
			System.out.println("\nEnter the Amount your want to Withdraw:");
			
			int amount = sc.nextInt();
			
			if(balance > amount) {
				
				balance -= amount;
				
				Thread.sleep(1000);
				
				System.out.println("\nPlease collect the cash");
				
				Thread.sleep(2000);
				
				System.out.println("\nBalance debited successessfully!");
				
			} else {
				
				System.out.println("\nInsufficient Balance!");
			}
			
		} catch (Exception e) {
			
			System.out.println(e);
			
			System.out.println("\nInvalid Input");
		}
	}
	
	public void checkBalance() {
		
		System.out.println("\nYour Account Balance is: "+ balance);
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		ATM atm = new ATM();
		
		int ch = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		
		String name = sc.nextLine();
		
		Thread.sleep(1000);
		
		System.out.println("\nHello "+ name + ", Welcome to SBI ATM!");
		
		x:do {
			
			Thread.sleep(1000);
			
			System.out.println("\nEnter your choice..... \n\nPress 1 to Deposit Amount\n\nPress 2 to Withdraw Amount\n\nPress 3 to Check Balance");
			
			ch = sc.nextInt();
			
			switch(ch) {
			
				case 1:
						
						atm.addAmount();
						break;
						
				case 2:
					
					atm.withdrawAmount();
					break;
					
				case 3:
					
					atm.checkBalance();
					break;
					
				default:
					
					System.out.println("\nInvalid choice. Please choose a valid option");	
			}
			Thread.sleep(1000);
			
			System.out.println("\nDo you want to continue?(yes/no)");
			
			String ans = sc.next();
			
			if(ans.equalsIgnoreCase("no") || ans.equalsIgnoreCase("n")) {
				
				break x;
			}	
			
		}while(ch != 0);
		
		Thread.sleep(1000);
		
		System.out.println("\nThanks for using SBI ATM. Have a good day ahead!");
	}
}
