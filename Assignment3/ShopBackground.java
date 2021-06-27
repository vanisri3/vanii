package Assignment3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;

public class ShopBackground extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	private String s, s1,s2,s3,s4,s5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShopBackground frame = new ShopBackground();
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
	public ShopBackground() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 877, 496);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 21, 861, 446);
		panel.setBackground(new Color(255, 228, 225));
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(148, 0, 211)));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(564, 79, 287, 294);
		panel.add(lblNewLabel_2);
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Asus\\Downloads\\shop name.jpg"));
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(148, 0, 211)));
		panel_1.setBackground(new Color(255, 228, 225));
		panel_1.setBounds(158, 11, 455, 57);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("SHOP BACKGROUND");
		lblNewLabel.setFont(new Font("Segoe Script", Font.BOLD, 26));
		lblNewLabel.setBounds(73, 11, 372, 33);
		panel_1.add(lblNewLabel);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(148, 0, 211)));
		panel_1_1.setBackground(new Color(255, 228, 225));
		panel_1_1.setBounds(21, 79, 537, 168);
		panel.add(panel_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("Shop Name : Vani's Non-Alcholic Beverage Shop");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.ITALIC, 15));
		lblNewLabel_1.setBounds(68, 11, 441, 53);
		panel_1_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Year Established : 2018");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Trebuchet MS", Font.ITALIC, 15));
		lblNewLabel_1_1.setBounds(56, 40, 441, 53);
		panel_1_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Contact Number : 01126953201");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Trebuchet MS", Font.ITALIC, 15));
		lblNewLabel_1_2.setBounds(56, 75, 441, 53);
		panel_1_1.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Location : No 322, Jalan Mahsuri  Lorong 12/1 09400 Padang Serai Kedah ");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setFont(new Font("Trebuchet MS", Font.ITALIC, 15));
		lblNewLabel_1_3.setBounds(10, 104, 530, 53);
		panel_1_1.add(lblNewLabel_1_3);
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setLayout(null);
		panel_1_3.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(148, 0, 211)));
		panel_1_3.setBackground(new Color(255, 228, 225));
		panel_1_3.setBounds(21, 258, 537, 115);
		panel.add(panel_1_3);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Instagram : @Vani'sNonAlcholicBeverage");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		lblNewLabel_1_1_1.setBounds(63, 11, 441, 53);
		panel_1_3.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Facebook: VANI's Non Alcholic Beverage Shop");
		lblNewLabel_1_1_2.setBounds(63, 51, 441, 53);
		panel_1_3.add(lblNewLabel_1_1_2);
		lblNewLabel_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_2.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		
		JButton btnNewButton = new JButton("EXIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Shop Background System", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			
			}
		});
		btnNewButton.setBounds(51, 384, 89, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Admin frame = new Admin();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(161, 384, 89, 23);
		panel.add(btnNewButton_1);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 875, 22);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Shop");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Shop Background");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ShopBackground frame = new ShopBackground();
				frame.setVisible(true);
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenu mnNewMenu_1 = new JMenu("Product");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Product Description");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String s = " ";
				String s1 = " ";
				String s2 = " ";
				String s3 = " ";
				String s4 =  " ";
				String s5 =  " ";
				
				ProductCustomer frame = new ProductCustomer(s, s1, s2, s3, s4, s5);
				frame.setVisible(true);
				
				
			}
			
		});
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu_3 = new JMenu("Marketing");
		menuBar.add(mnNewMenu_3);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Advertistment");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Marketing frame = new Marketing();
				frame.setVisible(true);
			}
		});
		mnNewMenu_3.add(mntmNewMenuItem_3);
		
		JMenu mnNewMenu_2 = new JMenu("Order");
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Ordering");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ordering frame = new Ordering();
				frame.setVisible(true);
			}
		});
		mnNewMenu_2.add(mntmNewMenuItem_2);
	}
}
