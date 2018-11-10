package view;

import basic.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;




class UserTabbedPaneClass extends JTabbedPane{


	UserDashBoard userDashBoardReference;
	UserBasic user;
	public UserTabbedPaneClass(UserDashBoard userDashBoardReference , UserBasic user)
	{	
		this.user = user;
		this.userDashBoardReference = userDashBoardReference;
		
		UserProfile userProfile = new UserProfile(userDashBoardReference, user);
		this.addTab("Profile" , userProfile);

		UserOrder userOrder = new UserOrder();
		this.addTab("Order" , userOrder);
		

		UserProduct userProduct = new UserProduct();
		this.addTab("Product" , userProduct);


		UserPanelSignOut userPanelSignOut = new UserPanelSignOut(userDashBoardReference);
		this.addTab("SignOut" , userPanelSignOut);




		/*other codes goes here*/
		
		





	}




	/*code for panel*/

	public void getLabelsAndButton()
	{

				JLabel idLabel = new JLabel("Name");
				JLabel passwordLabel = new JLabel ("Password");

				JTextField idTextField = new JTextField();
				JTextField passwordTextField = new JTextField();


				idLabel.setBounds(10,20,200,30);
				this.add(idLabel);



				idTextField.setBounds(10,60,200,30);
				this.add(idTextField);


				passwordLabel.setBounds(10,100,200,30);
				this.add(passwordLabel);



				passwordTextField.setBounds(10,140,200,30);
				this.add(passwordTextField);


				JButton loginButton = new JButton("Login");
				loginButton.setBounds(10,180,100,30);
				this.add(loginButton);



				


	

	}



	/*code for loginButtonActionListener*/
	
	public void buttonListenerMethod()
	{
		
	}

	

}