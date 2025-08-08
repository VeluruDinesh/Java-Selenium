

package Bank;
import java.util.Scanner;



class BankAccount implements Menu {
    String name;
    int accountNumber;
    int balance = 0;

    Scanner sc = new Scanner(System.in);
	private User user;
    public BankAccount(User user) {
    	this.user=user;
    }
    

	 public void Details() {
	        System.out.println("User Name: " + user.getUser());
	        System.out.println("Account Number: " + user.getAccount());
	    }

    public void Balance() {
        System.out.println("Current Balance: ₹" + balance);
    }

    public void Credit() {
        System.out.print("Enter amount to Credit: ₹");
        double amount = sc.nextDouble();
        if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Amount Debited. New Balance: ₹" + balance);
        }
    }

    public void Deposit() {
        System.out.print("Enter amount to Deposit: ₹");
        double amount = sc.nextDouble();
        balance += amount;
        System.out.println("Amount Deposited. New Balance: ₹" + balance);
    }
}

