
import java.util.*;
import java.sql.*;
public class UpdateData {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","Dinesh@123");
			String S="UPDATE patient SET Name=? WHERE id=?";
			
			PreparedStatement ptmt=con.prepareStatement(S);
			
			
			for(int i=0;i<2;i++) {
				System.out.print("Enter new name: ");
		        String name = sc.nextLine();
		        System.out.print("Enter old name: ");
		        int id=Integer.parseInt(sc.nextLine());  
		        ptmt.setString(1, name);
		        
		        ptmt.setInt(2, id);
		        ptmt.executeUpdate();
		        

			}
			sc.close();
			System.out.println(" Inserted In Table successfully!");
		
			con.close();
		}
		catch (Exception e) {
		    System.out.println(" Connection failed!");
		    e.printStackTrace();
		}

	}

}
