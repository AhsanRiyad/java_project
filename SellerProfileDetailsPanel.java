package view;

import basic.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.table.*;




public class SellerProfileDetailsPanel extends JPanel{

	SellerBasic seller;
	static Object[][] databaseInfo;
	static DefaultTableModel dTableModel;
	

	public SellerProfileDetailsPanel(SellerBasic seller)
	{
		this.seller = seller;


		
		this.setLayout(null);
		this.setBounds(0,0,600,600);
		// this.setBackground(Color.RED);


		
		

		getJTableTo();


		


	}


	public void getJTableTo(){


				Object[] columns = {"seller Id", "Full Name", "Email"};
				dTableModel = new DefaultTableModel(databaseInfo, columns);
				
				ArrayList<SellerBasic> list =new ArrayList<SellerBasic>();

				Object[] tempRow = new Object[3];
				list.add(seller);
				for(int i=0;i<list.size();i++){
					
					tempRow[0]=list.get(i).getId();
					tempRow[1]=list.get(i).getName();
					tempRow[2]=list.get(i).getEmail();
					
					
					dTableModel.addRow(tempRow);
				}
				
				JTable table = new JTable(dTableModel);
				table.setRowHeight(table.getRowHeight()+10);
				table.setAutoCreateRowSorter(true);
				table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

				TableColumn col1 = table.getColumnModel().getColumn(0);
				col1.setPreferredWidth(100);
				
				TableColumn col2 = table.getColumnModel().getColumn(1);
				col2.setPreferredWidth(190);
				
				TableColumn col3 = table.getColumnModel().getColumn(2);
				col3.setPreferredWidth(150);
				
				JScrollPane scrollPane = new JScrollPane(table);
				scrollPane.setBounds(50,50,458,100);
				add(scrollPane);








	}





}