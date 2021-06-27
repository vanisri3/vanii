package Assignment3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;
import javax.swing.JRadioButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Employee extends JFrame {

	private JPanel contentPane;
	private JTextField NameField;
	private JTextField IDField;
	private JTextField PositionField;
	private JTextField SalaryField;
	private JTable table;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Employee frame = new Employee();
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
	public Employee() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 894, 530);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 230, 140));
		panel.setBorder(new LineBorder(new Color(139, 0, 0), 5));
		panel.setBounds(0, 0, 880, 491);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(Color.MAGENTA, 3));
		panel_1.setBackground(Color.PINK);
		panel_1.setBounds(44, 260, 130, 28);
		panel.add(panel_1);
		
		JLabel NameLabel = new JLabel("Name");
		NameLabel.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 19));
		NameLabel.setBounds(10, 0, 101, 34);
		panel_1.add(NameLabel);
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setLayout(null);
		panel_1_3.setBorder(new LineBorder(Color.MAGENTA, 3));
		panel_1_3.setBackground(Color.PINK);
		panel_1_3.setBounds(44, 419, 130, 28);
		panel.add(panel_1_3);
		
		JLabel SalaryLabel = new JLabel("Salary");
		SalaryLabel.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 19));
		SalaryLabel.setBounds(10, 0, 101, 34);
		panel_1_3.add(SalaryLabel);
		
		NameField = new JTextField();
		NameField.setBackground(new Color(176, 224, 230));
		NameField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		NameField.setBounds(206, 265, 167, 23);
		panel.add(NameField);
		NameField.setColumns(10);
		
		IDField = new JTextField();
		IDField.setBackground(new Color(176, 224, 230));
		IDField.setColumns(10);
		IDField.setBounds(218, 346, 155, 23);
		panel.add(IDField);
		
		PositionField = new JTextField();
		PositionField.setBackground(new Color(176, 224, 230));
		PositionField.setColumns(10);
		PositionField.setBounds(218, 385, 155, 23);
		panel.add(PositionField);
		
	
		SalaryField = new JTextField();
		SalaryField.setBackground(new Color(176, 224, 230));
		SalaryField.setColumns(10);
		SalaryField.setBounds(218, 419, 155, 23);
		panel.add(SalaryField);
		
		
		JRadioButton male = new JRadioButton("male");
		male.setBackground(new Color(135, 206, 250));
		JRadioButton female = new JRadioButton("female");
		female.setBackground(new Color(135, 206, 250));
		female.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(female.isSelected())
				{
				   male.setSelected(false);
				}
			}
		});
		female.setBounds(339, 312, 109, 23);
		panel.add(female);
		
		//JRadioButton male = new JRadioButton("male");
		male.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(male.isSelected())
				{
				   female.setSelected(false);
				}
			}
		});
		male.setBounds(206, 312, 109, 23);
		panel.add(male);
		
	
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.setBackground(new Color(219, 112, 147));
		btnNewButton.setFont(new Font("Arial Rounded MT Bold", Font.ITALIC, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
       DefaultTableModel model = (DefaultTableModel) table.getModel();
       
    String gender = "  ";
       
   	if (male.isSelected()) {
		gender = male.getText();
		
	} else {
		gender = female.getText();
		
	}
				
				model.addRow(new Object[]{
						NameField.getText(),				
						gender,
						IDField.getText(),	
						PositionField.getText(),
						SalaryField.getText(),
						
				});
				
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Membership Update confirmed", "Membership Management System",
								JOptionPane.OK_OPTION);
					}
				}
				
			}
				
			
		});
		btnNewButton.setBounds(482, 382, 89, 23);
		panel.add(btnNewButton);
		
		JButton DeleteButton = new JButton("Delete");
		DeleteButton.setBackground(new Color(219, 112, 147));
		DeleteButton.setFont(new Font("Arial Rounded MT Bold", Font.ITALIC, 18));
		DeleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Membership Management System", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Membership Management System", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
				}
			
			}
		});
		DeleteButton.setBounds(592, 382, 120, 23);
		panel.add(DeleteButton);
		
		JButton updateButton = new JButton("Update");
		updateButton.setBackground(new Color(219, 112, 147));
		updateButton.setFont(new Font("Arial Rounded MT Bold", Font.ITALIC, 18));
		updateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				int i = table.getSelectedRow();
			    if(i>=0) //if single row is selected than update
			    {
			    	model.setValueAt(NameField.getText(),i,0); 
			    	if(male.getSelectedObjects()!= null) {
			    		model.setValueAt(male.getText(), i , 1);
			    	}
			    	else {
			    		model.setValueAt(female.getText(), i, 1);
			    	}
			    	
			    	
			    	model.setValueAt(IDField.getText(),i,2);
			    	model.setValueAt(PositionField.getText(),i,3);
			    	model.setValueAt(SalaryField.getText(),i,4);
					JOptionPane.showMessageDialog(null, "Update Successfully");
			    }
			    else 
			    {
			    	JOptionPane.showMessageDialog(null, "Please Select a Row First!");
			    }
			
			}
		});
		updateButton.setBounds(740, 382, 120, 23);
		panel.add(updateButton);
		
		JPanel panel_1_4 = new JPanel();
		panel_1_4.setLayout(null);
		panel_1_4.setBorder(new LineBorder(new Color(128, 0, 0), 4));
		panel_1_4.setBackground(new Color(240, 230, 140));
		panel_1_4.setBounds(465, 74, 395, 266);
		panel.add(panel_1_4);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 375, 186);
		panel_1_4.add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			
			}
		});
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
			},
			new String[] {
				"Name", "Gender", "Id", "Position", "Salary"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton btnUpload = new JButton("UPLOAD");
		btnUpload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					try {
					File file = new File("C:\\Users\\Asus\\Documents\\gui\\Employee.txt");
					
					if(!file.exists()) {
						file.createNewFile();
						}
					FileWriter fw = new FileWriter(file.getAbsoluteFile());
					BufferedWriter bw = new BufferedWriter(fw);
					
					for (int i=0; i<table.getRowCount(); i++) {
						for (int j=0; j<table.getColumnCount(); j++) {
							bw.write(table.getModel().getValueAt(i, j) + "  ");
							}
						       
						bw.write("\n________________________________________________________________\n");
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
		btnUpload.setBounds(152, 208, 89, 23);
		panel_1_4.add(btnUpload);
		
		JButton Resetbutton = new JButton("Reset");
		Resetbutton.setBackground(new Color(219, 112, 147));
		Resetbutton.setFont(new Font("Arial Rounded MT Bold", Font.ITALIC, 18));
		Resetbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				NameField.setText("");	
				IDField.setText("");
				male.isSelected();
				female.isSelected();
		//		male.setDisabledSelectedIcon("");
				PositionField.setText("");
				SalaryField.setText("");
				
			}
		});
		Resetbutton.setBounds(542, 419, 99, 23);
		panel.add(Resetbutton);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.setBackground(new Color(219, 112, 147));
		btnPrint.setFont(new Font("Arial Rounded MT Bold", Font.ITALIC, 18));
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					table.print();
				} catch (java.awt.print.PrinterException e1) {
					System.err.format("No printer found", e1.getMessage());
				}
			}
			
		});
		btnPrint.setBounds(651, 419, 89, 23);
		panel.add(btnPrint);
		
		JButton ExitButton = new JButton("Exit");
		ExitButton.setForeground(new Color(0, 0, 0));
		ExitButton.setBackground(new Color(219, 112, 147));
		ExitButton.setFont(new Font("Arial Rounded MT Bold", Font.ITALIC, 18));
		ExitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Employee Details System", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
			
		});
		ExitButton.setBounds(761, 419, 89, 23);
		panel.add(ExitButton);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBorder(new LineBorder(Color.MAGENTA, 3));
		panel_1_2.setBackground(Color.PINK);
		panel_1_2.setBounds(44, 380, 130, 28);
		panel.add(panel_1_2);
		
		JLabel PositionLabel = new JLabel("Position");
		PositionLabel.setBounds(10, 0, 101, 28);
		panel_1_2.add(PositionLabel);
		PositionLabel.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 19));
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new LineBorder(Color.MAGENTA, 3));
		panel_1_1.setBackground(Color.PINK);
		panel_1_1.setBounds(44, 346, 130, 23);
		panel.add(panel_1_1);
		
		JLabel IDLabel = new JLabel("ID");
		IDLabel.setBounds(10, 0, 65, 28);
		panel_1_1.add(IDLabel);
		IDLabel.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 19));
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setBackground(new Color(0, 0, 0));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Asus\\Downloads\\1623779645_tmp_employee.png"));
		lblNewLabel.setBounds(10, 74, 351, 175);
		panel.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 165, 0));
		panel_2.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(128, 0, 0)));
		panel_2.setBounds(255, 22, 321, 41);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Employee Details");
		lblNewLabel_1.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 33));
		lblNewLabel_1.setBounds(35, 7, 294, 27);
		panel_2.add(lblNewLabel_1);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBorder(new LineBorder(Color.MAGENTA, 3));
		panel_1_1_1.setBackground(Color.PINK);
		panel_1_1_1.setBounds(44, 312, 130, 23);
		panel.add(panel_1_1_1);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 19));
		lblGender.setBounds(10, 0, 65, 28);
		panel_1_1_1.add(lblGender);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBackground(new Color(219, 112, 147));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Admin frame = new Admin();
				frame.setVisible(true);
				dispose();
			}
		});
		btnBack.setFont(new Font("Arial Rounded MT Bold", Font.ITALIC, 18));
		btnBack.setBounds(421, 419, 89, 23);
		panel.add(btnBack);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Asus\\Pictures\\Picture12.jpg"));
		lblNewLabel_2.setBounds(0, -43, 689, 412);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Asus\\Pictures\\Picture12.jpg"));
		lblNewLabel_3.setBounds(0, 238, 751, 266);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\Asus\\Pictures\\Picture12.jpg"));
		lblNewLabel_5.setBounds(661, 260, 229, 244);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\Asus\\Pictures\\Picture12.jpg"));
		lblNewLabel_4.setBounds(651, -16, 229, 366);
		panel.add(lblNewLabel_4);
		
		
	
	}
}
