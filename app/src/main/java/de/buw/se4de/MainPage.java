package de.buw.se4de;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.*;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MainPage extends JFrame {

	private JPanel contentPane;
	private static JTextField Amount;
	private static JTextField Years;

	static double savingsReturns = 0.0006;
	static double cryptoReturns = 0.06;
	static double ETFReturns = 0.0812;
	static double P2PReturns = 0.1012;
	static double bondsReturns = 0.0712;
	static double returnsPercentWithoutDiv = 0.06;
	static double returnsPercentWithDiv = 0.12;
    
    //method to calculate return amount for investment in different mode


	//1.Bank interest
	public double Bank(double investmentAmount, double years) {
	double compoundedVal = investmentAmount;
	for(int i=1; i<=years*12; i++) {
		compoundedVal = compoundedVal+(compoundedVal*savingsReturns);
		}
	return compoundedVal;
	}
	
	//2.1.stocks without divident
	public double StocksWithOutDiv(double investmentAmount, double years) {
	double returnsWithoutDiv = investmentAmount*Math.pow(1+returnsPercentWithoutDiv,years);
	return returnsWithoutDiv;}

	//2.2.stocks with divident
	public double StocksWithDiv(double investmentAmount, double years) {
	double returnsWithDiv = investmentAmount*Math.pow(1+returnsPercentWithDiv,years);
	return returnsWithDiv;}
	
	//3.Cryptos
	public double Cryptos(double investmentAmount, double years) {
	double returnAmount = investmentAmount*Math.pow(1+cryptoReturns,years);
	return returnAmount;}
	
	//4.bond
	public double Bonds(double investmentAmount, double years) {
	double returnAmount = investmentAmount*Math.pow(1+bondsReturns,years);
	return returnAmount; }

	//5.ETF
	public double ETF(double investmentAmount, double years) {
	double returnAmount = investmentAmount*Math.pow(1+ETFReturns,years);
	return returnAmount;}

	//6.P2P
	public double P2P(double investmentAmount, double years) {
	double returnAmount = investmentAmount*Math.pow(1+P2PReturns,years);
	return returnAmount;}

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainPage frame = new MainPage();
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
	public MainPage() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 800, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
							
							JButton No = new JButton("No");
							No.setFont(new Font("Ebrima", Font.BOLD, 12));
							No.setBounds(424, 687, 85, 21);
							contentPane.add(No);
							
							JButton Yes = new JButton("Yes");
							Yes.setFont(new Font("Ebrima", Font.BOLD, 12));
							Yes.setBounds(301, 687, 85, 21);
							contentPane.add(Yes);
							
							JLabel Next = new JLabel("Wondering what happens if you retained your money at home and not invested?");
							Next.setHorizontalAlignment(SwingConstants.CENTER);
							Next.setFont(new Font("Ebrima", Font.BOLD, 16));
							Next.setBounds(10, 634, 800, 43);
							contentPane.add(Next);
					
							
							JLabel BankLabel = new JLabel("Bank");
							BankLabel.setHorizontalAlignment(SwingConstants.CENTER);
							BankLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
							BankLabel.setOpaque(false);
							BankLabel.setBounds(50, 327, 70, 20);
							contentPane.add(BankLabel);
					
							JLabel CryptosLabel = new JLabel("Cryptos");
							CryptosLabel.setForeground(new Color(0, 0, 0));
							CryptosLabel.setOpaque(false);
							CryptosLabel.setHorizontalAlignment(SwingConstants.CENTER);
							CryptosLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
							CryptosLabel.setBounds(314, 327, 70, 20);
							contentPane.add(CryptosLabel);
					
					JLabel BondsLabel = new JLabel("Bonds");
					BondsLabel.setOpaque(false);
					BondsLabel.setHorizontalAlignment(SwingConstants.CENTER);
					BondsLabel.setForeground(Color.BLACK);
					BondsLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
					BondsLabel.setBounds(440, 327, 70, 20);
					contentPane.add(BondsLabel);
					
							JLabel StocksLabel = new JLabel("Stocks");
							StocksLabel.setOpaque(false);
							StocksLabel.setHorizontalAlignment(SwingConstants.CENTER);
							StocksLabel.setForeground(Color.BLACK);
							StocksLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
							StocksLabel.setBounds(186, 327, 70, 20);
							contentPane.add(StocksLabel);
					
					JLabel P2PLabel = new JLabel("P2P");
					P2PLabel.setOpaque(false);
					P2PLabel.setHorizontalAlignment(SwingConstants.CENTER);
					P2PLabel.setForeground(Color.BLACK);
					P2PLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
					P2PLabel.setBounds(680, 327, 70, 20);
					contentPane.add(P2PLabel);
					
					JLabel ETFLabel = new JLabel("ETF");
					ETFLabel.setOpaque(false);
					ETFLabel.setHorizontalAlignment(SwingConstants.CENTER);
					ETFLabel.setForeground(Color.BLACK);
					ETFLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
					ETFLabel.setBounds(561, 327, 70, 20);
					contentPane.add(ETFLabel);
				
					JLabel TypeLabel = new JLabel("Choose your method of Investment");
					TypeLabel.setBounds(10, 176, 800, 43);
					TypeLabel.setHorizontalAlignment(SwingConstants.CENTER);
					TypeLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
					contentPane.add(TypeLabel);
		
		JLabel Display = new JLabel("");
		Display.setHorizontalAlignment(SwingConstants.CENTER);
		Display.setForeground(new Color(153, 0, 51));
		Display.setBackground(Color.WHITE);
		Display.setBounds(90, 422, 600, 135);
		Display.setOpaque(true);
		contentPane.add(Display);

		JLabel PeriodLabel = new JLabel("Investment period (years)");
		PeriodLabel.setBounds(145, 96, 202, 22);
		PeriodLabel.setFont(new Font("Ebrima", Font.BOLD, 16));
		contentPane.add(PeriodLabel);

		JLabel PeriodLabel2 = new JLabel("(in the range of 1 to 200000)");
		PeriodLabel2.setBounds(144, 58, 182, 13);
		PeriodLabel2.setFont(new Font("Ebrima", Font.BOLD, 12));
		contentPane.add(PeriodLabel2);
		
		JLabel AmountLabel = new JLabel("Amount to be invested (EUR)");
		AmountLabel.setBounds(118, 37, 254, 22);
		AmountLabel.setFont(new Font("Ebrima", Font.BOLD, 16));
		contentPane.add(AmountLabel);
		
		JLabel AmountLabel2 = new JLabel("(in the range of 1 to 100)");
		AmountLabel2.setBounds(171, 119, 163, 13);
		AmountLabel2.setFont(new Font("Ebrima", Font.BOLD, 12));
		contentPane.add(AmountLabel2);

		Amount = new JTextField();
		Amount.addKeyListener(new KeyAdapter() {
	         public void keyPressed(KeyEvent ke) {
	            String value = Amount.getText();
	            int l = value.length();
	            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9' || ke.getKeyChar() <= '.' ) {
	            	Amount.setEditable(true);
	               
	            } else {
	            	Amount.setEditable(false);
	            	JOptionPane.showMessageDialog(null,"Please enter valid input for amount (only numbers)");
	            	dispose();
	            	MainPage a = new MainPage();
					a.setVisible(true);
					a.setLocationRelativeTo(null);
					
	            }
	         }
	      });
		Amount.setBounds(408, 37, 234, 30);
		contentPane.add(Amount);
		Amount.setColumns(10);
		
		
		Years = new JTextField();
		Years.addKeyListener(new KeyAdapter() {
	         public void keyPressed(KeyEvent ke) {
	            String value = Years.getText();
	            int l = value.length();
	            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9' || ke.getKeyChar() <= '.' ) {
	            	Years.setEditable(true);
	            } 
				else {
	            	Years.setEditable(false);
	            	JOptionPane.showMessageDialog(null,"Please enter valid input for years (only numbers)");
					MainPage a = new MainPage();
					a.setVisible(true);
					a.setLocationRelativeTo(null);
					
	            }
	         }
	      });
		Years.setBounds(408, 96, 234, 30);
		contentPane.add(Years);
		Years.setColumns(10);
				
		JButton Banks = new JButton("");
		Banks.setIcon(new ImageIcon(MainPage.class.getResource("/Bank_final_50.png")));
		Banks.setBounds(50, 255, 70, 70);
		Banks.setBorder(BorderFactory.createRaisedBevelBorder());
		Banks.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(Banks);
		
		JButton Stocks = new JButton("");
		Stocks.setSelectedIcon(null);
		Stocks.setIcon(new ImageIcon(MainPage.class.getResource("/Stocks_final_50.png")));
		Stocks.setBorder(BorderFactory.createRaisedBevelBorder());
		Stocks.setFont(new Font("Tahoma", Font.BOLD, 14));
		Stocks.setBounds(186, 255, 70, 70);
		contentPane.add(Stocks);
		
		JButton Cryptos = new JButton("");
		Cryptos.setBorder(BorderFactory.createRaisedBevelBorder());
		Cryptos.setIcon(new ImageIcon(MainPage.class.getResource("/Crypto.jpg")));
		Cryptos.setFont(new Font("Tahoma", Font.BOLD, 14));
		Cryptos.setBounds(314, 255, 70, 70);
		contentPane.add(Cryptos);
		
		JButton Bonds = new JButton("");
		Bonds.setBorder(BorderFactory.createRaisedBevelBorder());
		Bonds.setIcon(new ImageIcon(MainPage.class.getResource("/Bonds.jpg")));
		Bonds.setFont(new Font("Tahoma", Font.BOLD, 14));
		Bonds.setBounds(440, 255, 70, 70);
		contentPane.add(Bonds);
		
		JButton ETF = new JButton("");
		ETF.setBorder(BorderFactory.createRaisedBevelBorder());
		ETF.setIcon(new ImageIcon(MainPage.class.getResource("/ETF.png")));
		ETF.setFont(new Font("Tahoma", Font.BOLD, 14));
		ETF.setBounds(561, 255, 70, 70);
		contentPane.add(ETF);
		
		JButton P2P = new JButton("");
		P2P.setBorder(BorderFactory.createRaisedBevelBorder());
		P2P.setIcon(new ImageIcon(MainPage.class.getResource("/P2P.png")));
		P2P.setFont(new Font("Tahoma", Font.BOLD, 14));
		P2P.setBounds(680, 255, 70, 70);
		contentPane.add(P2P);
		
		JLabel bgImage = new JLabel();
		bgImage.setIcon(new ImageIcon(MainPage.class.getResource("/Stocks_3.jpg")));
		bgImage.setBounds(0, 0, 800, 800);
		contentPane.add(bgImage);
		
		JLabel TypeLabel_1 = new JLabel("Choose your method of Investment");
		TypeLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		TypeLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		TypeLabel_1.setBounds(76, 176, 800, 43);
		contentPane.add(TypeLabel_1);
		
				
		Banks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Banks.setBackground(new Color(0,0,0));
				Cryptos.setBackground(null);
				Stocks.setBackground(null);
				Bonds.setBackground(null);
				ETF.setBackground(null);
				P2P.setBackground(null);

				try {
					String b  = MainPage.getAmount().getText();
					String c = MainPage.getYears().getText();
					double amount = Double.parseDouble(b);
					double year = Double.parseDouble(c);
					double result = Bank(amount, year);
					NumberFormat nf = NumberFormat.getNumberInstance(Locale.ENGLISH);
					DecimalFormat df = (DecimalFormat)nf;
					//DecimalFormat df = new DecimalFormat("####0.00");
					String compVal = df.format(result);
					Display.setText("<html>With a 0.06 % returns, your total amount after " + c 
							+ " years would be" + "<br/>" + "----------------------------------- " 
							+compVal + " Euros" + " ----------------------------------" + "</html>");
				
				}
				catch(NumberFormatException ex) {
					ex.printStackTrace();
				}
			}
		});

		Stocks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Stocks.setBackground(new Color(0,0,0));
				Banks.setBackground(null);
				Cryptos.setBackground(null);
				Bonds.setBackground(null);
				ETF.setBackground(null);
				P2P.setBackground(null);
		
				try {
					
					String b  = MainPage.getAmount().getText();
					String c = MainPage.getYears().getText();
					double amount = Double.parseDouble(b);
					double year = Double.parseDouble(c);
					double result = StocksWithOutDiv(amount, year);
					double result1 = StocksWithDiv(amount, year);

					NumberFormat nf = NumberFormat.getNumberInstance(Locale.ENGLISH);
					DecimalFormat df = (DecimalFormat)nf;
//					DecimalFormat df = new DecimalFormat("####0.00");
					String compVal = df.format(result);
					String compVal1 = df.format(result1);

					//Display.setText("<html>Hello World!<br/>blahblahblah</html>");
					Display.setText("<html>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" +
							"With "+(returnsPercentWithDiv*100)+ "% returns with dividends,"+
							"your total amount (in EUR) after " +c+" years will be: "+ 
							"<br/>" +
							"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+
							"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+
							"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+
							"----------------------------------- " + compVal1+ " Euros" + 
							"-----------------------------------" +
							"<br/>" +
							"<br/>" +
							"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+
							"With " + (returnsPercentWithoutDiv*100) + "% returns without dividends, " +
							"your total amount (in EUR) after " + c + " years will be: "+ 
							"<br/>"+
							"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+
							"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+
							"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+
							"----------------------------------- " +compVal + " Euros" +
							"----------------------------------- " +"</html>");
					
					
				}
				catch(NumberFormatException ex) {
					ex.printStackTrace();
				}
			}
		});

		Cryptos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cryptos.setBackground(new Color(0,0,0));
				Banks.setBackground(null);
				Stocks.setBackground(null);
				Bonds.setBackground(null);
				ETF.setBackground(null);
				P2P.setBackground(null);

				try {
					String b  = MainPage.getAmount().getText();
					String c = MainPage.getYears().getText();
					double amount = Double.parseDouble(b);
					double year = Double.parseDouble(c);
					double result = Cryptos(amount, year);
					NumberFormat nf = NumberFormat.getNumberInstance(Locale.ENGLISH);
					DecimalFormat df = (DecimalFormat)nf;
					
//					DecimalFormat df = new DecimalFormat("####0.00");
					String compVal = df.format(result);
					
					Display.setText("<html>With "+ (cryptoReturns*100)+" % returns, "+
							"your total amount (in EUR) after "+ c +" years will be: " +
							"<br/>" +
							"----------------------------------- " +compVal + " Euros" +
							"----------------------------------- " + "</html>");
				
				}
				catch(NumberFormatException ex) {
					ex.printStackTrace();
				}
			}
		});

		Bonds.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Bonds.setBackground(new Color(0,0,0));
				Banks.setBackground(null);
				Cryptos.setBackground(null);
				Stocks.setBackground(null);
				ETF.setBackground(null);
				P2P.setBackground(null);

				try {
					String b  = MainPage.getAmount().getText();
					String c = MainPage.getYears().getText();
					double amount = Double.parseDouble(b);
					double year = Double.parseDouble(c);
					double result = Bonds(amount, year);
					NumberFormat nf = NumberFormat.getNumberInstance(Locale.ENGLISH);
					DecimalFormat df = (DecimalFormat)nf;
//					DecimalFormat df = new DecimalFormat("####0.00");
					String compVal = df.format(result);
					Display.setText("<html>With "+(bondsReturns*100)+"% returns, "+
							"Your total amount (in EUR) after "+c+" years will be: "+
							"<br/>"+
							"----------------------------------- "+compVal + " Euros" + 
							"----------------------------------- " + "</html>");
				
				}
				catch(NumberFormatException ex) {
					ex.printStackTrace();
				}
			}
		});

		ETF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ETF.setBackground(new Color(0,0,0));
				Banks.setBackground(null);
				Cryptos.setBackground(null);
				Stocks.setBackground(null);
				Bonds.setBackground(null);
				P2P.setBackground(null);

				try {
					String b  = MainPage.getAmount().getText();
					String c = MainPage.getYears().getText();
					double amount = Double.parseDouble(b);
					double year = Double.parseDouble(c);
					double result = ETF(amount, year);
					NumberFormat nf = NumberFormat.getNumberInstance(Locale.ENGLISH);
					DecimalFormat df = (DecimalFormat)nf;
					
//					DecimalFormat df = new DecimalFormat("####0.00");
					String compVal = df.format(result);
					Display.setText("<html>With "+(ETFReturns*100)+"% returns, "+
							"Your total amount (in EUR) after "+c+" years will be: "+
							 "<br/>" +
							"----------------------------------- " +compVal +  " Euros" +
							"----------------------------------- " + "</html>");
				
				}
				catch(NumberFormatException ex) {
					ex.printStackTrace();
				}
			}
		});

		P2P.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				P2P.setBackground(new Color(0,0,0));
				Banks.setBackground(null);
				Cryptos.setBackground(null);
				Stocks.setBackground(null);
				Bonds.setBackground(null);
				ETF.setBackground(null);
				
				try {
					String b  = MainPage.getAmount().getText();
					String c = MainPage.getYears().getText();
					double amount = Double.parseDouble(b);
					double year = Double.parseDouble(c);
					double result = P2P(amount, year);
					NumberFormat nf = NumberFormat.getNumberInstance(Locale.ENGLISH);
					DecimalFormat df = (DecimalFormat)nf;
					
//					DecimalFormat df = new DecimalFormat("####0.00");
					String compVal = df.format(result);
					Display.setText("<html>With "+(P2PReturns*100)+"% returns, "+
							"Your total amount (in EUR) after "+c+" years will be: "+
							 "<br/>"+"----------------------------------- " +compVal + 
							" Euros" + "----------------------------------- " + "</html>");
				
				}
				catch(NumberFormatException ex) {
					ex.printStackTrace();
				}
			}
		});
		
		Yes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String b = MainPage.getAmount().getText();
					String c = MainPage.getYears().getText();
					
					if(b.isBlank()||c.isBlank())
					{
						JOptionPane.showMessageDialog(null,"Please enter valid input for amount and years (only numbers)");
						dispose();
						MainPage frame = new MainPage();
						frame.setVisible(true);
						frame.setLocationRelativeTo(null);
					}
					else
					{
						double amount = Double.parseDouble(b);
						double year = Double.parseDouble(c);

						if(amount<0||amount>2000000||year<0||year>100)
						{
							JOptionPane.showMessageDialog(null,"Please enter input for amount and years in the specified range (only numbers)");
							dispose();
							MainPage frame = new MainPage();
							frame.setVisible(true);
							frame.setLocationRelativeTo(null);
						}
						else if(amount>0||amount<=2000000||year>0||year<=100)
						{
							dispose();
							EndPageYes a = new EndPageYes();
							a.setVisible(true);
							a.setLocationRelativeTo(null);
							File soundFile = new File("src\\main\\resources\\jigglejiggle.wav");
							AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
			         		// Get a sound clip resource.
			         		Clip clip = AudioSystem.getClip();
			         		// Open audio clip and load samples from the audio input stream.
			         		clip.open(audioIn);
			         		clip.start();
						}
					}
					
				}
				catch(NumberFormatException ex2) {
					ex2.printStackTrace();
				}
			       catch (UnsupportedAudioFileException Ex) {
			         Ex.printStackTrace();
			      } catch (IOException ex) {
			         ex.printStackTrace();
			      } catch (LineUnavailableException ex1) {
			         ex1.printStackTrace();
			      }
				}
		});
		
		No.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					dispose();
					EndPageNo a = new EndPageNo();
					a.setVisible(true);
					a.setLocationRelativeTo(null);
					File soundFile = new File("src\\main\\resources\\jigglejiggle.wav");
					  AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
			         // Get a sound clip resource.
			         Clip clip = AudioSystem.getClip();
			         // Open audio clip and load samples from the audio input stream.
			         clip.open(audioIn);
			         clip.start();
			        
				}
			       catch (UnsupportedAudioFileException Ex) {
			         Ex.printStackTrace();
			      } catch (IOException ex) {
			         ex.printStackTrace();
			      } catch (LineUnavailableException ex1) {
			         ex1.printStackTrace();
			      }
				}
			});
		
	}
	public static JTextField getAmount() {
		// TODO Auto-generated method stub
		return Amount;
	}
	
	public static JTextField getYears() {
		// TODO Auto-generated method stub
		return Years;
	}
}
