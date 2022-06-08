import java.sql.*;

import java.util.Scanner;

public class crudops {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		crudops n=new crudops();
		Scanner sc=new Scanner(System.in);
		while(true)
		{
		System.out.println("Select the operation you want to perform");
		System.out.println("1.Insert\n 2.Read\n 3.Update\n 4.Delete \n 5.Exit");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1: n.Insert();
		break;
		case 2: n.Read();
		break;
		case 3: n.Update();
		break;
		case 4: n.Delete();
		break;
		case 5: System.out.print("exited");
		System.exit(0);
		default: System.out.println("Invalid number enter between 1 to 4");
		}
	}
	}
	public void Insert() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javadevlop","root","Jishnu@123");
		Statement st=con.createStatement();
		System.out.println("Before Inserting");
		ResultSet rs=st.executeQuery("select * from cust12");
		while(rs.next())
		{
		System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5)+"\t"+rs.getString(6)+"\t"+rs.getString(7));
		}
		st.executeUpdate("insert into cust12 values(8,'Ankit','Patil','ankit123@gmail.com',23,1234567898,'Pune');");
		System.out.println("After Inserting");
		ResultSet rs1=st.executeQuery("select * from cust12");
		while(rs1.next())
		{
		System.out.println(rs1.getString(1)+"\t"+rs1.getString(2)+"\t"+rs1.getString(3)+"\t"+rs1.getString(4)+"\t"+rs1.getString(5)+"\t"+rs1.getString(6)+"\t"+rs1.getString(7));
		}
	}
	
	public void Read() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javadevlop","root","Jishnu@123");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from cust12");
		while(rs.next())
		{
		System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5)+"\t"+rs.getString(6)+"\t"+rs.getString(7));
		}
	}
	
	public void Update() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javadevlop","root","Jishnu@123");
		Statement st=con.createStatement();
		System.out.println("Before Update");
		ResultSet rs=st.executeQuery("select * from cust12");
		while(rs.next())
		{
		System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5)+"\t"+rs.getString(6)+"\t"+rs.getString(7));
		}
		st.executeUpdate("update cust12 set fname='MSingh' where c_id=3;");
		System.out.println("After Update");
		ResultSet rs1=st.executeQuery("select * from cust12");
		while(rs1.next())
		{
		System.out.println(rs1.getString(1)+"\t"+rs1.getString(2)+"\t"+rs1.getString(3)+"\t"+rs1.getString(4)+"\t"+rs1.getString(5)+"\t"+rs1.getString(6)+"\t"+rs1.getString(7));
		}
	}

	public void Delete() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javadevlop","root","Jishnu@123");
		Statement st=con.createStatement();
		System.out.println("Before Delete");
		ResultSet rs=st.executeQuery("select * from cust12");
		while(rs.next())
		{
		System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5)+"\t"+rs.getString(6)+"\t"+rs.getString(7));
		}
		st.executeUpdate("delete from cust12 where c_id=6");
		System.out.println("After Delete");
		ResultSet rs1=st.executeQuery("select * from cust12");
		while(rs1.next())
		{
		System.out.println(rs1.getString(1)+"\t"+rs1.getString(2)+"\t"+rs1.getString(3)+"\t"+rs1.getString(4)+"\t"+rs1.getString(5)+"\t"+rs1.getString(6)+"\t"+rs1.getString(7));
		}
	}
}
