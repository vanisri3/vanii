package Assignment3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame {

	private JPanel contentPane;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 764, 538);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 0)));
		panel.setBackground(new Color(184, 134, 11));
		panel.setBounds(0, 67, 697, 90);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("VANI's Non-Alcholic Beverage Shop");
		lblNewLabel_1.setFont(new Font("Centaur", Font.BOLD | Font.ITALIC, 40));
		lblNewLabel_1.setBounds(39, 11, 677, 68);
		panel.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("LOG IN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login frame = new Login();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("ROG Fonts", Font.BOLD | Font.ITALIC, 18));
		btnNewButton.setBounds(267, 223, 208, 63);
		contentPane.add(btnNewButton);
		
		JButton btnCustomer = new JButton("EXIT");
		btnCustomer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Beverage Shop", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			
			}
		});
		btnCustomer.setFont(new Font("ROG Fonts", Font.BOLD | Font.ITALIC, 18));
		btnCustomer.setBounds(267, 320, 208, 68);
		contentPane.add(btnCustomer);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(new Color(184, 134, 11));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Asus\\Downloads\\photo_2021-06-21_23-50-42.jpg"));
		lblNewLabel.setBounds(0, 0, 748, 496);
		contentPane.add(lblNewLabel);
	}
}
