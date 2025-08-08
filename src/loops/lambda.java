package loops;

public class lambda {

	public static void main(String[] args) {

		Sum sum=(c,d)->c+d;
		int result=sum.add(2,6);
		System.out.println(result);
	

	}

}
