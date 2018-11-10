package view;

import basic.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.table.*;




public class UserProfileDetailsPanel extends JPanel{

	UserBasic user;
	static Object[][] databaseInfo;
	static DefaultTableModel dTableModel;
	

	public UserProfileDetailsPanel(UserBasic user)
	{
		this.user = user;


		
		this.setLayout(null);
		this.setBounds(0,0,600,600);
		// this.setBackground(Color.RED);


		
		

		getJTableTo();


		


	}


	public void getJTableTo(){


				Object[] columns = {"User Id", "Full Name", "Email"};
				dTableModel = new DefaultTableModel(databaseInfo, columns);
				
				ArrayList<UserBasic> list =new ArrayList<UserBasic>();

				Object[] tempRow = new Object[3];
				list.add(user);
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