package model;

import basic.*;
import view.*;
import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;




public class LoginPageControl{

	String customerId;
	String customerName;
	String customerEmail;
	String customerPassword;
	UserBasic userBasic;
	SellerBasic sellerBasic;

	public LoginPageControl()
	{

		

	}




	public boolean loginInfoCheckCustomer(String id, String password)
	{

		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://riyadahsan.com:3306/riyadahs_java","riyadahs_riyad","448787");
			
			Statement stmt = con.createStatement();
			
			// String customerTable = "INSERT INTO `seller`(`sellerId`, `sellerName`, `sellerEmail` ) VALUES ('"+id+"','"+name+"','"+email+"')";
			// String loginTable = "INSERT INTO `login`(`sellerId`, `password`) VALUES ('"+id+"','"+password+"')";
			
			String customerLoginId = "select `customerId` from `login` where `customerId`='"+id+"' and `password`='"+password+"'";
			ResultSet rs = stmt.executeQuery(customerLoginId);




			// String customerInfoCollect = "select  `customerName` `customerEmail` from `customer` where `customerId`='"+id+"'";

			// String id = "select `sellerId` `customerId` from `login` where `sellerId`='"+id+"' or `customerId`='"+id+"' and `password`='"+password+"'";			

			// int a = stmt.executeUpdate(customerTable);
			// int b = stmt.executeUpdate(loginTable);
			// System.out.println(a);
			/*while(rs.next())
			{
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
			}*/






			while(rs.next())
			{
				System.out.println(rs.getString(1));
				if(rs.getString(1).equals(id))
				{				
					
					return true;
				}
			}
			
			
		con.close();
			
			
		}
		catch(Exception e){
			System.out.println("Login Exception"+ e);
			return false;
		}

		return false;

	}







	public boolean loginInfoCheckSeller(String id, String password)
	{

		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://riyadahsan.com:3306/riyadahs_java","riyadahs_riyad","448787");
			
			Statement stmt = con.createStatement();
			
			
			String sellerLoginId = "select `sellerId` from `login` where `sellerId`='"+id+"' and `password`='"+password+"'";
			ResultSet rs = stmt.executeQuery(sellerLoginId);



			while(rs.next())
			{
				System.out.println(rs.getString(1));
				if(rs.getString(1).equals(id))
				{				
					
					return true;
				}
			}
			
			
		con.close();
			
			
		}
		catch(Exception e){
			System.out.println("Login Exception"+ e);
			return false;
		}

		return false;

	}










	public void getCutomerInfo()
	{
		UserBasic userBasicObject = new UserBasic();
		userBasicObject.setUserDetails(customerId, customerName, customerEmail, customerPassword);



	}


	public UserBasic userBasicList(String id){
		 
		userBasic = new UserBasic();
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://riyadahsan.com:3306/riyadahs_java","riyadahs_riyad","448787");
			Statement stmt = con.createStatement();
			String sql= "select customerId , customerName, customerEmail from customer where customerId='"+id+"'";

			ResultSet rs   = stmt.executeQuery(sql);
			
			
			

			while(rs.next())
			{
				userBasic.setUserDetails(rs.getString(1), rs.getString(2), rs.getString(3), "something");
			}
			
			con.close();
			return userBasic;
			
		}
		catch(Exception e){
			System.out.println("object exception :"+e);
			return userBasic;
		}
		
		
	}



	public SellerBasic sellerBasicList(String id){
		 
		sellerBasic = new SellerBasic();
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://riyadahsan.com:3306/riyadahs_java","riyadahs_riyad","448787");
			Statement stmt = con.createStatement();
			String sql= "select sellerId , sellerName, sellerEmail from seller where sellerId='"+id+"'";

			ResultSet rs   = stmt.executeQuery(sql);
			
			
			

			while(rs.next())
			{
				sellerBasic.setSellerDetails(rs.getString(1), rs.getString(2), rs.getString(3), "something");
			}
			
			con.close();
			return sellerBasic;
			
		}
		catch(Exception e){
			System.out.println("object exception :"+e);
			return sellerBasic;
		}
		
		
	}






	

}