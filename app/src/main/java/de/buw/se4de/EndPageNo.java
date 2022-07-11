package de.buw.se4de;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Font;

public class EndPageNo extends JFrame {

	private static JTextField Amount;
	private static JTextField Years;

	static double expectedInflation = 0.01;
	
	//no investment
		public double Home(double investmentAmount, double years) {
		double effAmount = investmentAmount - (investmentAmount*expectedInflation*years);
		return effAmount;}

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EndPageYes frame = new EndPageYes();
					frame.setLocationRelativeTo(null);
					frame.setSize(800,800);
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
	public EndPageNo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 800, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel View = new JLabel();
		View.setFont(new Font("Ebrima", Font.PLAIN, 12));
		View.setForeground(Color.WHITE);
		View.setBounds(20, 171, 400, 229);
		contentPane.add(View);

		JLabel View1 = new JLabel();
		View1.setFont(new Font("Lucida Fax", Font.BOLD | Font.ITALIC, 20));
		View1.setForeground(Color.WHITE);
		View1.setBounds(20, 135, 464, 57);
		contentPane.add(View1);


		View1.setText("<html>" + "Thank you for choosing our application"+ "</html>"); 

		View.setText("<html>\r\nBefore you exit, we would like to suggest the below investing options<br/>Bitcoin (BTC) -- Market cap: $563 billion<br/>Ethereum (ETH) -- Market cap: $238 billion<br/>Tether (USDT) -- Market cap: $83 billion<br/>Binance Coin (BNB) -- Market cap: $62 billion<br/>U.S. Dollar Coin (USDC) -- Market cap: $49 billion<br/><br/><br/>You might want to check our sponsor's website:<br/>https://www.etoro.com/<br/></html>");
		
		JLabel Caution = new JLabel("New label");
		Caution.setForeground(Color.WHITE);
		Caution.setBounds(20, 727, 780, 20);
		contentPane.add(Caution);
		Caution.setText("<html>CAUTION: Investing money in stocks and cryptos comes with a risk. We are not responsible for your loss of money.</html>");
		
		JLabel bg = new JLabel("");
		bg.setIcon(new ImageIcon(EndPageYes.class.getResource("/ll.jpg")));
		bg.setBounds(0, 0, 800, 800);
		contentPane.add(bg);
			
	}

}
