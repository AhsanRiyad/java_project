package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;




public class UserProduct extends JPanel{

	public UserProduct()
	{

		
		this.setLayout(null);
		this.setBounds(0,0, 500,500);
		this.setBackground(Color.GREEN);



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