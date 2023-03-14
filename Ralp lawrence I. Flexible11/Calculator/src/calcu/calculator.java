package calcu;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class calculator {

	private JFrame frame;
	private JTextField num1;
	private JTextField num2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
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
	public calculator() {
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
		
		num1 = new JTextField();
		num1.setBounds(10, 74, 182, 46);
		frame.getContentPane().add(num1);
		num1.setColumns(10);
		JLabel lblNewLabel = new JLabel("Calculator");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblNewLabel.setBounds(125, 11, 161, 30);
		frame.getContentPane().add(lblNewLabel);
		
		final JLabel Answer = new JLabel("");
		Answer.setHorizontalAlignment(SwingConstants.CENTER);
		Answer.setBounds(159, 172, 89, 30);
		num2 = new JTextField();
		num2.setBounds(220, 74, 204, 46);
		frame.getContentPane().add(num2);
		num2.setColumns(10);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try{
					int x = Integer.parseInt(num1.getText());
					int y = Integer.parseInt(num2.getText());
					Answer.setText(String.valueOf(x+y));
				}catch(Exception n) {
					Answer.setText("ERROR : "+n.getMessage());
				}
			}
		});
		btnNewButton.setBounds(42, 161, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("SUBTRACT");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try{
				int x = Integer.parseInt(num1.getText());
				int y = Integer.parseInt(num2.getText());
				Answer.setText(String.valueOf(x-y));
			}catch(Exception n) {
				Answer.setText("ERROR : "+n.getMessage());
			}
			}
		});
		btnNewButton_1.setBounds(42, 202, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("MULTIPLY");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try{
					int x = Integer.parseInt(num1.getText());
					int y = Integer.parseInt(num2.getText());
					Answer.setText(String.valueOf(x*y));
				}catch(Exception n) {
					Answer.setText("ERROR : "+n.getMessage());
			}
			}
		});
		btnNewButton_2.setBounds(287, 161, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("DIVIDE");
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try{
				double x = Double.parseDouble(num1.getText());
				double y = Double.parseDouble(num2.getText());
				Answer.setText(String.valueOf(x/y));
			}catch(Exception n) {
				Answer.setText("ERROR : "+n.getMessage());
			}
			}
			});
		btnNewButton_3.setBounds(287, 202, 89, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		
		frame.getContentPane().add(Answer);
	}

}
