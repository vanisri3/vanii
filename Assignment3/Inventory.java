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
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;

public class Inventory extends JFrame {

	private JPanel contentPane;
	private JTextField productname;
	private JTextField type;
	private JTextField price;
	private JTextField stock;
	private JTextField datein;
	private JTable table;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inventory frame = new Inventory();
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
	public Inventory() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 864, 501);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(72, 209, 204));
		panel.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 255)));
		panel.setBounds(0, 0, 848, 462);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 255)));
		panel_1.setBackground(new Color(72, 209, 204));
		panel_1.setBounds(217, 24, 320, 47);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Inventory Management");
		lblNewLabel.setFont(new Font("Sitka Banner", Font.BOLD, 28));
		lblNewLabel.setBounds(24, 11, 265, 33);
		panel_1.add(lblNewLabel);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 255)));
		panel_1_1.setBackground(new Color(72, 209, 204));
		panel_1_1.setBounds(10, 82, 288, 223);
		panel.add(panel_1_1);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 255)));
		panel_1_2.setBackground(new Color(72, 209, 204));
		panel_1_2.setBounds(10, 11, 116, 32);
		panel_1_1.add(panel_1_2);
		
		JLabel Namelabel = new JLabel("Product name");
		Namelabel.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
		Namelabel.setBounds(10, 11, 96, 14);
		panel_1_2.add(Namelabel);
		
		JPanel panel_1_2_1 = new JPanel();
		panel_1_2_1.setLayout(null);
		panel_1_2_1.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 255)));
		panel_1_2_1.setBackground(new Color(72, 209, 204));
		panel_1_2_1.setBounds(10, 54, 116, 32);
		panel_1_1.add(panel_1_2_1);
		
		JLabel Typelabel = new JLabel("Product Type");
		Typelabel.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
		Typelabel.setBounds(10, 11, 96, 14);
		panel_1_2_1.add(Typelabel);
		
		JPanel panel_1_2_2 = new JPanel();
		panel_1_2_2.setLayout(null);
		panel_1_2_2.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 255)));
		panel_1_2_2.setBackground(new Color(72, 209, 204));
		panel_1_2_2.setBounds(10, 97, 116, 32);
		panel_1_1.add(panel_1_2_2);
		
		JLabel Pricelabel = new JLabel("Price");
		Pricelabel.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
		Pricelabel.setBounds(10, 11, 83, 14);
		panel_1_2_2.add(Pricelabel);
		
		JPanel panel_1_2_3 = new JPanel();
		panel_1_2_3.setLayout(null);
		panel_1_2_3.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 255)));
		panel_1_2_3.setBackground(new Color(72, 209, 204));
		panel_1_2_3.setBounds(10, 140, 116, 32);
		panel_1_1.add(panel_1_2_3);
		
		JLabel StockQuantity = new JLabel("Stock Quantity");
		StockQuantity.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
		StockQuantity.setBounds(10, 11, 96, 14);
		panel_1_2_3.add(StockQuantity);
		
		JPanel panel_1_2_4 = new JPanel();
		panel_1_2_4.setLayout(null);
		panel_1_2_4.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 255)));
		panel_1_2_4.setBackground(new Color(72, 209, 204));
		panel_1_2_4.setBounds(10, 179, 116, 32);
		panel_1_1.add(panel_1_2_4);
		
		JLabel lblDateStockIn = new JLabel("Date stock in");
		lblDateStockIn.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
		lblDateStockIn.setBounds(10, 11, 83, 14);
		panel_1_2_4.add(lblDateStockIn);
		
		productname = new JTextField();
		productname.setBounds(136, 11, 127, 26);
		panel_1_1.add(productname);
		productname.setColumns(10);
		
		type = new JTextField();
		type.setColumns(10);
		type.setBounds(136, 54, 127, 26);
		panel_1_1.add(type);
		
		price = new JTextField();
		price.setColumns(10);
		price.setBounds(136, 97, 127, 26);
		panel_1_1.add(price);
		
		stock = new JTextField();
		stock.setColumns(10);
		stock.setBounds(136, 140, 127, 26);
		panel_1_1.add(stock);
		
		datein = new JTextField();
		datein.setColumns(10);
		datein.setBounds(136, 179, 127, 26);
		panel_1_1.add(datein);
		
		JButton Addbutton = new JButton("ADD");
		Addbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
			       DefaultTableModel model = (DefaultTableModel) table.getModel();
							
							model.addRow(new Object[]{
									productname.getText(),
									type.getText(),
									price.getText(),
								    stock.getText(),
								    datein.getText(),
								
							});
							
							if (table.getSelectedRow() == -1) {
								if (table.getRowCount() == 0) {
									JOptionPane.showMessageDialog(null, "Membership Update confirmed", "Membership Management System",
											JOptionPane.OK_OPTION);
								}
							}
							
						}
			
		});
		Addbutton.setBounds(10, 341, 66, 33);
		panel.add(Addbutton);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
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
		btnDelete.setBounds(86, 341, 84, 33);
		panel.add(btnDelete);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				int i = table.getSelectedRow();
			    if(i>=0) //if single row is selected than update
			    {
			    	model.setValueAt(productname.getText(),i,0);
			    	model.setValueAt(type.getText(),i,1);
			    	model.setValueAt(price.getText(),i,2);
			    	model.setValueAt(stock.getText(),i,3);
			    	model.setValueAt(datein.getText(),i,4);
					JOptionPane.showMessageDialog(null, "Update Successfully");
			    }
			    else 
			    {
			    	JOptionPane.showMessageDialog(null, "Please Select a Row First!");
			    }
			}
		});
		btnUpdate.setBounds(180, 341, 92, 33);
		panel.add(btnUpdate);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				productname.setText("");
				type.setText("");
				price.setText("");
				stock.setText("");
				datein.setText("");
				
			}
		});
		btnReset.setBounds(282, 341, 73, 33);
		panel.add(btnReset);
		
		JButton btnPrint = new JButton("PRINT");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					table.print();
				} catch (java.awt.print.PrinterException e1) {
					System.err.format("No printer found", e1.getMessage());
				}
			}
		});
		btnPrint.setBounds(109, 385, 73, 33);
		panel.add(btnPrint);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Membership Registration System", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setBounds(202, 385, 73, 33);
		panel.add(btnExit);
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setLayout(null);
		panel_1_3.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 255)));
		panel_1_3.setBackground(new Color(72, 209, 204));
		panel_1_3.setBounds(366, 80, 459, 338);
		panel.add(panel_1_3);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 435, 255);
		panel_1_3.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
			},
			new String[] {
				"Product Name", "Product Type", "Price", "Stock Quantity", "Date stockin"
			}
		));
		table.getColumnModel().getColumn(2).setPreferredWidth(46);
		scrollPane.setViewportView(table);
		
		JButton btnUpload = new JButton("UPLOAD");
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
		btnUpload.setBounds(173, 282, 91, 33);
		panel_1_3.add(btnUpload);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Admin frame = new Admin();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(10, 385, 84, 33);
		panel.add(btnNewButton);
	


		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Asus\\Pictures\\Picture3.jpg"));
		lblNewLabel_1.setBounds(-27, -40, 875, 548);
		panel.add(lblNewLabel_1);
	}
}
