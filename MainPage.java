package pages;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;

public class MainPage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainPage window = new MainPage();
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
	public MainPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(53, 64, 143));
		frame.setBounds(100, 100, 1170, 670);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblMainBanner = new JLabel("");
		lblMainBanner.setIcon(new ImageIcon("C:\\Users\\murei\\Downloads\\BULLDOGS.png"));
		lblMainBanner.setBounds(0, 0, 1170, 120);
		frame.getContentPane().add(lblMainBanner);
		
		JLabel lblTradUnif = new JLabel("Traditional Uniform");
		lblTradUnif.setHorizontalAlignment(SwingConstants.CENTER);
		lblTradUnif.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTradUnif.setBounds(139, 344, 189, 13);
		frame.getContentPane().add(lblTradUnif);
		
		JLabel TradUnif = new JLabel("");
		TradUnif.setIcon(new ImageIcon("C:\\Users\\murei\\Downloads\\trad.png"));
		TradUnif.setBounds(133, 161, 200, 200);
		frame.getContentPane().add(TradUnif);
		
		JLabel lblPsychUnif = new JLabel("Psychology Uniform");
		lblPsychUnif.setHorizontalAlignment(SwingConstants.CENTER);
		lblPsychUnif.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPsychUnif.setBounds(483, 341, 189, 20);
		frame.getContentPane().add(lblPsychUnif);
		
		JLabel PsychUnif = new JLabel("");
		PsychUnif.setIcon(new ImageIcon("C:\\Users\\murei\\Downloads\\psych.png"));
		PsychUnif.setBounds(472, 162, 200, 200);
		frame.getContentPane().add(PsychUnif);
		
		JLabel lblTourismUnif = new JLabel("Tourism Uniform");
		lblTourismUnif.setHorizontalAlignment(SwingConstants.CENTER);
		lblTourismUnif.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTourismUnif.setBounds(817, 341, 189, 20);
		frame.getContentPane().add(lblTourismUnif);
		
		JLabel TourismUnif = new JLabel("");
		TourismUnif.setIcon(new ImageIcon("C:\\Users\\murei\\Downloads\\tourism.png"));
		TourismUnif.setBounds(811, 162, 200, 200);
		frame.getContentPane().add(TourismUnif);
		
		JLabel lblMedTechUniform = new JLabel("Medical Technology Uniform");
		lblMedTechUniform.setHorizontalAlignment(SwingConstants.CENTER);
		lblMedTechUniform.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMedTechUniform.setBounds(122, 580, 227, 20);
		frame.getContentPane().add(lblMedTechUniform);
		
		JLabel MedTechUnif = new JLabel("");
		MedTechUnif.setIcon(new ImageIcon("C:\\Users\\murei\\Downloads\\medtech.png"));
		MedTechUnif.setBounds(133, 402, 200, 200);
		frame.getContentPane().add(MedTechUnif);
		
	}
}
