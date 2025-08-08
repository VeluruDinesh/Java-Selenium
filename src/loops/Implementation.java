package loops;
import java.util.Scanner;

 class Implementation implements Menu1 {
	 Scanner sc=new Scanner(System.in);
	 int balance=0;

	 int deposit;
	public void Withdraw() {
		System.out.println("Enter the Amount");
		 int withdraw=sc.nextInt();
		 if(withdraw<balance) {
		balance-=withdraw;
		System.out.println("Balnce : "+balance);
		 }
		 else {
			 System.out.println("INSUFFICENT BALANCE");
			 
		 }
		 
	 }
	 public void Deposit() {
		 System.out.print("Enter amount to Deposit: ₹");
	        double amount = sc.nextDouble();
	        balance += amount;
	        System.out.println("Amount Deposited. New Balance: ₹" + balance);
		 
	 }
	 public void Balance() {
		 System.out.println("Current Balance: ₹" + balance);
	 
	 }
	 
 }
