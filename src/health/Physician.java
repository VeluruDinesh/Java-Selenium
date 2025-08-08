package health;

public class Physician extends Doctor {

    public Physician(String name, String specialization) {
        super(name, specialization);
    }

    
    public void diagnose(Patient patient) {
        System.out.println("Dr. " + getName() + " (" + getSpecialization() + ") is diagnosing " +
                           patient.getName() + " for " + patient.getProblem());
    }
}
