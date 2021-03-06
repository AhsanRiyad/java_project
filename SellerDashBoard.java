package view;

import basic.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;




public class SellerDashBoard extends JFrame{
	
	SellerBasic seller;

	public SellerDashBoard(SellerBasic seller)
	{
		this.seller = seller;
		this.setTitle("SellerDashBoard");
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

			SellerTabbedPaneClass tabbedPane1 = new SellerTabbedPaneClass(this , seller);
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