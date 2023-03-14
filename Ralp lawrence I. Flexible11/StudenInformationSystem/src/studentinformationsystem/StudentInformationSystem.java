package studentinformationsystem;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.JTextField;

//import sqliteConnection;

import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JScrollPane;

public class StudentInformationSystem {

	private JFrame frmStudentInformationSystem;
	private JTextField txtStudID;
	private JTextField txtFName;
	private JTextField txtMName;
	private JTextField txtLName;
	private JTextField txtAge;
	private JTextField txtMothersName;
	private JTextField txtFathersName;
	private JTextField txtCPNumber;
	private JTextField txtAddress;
	private JTable tableRecords;
	private JComboBox cmbGender;
	private JDateChooser dateChooser; 
	private JButton btnUpdate;
	private JButton btnAddNewRecord;
	
		
	
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentInformationSystem window = new StudentInformationSystem();
					window.frmStudentInformationSystem.setVisible(true);
					
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
		dateChooser.hide();
		btnUpdate.hide();
		
		//connection  = sqliteConnection.dbConnector();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmStudentInformationSystem = new JFrame();
		frmStudentInformationSystem.getContentPane().setBackground(new Color(0, 128, 128));
		frmStudentInformationSystem.setResizable(false);
		frmStudentInformationSystem.setTitle("Student Information System");
		frmStudentInformationSystem.setBounds(100, 100, 1232, 434);
		frmStudentInformationSystem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmStudentInformationSystem.getContentPane().setLayout(null);
		
		JLabel lblStudID = new JLabel("Student ID : ");
		lblStudID.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				
				//JOptionPane.showMessageDialog(null,"Hello World!");
			}
		});
		lblStudID.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblStudID.setHorizontalAlignment(SwingConstants.RIGHT);
		lblStudID.setBounds(35, 22, 114, 14);
		frmStudentInformationSystem.getContentPane().add(lblStudID);
		
		JLabel lblFName = new JLabel("FirstName : ");
		lblFName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblFName.setBounds(0, 47, 149, 14);
		frmStudentInformationSystem.getContentPane().add(lblFName);
		
		JLabel lblMName = new JLabel("MiddleName : ");
		lblMName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMName.setBounds(43, 72, 106, 14);
		frmStudentInformationSystem.getContentPane().add(lblMName);
		
		JLabel lblLName = new JLabel("LastName : ");
		lblLName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLName.setBounds(43, 97, 106, 14);
		frmStudentInformationSystem.getContentPane().add(lblLName);
		
		JLabel lblBirthday = new JLabel("Birthdate : ");
		lblBirthday.setHorizontalAlignment(SwingConstants.RIGHT);
		lblBirthday.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblBirthday.setBounds(43, 122, 106, 14);
		frmStudentInformationSystem.getContentPane().add(lblBirthday);
		
		JLabel lblAge = new JLabel("Age : ");
		lblAge.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAge.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAge.setBounds(43, 142, 106, 19);
		frmStudentInformationSystem.getContentPane().add(lblAge);
		
		JLabel lblGender = new JLabel("Gender : ");
		lblGender.setHorizontalAlignment(SwingConstants.RIGHT);
		lblGender.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblGender.setBounds(43, 163, 106, 14);
		frmStudentInformationSystem.getContentPane().add(lblGender);
		
		JLabel lblMothersName = new JLabel("Mothers' Name : ");
		lblMothersName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMothersName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMothersName.setBounds(30, 188, 119, 14);
		frmStudentInformationSystem.getContentPane().add(lblMothersName);
		
		JLabel lblFatherName = new JLabel("Fathers' Name : ");
		lblFatherName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFatherName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblFatherName.setBounds(30, 213, 119, 14);
		frmStudentInformationSystem.getContentPane().add(lblFatherName);
		
		txtStudID = new JTextField();
		txtStudID.setEnabled(false);
		txtStudID.setBounds(159, 21, 255, 20);
		frmStudentInformationSystem.getContentPane().add(txtStudID);
		txtStudID.setColumns(10);
		
		JLabel lblCPNum = new JLabel("Cellphone Number : ");
		lblCPNum.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCPNum.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCPNum.setBounds(10, 239, 139, 14);
		frmStudentInformationSystem.getContentPane().add(lblCPNum);
		
		JLabel lblAddress = new JLabel("Address : ");
		lblAddress.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAddress.setBounds(30, 264, 119, 14);
		frmStudentInformationSystem.getContentPane().add(lblAddress);
		
		txtFName = new JTextField();
		txtFName.setEnabled(false);
		txtFName.setColumns(10);
		txtFName.setBounds(159, 46, 255, 20);
		frmStudentInformationSystem.getContentPane().add(txtFName);
		
		txtMName = new JTextField();
		txtMName.setEnabled(false);
		txtMName.setColumns(10);
		txtMName.setBounds(159, 71, 255, 20);
		frmStudentInformationSystem.getContentPane().add(txtMName);
		
		txtLName = new JTextField();
		txtLName.setEnabled(false);
		txtLName.setColumns(10);
		txtLName.setBounds(159, 96, 255, 20);
		frmStudentInformationSystem.getContentPane().add(txtLName);
		
		txtAge = new JTextField();
		txtAge.setEnabled(false);
		txtAge.setColumns(10);
		txtAge.setBounds(159, 143, 255, 20);
		frmStudentInformationSystem.getContentPane().add(txtAge);
		
		txtMothersName = new JTextField();
		txtMothersName.setEnabled(false);
		txtMothersName.setColumns(10);
		txtMothersName.setBounds(159, 187, 255, 20);
		frmStudentInformationSystem.getContentPane().add(txtMothersName);
		
		txtFathersName = new JTextField();
		txtFathersName.setEnabled(false);
		txtFathersName.setColumns(10);
		txtFathersName.setBounds(159, 212, 255, 20);
		frmStudentInformationSystem.getContentPane().add(txtFathersName);
		
		txtCPNumber = new JTextField();
		txtCPNumber.setEnabled(false);
		txtCPNumber.setColumns(10);
		txtCPNumber.setBounds(159, 238, 255, 20);
		frmStudentInformationSystem.getContentPane().add(txtCPNumber);
		
		txtAddress = new JTextField();
		txtAddress.setEnabled(false);
		txtAddress.setColumns(10);
		txtAddress.setBounds(159, 263, 255, 20);
		frmStudentInformationSystem.getContentPane().add(txtAddress);
		
		dateChooser = new JDateChooser();
		dateChooser.setBounds(159, 122, 255, 20);
		frmStudentInformationSystem.getContentPane().add(dateChooser);
		
		cmbGender = new JComboBox();
		cmbGender.setEnabled(false);
		cmbGender.setModel(new DefaultComboBoxModel(new String[] {"Female", "Male", "TransGender", "Prefer not to Tell"}));
		cmbGender.setBounds(159, 161, 255, 22);
		frmStudentInformationSystem.getContentPane().add(cmbGender);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(424, 22, 739, 362);
		frmStudentInformationSystem.getContentPane().add(scrollPane);
		
		
		tableRecords = new JTable();
		scrollPane.setViewportView(tableRecords);
		tableRecords.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		tableRecords.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tableRecords.setBackground(new Color(144, 238, 144));
		tableRecords.setEnabled(false);
			
		
		btnAddNewRecord = new JButton("Add Record");
		btnAddNewRecord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btnAddNewRecord.hide();
				txtStudID.enable();
				txtFName.enable();
				txtMName.enable();
				txtLName.enable();
				txtAge.enable();
				cmbGender.enable();
				dateChooser.show();
				txtMothersName.enable();
				txtFathersName.enable();
				txtCPNumber.enable();
				txtAddress.enable();
				btnUpdate.show();
			}
		});
		btnAddNewRecord.setBounds(133, 326, 128, 23);
		frmStudentInformationSystem.getContentPane().add(btnAddNewRecord);
		
		
		btnUpdate = new JButton("Update Record");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
				connection  = sqliteConnection.dbConnector();
				try {
					//SimpleDateFormat sdf = new SimpleDateFormat("MMM d, y");
					//String date = sdf.format(dateChooser.getDate());
					//Connection connection = sqliteConnection.dbConnector();
					//PreparedStatement statement = connection.prepareStatement("UPDATE tblStudentInfo SET FirstName = ?, MiddleInitial = ?, LastName = ?, Birthday = ?, Age = ?, Gender = ?, MothersName = ?, FathersName = ?, CPNumber = ?, Address = ? WHERE StudID = ?");
														
								
					PreparedStatement statement = connection.prepareStatement("INSERT INTO tblStudentInfo(StudID, FirstName, MiddleInitial, LastName, Birthday, Age, Gender, MothersName, FathersName, CPNumber, Address) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
					statement.setString(1, txtStudID.getText());
					statement.setString(2, txtFName.getText());
					statement.setString(3, txtMName.getText());
					statement.setString(4, txtLName.getText());
					statement.setString(5, dateChooser.getDate().toString());
					statement.setString(6, txtAge.getText());
					statement.setString(7, cmbGender.getSelectedItem().toString());
					statement.setString(8, txtMothersName.getText());
					statement.setString(9, txtFathersName.getText());
					statement.setString(10, txtCPNumber.getText());
					statement.setString(11, txtAddress.getText());
					statement.execute();
					JOptionPane.showMessageDialog(null, "Student information saved successfuly!", "Saved Successfuly!", JOptionPane.INFORMATION_MESSAGE);
					
					btnAddNewRecord.show();
					txtStudID.enable(false);txtFName.enable(false);txtMName.enable(false);txtLName.enable(false);txtAge.enable(false);
					cmbGender.enable(false);dateChooser.show();
					txtMothersName.enable(false);txtFathersName.enable(false);txtCPNumber.enable(false);txtAddress.enable(false);btnUpdate.hide();
					dateChooser.hide();
					
					//String query = "select * from tblStudentInfo";
					String query = "select StudID, FirstName, MiddleInitial, LastName, Gender, CPNumber, Address from tblStudentInfo";
					PreparedStatement pst = connection.prepareStatement(query);
					ResultSet rs = pst.executeQuery();
					tableRecords.setModel(DbUtils.resultSetToTableModel(rs));
//					
				} catch (SQLException e2) {
					e2.printStackTrace();
					JOptionPane.showMessageDialog(null, "Something Wrong\nDouble check your inserted information.");
				}
				
			}
			
		});
		btnUpdate.setBounds(271, 326, 128, 23);
		frmStudentInformationSystem.getContentPane().add(btnUpdate);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.setBounds(133, 360, 128, 23);
		frmStudentInformationSystem.getContentPane().add(btnEdit);
		
		JButton btnSearchRecord = new JButton("Search Record");
		btnSearchRecord.setBounds(271, 360, 128, 23);
		frmStudentInformationSystem.getContentPane().add(btnSearchRecord);
	}
}
