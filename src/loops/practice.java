package loops;
import java.util.Scanner;


public class practice {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number of employee");
	int Number=sc.nextInt();
	Employee[] employees = new Employee[Number];
	
	for(int i=0;i<Number;i++) {
		System.out.println("enter the name");
		String Name=sc.nextLine();
		System.out.println("enter the salary");
		double salary=sc.nextDouble();
	employees[i]=new Employee(Name,salary);
	}
	sc.close();

}
}
