package Day9;


import java.util.*;
 
public class HospitalQueue {
public static void main(String[] args)
    {
 
	LinkedList<String> patientQueue=new LinkedList<>();   
	Scanner sc= new Scanner(System.in);
	int choice;
	
	while(true){
		System.out.println("\n Hospital Patient Queue_ _ _ :");
		System.out.println("1. Add New Patient(normal)");
		System.out.println("2. Add emergeny patient");
		System.out.println("3. Remove patient");
		System.out.println("4. View all Patient");
		System.out.println("5. View first and last patient");
		System.out.println("6. Exit");
		System.out.println("Enter your choice :");
		choice =sc.nextInt();
		sc.nextLine();
		
	switch(choice)
	{
	case 1:
		System.out.println("Enter patient name :");
        String patient =sc.nextLine();
        patientQueue.addLast(patient);
	    System.out.println("Added to queue.");
	    break;    
	case 2:
		System.out.println("Enter emergency patient name :");
		String emergencyPatient= sc.nextLine();
        patientQueue.addFirst(emergencyPatient);
	    System.out.println("Emergency pateint added to front :");
	    break;
	    
	case 3:
		if(!patientQueue.isEmpty())
{          System.out.println("Enter the patient name");
          String name=sc.nextLine();
          for(String patientName : patientQueue) {
       if(patientName.equalsIgnoreCase(name)) 
       {
	boolean remove= patientQueue.remove(name);
	System.out.println("Removed patient :" + remove );
	break;
	}
       else {
    	   System.out.println("Patient is not present");
    	   break;
       }
       }
          
       }
		else
		{
			System.out.println("No patient in queue");
		}
		break;
 
	case 4:
		System.out.println("Current Queue :" +patientQueue);
        break;
        
	case 5:
		if(!patientQueue.isEmpty())
		{
			System.out.println(" First :" +patientQueue.getFirst());
			System.out.println("Last :" +patientQueue.getLast());
		}
        else
		{
			System.out.println("Queue is empty");
		}
        break;
	case 6:
		System.out.println("Exiting......");
		sc.close();
		return;
    
	default:
		System.out.println("Invalid Choice");
	}
	
    }//while (choice !=6);
	
}
}
 
