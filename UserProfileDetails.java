package view;

import basic.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.table.*;




public class UserProfileDetails extends JFrame{

	UserBasic user;
	static Object[][] databaseInfo;
	static DefaultTableModel dTableModel;
	

	public UserProfileDetails(UserBasic user)
	{
		this.user = user;


		this.setTitle("User details");
		this.setSize(600,600);
		// this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(null);


		
		

		getJTableTo();


		this.setVisible(true);


	}


	public void getJTableTo(){




		UserProfileDetailsPanel userProfileDetailsPanel = new UserProfileDetailsPanel(user);
		this.add(userProfileDetailsPanel);





	}





}