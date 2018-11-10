package  model;


import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;




public class RegistrationPageControl extends JFrame{

	public RegistrationPageControl()
	{

		

	}


	//String id, String name, String email, String password

	public boolean getRegistrationDataCustomer(String id, String name, String email, String password)
		{

		try{
			Class.forName("com.mysql.jdbc.Driver");
			 Connection con = DriverManager.getConnection("jdbc:mysql://riyadahsan.com:3306/riyadahs_java","riyadahs_riyad","448787");
			// Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaproject","riyad","448787");
			Statement stmt = con.createStatement();
			// ResultSet rs = stmt.executeQuery("select * from user");
			// String name = "Rakib";
			// String age = "30";
			// int id		= 2;
			String customerTable = "INSERT INTO `customer`(`customerId`, `customerName`, `CustomerEmail` ) VALUES ('"+id+"','"+name+"','"+email+"')";
			String loginTable = "INSERT INTO `login`(`customerId`, `password`) VALUES ('"+id+"','"+password+"')";
			//String sql = "insert into customer values('yes' , 'Riyad Ahsan' , 'riyad@gmail.com' ,'01919448787' )";


			int a = stmt.executeUpdate(customerTable);
			stmt.executeUpdate(loginTable);
			System.out.println(a);
			/* while(rs.next())
			{
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
			} */
			
			con.close();
			return true;
			
		}catch(Exception e){
			System.out.println(e);
			return false;
		}




	}





	public boolean getRegistrationDataSeller(String id, String name, String email, String password)
		{

		try{
			Class.forName("com.mysql.jdbc.Driver");
			 Connection con = DriverManager.getConnection("jdbc:mysql://riyadahsan.com:3306/riyadahs_java","riyadahs_riyad","448787");
			// Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaproject","riyad","448787");
			Statement stmt = con.createStatement();
			// ResultSet rs = stmt.executeQuery("select * from user");
			// String name = "Rakib";
			// String age = "30";
			// int id		= 2;
			String customerTable = "INSERT INTO `seller`(`sellerId`, `sellerName`, `sellerEmail` ) VALUES ('"+id+"','"+name+"','"+email+"')";
			String loginTable = "INSERT INTO `login`(`sellerId`, `password`) VALUES ('"+id+"','"+password+"')";
			//String sql = "insert into customer values('yes' , 'Riyad Ahsan' , 'riyad@gmail.com' ,'01919448787' )";
						

			int a = stmt.executeUpdate(customerTable);
			int b = stmt.executeUpdate(loginTable);
			System.out.println(a);
			/* while(rs.next())
			{
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
			} */
			
			con.close();
			return true;
			
		}catch(Exception e){
			System.out.println(e);
			return false;
		}




	}










	




}