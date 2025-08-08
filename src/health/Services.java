package health;


class Services implements Service{
	private Patient[] patients = new Patient[10];
    private int count = 0;

    public void Register(Patient patient) {
        if (count < patients.length) {
            patients[count++] = patient;
            System.out.println("Patient registered: " + patient.getName());
        } else {
            System.out.println("Registration full. Cannot register more patients.");
        }
    }

    public void Paitent_Details(int patientId) {
        for (int i = 0; i < count; i++) {
            if (patients[i].getId() == patientId) {
                System.out.println("ID: " + patients[i].getId());
                System.out.println("Name: " + patients[i].getName());
                System.out.println("Problem: " + patients[i].getProblem());
                return;
            }
        }
        System.out.println("No patient found with ID: " + patientId);
    }
}
