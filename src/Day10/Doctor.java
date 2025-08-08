package Day10;
import java.util.*;

public class Doctor {
	private String License_No;
	private String Name;
	private String Department;
	
	public Doctor(String License_No,String Name,String Department ) {
		this.License_No=License_No;
		this.Name=Name;
		this.Department=Department;
	}
	 public boolean equals(Object obj) {
	        if (this == obj) return true;
	        if (!(obj instanceof Doctor)) return false;
	        Doctor other = (Doctor) obj;
	        return this.License_No == other.License_No;
	    }

	    
	    public int hashCode() {
	        return Objects.hashCode(License_No);
	    }
	    public String toString() {
	    	return "License_No : "+License_No+"\nName : "+Name+"\nDepartment : "+Department;
	    	
	    }


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashSet<Doctor> Doctor_Details=new HashSet<>();
		while(true) {
			System.out.println("\n Doctor Registration:");
			System.out.println("1. Register Doctor");
			System.out.println("2. View all Doctor");
			System.out.println("3. Exit");
			System.out.println("Enter your choice :");
			int choice=Integer.parseInt(sc.nextLine());
			switch(choice){
				case 1:
					System.out.print("Enter your License_No");
					String license_no=sc.nextLine();
							//sc.nextLine();
					System.out.print("Enter your Name");
					String name=sc.nextLine();
					System.out.print("Enter your Department");
					String department=sc.nextLine();
					Doctor newDoctor=new Doctor(license_no,name,department);
					
					boolean added = Doctor_Details.add(newDoctor);
                    if (added) {
                        System.out.println("Doctor registered successfully.");
                        break;
                    } else {
                        System.out.println("Doctor with this License_No already exists.");
                    }
                    break;

                case 2:
                    if (Doctor_Details.isEmpty()) {
                        System.out.println("No doctors registered.");
                    } else {
                        System.out.println("Registered Doctors:");
                        for (Doctor d : Doctor_Details) {
                            System.out.println(d);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
					


			}
		

	}

}
	
}
