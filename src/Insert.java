

	import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class Insert {

		public static void main(String[] args) {
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","Dinesh@123");
				String S="INSERT INTO patient (Name,age,disease,Admission_Date,Doctor_Assigned) VALUES (?,?,?,?,?)";
				PreparedStatement ptmt=con.prepareStatement(S);
				String[][] S1= {{"dinesh","22","fever","14/07/2025","General"},{"varun","23","pain","15/09/2025","physian"},{"sai","24","headache","16/07/2025","general"}};
				for(String[] a:S1) {
					ptmt.setString(1, a[0]);
					ptmt.setInt(2, Integer.parseInt(a[1]));
					ptmt.setString(3, a[2]);
					ptmt.setString(4, a[3]);
					ptmt.setString(5, a[4]);
					ptmt.executeUpdate();	
				}
				
				System.out.print("Inserted values in table");
			}
			catch(Exception e) {
				e.printStackTrace();
			}

		}

	}


