package Bank;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		User U=new User("Dinesh",55000700);
		BankAccount acc = new BankAccount(U);
		Scanner sc=new Scanner(System.in);
		

		        int choice;
		        do {
		            System.out.println("\n========= MENU =========");
		            System.out.println("1. Account Details");
		            System.out.println("2. Check Balance");
		            System.out.println("3. Deposit");
		            System.out.println("4. Credit");
		            System.out.println("5. Exit");
		            System.out.print("Enter your choice: ");
		            choice = sc.nextInt();

		            if (choice == 1) {
		                acc.Details();
		            } else if (choice == 2) {
		                acc.Balance();
		            } else if (choice == 3) {
		                acc.Deposit();
		            } else if (choice == 4) {
		                acc.Credit();
		            } else if (choice == 5) {
		                System.out.println("Exiting... Thank you!");
		            } else {
		                System.out.println("Invalid choice. Please try again.");
		            }
		        } while (choice != 5);

		        sc.close();
		        
		    }
		

}

