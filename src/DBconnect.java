import java.sql.*;
import java.util.*;
public class DBconnect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","Dinesh@123");
	String S="UPDATE patient SET Name=? WHERE Name=?";
	//Statement stmt=con.createStatement();
	PreparedStatement ptmt=con.prepareStatement(S);
	
	
	for(int i=0;i<2;i++) {
		System.out.print("Enter new name: ");
        String name = sc.nextLine();
        System.out.print("Enter old name: ");
        String name1 = sc.nextLine();

        
       
        ptmt.setString(1, name);
        
        ptmt.setString(2, name1);
        ptmt.executeUpdate();
        

	}
	sc.close();
	/*String[][] Patientdata= {{"dinesh","22","fever"},{"varun","23","pain"},{"sai","24","headache"}};
	for(String[] s:Patientdata) {
		ptmt.setString(1, s[0]);
		ptmt.setInt(2, Integer.parseInt(s[1]));
		ptmt.setString(3, s[2]);
		
		ptmt.executeUpdate();
		
	}*/
	
	//stmt.executeUpdate(S);
	System.out.println(" Inserted In Table successfully!");
	//stmt.close();
	con.close();
}
catch (Exception e) {
    System.out.println(" Connection failed!");
    e.printStackTrace();
}

}
}
