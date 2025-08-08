package loops;
public class  Multiple_Con  {
    String name;
    int age;

   
     Multiple_Con () {
        name = "Unknown";
        age = 0;
    }

    
     Multiple_Con (String n, int a) {
        name = n;
        age = a;
    }

    void show() {
        System.out.println(name + " is " + age + " years old");
    }

    public static void main(String[] args) {
    	 Multiple_Con  p1 = new  Multiple_Con();
    	 Multiple_Con  p2 = new  Multiple_Con("Dinesh", 22);

        p1.show();  
        p2.show();  
    }
}



