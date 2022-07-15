import java.sql.*;

import java.util.Scanner;

public class javamysql {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javadevlop","root","Jishnu@123");
			System.out.println("Connected Successfully");
			
			Scanner sc1= new Scanner(System.in);
			System.out.println("Enter you mobile number ");
			Long contact =sc1.nextLong();
			
			Scanner sc2= new Scanner(System.in);
			System.out.println("Enter Name to update");
			String name =sc2.nextLine();
			
			Statement stmt=con.createStatement();
			
			String query1 = "Select pname,dname,phone,apdate from appointment";
		//	String query1 = "Select pname,dname,phone,apdate from appointment where phone = "+contact;
		//	String query2 = "Select pname,dname,phone,apdate from appointment where pname = '"+name+"'";
			
			String query3 = "update appointment set pname = '"+name+"'where phone="+contact;
			
			PreparedStatement pstmt= con.prepareStatement(query3);
			
			pstmt.executeUpdate();
			ResultSet rs = stmt.executeQuery(query1);

			if(rs.next()==false)
			{
				System.out.println("Error");
			}
			else 
			{
				while(rs.next())
				{	
					System.out.println("Patient Name = " +rs.getString(1));
					System.out.println("Doctor Name = " +rs.getString(2));
					System.out.println("Patient Number = " +rs.getString(3));
					System.out.println("Appointment Date = " +rs.getString(4));
					System.out.println("------------------------------");
						
				}
			}
			
			System.out.println();
			rs.close();
			stmt.close();
			con.close();  
		}
		catch(SQLException e)
		{
		System.out.println(e.getErrorCode());
		}
	}

}
