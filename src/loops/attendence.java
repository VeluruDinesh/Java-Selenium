package loops;
import java.util.Scanner;
public class attendence {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 String [][] students= {{"Students","Mon","Tue","wed","Thur","FRi","Sat","Sun"}
		 ,{"dinesh","P","P","P","P","p","p"}};
		 System.out.println("enter attendence");
		 for(int j=1;j<students.length;j++) {
			 
			  students[1][j] =sc.nextLine();
		 }
		 for(int i=0;i<students.length;i++) {
			 for(int j=0;j<students.length;j++) {
				 System.out.println("log details");
				 System.out.println(students[i][j]);
				 
				 
			 }
			 
			 
		 }
		 sc.close();

	}

}
