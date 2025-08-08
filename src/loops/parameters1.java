package loops;

public class parameters1 {
	void store(String Store_name) {
		System.out.println("Store_name : "+Store_name);
		
	}
	void emplyoee(String name,int id) {
		System.out.println("employee : "+name+ "\nID :"+id);
		
	}

	public static void main(String[] args) {
	
		parameters1 p=new parameters1();
		p.store("Sumithra");
		p.emplyoee("Varun", 10);

	}

}
