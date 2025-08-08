package loops;
public class vote {
    private String name;
    private int age;
    

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    

    public void voters() {
        if (age >= 18) {
            
                System.out.println("Vote successful. Thank you, " + name + "!");
            
        } else {
            System.out.println("You are not eligible to vote.");
        }
    }

   
}

class Address{
	private String constituency;
	public String getContituency() {
		return constituency;
	}
	public void setContituency(String newConstituency) {
		this.constituency=newConstituency;
	}
	
}