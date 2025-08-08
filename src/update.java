
import java.sql.*;
public class update {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","Dinesh@123");
			String S="ALTER TABLE patient ADD ( Admission_Date VARCHAR(100) ,Doctor_Assigned VARCHAR(100) )";
			PreparedStatement ptmt=con.prepareStatement(S);
			ptmt.executeUpdate();
			System.out.print("Altered table");
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
