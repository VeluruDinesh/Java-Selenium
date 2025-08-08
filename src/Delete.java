import java.sql.*;

import java.util.*;

public class Delete {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","Dinesh@123");
			String S="DELETE FROM patient WHERE id =?";
			PreparedStatement ptmt=con.prepareStatement(S);
			int ID=sc.nextInt();
			sc.nextLine();
			ptmt.setInt(1,ID);
			ptmt.executeUpdate();
			System.out.print("Deleted Successfully");
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		sc.close();

	}

}
