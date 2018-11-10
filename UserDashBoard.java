package view;

import basic.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;




public class UserDashBoard extends JFrame{
	
	UserBasic user;

	public UserDashBoard(String titleName , UserBasic user)
	{
		this.user = user;
		this.setTitle(titleName);
		this.setSize(500,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		// this.setLayout(null);

		/*other codes goes here*/
		
		
		getMunuBarMethod();
		getTabbedPaneMethod();

		/*setVisible should be the last line*/

		this.setVisible(true);

	}




	/*code for panel*/

	public void getTabbedPaneMethod()
	{

			TabbedPaneClass tabbedPane1 = new TabbedPaneClass(this , user);
			this.add(tabbedPane1);

	}


	/*code for menuBar*/
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


}