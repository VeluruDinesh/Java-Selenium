package Day10;
import java.util.*;

public class Hashmap {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> patient=new HashMap<>();
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("\n patient Registration:");
			System.out.println("1. Register patient");
			System.out.println("2. View all patient");
			System.out.println("3. View patient with ID");
			System.out.println("4. Remove patient");
			System.out.println("5. No.of patient");
			System.out.println("6. View all patient");
			System.out.println("7. clear patients Data");
			System.out.println("8. Exit");
			System.out.println("Enter your choice :");
			int choice=Integer.parseInt(sc.nextLine());
			switch(choice){
				case 1:
					System.out.println("enter the Id");
					int id=Integer.parseInt(sc.nextLine());
					System.out.println("enter the Patient name");
					String Patient=sc.nextLine();
					patient.put(id,Patient);
					break;
				case 2:
					System.out.println("Registered Patient");
					System.out.println(patient);
					break;
				case 3:
					System.out.println("Enter the patient ID");
					int ID=Integer.parseInt(sc.nextLine());
					System.out.println(" Patient Name : "+patient.get(ID));
					break;
				case 4:
					System.out.println("Enter the patient ID to Remove");
					int Id=Integer.parseInt(sc.nextLine());
					patient.remove(Id);
					System.out.println(patient.get(Id)+" Patient Removed");
					break;
				case 5:
					int No_Patient=patient.size();
					System.out.println("Total Numbers :"+No_Patient);
					break;
					
					
				case 6:
					System.out.println("Enter the patient ID to Update");
					int iD=Integer.parseInt(sc.nextLine());
					System.out.println("Enter the new Name");
					String name=sc.nextLine();
					patient.put(iD,name);
					System.out.println(patient.get(iD)+" Patient Name has been Updated");
					break;
				case 7:
					patient.clear();
					System.out.println("data has been cleared");

					break;
				case 8:
					System.out.println("Exiting....");
					sc.close();
					return;
					
					
		}

	}

	}
}
