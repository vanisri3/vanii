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
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Sales extends JFrame {

	private JPanel contentPane;
	private JTextField spendingbox;
	private JTextField chargebox;
	private JTextField salesbox;
	private JTable table;
	private JFrame frame;
	
	String itotal;
	double [] itemcost = new double [4];
	private JTextField profittext;
	private JTextField reconfirmsale;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sales frame = new Sales();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void my_update(String str) { //method my_update to retrieve str
		salesbox.setText(str);
		
		//double ds = Double.parseDouble(str);

	//	Order obj= new Order();// obj created for class Second()
	//	obj.my_update(str); // Execute the method my_update to pass str
	    
	
	}
	

	/**
	 * Create the frame.
	 */
	public Sales() {// constructor without argument
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 837, 461);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(135, 206, 235));
		panel.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 128)));
		panel.setBounds(0, 0, 831, 420);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 128)));
		panel_1.setBackground(new Color(135, 206, 235));
		panel_1.setBounds(125, 11, 492, 63);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Sales information");
		lblNewLabel.setFont(new Font("Segoe Print", Font.BOLD, 42));
		lblNewLabel.setBounds(39, 11, 418, 44);
		panel_1.add(lblNewLabel);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 128)));
		panel_1_1.setBackground(new Color(135, 206, 235));
		panel_1_1.setBounds(10, 116, 186, 34);
		panel.add(panel_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("Total inventory spending");
		lblNewLabel_1.setBounds(10, 11, 178, 21);
		panel_1_1.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Sylfaen", Font.PLAIN, 15));
		
		spendingbox = new JTextField();
		spendingbox.setBounds(219, 126, 110, 20);
		panel.add(spendingbox);
		spendingbox.setColumns(10);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 128)));
		panel_1_1_1.setBackground(new Color(135, 206, 235));
		panel_1_1_1.setBounds(10, 161, 186, 34);
		panel.add(panel_1_1_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Total incidental charge");
		lblNewLabel_1_1.setFont(new Font("Sylfaen", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(10, 11, 178, 21);
		panel_1_1_1.add(lblNewLabel_1_1);
		
		JPanel panel_1_1_2 = new JPanel();
		panel_1_1_2.setLayout(null);
		panel_1_1_2.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 128)));
		panel_1_1_2.setBackground(new Color(135, 206, 235));
		panel_1_1_2.setBounds(10, 206, 186, 34);
		panel.add(panel_1_1_2);
		
		JLabel lblNewLabel_1_2 = new JLabel("Total sales ");
		lblNewLabel_1_2.setFont(new Font("Sylfaen", Font.PLAIN, 15));
		lblNewLabel_1_2.setBounds(10, 11, 178, 21);
		panel_1_1_2.add(lblNewLabel_1_2);
		
		chargebox = new JTextField();
		chargebox.setColumns(10);
		chargebox.setBounds(219, 175, 110, 20);
		panel.add(chargebox);
		
		salesbox = new JTextField();
		salesbox.setColumns(10);
		salesbox.setBounds(219, 220, 110, 20);
		panel.add(salesbox);
		//l1 = new JLabel("Output"); // removed JLable from here. 
	//	l1.setBounds(100, 38, 93, 14);
		//contentPane.add(salesbox);
		
		profittext = new JTextField();
		profittext.setColumns(10);
		profittext.setBounds(219, 298, 110, 20);
		panel.add(profittext);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				  DefaultTableModel model = (DefaultTableModel) table.getModel();
					
					model.addRow(new Object[]{
							spendingbox.getText(),
							chargebox.getText(),
							reconfirmsale.getText(),
							//salesbox.getText(),
							
							profittext.getText(),
						    
					});
					
					if (table.getSelectedRow() == -1) {
						if (table.getRowCount() == 0) {
							JOptionPane.showMessageDialog(null, "Sales Information updated confirmed", "Sales Information System",
									JOptionPane.OK_OPTION);
						}
					}
					
				}
			
		});
		btnNewButton.setBounds(24, 360, 89, 23);
		panel.add(btnNewButton);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Sales Information", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Sales Information", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		btnDelete.setBounds(125, 360, 89, 23);
		panel.add(btnDelete);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					spendingbox.setText("");
					chargebox.setText("");
					salesbox.setText("");
					reconfirmsale.setText("");
					profittext.setText("");
				
					
				}
			
		});
		btnReset.setBounds(224, 360, 89, 23);
		panel.add(btnReset);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(135, 206, 235));
		panel_2.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 139)));
		panel_2.setBounds(339, 103, 472, 199);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnUpload = new JButton("UPLOAD");
		btnUpload.setBounds(166, 153, 89, 23);
		panel_2.add(btnUpload);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 22, 452, 120);
		panel_2.add(scrollPane);
		
		
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"250", "50", "3500", "3200"},
			},
			new String[] {
				"Inventory Spending (RM)", "Incidental Charges (RM)", "Total Sales (RM)", "Total Profit (RM)"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(144);
		table.getColumnModel().getColumn(1).setPreferredWidth(142);
		table.getColumnModel().getColumn(2).setPreferredWidth(95);
		table.getColumnModel().getColumn(3).setPreferredWidth(101);
		scrollPane.setViewportView(table);
		
		JPanel panel_1_1_2_1 = new JPanel();
		panel_1_1_2_1.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 128)));
		panel_1_1_2_1.setBackground(new Color(135, 206, 235));
		panel_1_1_2_1.setBounds(10, 284, 186, 45);
		panel.add(panel_1_1_2_1);
		panel_1_1_2_1.setLayout(null);
		
		
		JButton btnProfit = new JButton("PROFIT");
		btnProfit.setBackground(new Color(176, 224, 230));
		btnProfit.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnProfit.setBounds(48, 11, 89, 23);
		panel_1_1_2_1.add(btnProfit);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Sales Information", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			
			}
		});
		btnExit.setBounds(328, 360, 89, 23);
		panel.add(btnExit);
		
		JButton btnNewButton_1 = new JButton("BACK");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			  Admin  frame = new Admin();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(437, 360, 89, 23);
		panel.add(btnNewButton_1);
		
		JPanel panel_1_1_2_2 = new JPanel();
		panel_1_1_2_2.setLayout(null);
		panel_1_1_2_2.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 128)));
		panel_1_1_2_2.setBackground(new Color(135, 206, 235));
		panel_1_1_2_2.setBounds(10, 249, 186, 34);
		panel.add(panel_1_1_2_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Reconfirmation of Sales");
		lblNewLabel_1_2_1.setFont(new Font("Sylfaen", Font.PLAIN, 15));
		lblNewLabel_1_2_1.setBounds(10, 11, 178, 21);
		panel_1_1_2_2.add(lblNewLabel_1_2_1);
		
		reconfirmsale = new JTextField();
		reconfirmsale.setBounds(219, 267, 110, 20);
		panel.add(reconfirmsale);
		reconfirmsale.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Asus\\Pictures\\Picture10.jpg"));
		lblNewLabel_2.setBounds(0, 0, 731, 407);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Asus\\Pictures\\Picture10.jpg"));
		lblNewLabel_3.setBounds(461, -24, 360, 455);
		panel.add(lblNewLabel_3);
		btnProfit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			/*	//my_update(String str);
				String str = null;
				salesbox.setText(str);
				double ds = Double.parseDouble(str);
			*/	
				itemcost [0] = Double.parseDouble(spendingbox.getText());
				itemcost [1] = Double.parseDouble(chargebox.getText());
				itemcost [2] =  Double.parseDouble(reconfirmsale.getText());
			//	salesbox.setText(str);
				
				itemcost[3] = itemcost[2] - itemcost[1] - itemcost[0];
				
				itotal = String.format("RM%.2f ", itemcost[3]);
				profittext.setText(itotal);
				
			}
			
			
		});
		btnUpload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					File file = new File("C:\\Users\\Asus\\Documents\\gui\\Inventory.txt");
					
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
		
		
	}
}
