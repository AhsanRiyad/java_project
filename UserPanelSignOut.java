package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;




public class UserPanelSignOut extends JPanel{

	UserDashBoard loginPageReference;

	public UserPanelSignOut(UserDashBoard loginPageReference)
	{

		this.loginPageReference = loginPageReference;
		this.setLayout(null);
		this.setBounds(0,0, 500,500);
		this.setBackground(Color.ORANGE);



		/*other codes goes here*/
		getLabelsAndButton();
		





	}




	/*code for panel*/

	public void getLabelsAndButton()
	{

				

				JLabel signOutLabel = new JLabel("Wanna signOut, click below");
				signOutLabel.setBounds(10,20,200,30);
				this.add(signOutLabel);

				JButton signOutButton = new JButton("SignOut");
				signOutButton.setBounds(10,60,100,30);
				this.add(signOutButton);


				buttonListenerMethod(signOutButton);
				


	

	}



	/*code for loginButtonActionListener*/
	
	public void buttonListenerMethod(JButton signOutButtonReference)
	{
		
		signOutButtonReference.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e){

				loginPageReference.dispose();
				new LoginPage("Login" , "Enter Your ID: " , "Enter Your Password: ");
				

			}



		});



	}

	

}