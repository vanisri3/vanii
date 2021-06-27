package Assignment3;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;

public class Admin extends JFrame {

	private JPanel contentPane;
	//private Container menuBar1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin frame = new Admin();
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
	public Admin() {
		
	
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 693, 360);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 74, 667, 247);
		panel.setBackground(new Color(188, 143, 143));
		panel.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(165, 42, 42)));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(165, 42, 42)));
		panel_1.setBackground(new Color(188, 143, 143));
		panel_1.setBounds(195, 53, 427, 75);
		panel.add(panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("WELCOME TO ADMIN PAGE");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 26));
		lblNewLabel_1.setBounds(10, 11, 407, 49);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(21, 43, 229, 192);
		panel.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Asus\\Downloads\\Admin-icon.png"));
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Login frame = new Login();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(281, 184, 89, 23);
		panel.add(btnNewButton);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 22, 461, 63);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu1 = new JMenu("Inventory");
		mnNewMenu1.setFont(new Font("Goudy Old Style", Font.BOLD | Font.ITALIC, 17));
		menuBar.add(mnNewMenu1);
		
		JMenuItem mntmNewMenuItem1 = new JMenuItem("inventory");
		mntmNewMenuItem1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Inventory frame = new Inventory();
				frame.setVisible(true);
			}
		});
		mnNewMenu1.add(mntmNewMenuItem1);
		
		JMenu mnNewMenu_1 = new JMenu("sales");
		mnNewMenu_1.setFont(new Font("Goudy Old Style", Font.BOLD | Font.ITALIC, 18));
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Sales");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sales frame = new Sales();
				frame.setVisible(true);
				
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu = new JMenu("Employee");
		mnNewMenu.setFont(new Font("Goudy Old Style", Font.BOLD | Font.ITALIC, 18));
		mnNewMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Employee");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Employee frame = new Employee();
				frame.setVisible(true);
				
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenu mnNewMenu_2 = new JMenu("Shop Info");
		mnNewMenu_2.setFont(new Font("Goudy Old Style", Font.BOLD | Font.ITALIC, 18));
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Shop Background");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ShopBackground frame = new ShopBackground();
				frame.setVisible(true);
			}
		});
		mnNewMenu_2.add(mntmNewMenuItem_2);
		
		JMenu mnNewMenu_3 = new JMenu("Product");
		mnNewMenu_3.setFont(new Font("Goudy Old Style", Font.BOLD | Font.ITALIC, 18));
		menuBar.add(mnNewMenu_3);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Product");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ProductAdmin frame = new ProductAdmin();
				frame.setVisible(true);
			}
			
			
		});
		mnNewMenu_3.add(mntmNewMenuItem_3);
	}
}
