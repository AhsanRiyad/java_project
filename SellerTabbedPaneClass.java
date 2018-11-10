package view;

import basic.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;




class SellerTabbedPaneClass extends JTabbedPane{


	SellerDashBoard sellerDashBoardReference;
	SellerBasic seller;
	public SellerTabbedPaneClass(SellerDashBoard sellerDashBoardReference , SellerBasic seller)
	{	
		this.seller = seller;
		this.sellerDashBoardReference = sellerDashBoardReference;
		
		SellerProfile sellerProfile = new SellerProfile(sellerDashBoardReference, seller);
		this.addTab("Profile" , sellerProfile);

		/*UserOrder userOrder = new UserOrder();
		this.addTab("Order" , userOrder);
		

		UserProduct userProduct = new UserProduct();
		this.addTab("Product" , userProduct);


		UserPanelSignOut userPanelSignOut = new UserPanelSignOut(userDashBoardReference);
		this.addTab("SignOut" , userPanelSignOut);*/




		/*other codes goes here*/
		
		





	}




	
	

}