package loops;
import java.util.Scanner;



 abstract class Tv_Remote{
  public abstract void TurnOn();
	
}
abstract class PowerOff extends Tv_Remote{
	public abstract void TurnOff();
	
}
class Features extends PowerOff {
	public void TurnOn() {
	System.out.println("Tv Turned On");
	}
	public void TurnOff() {
		System.out.println("Tv TrunedOff");
		}
	
	
}


public class Remote {
	  

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter 1 for TuenON");
		System.out.println("Enter 2 for TuenOff");
		Features myObj=new Features();
		int Choice=Sc.nextInt();
		if(Choice==1) {
			myObj.TurnOn();
			
		}
		else {
			myObj.TurnOff();

			
		}
		Sc.close();
	}

}
