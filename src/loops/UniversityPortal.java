package loops;


class University {
 public void printUniversity() {
     System.out.println("Welcome to XYZ University");
 }
}


class Student extends University {
 public void printStudent() {
     System.out.println("I am a student of XYZ University");
 }
}


class Teacher extends University {
 public void printTeacher() {
     System.out.println("I am a teacher at XYZ University");
 }
}


class ResearchScholar extends Student {
 public void printResearchScholar() {
     System.out.println("I am a research scholar under the Student category");
 }
}


public class UniversityPortal {
 public static void main(String[] args) {
     ResearchScholar rs = new ResearchScholar();
     rs.printUniversity();
     rs.printStudent();
     rs.printResearchScholar();

     Teacher t = new Teacher();
     t.printUniversity();
     t.printTeacher();
 }
}
