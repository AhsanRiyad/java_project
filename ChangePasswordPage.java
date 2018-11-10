package view;



import basic.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;




public class ChangePasswordPage extends JFrame{

	UserBasic user;

	public ChangePasswordPage(UserBasic user)
	{
		this.user = user;
		this.setTitle("Change Password");
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

				JLabel oldPasswordLabel = new JLabel("Old password: ");
				oldPasswordLabel.setBounds(10,20,200,30);
				this.add(oldPasswordLabel);


				JTextField oldPasswordTextField = new JTextField();
				oldPasswordTextField.setBounds(10,60,200,30);
				this.add(oldPasswordTextField);



				JLabel newPasswordLabel = new JLabel("New Password: ");
				newPasswordLabel.setBounds(10,100,200,30);
				this.add(newPasswordLabel);


				JTextField newPasswordTextField = new JTextField();
				newPasswordTextField.setBounds(10,140,200,30);
				this.add(newPasswordTextField);



				JLabel confirmNewPasswordLabel = new JLabel("Re-enter New Password: ");
				confirmNewPasswordLabel.setBounds(10,180,200,30);
				this.add(confirmNewPasswordLabel);


				JTextField confirmNewPasswordTextField = new JTextField();
				confirmNewPasswordTextField.setBounds(10,220,200,30);
				this.add(confirmNewPasswordTextField);


				JButton changePasswordButton = new JButton("Change Password");
				changePasswordButton.setBounds(10,260,200,30);
				this.add(changePasswordButton);

				JButton goBackButton = new JButton("Go Back");
				goBackButton.setBounds(10,300,200,30);
				this.add(goBackButton);




				buttonListenerMethod(changePasswordButton, goBackButton);

				/*JButton recoveryPasswordButton = new JButton("Recover Password");
				recoveryPasswordButton.setBounds(10,100,200,30);
				this.add(recoveryPasswordButton);



				JLabel loginHereLabel = new JLabel("Got your password?");
				loginHereLabel.setBounds(10,140,200,30);
				loginHereLabel.setForeground(Color.RED);
				this.add(loginHereLabel);


				JButton loginHereButton = new JButton("Login Here");
				loginHereButton.setBounds(10,180,200,30);
				this.add(loginHereButton);



				buttonListenerMethod(recoveryPasswordButton, loginHereButton);*/


				


	

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

	public void buttonListenerMethod(JButton changePasswordButtonReference, JButton goBackButtonReference)
	{
		
		changePasswordButtonReference.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e){

				System.out.println("good");
				JOptionPane.showMessageDialog(null, "Successful\n Thank You.");
				

			}



		});


		goBackButtonReference.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e){

				System.out.println("good");
				dispose();
				new UserDashBoard("User DashBoard", user);
				
				

			}



		});





	}





}