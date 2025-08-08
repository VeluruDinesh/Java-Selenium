package loops;
import java.util.Scanner;

public class main_class {

	
		 public static void main(String[] args) {
			 Scanner sc=new Scanner(System.in);
			 Address myObj= new Address();
			 System.out.println("Enter your constituency");
			 String inputConstituency=sc.nextLine();
			 myObj.setContituency(inputConstituency);
		        vote obj = new vote();
		        System.out.println("Enter your Name");
		        String inputName=sc.nextLine();
		        obj.setName(inputName);
		        System.out.println("\nEnter your Age");
		        int inputAge=sc.nextInt();
		        obj.setAge(inputAge);

		        obj.voters();
		        sc.close();
		         
		    }
		 

	

}
