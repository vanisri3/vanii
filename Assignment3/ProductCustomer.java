package Assignment3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;

class ProductCustomer extends JFrame
{
	private JTable table;
	
	
	ProductCustomer(String st , String ln , String jc,String wt , String syrp , String mk)
   {
     setDefaultCloseOperation(javax.swing. WindowConstants.DISPOSE_ON_CLOSE);
     setTitle("Tea");
     getContentPane().setLayout(null);
     
     getContentPane().setLayout(null);
     setDefaultCloseOperation(javax.swing. WindowConstants.DISPOSE_ON_CLOSE);
     setTitle("cofffee");
     
     getContentPane().setLayout(null);
     setDefaultCloseOperation(javax.swing. WindowConstants.DISPOSE_ON_CLOSE);
     setTitle("Juice");
     
     getContentPane().setLayout(null);
     setDefaultCloseOperation(javax.swing. WindowConstants.DISPOSE_ON_CLOSE);
     setTitle("water");
     
     
     getContentPane().setLayout(null);
     setDefaultCloseOperation(javax.swing. WindowConstants.DISPOSE_ON_CLOSE);
     setTitle("Syrup");
     
     getContentPane().setLayout(null);
     setDefaultCloseOperation(javax.swing. WindowConstants.DISPOSE_ON_CLOSE);
     setTitle("Milk");
     
     JPanel panel = new JPanel();
     panel.setBorder(new MatteBorder(3, 4, 4, 3, (Color) new Color(0, 0, 0)));
     panel.setBackground(new Color(176, 224, 230));
     panel.setBounds(0, 0, 670, 417);
     getContentPane().add(panel);
     panel.setLayout(null);
     JLabel labb = new JLabel("Water    " + wt);
     labb.setFont(new Font("Lucida Bright", Font.ITALIC, 21));
     labb.setBounds(10, 245, 134, 20);
     panel.add(labb);
     JLabel lll = new JLabel("Milk    " + mk);
     lll.setFont(new Font("Lucida Bright", Font.ITALIC, 21));
     lll.setBounds(10, 303, 134, 20);
     panel.add(lll);
     JLabel labb_1 = new JLabel("Syrup    " + syrp);
     labb_1.setFont(new Font("Lucida Bright", Font.ITALIC, 21));
     labb_1.setBounds(10, 272, 134, 31);
     panel.add(labb_1);
     JLabel lab_2 = new JLabel("Juice    " + jc);
     lab_2.setFont(new Font("Lucida Bright", Font.ITALIC, 21));
     lab_2.setBounds(10, 214, 115, 31);
     panel.add(lab_2);
     JLabel lab_1 = new JLabel("Coffee " + ln);
     lab_1.setFont(new Font("Lucida Bright", Font.ITALIC, 21));
     lab_1.setBounds(10, 194, 123, 20);
     panel.add(lab_1);
     JLabel lab=new JLabel("Tea   "+st);
     lab.setFont(new Font("Lucida Bright", Font.ITALIC, 21));
     lab.setBounds(10, 163, 147, 20);
     panel.add(lab);
     
     JPanel panel_2 = new JPanel();
     panel_2.setLayout(null);
     panel_2.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(186, 85, 211)));
     panel_2.setBackground(new Color(144, 238, 144));
     panel_2.setBounds(318, 71, 276, 131);
     panel.add(panel_2);
     
     JLabel lblNewLabel_2 = new JLabel("Benefits of Beverage");
     lblNewLabel_2.setFont(new Font("Sitka Text", Font.BOLD, 13));
     lblNewLabel_2.setBounds(37, 13, 174, 26);
     panel_2.add(lblNewLabel_2);
     
     JLabel lblNewLabel_3 = new JLabel("___________________");
     lblNewLabel_3.setBounds(37, 11, 130, 26);
     panel_2.add(lblNewLabel_3);
     
     JLabel lblNewLabel_4 = new JLabel("Stimulating Beverage");
     lblNewLabel_4.setBounds(10, 42, 115, 14);
     panel_2.add(lblNewLabel_4);
     
     JLabel lblNewLabel_4_1 = new JLabel("- improve memory");
     lblNewLabel_4_1.setBounds(114, 42, 115, 14);
     panel_2.add(lblNewLabel_4_1);
     
     JLabel lblNewLabel_4_2 = new JLabel("Refreshing  Beverage");
     lblNewLabel_4_2.setBounds(10, 67, 115, 14);
     panel_2.add(lblNewLabel_4_2);
     
     JLabel lblNewLabel_4_3 = new JLabel("- improve mental functioning");
     lblNewLabel_4_3.setBounds(114, 51, 140, 46);
     panel_2.add(lblNewLabel_4_3);
     
     JLabel lblNewLabel_4_4 = new JLabel("Nourishing Beverage");
     lblNewLabel_4_4.setBounds(10, 92, 115, 14);
     panel_2.add(lblNewLabel_4_4);
     
     JLabel lblNewLabel_4_5 = new JLabel("- improve skin complexion");
     lblNewLabel_4_5.setBounds(114, 92, 131, 14);
     panel_2.add(lblNewLabel_4_5);
     
     JPanel panel_1 = new JPanel();
     panel_1.setLayout(null);
     panel_1.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(199, 21, 133)));
     panel_1.setBackground(new Color(72, 209, 204));
     panel_1.setBounds(132, 11, 293, 49);
     panel.add(panel_1);
     
     JLabel lblNewLabel = new JLabel("Product Description");
     lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
     lblNewLabel.setFont(new Font("Papyrus", Font.BOLD | Font.ITALIC, 27));
     lblNewLabel.setBounds(0, 11, 299, 37);
     panel_1.add(lblNewLabel);
     
     JPanel panel_3 = new JPanel();
     panel_3.setBounds(223, 254, 437, 152);
     panel.add(panel_3);
     panel_3.setLayout(null);
     
     JScrollPane scrollPane = new JScrollPane();
     scrollPane.setBounds(10, 11, 417, 130);
     panel_3.add(scrollPane);
     
     table = new JTable();
     table.setBackground(new Color(255, 182, 193));
     table.setModel(new DefaultTableModel(
     	new Object[][] {
     		{"Coffee", "Stimulating", "RM13.00", "Nescaffe", "Can"},
     		{"Tea", "Stimulating", "RM15.00", "BOH", "Packet"},
     		{"Juice", "Refreshing", "RM9.00", "Tropicana", "Bottle"},
     		{"Water", "Refreshing", "RM8.50", "Spritzer Mineral", "Bottle"},
     		{"Syrup", "Refreshing", "RM16.00", "Monin", "Bottle"},
     		{"Milk", "Nourishing", "RM8.00", "Dutch Lady", "Paper Bottle"},
     	},
     	new String[] {
     		"Beverage", "Type", "Price", "Brand", "Packaging"
     	}
     ));
     table.getColumnModel().getColumn(1).setPreferredWidth(82);
     table.getColumnModel().getColumn(2).setPreferredWidth(89);
     table.getColumnModel().getColumn(3).setPreferredWidth(102);
     scrollPane.setViewportView(table);
     
     JLabel lblNewLabel_1 = new JLabel("Beverage Details  & it Usual Price");
     lblNewLabel_1.setFont(new Font("Baskerville Old Face", Font.ITALIC, 20));
     lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
     lblNewLabel_1.setBounds(331, 223, 293, 31);
     panel.add(lblNewLabel_1);
     
     JLabel lblNewLabel_1_1 = new JLabel("Current Updating Price");
     lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
     lblNewLabel_1_1.setFont(new Font("Baskerville Old Face", Font.BOLD | Font.ITALIC, 18));
     lblNewLabel_1_1.setBounds(10, 112, 215, 31);
     panel.add(lblNewLabel_1_1);
     setSize(686, 456);
      }
 }