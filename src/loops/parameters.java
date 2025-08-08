package loops;
import java.util.Scanner;

public class parameters {
	String name;
	int balance;
	Scanner amount=new Scanner(System.in);
  void withdraw() {
	  System.out.println("enter the amount to withdraw");
	  int Amount=amount.nextInt();
	  int total_amount=balance-Amount;
	  System.out.println("total_balance : "+total_amount);
	  }
  void deposit() {
	  System.out.println("enter the amount to deposit");
	  int Amount=amount.nextInt();
	  int total_amount=balance+Amount;
	  System.out.println("total_balance : "+total_amount);
 }
	

	public static void main(String[] args) {
		parameters p=new parameters();
		p.name="Dinesh";
		p.balance=100000;
		p.withdraw();
		p.deposit();
		
		

	}

}
