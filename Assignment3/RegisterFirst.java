package Assignment3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.UIManager;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ImageIcon;

public class RegisterFirst extends JFrame {

	private JPanel contentPane;
	protected JTextField Unametxt;
	private JTextField Emailtxt;
	protected JTextField Passtxt;
	private JTextField ConPasstxt;
	public static JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				//2.2 Exception Handling
				try {
					RegisterFirst frame = new RegisterFirst();
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
	public RegisterFirst() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 979, 470);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(109, 109, 109)));
		panel.setBackground(new Color(128, 128, 128));
		panel.setBounds(0, 0, 961, 432);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(109, 109, 109)));
		panel_1.setBackground(SystemColor.controlHighlight);
		panel_1.setBounds(301, 0, 391, 44);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Customer Registration");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(10, 0, 371, 43);
		panel_1.add(lblNewLabel);
		
		Unametxt = new JTextField();
		Unametxt.setFont(new Font("Tahoma", Font.BOLD, 20));
		Unametxt.setBounds(27, 139, 324, 31);
		panel.add(Unametxt);
		Unametxt.setColumns(10);
		
		Emailtxt = new JTextField();
		Emailtxt.setFont(new Font("Tahoma", Font.BOLD, 20));
		Emailtxt.setColumns(10);
		Emailtxt.setBounds(27, 191, 324, 31);
		panel.add(Emailtxt);
		
		Passtxt = new JTextField();
		Passtxt.setFont(new Font("Tahoma", Font.BOLD, 20));
		Passtxt.setColumns(10);
		Passtxt.setBounds(27, 245, 324, 31);
		panel.add(Passtxt);
		
		ConPasstxt = new JTextField();
		ConPasstxt.setFont(new Font("Tahoma", Font.BOLD, 20));
		ConPasstxt.setColumns(10);
		ConPasstxt.setBounds(27, 296, 324, 31);
		panel.add(ConPasstxt);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(600, 114, 351, 172);
		panel.add(scrollPane);
		
		//2.3 File IO
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"User Name", "Email", "Password"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton ResetBtn = new JButton("Reset");
		ResetBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Unametxt.setText("");
				Emailtxt.setText("");
				Passtxt.setText("");
				ConPasstxt.setText("");
			}
		});
		
		ResetBtn.setForeground(Color.BLACK);
		ResetBtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		ResetBtn.setBounds(27, 399, 144, 22);
		panel.add(ResetBtn);
		
		JButton btnBackToLogin = new JButton("Login");
		btnBackToLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				LoginCustomer CL = new LoginCustomer();
				CL.setModalExclusionType(null);
				CL.setVisible(true);
				dispose();
			}
		});
		btnBackToLogin.setForeground(Color.BLACK);
		btnBackToLogin.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnBackToLogin.setBounds(27, 363, 144, 25);
		panel.add(btnBackToLogin);
		
		JButton btnUpload = new JButton("Upload");
		btnUpload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//2.2 Exception Handling
				try {
					File file = new File("C:\\Users\\Asus\\Documents\\gui\\RegisterFirst.txt");
					if(!file.exists()) {
						file.createNewFile();
						}
					FileWriter fw = new FileWriter(file.getAbsoluteFile());
					BufferedWriter bw = new BufferedWriter(fw);
					
					for (int i=0; i<table.getRowCount(); i++) {
						for (int j=0; j<table.getColumnCount(); j++) {
							bw.write(table.getModel().getValueAt(i, j) + "  ");
							}
						bw.write("\n________\n");
						}
						bw.close();
						fw.close();
						JOptionPane.showMessageDialog(null, "Data Exported");
					}
					catch(Exception ex) {
						ex.printStackTrace();
					}
			}
		});
		btnUpload.setForeground(Color.BLACK);
		btnUpload.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnUpload.setBounds(718, 296, 112, 31);
		panel.add(btnUpload);
		
		JButton btnSubmit = new JButton("Register");
		btnSubmit.setBackground(new Color(255, 255, 255));
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//2.2 Exception handling
				try {
				String Fname = Unametxt.getText();
				String Email = Emailtxt.getText();
				String Password = Passtxt.getText();
				String Cpassword = ConPasstxt.getText();
				
				if(Fname.equals("")) 
					JOptionPane.showMessageDialog(null, "User name cannot be empty\nRegistration unsuccessful");
				
				else if(Email.equals("")) 
					JOptionPane.showMessageDialog(null, "Enter your email\nRegistration unsuccessful");
				
				else if(Password.equals("")) 
					JOptionPane.showMessageDialog(null, "Enter your password\nRegistration unsuccessful");
				
				else if(!Cpassword.equals(Password)) 
					JOptionPane.showMessageDialog(null, "Password is not same!!!\nRegistration unsuccessful");
				
				else {
					
					JOptionPane.showMessageDialog(null, "Registration is successful");
					DefaultTableModel model = (DefaultTableModel) table.getModel();
					model.addRow(new Object[]{
						Unametxt.getText(),
						Emailtxt.getText(),
						Passtxt.getText(),
				});
				
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Register Information Update confirmed", "Registration",
								JOptionPane.OK_OPTION);
					}
				}
			}
		  } catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Please enter the right USER NAME and PASSWORD!", "Error", JOptionPane.ERROR_MESSAGE);
				}
		}
		});
		btnSubmit.setForeground(Color.BLACK);
		btnSubmit.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSubmit.setBounds(27, 332, 94, 25);
		panel.add(btnSubmit);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 8));
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Asus\\Pictures\\Picture5.png"));
		lblNewLabel_1.setBounds(-50, 25, 442, 384);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Asus\\Pictures\\K.jpg"));
		lblNewLabel_2.setBounds(-21, 0, 621, 432);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Asus\\Pictures\\K.jpg"));
		lblNewLabel_3.setBounds(582, 0, 391, 432);
		panel.add(lblNewLabel_3);
	}
	
	public static void AddRowToJtable(Object[] dataRow) {
		DefaultTableModel model = (DefaultTableModel)getTable().getModel();
		model.addRow(dataRow);
	}

	public static JTable getTable() {
		return table;
	}

	public static void setTable(JTable table) {
		RegisterFirst.table = table;
	}
}