package Assignment3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Marketing extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Marketing frame = new Marketing();
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
	public Marketing() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 833, 625);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(102, 205, 170));
		panel.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 100, 0)));
		panel.setBounds(10, 0, 807, 586);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 100, 0)));
		panel_1.setBackground(new Color(102, 205, 170));
		panel_1.setBounds(228, 11, 332, 53);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Marketing");
		lblNewLabel.setFont(new Font("Stencil", Font.ITALIC, 29));
		lblNewLabel.setBounds(74, 11, 200, 29);
		panel_1.add(lblNewLabel);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 0)));
		panel_1_1.setBackground(new Color(102, 205, 170));
		panel_1_1.setBounds(31, 75, 747, 487);
		panel.add(panel_1_1);
		
		JLabel lblWeAreComing = new JLabel("We are coming with new Offers Now");
		lblWeAreComing.setHorizontalAlignment(SwingConstants.CENTER);
		lblWeAreComing.setForeground(new Color(75, 0, 130));
		lblWeAreComing.setFont(new Font("Sitka Heading", Font.ITALIC, 29));
		lblWeAreComing.setBounds(136, 11, 476, 40);
		panel_1_1.add(lblWeAreComing);
		
		JLabel lblSpecialOffers = new JLabel("Special Offers !!!");
		lblSpecialOffers.setHorizontalAlignment(SwingConstants.CENTER);
		lblSpecialOffers.setForeground(new Color(0, 0, 0));
		lblSpecialOffers.setFont(new Font("Viner Hand ITC", Font.BOLD, 29));
		lblSpecialOffers.setBounds(247, 35, 279, 47);
		panel_1_1.add(lblSpecialOffers);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 100, 0)));
		panel_1_2.setBackground(new Color(102, 205, 170));
		panel_1_2.setBounds(51, 85, 601, 134);
		panel_1_1.add(panel_1_2);
		
		JLabel lblBuyMoreThan = new JLabel("Buy More Than RM40.00");
		lblBuyMoreThan.setFont(new Font("Perpetua", Font.ITALIC, 33));
		lblBuyMoreThan.setBounds(140, 11, 359, 29);
		panel_1_2.add(lblBuyMoreThan);
		
		JLabel lblFreeVoucher = new JLabel("Free Voucher : Refreshing Beverage");
		lblFreeVoucher.setFont(new Font("Perpetua", Font.ITALIC, 33));
		lblFreeVoucher.setBounds(106, 51, 413, 52);
		panel_1_2.add(lblFreeVoucher);
		
		JLabel lblBuyMoreThan_1 = new JLabel("*****************************************************");
		lblBuyMoreThan_1.setFont(new Font("Perpetua", Font.ITALIC, 31));
		lblBuyMoreThan_1.setBounds(0, 234, 765, 29);
		panel_1_1.add(lblBuyMoreThan_1);
		
		JPanel panel_1_2_1 = new JPanel();
		panel_1_2_1.setLayout(null);
		panel_1_2_1.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 100, 0)));
		panel_1_2_1.setBackground(new Color(102, 205, 170));
		panel_1_2_1.setBounds(36, 270, 639, 189);
		panel_1_1.add(panel_1_2_1);
		
		JLabel lblForMoreInformation = new JLabel("For more information can contact us via");
		lblForMoreInformation.setHorizontalAlignment(SwingConstants.CENTER);
		lblForMoreInformation.setForeground(new Color(255, 0, 0));
		lblForMoreInformation.setFont(new Font("Lucida Fax", Font.BOLD | Font.ITALIC, 24));
		lblForMoreInformation.setBounds(10, 11, 565, 29);
		panel_1_2_1.add(lblForMoreInformation);
		
		JLabel lblInstagramvaninonalcholicbeverage = new JLabel("INSTAGRAM : @vaniNonAlcholicBeverage");
		lblInstagramvaninonalcholicbeverage.setHorizontalAlignment(SwingConstants.CENTER);
		lblInstagramvaninonalcholicbeverage.setFont(new Font("Bell MT", Font.ITALIC, 26));
		lblInstagramvaninonalcholicbeverage.setBounds(10, 51, 501, 29);
		panel_1_2_1.add(lblInstagramvaninonalcholicbeverage);
		
		JLabel lblFacebookVanis = new JLabel("FACEBOOK  : VANI's Non Alcholic Bverage Shop");
		lblFacebookVanis.setHorizontalAlignment(SwingConstants.CENTER);
		lblFacebookVanis.setFont(new Font("Bell MT", Font.ITALIC, 26));
		lblFacebookVanis.setBounds(26, 125, 516, 29);
		panel_1_2_1.add(lblFacebookVanis);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Asus\\Downloads\\Instagram-icon.png"));
		lblNewLabel_1.setBounds(493, 42, 62, 57);
		panel_1_2_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Asus\\Downloads\\social-facebook-box-blue-icon.png"));
		lblNewLabel_2.setBounds(549, 110, 80, 61);
		panel_1_2_1.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.setBounds(10, 11, 99, 29);
		panel.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				ShopBackground frame = new ShopBackground();
				frame.setVisible(true);
				dispose();
			}
		});
	}
}
