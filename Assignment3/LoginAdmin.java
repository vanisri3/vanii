package Assignment3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class LoginAdmin extends JFrame {

	private JPanel contentPane;
	private JTextField UserNametextField;
	private JTextField PasswordtextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				//2.2 Exception Handling
				try {
					LoginAdmin frame = new LoginAdmin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginAdmin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 747, 540);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.DARK_GRAY));
		panel.setBackground(new Color(233, 150, 122));
		panel.setBounds(0, 0, 729, 502);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserNametextField.setText("");
				PasswordtextField.setText("");
			}
		});
		
		JButton button = new JButton("Back");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login L = new Login();
				L.setModalExclusionType(null);
				L.setVisible(true);
				dispose();
			}
		});
		
		button.setFont(new Font("Tahoma", Font.PLAIN, 20));
		button.setBounds(556, 459, 83, 32);
		panel.add(button);
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnReset.setBounds(302, 433, 171, 32);
		panel.add(btnReset);
		
		JLabel UserNameJLabel = new JLabel("User Name");
		UserNameJLabel.setBounds(216, 199, 213, 32);
		UserNameJLabel.setForeground(new Color(0, 0, 0));
		UserNameJLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel.add(UserNameJLabel);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(215, 266, 247, 47);
		lblPassword.setForeground(new Color(0, 0, 0));
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel.add(lblPassword);
		
		UserNametextField = new JTextField();
		UserNametextField.setBounds(256, 230, 327, 40);
		UserNametextField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panel.add(UserNametextField);
		UserNametextField.setColumns(10);
		
		PasswordtextField = new JTextField();
		PasswordtextField.setBounds(256, 302, 327, 40);
		PasswordtextField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PasswordtextField.setColumns(10);
		panel.add(PasswordtextField);
		
		JButton btnLoginButton = new JButton("Login");
		btnLoginButton.setBounds(270, 397, 219, 25);
		btnLoginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//2.2 Exception Handling
				try {  
					if(UserNametextField.getText().equals("vanisri")&& PasswordtextField.getText().equals("3006")) {
						JOptionPane.showMessageDialog(null, "Login Succesfull");
						Admin frame= new Admin();
						frame.setModalExclusionType(null);
						frame.setVisible(true);
						dispose();
						}
					
					else 
						JOptionPane.showMessageDialog(null, "Login UnSuccesfull");
						
					
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Please enter the right user name and password");
				}
			}
		});
		btnLoginButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel.add(btnLoginButton);
		
		JLabel lblAdminLoginPage = new JLabel("Admin Login Page");
		lblAdminLoginPage.setBounds(129, 27, 482, 60);
		lblAdminLoginPage.setForeground(new Color(0, 0, 0));
		lblAdminLoginPage.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdminLoginPage.setFont(new Font("Blackadder ITC", Font.BOLD, 45));
		panel.add(lblAdminLoginPage);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(117, 82, 790, 409);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Asus\\Pictures\\kl.jpg"));
		panel.add(lblNewLabel);
	}
}