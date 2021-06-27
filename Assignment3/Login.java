package Assignment3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Component;

import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JDesktopPane;

public class Login extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				//2.2 Exception Handling
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 966, 618);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.BLACK));
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 977, 578);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			private Component frame;

			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "LOGIN", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnExit.setBackground(new Color(230, 230, 250));
		btnExit.setBounds(321, 469, 226, 26);
		panel.add(btnExit);
		
		JLabel lblNewLabel = new JLabel("WELCOME TO THE BEVERAGE SHOP SYSTEM");
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setForeground(new Color(255, 0, 255));
		lblNewLabel.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 34));
		lblNewLabel.setBounds(84, 0, 786, 76);
		panel.add(lblNewLabel);
		
		JButton btnAdminButton = new JButton("Admin");
		btnAdminButton.setBackground(new Color(230, 230, 250));
		btnAdminButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginAdmin AL = new LoginAdmin();
				AL.setModalExclusionType(null);
				AL.setVisible(true);
				dispose();
			}
		});
		btnAdminButton.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnAdminButton.setBounds(198, 410, 181, 38);
		panel.add(btnAdminButton);
		
		JButton btnCustomer = new JButton("Customer");
		btnCustomer.setBackground(new Color(230, 230, 250));
		btnCustomer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginCustomer CL = new LoginCustomer();
				CL.setModalExclusionType(null);
				CL.setVisible(true);
				dispose();
			}
		});
		btnCustomer.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnCustomer.setBounds(482, 410, 181, 38);
		panel.add(btnCustomer);
		
		JLabel lblNewLabel_2 = new JLabel("Please Kindly Choose Your Role");
		lblNewLabel_2.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 23));
		lblNewLabel_2.setForeground(new Color(240, 248, 255));
		lblNewLabel_2.setBounds(306, 174, 444, 26);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Asus\\Downloads\\Admin-icon (2).png"));
		lblNewLabel_3.setBounds(233, 283, 116, 128);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\Asus\\Downloads\\Person-Male-Light-icon.png"));
		lblNewLabel_4.setBounds(511, 280, 141, 135);
		panel.add(lblNewLabel_4);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Main frame = new Main();
				frame.setVisible(true);
				dispose();
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnBack.setBackground(new Color(230, 230, 250));
		btnBack.setBounds(321, 506, 226, 26);
		panel.add(btnBack);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBackground(new Color(135, 206, 250));
		lblNewLabel_1.setForeground(new Color(175, 238, 238));
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Asus\\Pictures\\l.jpg"));
		lblNewLabel_1.setBounds(-168, 0, 1118, 622);
		panel.add(lblNewLabel_1);
	}
}