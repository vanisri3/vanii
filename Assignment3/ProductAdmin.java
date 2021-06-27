package Assignment3;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;

//import Trytable.Finance;

//import Trytable.Order;

class ProductAdmin extends JFrame
{
    JTextField text;
    private JTable table;
    private JTextField cf;
    private JTextField jc;
    private final JTextField wat = new JTextField();
    private JTextField spp;
    private JTextField milk;
    private String p, p2,p3,p4,p5,p6;
    
    
    String tea,coffee,water,syrup,juice,milkk;
    //private JTable table;

	public ProductAdmin(String p, String p2, String p3, String p4, String p5, String p6) { //constructor with arguments to pass the values
		this.tea = p; //
		this.coffee= p2;
		this.water = p3;
		this.syrup = p4;
		this.juice= p5;
		this.milkk = p6;
		
	}
	
    
	 ProductAdmin(){ // constructor
        getContentPane().setLayout(null);
        
        JPanel panel = new JPanel();
        panel.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
        panel.setBackground(new Color(219, 112, 147));
        panel.setBounds(0, 0, 715, 374);
        getContentPane().add(panel);
        panel.setLayout(null);
        
        JPanel panel_1 = new JPanel();
        panel_1.setBackground(new Color(186, 85, 211));
        panel_1.setBounds(246, 114, 416, 173);
        panel.add(panel_1);
        panel_1.setLayout(null);
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(10, 11, 396, 151);
        panel_1.add(scrollPane);
        
        table = new JTable();
        table.setModel(new DefaultTableModel(
        	new Object[][] {
        		{null, null, null, null, null, null},
        	},
        	new String[] {
        		"TEA", "COFFEE", "SYRUP", "JUICE", "WATER", "MILK"
        	}
        ));
        scrollPane.setViewportView(table);
        
        JLabel lblNewLabel_4 = new JLabel("BEVERAGE PRODUCT");
        lblNewLabel_4.setFont(new Font("Tempus Sans ITC", Font.BOLD | Font.ITALIC, 33));
        lblNewLabel_4.setBounds(212, 11, 426, 37);
        panel.add(lblNewLabel_4);
        JButton b=new JButton("Change");
        b.setBounds(63, 324, 80, 20);
        panel.add(b);
        
        JPanel panel_2 = new JPanel();
        panel_2.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 0)));
        panel_2.setBackground(new Color(255, 192, 203));
        panel_2.setBounds(10, 95, 199, 218);
        panel.add(panel_2);
        panel_2.setLayout(null);
        
        milk = new JTextField();
        milk.setBounds(97, 175, 92, 20);
        panel_2.add(milk);
        milk.setColumns(10);
        
        jc = new JTextField();
        jc.setBounds(97, 144, 92, 20);
        panel_2.add(jc);
        jc.setColumns(10);
        
        spp = new JTextField();
        spp.setBounds(97, 113, 92, 20);
        panel_2.add(spp);
        spp.setColumns(10);
        wat.setBounds(97, 82, 92, 20);
        panel_2.add(wat);
        wat.setText("");
        wat.setColumns(10);
        
        cf = new JTextField();
        cf.setBounds(97, 51, 92, 20);
        panel_2.add(cf);
        cf.setColumns(10);
        text=new JTextField(20);
        text.setBounds(97, 20, 92, 20);
        panel_2.add(text);
        
        JLabel lblNewLabel_3 = new JLabel("Milk:");
        lblNewLabel_3.setBounds(23, 177, 46, 14);
        panel_2.add(lblNewLabel_3);
        
        JLabel lblNewLabel_2 = new JLabel("Water");
        lblNewLabel_2.setBounds(23, 146, 46, 14);
        panel_2.add(lblNewLabel_2);
        
        JLabel lblNewLabel_1 = new JLabel("Juice");
        lblNewLabel_1.setBounds(23, 116, 46, 14);
        panel_2.add(lblNewLabel_1);
        
        JLabel lblNewLabel = new JLabel("Syrup");
        lblNewLabel.setBounds(23, 85, 46, 14);
        panel_2.add(lblNewLabel);
        
        JLabel coffee_1 = new JLabel("Coffee:");
        coffee_1.setBounds(23, 54, 46, 14);
        panel_2.add(coffee_1);
        JLabel l=new JLabel("Tea");
        l.setBounds(23, 20, 64, 20);
        panel_2.add(l);
        
        JLabel lblNewLabel_5 = new JLabel("Updating @Editing Beverage Prices");
        lblNewLabel_5.setFont(new Font("Yu Gothic UI", Font.ITALIC, 24));
        lblNewLabel_5.setBounds(196, 51, 482, 33);
        panel.add(lblNewLabel_5);
        
          b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
            	
            	DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[]{
						text.getText(),
						cf.getText(),
						jc.getText(),
						wat.getText(),
						spp.getText(),
						milk.getText(),
						
												
				});
							 				
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Sales Information Update confirmed", "Thank you",
								JOptionPane.OK_OPTION);
					}
				}
				
				//How to read data in table
				
				
				for (int i = 0 ; i < model.getRowCount() ; i++) { //use i - read only the current update of row/data
			        // null or not Integer will throw exception
			        p = String.valueOf(model.getValueAt(i, 0));
			        p2 = String.valueOf(model.getValueAt(i, 1));
			        p3 = String.valueOf(model.getValueAt(i, 2));
			        p4 = String.valueOf(model.getValueAt(i, 3));
			        p5 = String.valueOf(model.getValueAt(i, 4));
			        p6 = String.valueOf(model.getValueAt(i, 5));
				}
				
				
			

							
				//How to pass value/data from product description (admin page) into customer page
				try {
					Order fr = new Order(p, p2, p3, p4, p5, p6); //open customer page using constructor with 5 arguments
					fr.setVisible(true);
					//dispose();
				} catch (Exception ee) {
					ee.printStackTrace();
				}
				
				
				 String value=text.getText();
		           String cc= cf.getText();
		            String juice = jc.getText();
		             String water = wat.getText();
		             String syrup = spp.getText();
		               String mik =   milk.getText();
				

				try {
					ProductCustomer fn = new ProductCustomer(value, cc,juice , water,syrup,  mik);
					fn.setVisible(true);
				} catch (Exception ee) {
					ee.printStackTrace();
			
				}
            }
				
        });
        setVisible(true);
        setSize(721,413);
          
          
    }
        public static void main(String[] args) 
    {
        new  ProductAdmin();
    }
}