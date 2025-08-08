package Day9;

import java.util.*;
class patient{
	int id;
	String name;
	patient(int id,String name){
		this.id=id;
		this.name=name;
	}
		public String toString() {
	        return "ID: " + id + ", Name: " + name;
	    
	}
}

public class hashSet {

	public static void main(String[] args) {
		LinkedList<patient> patientQueue=new LinkedList<>();
		HashSet<Integer> patientId=new HashSet<>();
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("Hospital Patient Queue:");
            System.out.println("1. Add Patient");
            System.out.println("2. View All Patients");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int Choice=Integer.parseInt(sc.nextLine());
            switch(Choice) {
            case 1:
                System.out.print("Enter Patient ID: ");
                int id = sc.nextInt();
                sc.nextLine();
                /*if (patientId.contains(id)) {
                    System.out.println(" Patient with this ID already exists.");
                    break;
                }*/
                System.out.print("Enter Patient Name: ");
                String name = sc.nextLine();
                patientQueue.add(new patient(id, name));
                patientId.add(id);
                System.out.println("Patient added to queue.");
                break;

            case 2:
                if (patientQueue.isEmpty()) {
                    System.out.println("No patients in queue.");
                } else {
                    System.out.println("Registered Patients:");
                    for (patient p : patientQueue) {
                        System.out.println(p);
                    }
                }
                break;

            case 3:
                System.out.println("Exiting system...");
                sc.close();
                return;

            default:
                System.out.println("Invalid choice. Try again.");
        }
		}
		
		
		

	}

}
