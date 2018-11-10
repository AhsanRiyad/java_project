package view;

import basic.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.table.*;




public class SellerProfileDetails extends JFrame{

	SellerBasic seller;
	static Object[][] databaseInfo;
	static DefaultTableModel dTableModel;
	

	public SellerProfileDetails(SellerBasic seller)
	{
		this.seller = seller;


		this.setTitle("seller details");
		this.setSize(600,600);
		// this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(null);


		
		

		getJTableTo();


		this.setVisible(true);


	}


	public void getJTableTo(){




		SellerProfileDetailsPanel sellerProfileDetailsPanel = new SellerProfileDetailsPanel(seller);
		this.add(sellerProfileDetailsPanel);





	}





}