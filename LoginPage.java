package view;

import basic.*;
import model.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;




public class LoginPage extends JFrame{


	JTextField idTextField;
	JPasswordField passwordTextField;



	LoginPageControl loginButtonControl;


	JRadioButton sellerRadioButton,customerRadioButton; 
	JLabel sellerOrCustomerLabel;
	ButtonGroup radioButtonGroup;



	UserBasic userBasicObject;
	SellerBasic sellerBasicObject;

	public LoginPage(String titleName, String idName , String passwordName)
	{

		this.setTitle(titleName);
		this.setSize(500,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(null);


		getMunuBarMethod();

		getButtonsAndLabels(idName , passwordName);







		this.setVisible(true);

	}


















	public void getButtonsAndLabels(String idName , String passwordName)
	{

				JLabel idLabel = new JLabel(idName);
				idLabel.setBounds(10,20,200,30);
				this.add(idLabel);

				idTextField = new JTextField();
				idTextField.setBounds(10,60,200,30);
				this.add(idTextField);


				JLabel passwordLabel = new JLabel (passwordName);
				passwordLabel.setBounds(10,100,200,30);
				this.add(passwordLabel);


				passwordTextField = new JPasswordField();
				passwordTextField.setBounds(10,140,200,30);
				passwordTextField.setEchoChar('*');
				this.add(passwordTextField);





				radioButtonGroup =new ButtonGroup(); 

				sellerOrCustomerLabel = new JLabel("R U seller or Customer?");
				sellerOrCustomerLabel.setBounds(10,180,150,30);
				this.add(sellerOrCustomerLabel);

				sellerRadioButton = new JRadioButton("Seller");
				sellerRadioButton.setBounds(20,220,80,30);
				radioButtonGroup.add(sellerRadioButton);
				this.add(sellerRadioButton);




				customerRadioButton = new JRadioButton("Customer");
				customerRadioButton.setBounds(120,220,110,30);
				radioButtonGroup.add(customerRadioButton);
				this.add(customerRadioButton);










				
				JButton loginButton = new JButton("Login");
				loginButton.setBounds(10,260,100,30);
				this.add(loginButton);


				JLabel forgotPasswordLabel = new JLabel("Forgot Password? ");
				forgotPasswordLabel.setBounds(10,300,300,30);
				forgotPasswordLabel.setForeground(Color.RED);
				this.add(forgotPasswordLabel);


				JButton forgotPasswordButton = new JButton("Recover Here ");
				forgotPasswordButton.setBounds(10,340,200,30);
				this.add(forgotPasswordButton);


				JLabel signUPLabel = new JLabel("Not Registered Yet? Sign UP here: ");
				signUPLabel.setBounds(10,380,300,30);
				signUPLabel.setForeground(Color.RED);
				this.add(signUPLabel);

				JButton signUPButton = new JButton("Sign UP");
				signUPButton.setBounds(10,420,200,30);
				this.add(signUPButton);



				buttonListenerMethod(loginButton, signUPButton, forgotPasswordButton);


				


	

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

	public void buttonListenerMethod(JButton loginButtonReference , JButton signUpButtonReference , JButton forgotPasswordButtonReference)
	{
		
		loginButtonReference.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e){

				System.out.println("good");
				
				String idTextFieldParameter = idTextField.getText();
				String passwordTextFieldParameter = String.valueOf(passwordTextField.getPassword());
				loginButtonControl = new LoginPageControl();

				if(sellerRadioButton.isSelected())
				{
					

					if(idTextFieldParameter.isEmpty())
					{
						


						idTextField.setBackground(Color.RED);
						idTextField.setForeground(Color.WHITE);


						JOptionPane.showMessageDialog(null, "ID can not be blank");

					}

					else if(passwordTextFieldParameter.isEmpty())
					{
						
						idTextField.setBackground(Color.WHITE);
						idTextField.setForeground(Color.BLACK);
						passwordTextField.setBackground(Color.RED);
						passwordTextField.setForeground(Color.WHITE);

	
						JOptionPane.showMessageDialog(null, "Password can not be blank");

					}


					else{


						passwordTextField.setForeground(Color.BLACK);
						passwordTextField.setBackground(Color.WHITE);
						idTextField.setBackground(Color.WHITE);
						idTextField.setForeground(Color.BLACK);
						
						boolean loginBool = loginButtonControl.loginInfoCheckSeller(idTextFieldParameter, passwordTextFieldParameter);
						System.out.println(loginBool);
						if(loginBool==true)
						{

						sellerBasicObject = loginButtonControl.sellerBasicList(idTextField.getText());
						new SellerDashBoard(sellerBasicObject);
						dispose();
						}
						else
						{
							JOptionPane.showMessageDialog(null, "ID or Password does not match");
						}




				}

				}


				else if(customerRadioButton.isSelected())
				{
					
					if(idTextFieldParameter.isEmpty())
					{
						


						idTextField.setBackground(Color.RED);
						idTextField.setForeground(Color.WHITE);


						JOptionPane.showMessageDialog(null, "ID can not be blank");

					}

					else if(passwordTextFieldParameter.isEmpty())
					{
						
						idTextField.setBackground(Color.WHITE);
						idTextField.setForeground(Color.BLACK);
						passwordTextField.setBackground(Color.RED);
						passwordTextField.setForeground(Color.WHITE);

	
						JOptionPane.showMessageDialog(null, "Password can not be blank");

					}


					else{


						passwordTextField.setForeground(Color.BLACK);
						passwordTextField.setBackground(Color.WHITE);
						idTextField.setBackground(Color.WHITE);
						idTextField.setForeground(Color.BLACK);
						
						boolean loginBool = loginButtonControl.loginInfoCheckCustomer(idTextFieldParameter, passwordTextFieldParameter);
						System.out.println(loginBool);
						if(loginBool==true)
						{

						userBasicObject = loginButtonControl.userBasicList(idTextField.getText());
						new UserDashBoard("User", userBasicObject);
						dispose();
						}
						else
						{
							JOptionPane.showMessageDialog(null, "ID or Password does not match");
						}




				}}
				





			}



		});




		signUpButtonReference.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e){

				System.out.println("good");
				dispose();
				new RegistrationPage();

			}



		});




		forgotPasswordButtonReference.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e){

				System.out.println("good");
				dispose();
				new RecoveryPage();

			}



		});



	}




}