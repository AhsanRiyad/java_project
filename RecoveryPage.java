package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;




public class RecoveryPage extends JFrame{

	public RecoveryPage()
	{

		this.setTitle("Recover Password");
		this.setSize(500,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(null);


		getMunuBarMethod();

		getButtonsAndLabels();







		this.setVisible(true);

	}


















	public void getButtonsAndLabels()
	{

				JLabel recoveryPasswordLabel = new JLabel("Please enter your email id:");
				recoveryPasswordLabel.setBounds(10,20,200,30);
				this.add(recoveryPasswordLabel);


				JTextField recoveryPasswordTextField = new JTextField();
				recoveryPasswordTextField.setBounds(10,60,200,30);
				this.add(recoveryPasswordTextField);



				JButton recoveryPasswordButton = new JButton("Recover Password");
				recoveryPasswordButton.setBounds(10,100,200,30);
				this.add(recoveryPasswordButton);



				JLabel loginHereLabel = new JLabel("Got your password?");
				loginHereLabel.setBounds(10,140,200,30);
				loginHereLabel.setForeground(Color.RED);
				this.add(loginHereLabel);


				JButton loginHereButton = new JButton("Login Here");
				loginHereButton.setBounds(10,180,200,30);
				this.add(loginHereButton);



				buttonListenerMethod(recoveryPasswordButton, loginHereButton);


				


	

	}


	

	public void getMunuBarMethod()
	{
		JMenuBar menuBar1 = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		JMenu helpMenu = new JMenu("Help");
		JMenu fileSubMenuNew = new JMenu("New");
		JMenuItem fileExit = new JMenuItem("Exit");
		JMenuItem helpVersion = new JMenuItem("Version");
		JMenuItem helpFaq = new JMenuItem("Faq");
		JMenuItem fileSubMenuNewText = new JMenuItem("Text");
		JMenuItem fileSubMenuNewDoc = new JMenuItem("Doc");





		fileMenu.add(fileSubMenuNew);
		fileMenu.add(fileExit);
		menuBar1.add(fileMenu);
		menuBar1.add(helpMenu);
		helpMenu.add(helpFaq);
		helpMenu.add(helpVersion);
		fileSubMenuNew.add(fileSubMenuNewText);
		fileSubMenuNew.add(fileSubMenuNewDoc);



		this.setJMenuBar(menuBar1);

	}



	/*code for loginButtonActionListener*/

	public void buttonListenerMethod(JButton recoveryPasswordButtonReference , JButton loginHereButtonReference)
	{
		
		recoveryPasswordButtonReference.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e){

				System.out.println("good");
				JOptionPane.showMessageDialog(null , "SuccessFul\n Thank You.");
				

			}



		});




		loginHereButtonReference.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e){

				System.out.println("good");
				dispose();
				
				new LoginPage("Login" , "Enter Your ID: " , "Enter Your Password: ");

			}



		});








	}




}