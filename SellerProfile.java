package view;

import basic.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;




public class SellerProfile extends JPanel{

	SellerBasic seller;
	SellerDashBoard loginPageReference;
	JButton showProfileInfoButton;
	public SellerProfile(SellerDashBoard loginPageReference , SellerBasic seller)
	{

		this.seller = seller;
		this.loginPageReference = loginPageReference;

		this.setLayout(null);
		this.setBounds(0,0, 500,500);
		this.setBackground(Color.YELLOW);



		/*other codes goes here*/
		getLabelsAndButton();
		





	}




	/*code for panel*/

	public void getLabelsAndButton()
	{

				JLabel changePasswordLabel = new JLabel("Want to change password?");
				JLabel changeEmailLabel = new JLabel ("Want to change email?");

				JButton changePasswordButton = new JButton("Change Password");
				JButton changeEmailButton = new JButton("Change Email");


				changePasswordLabel.setBounds(10,20,200,30);
				this.add(changePasswordLabel);



				changePasswordButton.setBounds(10,60,200,30);
				this.add(changePasswordButton);


				changeEmailLabel.setBounds(10,100,200,30);
				this.add(changeEmailLabel);



				changeEmailButton.setBounds(10,140,200,30);
				this.add(changeEmailButton);


				showProfileInfoButton = new JButton("Show Profile Info");
				showProfileInfoButton.setBounds(10,180,200,30);
				this.add(showProfileInfoButton);


				buttonListenerMethod(changePasswordButton);
				


	

	}



	/*code for loginButtonActionListener*/
	
	public void buttonListenerMethod(JButton changePasswordButton )
	{
		
		changePasswordButton.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e){

				/*JOptionPane.showMessageDialog(null , "SuccessFul\n Thank You.");*/
				loginPageReference.dispose();

				/*new ChangePasswordPage(seller);*/
				
				

			}



		});





		showProfileInfoButton.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e){

				/*JOptionPane.showMessageDialog(null , "SuccessFul\n Thank You.");*/
				

				new SellerProfileDetails(seller);
				
				

			}



		});









	}













	

}