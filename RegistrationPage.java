package view;

import model.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;




public class RegistrationPage extends JFrame{

	RegistrationPageControl registrationPageControlObject;
	
	JTextField fullNameTextField;
	JTextField emailTextField;
	JPasswordField enterPasswordTextField;
	JTextField userNameTextField;

	JRadioButton sellerRadioButton,customerRadioButton; 
	JLabel sellerOrCustomerLabel;
	ButtonGroup radioButtonGroup;



	public RegistrationPage()
	{

		this.setTitle("Registration");
		this.setSize(350,700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(null);


		getMunuBarMethod();

		getButtonsAndLabels();





		this.setVisible(true);

	}



	public void getButtonsAndLabels()
	{

				radioButtonGroup =new ButtonGroup(); 

				sellerOrCustomerLabel = new JLabel("R U seller or Customer?");
				sellerOrCustomerLabel.setBounds(10,20,150,30);
				this.add(sellerOrCustomerLabel);

				sellerRadioButton = new JRadioButton("Seller");
				sellerRadioButton.setBounds(20,60,80,30);
				radioButtonGroup.add(sellerRadioButton);
				this.add(sellerRadioButton);




				customerRadioButton = new JRadioButton("Customer");
				customerRadioButton.setBounds(120,60,110,30);
				radioButtonGroup.add(customerRadioButton);
				this.add(customerRadioButton);


				JLabel fullNameLabel = new JLabel("Enter Your Full Name: ");
				fullNameLabel.setBounds(10,100,200,30);
				this.add(fullNameLabel);


				fullNameTextField = new JTextField();
				fullNameTextField.setBounds(10,140,200,30);
				this.add(fullNameTextField);



				JLabel userNameLabel = new JLabel ("Enter Your User Name Name:");
				userNameLabel.setBounds(10,180,200,30);
				this.add(userNameLabel);



				
				userNameTextField = new JTextField();
				userNameTextField.setBounds(10,220,200,30);
				this.add(userNameTextField);

				



				JLabel emailLabel = new JLabel("Enter Your Email: ");
				emailLabel.setBounds(10,260,200,30);
				this.add(emailLabel);



				emailTextField = new JTextField();
				emailTextField.setBounds(10,300,200,30);
				this.add(emailTextField);



				JLabel enterPasswordLabel = new JLabel ("Enter Your Password: ");
				enterPasswordLabel.setBounds(10,340,200,30);
				this.add(enterPasswordLabel);


				enterPasswordTextField = new JPasswordField ();
				enterPasswordTextField.setBounds(10,380,200,30);
				enterPasswordTextField.setEchoChar('*');
				this.add(enterPasswordTextField);



				JLabel reEnterPasswordLabel = new JLabel ("Re-Enter Your Password:");
				reEnterPasswordLabel.setBounds(10,420,200,30);
				this.add(reEnterPasswordLabel);



				JPasswordField reEnterPasswordTextField = new JPasswordField ();
				reEnterPasswordTextField.setBounds(10,460,200,30);
				reEnterPasswordTextField.setEchoChar('*');
				this.add(reEnterPasswordTextField);


				JButton confirmRegistrationButton = new JButton("Confirm");
				confirmRegistrationButton.setBounds(10,500,200,30);
				this.add(confirmRegistrationButton);



				JButton registrationBackButton = new JButton("Login here");
				registrationBackButton.setBounds(10,540,200,30);
				this.add(registrationBackButton);






				buttonListenerMethod(confirmRegistrationButton, registrationBackButton);


	

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

	public void buttonListenerMethod(JButton registrationButtonReference, JButton registrationBackButtonReference)
	{
		
		registrationButtonReference.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e){

				System.out.println("good");

				String fullNameTextFieldParameter = fullNameTextField.getText();
				String userNameTextFieldParameter = userNameTextField.getText();
				String emailTextFieldParameter	  = emailTextField.getText();
				String enterPasswordTextFieldParameter = String.valueOf(enterPasswordTextField.getPassword());


				registrationPageControlObject = new RegistrationPageControl();
				

				if(customerRadioButton.isSelected()){ 
				registrationPageControlObject.getRegistrationDataCustomer(userNameTextFieldParameter, fullNameTextFieldParameter, emailTextFieldParameter , enterPasswordTextFieldParameter);
			    }


			    else if(sellerRadioButton.isSelected()){ 
				registrationPageControlObject.getRegistrationDataSeller(userNameTextFieldParameter, fullNameTextFieldParameter, emailTextFieldParameter , enterPasswordTextFieldParameter);
			    }



				JOptionPane.showMessageDialog(null, "Successful\n Thank You.");
				

			}



		});


		registrationBackButtonReference.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e){

				System.out.println("good");
				dispose();
				new LoginPage("Login" , "Enter Your ID: " , "Enter Your Password: ");
				
				

			}



		});





	}




}