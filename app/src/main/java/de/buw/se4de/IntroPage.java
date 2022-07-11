package de.buw.se4de;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.border.MatteBorder;

import javax.swing.border.EtchedBorder;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.Toolkit;

public class IntroPage extends JFrame {

	private JPanel contentPane;
	private JTextField user;
	private JTextField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IntroPage frame = new IntroPage();
					frame.setLocationRelativeTo(null);
					frame.setSize(800,800);
					frame.setVisible(true); 
				}
						// Open an audio input stream.
					    	  //File soundFile = new File("C:\\Users\\Chaithra\\eclipse-workspace\\Codes_Exercises\\src\\InvestBuddy\\Scam1992.wav");
					    	  
				catch (Exception e) {
					e.printStackTrace();
				}
			}		});					//UIDefaults uiDefaults = UIManager.getDefaults();
					//uiDefaults.put("activeCaption", new javax.swing.plaf.ColorUIResource(Color.gray));
					//uiDefaults.put("activeCaptionText", new javax.swing.plaf.ColorUIResource(Color.white));
					//JFrame.setDefaultLookAndFeelDecorated(true);

				
	}

	/**
	 * Create the frame.
	 */
	public IntroPage() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0	, 0, 800, 800);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("INVEST BUDDY");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Segoe Print", Font.BOLD, 40));
		lblNewLabel.setBackground(new Color(245, 222, 179));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 72, 566, 31);
		contentPane.add(lblNewLabel);
		
		JButton StartInvesting = new JButton("Explore Options now");
		StartInvesting.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    dispose();
		         MainPage a = new MainPage();
		         a.setVisible(true);
				 a.setLocationRelativeTo(null);
					
			}
			
		});
		StartInvesting.setFont(new Font("Pristina", Font.BOLD, 22));
		StartInvesting.setBackground(new Color(51, 204, 204));
		StartInvesting.setForeground(Color.BLACK);
		StartInvesting.setBounds(134, 171, 305, 73);
		contentPane.add(StartInvesting);
		
		JLabel lblNewLabel_2 = new JLabel("Plan now, for a better future");
		lblNewLabel_2.setFont(new Font("Pristina", Font.BOLD, 27));
		lblNewLabel_2.setBounds(162, 113, 274, 30);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setIcon(new ImageIcon(IntroPage.class.getResource("/Project_57-04.jpg")));
		lblNewLabel_1.setBounds(0, 0, 800, 800);
		contentPane.add(lblNewLabel_1);
	}
}
		
		
	
	
