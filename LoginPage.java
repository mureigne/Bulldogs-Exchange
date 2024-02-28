package pages;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class LoginPage {

	private JFrame frame;
	private JTextField txtEmail;
	private JPasswordField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage window = new LoginPage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(53, 64, 143));
		frame.getContentPane().setLayout(null);
		
		JPanel panelYellow = new JPanel();
		panelYellow.setBackground(new Color(255, 212, 28));
		panelYellow.setBounds(56, 46, 520, 543);
		frame.getContentPane().add(panelYellow);
		panelYellow.setLayout(null);
		
		JLabel BANNER = new JLabel("");
		BANNER.setHorizontalAlignment(SwingConstants.CENTER);
		BANNER.setIcon(new ImageIcon("C:\\Users\\murei\\Downloads\\BANNER.png"));
		BANNER.setBounds(0, 40, 520, 195);
		panelYellow.add(BANNER);
		
		JLabel LOGO = new JLabel("");
		LOGO.setIcon(new ImageIcon("C:\\Users\\murei\\Downloads\\NULogo.png"));
		LOGO.setBounds(200, 358, 120, 120);
		panelYellow.add(LOGO);
		
		JPanel panelWhite = new JPanel();
		panelWhite.setBounds(575, 46, 520, 543);
		frame.getContentPane().add(panelWhite);
		panelWhite.setLayout(null);
		
		JLabel lblSignIn = new JLabel("Sign in");
		lblSignIn.setForeground(new Color(53, 64, 143));
		lblSignIn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSignIn.setBounds(63, 43, 102, 30);
		panelWhite.add(lblSignIn);
		
		JLabel lblAccType = new JLabel("Select Account Type:");
		lblAccType.setForeground(new Color(73, 88, 188));
		lblAccType.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAccType.setBounds(63, 102, 190, 30);
		panelWhite.add(lblAccType);
		
		JComboBox comboBoxAccType = new JComboBox();
		comboBoxAccType.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBoxAccType.setModel(new DefaultComboBoxModel(new String[] {"", "Admin", "Student"}));
		comboBoxAccType.setBounds(63, 134, 394, 30);
		panelWhite.add(comboBoxAccType);
		
		JLabel lblCredentials = new JLabel("Bulldogs Exchange Credentials:");
		lblCredentials.setForeground(new Color(73, 88, 188));
		lblCredentials.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCredentials.setBounds(63, 200, 351, 30);
		panelWhite.add(lblCredentials);
		
		txtEmail = new JTextField();
		txtEmail.setToolTipText("");
		txtEmail.setForeground(new Color(53, 64, 143));
		txtEmail.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtEmail.setBounds(137, 240, 320, 30);
		panelWhite.add(txtEmail);
		txtEmail.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setForeground(new Color(73, 88, 188));
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEmail.setLabelFor(txtEmail);
		lblEmail.setBounds(63, 240, 69, 30);
		panelWhite.add(lblEmail);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setForeground(new Color(73, 88, 188));
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPassword.setBounds(63, 280, 69, 30);
		panelWhite.add(lblPassword);
		
		password = new JPasswordField();
		password.setBounds(137, 280, 320, 30);
		panelWhite.add(password);
		
		JButton btnNewButton = new JButton("Login with Bulldogs Exchange");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(0, 204, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(63, 338, 394, 35);
		panelWhite.add(btnNewButton);
		
		JLabel lblCreate = new JLabel("Create an Account");
		lblCreate.setHorizontalAlignment(SwingConstants.CENTER);
		lblCreate.setForeground(new Color(73, 88, 188));
		lblCreate.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCreate.setBounds(63, 419, 187, 30);
		panelWhite.add(lblCreate);
		
		JLabel lblForgotPassword = new JLabel("Forgot Password");
		lblForgotPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblForgotPassword.setForeground(new Color(73, 88, 188));
		lblForgotPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblForgotPassword.setBounds(269, 419, 188, 30);
		panelWhite.add(lblForgotPassword);
		
		JLabel lblBackToPortal = new JLabel("Back to Portal");
		lblBackToPortal.setHorizontalAlignment(SwingConstants.CENTER);
		lblBackToPortal.setForeground(new Color(73, 88, 188));
		lblBackToPortal.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblBackToPortal.setBounds(150, 474, 219, 30);
		panelWhite.add(lblBackToPortal);
		frame.setBackground(new Color(240, 240, 240));
		frame.setBounds(100, 100, 1170, 670);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
