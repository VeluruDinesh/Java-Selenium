package hospital;
import java.util.*;
//import java.util.ArrayList;
//import java.util.Scanner;
 
 
class Patient
{
	private int id;
	private String name;
	private int age;
	private String disease;
	
	public Patient (int id,String name, int age, String disease)
	{
	this.id=id;
	this.name=name;
	this.age=age;
	this.disease=disease;
	}
	
	public String getName()
	{
		return name;
	}
	public String getDisease()
	{
		return disease;
	}
	
	public void displayDetails()
	{
		System.out.println("ID : "+id +"\nName:" + name + " \nAge :" + age + "\nDisease:" + disease) ;
	}
	}
public class HospitalDOB {
public static void main(String[] args)
	{
ArrayList<Patient> patientList=new ArrayList<>();
 
Scanner scanner =new Scanner (System.in);
patientList.add(new Patient(1,"Vinay Bhat", 45, "fever"));
patientList.add(new Patient(2,"Sonali Langar", 40, "Cough"));
patientList.add(new Patient(3,"Renu Sai", 30, "Pain"));
patientList.add(new Patient(3,"Dinesh", 30, "fever"));

while(true)
{
	System.out.println("\n Hospital OPD Manu :");
	System.out.println("1. Add New Patient:");
	System.out.println("2. Display All Pateints");
	System.out.println("3. Searrch Patient by Name");
	System.out.println("4. Number of pateints with disease");
	System.out.println("5. Check pateints Existence");
	System.out.println("6. Number of pateints ");
	System.out.println("7. Exit");
	System.out.println("Enter your choice :");
	int choice =Integer.parseInt(scanner.nextLine());
   
	//scanner.nextLine();    // consume newline
 
	switch(choice)
	{
	case 1:
		System.out.println("Enter patient id:");
		int id =Integer.parseInt(scanner.nextLine());
		System.out.print("Enter patient name :");
		String name=scanner.nextLine();
		System.out.println("Enter patient age:");
		int age =Integer.parseInt(scanner.nextLine());
		//int age =scanner.nextInt();
		//scanner.nextLine();			     // consume newline
        System.out.println("Enter disease:");
        String disease=scanner.nextLine();
        patientList.add(new Patient(id,name, age, disease));
        System.out.println("Patient added successfully !");
        break;
	case 2:
		System.out.println("All Registered Patients:");
		for(Patient p : patientList)
		{
			p.displayDetails();
		}
		break;	
	case 3:
		System.out.println("Enter patient name to search:");
		String searchName=scanner.nextLine();
		boolean found=false;
		
	
		for(Patient p: patientList)
		{
			if(p.getName().equalsIgnoreCase(searchName))
			{
				p.displayDetails();
				found=true;
			}
		}
		if(!found)
		{
			System.out.println("No patient found with name :" + searchName);
		}
		break;
	case 4:
		System.out.print("enter the disease ");
		String Disease=scanner.nextLine();
		int count=0;
		for(Patient p : patientList) {
			if (p.getDisease().equalsIgnoreCase(Disease)) {
	            p.displayDetails(); 
	            count++;
	        }
		}
		if (count == 0) {
	        System.out.println("No patients found with disease: " + Disease);
	    } else {
	        System.out.println("Total patients with " + Disease + ": " + count);
	    }
		break;
		
	case 5:
		System.out.println("Enter the patient name:");
		String Name = scanner.nextLine();
		boolean found1 = false;

		for (Patient p : patientList) {
		    if (p.getName().equalsIgnoreCase(Name)) {
		        System.out.println("Patient exists");
		        found1 = true;
		        break; 
		    }
		}

		if (!found1) {
		    System.out.println("Patient does not exist");
		    System.out.println("Choose 1 to add patient");
		}
       break;
		

	case 6:
	    System.out.println("Total number of patients: " + patientList.size());
	    break;

		
		
		
	case 7:
		System.out.println("Exiting...");
		scanner.close();
		return;
		
		default: System.out.println("Invalid choice!");
}
}
}
}
 
 
