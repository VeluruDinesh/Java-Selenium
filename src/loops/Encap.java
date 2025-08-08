package loops;

public class Encap {
	
	private String salary;
	public String getSalary() {
		return salary;
		
	}
public void setName(String newSalary) {
	this.salary=newSalary;
}
	public static void main(String[] args) {
		Encap Myobj=new Encap();
		Myobj.setName("100000");
		System.out.println(Myobj.getSalary());
	

	}

}
