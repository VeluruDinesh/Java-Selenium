package loops;


public class receipt {

	public static void main(String[] args) {
		StringBuffer Customer=new StringBuffer();
		Customer.append("Customer Name:Dinesh\n");
		Customer.append("mobile:Samsung\n");
		Customer.append("Model:S23\n");
		Customer.append("Ram:16GB\n");
		Customer.append("Camera:48Mp\n");
		Customer.append("warranty:2 years\n");
		System.out.print(Customer.toString());
		StringBuffer Customer1=new StringBuffer("welcome to Java Program" );
		
		Customer1.insert(2,"L");
		System.out.print(Customer.toString());
		Customer1.insert(8," NITHESH");
		System.out.print(Customer1.toString()+"\n");
		
		
		Customer1.replace(9, 17,"Varun ");
		System.out.print(Customer1.toString()+"\n");
		
		
		Customer1.delete(9, 15);
		System.out.print(Customer1.toString());
		
		
		}

}
