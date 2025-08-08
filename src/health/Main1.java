package health;

public class Main1 {

	public static void main(String[] args) {
		Patient p1 = new Patient(1, "Dinesh",  "Fever");
        Patient p2 = new Patient(2, "Varun",  "Heart Pain");
		Services S=new Services();
		S.Register(p1);
		S.Register(p2);
		S.Paitent_Details(1);
		S.Paitent_Details(1);
		Doctor doc1 = new Physician("Dr. Dinesh","General Medicine");
		Doctor doc2 = new Physician("Dr. Varun","General Medicine");
		doc1.diagnose(p1);
        doc2.diagnose(p2);
		

	}

}


