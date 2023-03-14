package taxcalcu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Taxcalculator {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Taxcalculator window = new Taxcalculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Taxcalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tax Calculator");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setBounds(10, 11, 414, 30);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Gift Value");
		lblNewLabel_1.setBounds(10, 63, 82, 30);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(102, 68, 294, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Tax:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(152, 193, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(192, 195, 204, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				  int giftvalue = Integer.parseInt(textField.getText());	  
			      if (giftvalue < 5000 ) {
			    	  lblNewLabel_3.setText(" No Tax");
			      } else if (giftvalue >= 5000 && giftvalue <= 25000) {
			    	  int tax = 100;
			    	  int finaltax = giftvalue-5000;
			    	  double taxrate = 0.08;
			    	  double finaltaxrate = tax + finaltax * taxrate;
			    	  String ftr = String.valueOf(finaltaxrate);
			    	  lblNewLabel_3.setText(ftr);
			      } else if (giftvalue >=25000 && giftvalue <= 55000) {
			    	  int tax = 1700;
			    	  int finaltax = giftvalue - 25000;
			    	  double taxrate = 0.10;
				      double finaltaxrate = tax + finaltax * taxrate;
				      String ftr = String.valueOf(finaltaxrate);
				      lblNewLabel_3.setText(ftr);
			      } else if (giftvalue >=55000 && giftvalue <= 200000) {
			    	  int tax = 4700;
			    	  int finaltax = giftvalue - 55000;
			    	  double taxrate = 0.12;
				      double finaltaxrate = tax + finaltax * taxrate;
				      String ftr = String.valueOf(finaltaxrate);
				      lblNewLabel_3.setText(ftr);
			      } else if (giftvalue >= 200000 && giftvalue <= 1000000) {
			    	  int tax = 22100;
			    	  int finaltax = giftvalue - 200000;
			    	  double taxrate = 0.15;
				      double finaltaxrate = tax + finaltax * taxrate;
				      String ftr = String.valueOf(finaltaxrate);
				      lblNewLabel_3.setText(ftr);
			      } else if (giftvalue >= 1000000) {
			    	  int tax = 142100;
			    	  int finaltax = giftvalue - 1000000;
			    	  double taxrate = 0.17;
				      double finaltaxrate = tax + finaltax * taxrate;
				      String ftr = String.valueOf(finaltaxrate);
				      lblNewLabel_3.setText(ftr);
			      }
			}
		});
		btnNewButton.setBounds(35, 189, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		
	}
}
