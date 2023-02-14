package Studinfo;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Set;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.Color;


import javax.swing.table.DefaultTableModel;

import org.sqlite.SQLiteConnection;

import com.github.lgooddatepicker.components.DatePicker;

import net.proteanit.sql.DbUtils;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StudentInformationSystem {

	private JFrame StudentInformationSystem;
	private JTable table;
	private JTextField studentid;
	private JTextField Fname;
	private JTextField Lname;
	private JTextField Age;
	private JTextField Mname;
	private JTextField Ftname;
	private JTextField Cpno;
	private JTextField Address;
	private static Connection con = null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 //Step 1 : Register the SQLite JDBC Driver
				         Class.forName("org.sqlite.JDBC");
				      //Step 2 : connecting to our database
				           con = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Ralp\\Desktop\\StudentInformationSystem.db"); // connecting to our 
			               con.setAutoCommit(false);
			                System.out.println("Connected");
					StudentInformationSystem window = new StudentInformationSystem();
					window.StudentInformationSystem.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StudentInformationSystem() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
	    

	    
		StudentInformationSystem = new JFrame();
		StudentInformationSystem.getContentPane().setBackground(Color.CYAN);
		StudentInformationSystem.setBounds(100, 100, 888, 420);
		StudentInformationSystem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		StudentInformationSystem.getContentPane().setLayout(null);
	
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(249, 21, 613, 349);
		StudentInformationSystem.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		table.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		table.setBackground(Color.WHITE);
		table.setDefaultEditor(Object.class, null);
		table.setEnabled(false);
		table.setModel(new DefaultTableModel(
       
			new Object[][] {
			},
			new String[] {
			}
		));
		scrollPane.setViewportView(table);
		table.getTableHeader().setReorderingAllowed(false);
		
		JLabel StudentIDLabel = new JLabel("UserID");
		StudentIDLabel.setBounds(10, 11, 46, 14);
		StudentInformationSystem.getContentPane().add(StudentIDLabel);
		
		JLabel FnameLabel = new JLabel("FirstName");
		FnameLabel.setBounds(10, 37, 53, 14);
		StudentInformationSystem.getContentPane().add(FnameLabel);
		
		JLabel LnameLabel_1 = new JLabel("LastName");
		LnameLabel_1.setBounds(10, 68, 53, 14);
		StudentInformationSystem.getContentPane().add(LnameLabel_1);
		
		JLabel gndr = new JLabel("Gender");
		gndr.setBounds(10, 93, 46, 14);
		
		JLabel AgeLabel_2 = new JLabel("Age");
		AgeLabel_2.setBounds(17, 125, 46, 14);
		StudentInformationSystem.getContentPane().add(AgeLabel_2);
		JLabel Bdate = new JLabel("Birthdate");
		Bdate.setBounds(10, 157, 46, 14);
		StudentInformationSystem.getContentPane().add(Bdate);
		
		JLabel MnameLabel_4 = new JLabel("MotherName");
		MnameLabel_4.setBounds(10, 182, 65, 14);
		StudentInformationSystem.getContentPane().add(MnameLabel_4);
		
		JLabel FnameLabel_5 = new JLabel("FatherName");
		FnameLabel_5.setBounds(10, 207, 65, 14);
		StudentInformationSystem.getContentPane().add(FnameLabel_5);
		
		JLabel CpnoLabel_6 = new JLabel("CellphoneNumber");
		CpnoLabel_6.setBounds(0, 232, 89, 14);
		StudentInformationSystem.getContentPane().add(CpnoLabel_6);
		
		JLabel AddressLabel_7 = new JLabel("Address");
		AddressLabel_7.setBounds(10, 257, 46, 14);
		StudentInformationSystem.getContentPane().add(AddressLabel_7);
		
		JComboBox gender = new JComboBox();
		gender.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female", "Gay", "Lesbian"}));
		gender.setToolTipText("\r\n");
		gender.setBounds(126, 89, 92, 22);
		StudentInformationSystem.getContentPane().add(gender);
		
		DatePicker bdate = new DatePicker();
		bdate.setBounds(84, 151, 139, 20);
		StudentInformationSystem.getContentPane().add(bdate);
		
		StudentInformationSystem.getContentPane().add(gndr);
		studentid = new JTextField();
		studentid.setBounds(91, 8, 132, 20);
		StudentInformationSystem.getContentPane().add(studentid);
		studentid.setColumns(10);
		
		Fname = new JTextField();
		Fname.setBounds(91, 34, 132, 20);
		StudentInformationSystem.getContentPane().add(Fname);
		Fname.setColumns(10);
		
		Lname = new JTextField();
		Lname.setBounds(91, 65, 132, 20);
		StudentInformationSystem.getContentPane().add(Lname);
		Lname.setColumns(10);
		
		Age = new JTextField();
		Age.setBounds(182, 119, 36, 23);
		StudentInformationSystem.getContentPane().add(Age);
		Age.setColumns(10);
		
		Mname = new JTextField();
		Mname.setBounds(91, 178, 132, 20);
		StudentInformationSystem.getContentPane().add(Mname);
		Mname.setColumns(10);
		
		Ftname = new JTextField();
		Ftname.setBounds(91, 204, 132, 20);
		StudentInformationSystem.getContentPane().add(Ftname);
		Ftname.setColumns(10);
		
		Cpno = new JTextField();
		Cpno.setBounds(91, 229, 132, 20);
		StudentInformationSystem.getContentPane().add(Cpno);
		Cpno.setColumns(10);
		
		Address = new JTextField();
		Address.setBounds(91, 254, 132, 20);
		StudentInformationSystem.getContentPane().add(Address);
		Address.setColumns(10);
		

		JButton AddButton = new JButton("ADD");
		AddButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
                 try { 
					  //Storing StudentDetails into Database
					 String sql = ("INSERT INTO StudentInfo (UserID,FirstName,LastName,Gender,Age,Birthdate,MotherName,FatherName,CellphoneNumber,Address) VALUES (?,?,?,?,?,?,?,?,?,?)");
				    PreparedStatement statement = con.prepareStatement(sql);
				    statement.setString(1, studentid.getText());
				    statement.setString(2, Fname.getText());
				    statement.setString(3, Lname.getText());
				    statement.setString(4, gender.getSelectedItem().toString());
				    statement.setString(6, bdate.getDateStringOrEmptyString());
				    statement.setString(5, Age.getText());
				    statement.setString(7, Mname.getText());
				    statement.setString(8, Ftname.getText());
				    statement.setString(9, Cpno.getText());
				    statement.setString(10, Address.getText());
				    statement.executeUpdate();
				    con.commit();
				    JOptionPane.showMessageDialog(null, "Student information saved successfuly!", "Saved Successfuly!", JOptionPane.INFORMATION_MESSAGE);
				    String query = "Select * from StudentInfo";
					PreparedStatement pst = con.prepareStatement(query);
					ResultSet resultset = pst.executeQuery();
					table.setModel (DbUtils.resultSetToTableModel(resultset));
				} catch (Exception s) {
					s.printStackTrace();
		 }
				  }
		});
		AddButton.setBounds(10, 307, 89, 23);
		StudentInformationSystem.getContentPane().add(AddButton);
		
		JButton UpdateButton = new JButton("Update");
		UpdateButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
	
			   try {
				   String query = "Update StudentInfo set UserID ='"+studentid.getText()+"' ,FirstName='"+Fname.getText()+
				   "' ,LastName='"+Lname.getText()+"', Gender='"+gender.getSelectedItem().toString()+"' ,Age='"+Age.getText()+
				   "' ,Birthdate='"+bdate.getDateStringOrEmptyString()+"' ,MotherName='"+Mname.getText()+"' ,FatherName='"+Mname.getText()+
				   "' ,CellphoneNumber='"+Cpno.getText()+"' ,Address='"+Address.getText()+"' where UserID='"+studentid.getText()+"' "; 
				   
				   PreparedStatement pst = con.prepareStatement(query);
				   
				   pst.execute();
				   
				   JOptionPane.showMessageDialog(null,"Data Updated");
				   
				   pst.close();
				   
			   } catch (Exception ex) {
				   ex.printStackTrace();
			   }
			 }
		
		});
		UpdateButton.setBounds(109, 307, 89, 23);
		StudentInformationSystem.getContentPane().add(UpdateButton);
		
		JButton Show = new JButton("Show");
		Show.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Show.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try { 
					String query = "Select * from StudentInfo";
				PreparedStatement pst = con.prepareStatement(query);
				ResultSet resultset = pst.executeQuery();
				table.setModel (DbUtils.resultSetToTableModel(resultset));
			} catch (Exception s) {
				s.printStackTrace();
			 }
			}
		});
		Show.setBounds(10, 341, 89, 23);
		StudentInformationSystem.getContentPane().add(Show);
		
		JButton DelButton = new JButton("Delete");
		DelButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					String query = "DELETE FROM StudentInfo WHERE UserID ='"+studentid.getText()+"' ";
					PreparedStatement pst = con.prepareStatement(query);
					
					pst.execute();
					
					JOptionPane.showMessageDialog(null,"Data Deleted");
					
					pst.close();
					
				} catch(Exception es) {
					es.printStackTrace();
				}
			}
			
		});
		DelButton.setBounds(109, 341, 89, 23);
		StudentInformationSystem.getContentPane().add(DelButton);
		
	}
}
