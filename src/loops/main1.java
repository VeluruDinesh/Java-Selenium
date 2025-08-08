package loops;
import java.util.Scanner;


class InvalidPinException1 extends Exception {
	private static final long serialVersionUID = 1L;
    public InvalidPinException1(String message) {
        super(message);
    }
}
public class main1 {
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//PIN
		System.out.println("Insert your card");
		
		 
		 int Attempt=3;
		 		 
		for(int i=0;i<Attempt;i++) {
		try {
			
			System.out.println("Enter Your 4-Digit Pin:");
			int PIN =sc.nextInt();
		
			if(PIN!=ATM1.Pin) {
				throw new InvalidPinException1("INVALID PIN");
				
			
			}
			else {
				System.out.println("VALID PIN");
				break;
			}
		}
		catch (InvalidPinException1 e) {
		            System.out.println(e.getMessage());
		            if (i == Attempt - 1) {
	                    System.out.println("Card Blocked. Too many invalid attempts.");
	                }
		        }
		finally {
		}
		
		}
		//MENU
		Implementation acc = new Implementation();
		int choice;
        do {
            System.out.println("\n========= MENU =========");
            
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
            	acc.Balance();
            	
            } else if (choice == 2) {
            	acc.Withdraw();
            } else if (choice == 3) {
                acc.Deposit();
            }  else if (choice == 4) {
                System.out.println("Exiting... Thank you!");
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);


		sc.close();
		}
	 
		
		
		}
		
		
