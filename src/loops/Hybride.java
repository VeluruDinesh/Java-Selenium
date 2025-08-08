package loops;
class father{
	public void print_father() {
	System.out.println("Hi i am father");
	}
}
class  son extends father{
	public void print_son() {
	System.out.println("Hi i am son");
	}
}
class  daughter extends father{
	public void print_daughter() {
	System.out.println("Hi i am daughter");
	}
}
class Grandson extends son{
	public void print_GrandSon() {
	System.out.println("Hi i am GrandSon");
	}
	
}
public class Hybride {

	public static void main(String[] args) {
		Grandson g=new Grandson();
		g.print_GrandSon();
		daughter d = new daughter();
        d.print_father();    
        d.print_daughter();

	}

}
