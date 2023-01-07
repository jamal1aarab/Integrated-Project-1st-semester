package fenetre2;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import javax.swing.Timer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuItem;
import java.awt.Choice;
import java.awt.Button;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

public class Acc {

	 JFrame acceui;
	 private ImageIcon[] images;
	 private int currentIndex;
	 private Timer timer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Acc window = new Acc();
					window.acceui.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Acc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		acceui = new JFrame();
		acceui.setBackground(Color.GRAY);
		acceui.getContentPane().setBackground(Color.DARK_GRAY);
		acceui.setBounds(0, 0, 1060, 595);
		acceui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		acceui.getContentPane().setLayout(null);
		
		JPanel conteneur = new JPanel();
		conteneur.setBackground(Color.LIGHT_GRAY);
		conteneur.setBounds(0, 10, 1920, 661);
		acceui.getContentPane().add(conteneur);
		conteneur.setLayout(null);
		JPanel droit = new JPanel();
		droit.setBackground(Color.LIGHT_GRAY);
		droit.setBounds(548, 0, 503, 550);
		conteneur.add(droit);
		droit.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 450, 500, 110);
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(59, 59, 59));
		droit.add(panel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Info  :\r\n");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(10, 0, 138, 31);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel(".EMI");
		lblNewLabel_3.setForeground(Color.YELLOW);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
		lblNewLabel_3.setBounds(20, 28, 45, 13);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel(".Université Med V");
		lblNewLabel_3_1.setForeground(Color.YELLOW);
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
		lblNewLabel_3_1.setBounds(20, 41, 138, 13);
		panel_1.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_4 = new JLabel("Contactez nous  :");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_4.setBounds(229, 11, 146, 13);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("BP765,Avenue Ibn Sina Agdal Rabat Maroc\r\n");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
		lblNewLabel_5.setBounds(197, 19, 229, 31);
		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Phone : (+212) 537 68 71 50");
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
		lblNewLabel_6.setBounds(207, 41, 167, 13);
		panel_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Email  :");
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
		lblNewLabel_7.setBounds(207, 55, 45, 13);
		panel_1.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("contact @emi.ac.ma");
		lblNewLabel_8.setForeground(Color.YELLOW);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
		lblNewLabel_8.setBounds(251, 55, 124, 13);
		panel_1.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("© Equipe EMI");
		lblNewLabel_9.setForeground(Color.RED);
		lblNewLabel_9.setFont(new Font("Tw Cen MT", Font.BOLD, 10));
		lblNewLabel_9.setBounds(10, 81, 97, 19);
		panel_1.add(lblNewLabel_9);
		
		
		
		JLabel med = new JLabel("");
		med.setBounds(0, 0, 170, 81);
		ImageIcon icon3=new ImageIcon(this.getClass().getResource("/med (1).jpg"));
		med.setIcon(icon3);
		droit.add(med);
		
		JLabel emi = new JLabel("");
		emi.setBounds(194, 0, 282, 81);
		ImageIcon icon4=new ImageIcon(this.getClass().getResource("/logoEmi1.png"));
		emi.setIcon(icon4);
		droit.add(emi);
		
		JPanel panel = new JPanel();
		panel.setBounds(42, 215, 402, 170);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));
		panel.setBackground(Color.LIGHT_GRAY);
		droit.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_10 = new JLabel("   Bienvenue!\r\n");
		lblNewLabel_10.setBounds(6, 15, 382, 149);
		panel.add(lblNewLabel_10);
		lblNewLabel_10.setBackground(Color.BLACK);
		lblNewLabel_10.setFont(new Font("Agency FB", Font.BOLD | Font.ITALIC, 33));
		lblNewLabel_10.setForeground(Color.WHITE);
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		JPanel koulchi = new JPanel();
		koulchi.setBounds(105, 145, 371, 42);
		droit.add(koulchi);
		koulchi.setLayout(null);
		
    	JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel_2.setBounds(4, -15, 141, 63);
		koulchi.add(panel_2);
		panel_2.setLayout(null);
		
		JPanel connect = new JPanel();
		connect.setBounds(6, 15, 129, 42);
		panel_2.add(connect);
		connect.setLayout(null);
		
		JLabel lblNewLabel_11 = new JLabel("sign in");
		lblNewLabel_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				LoginForm lg=new LoginForm();
				 lg.enter.setVisible(true);
				 acceui.dispose();
			}
		});
		lblNewLabel_11.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 22));
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11.setBounds(0, 0, 129, 42);
		connect.add(lblNewLabel_11);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel_3.setBounds(151, -15, 141, 63);
		koulchi.add(panel_3);
		panel_3.setLayout(null);
		
		JPanel newe = new JPanel();
		newe.setBounds(6, 15, 129, 42);
		panel_3.add(newe);
		newe.setLayout(null);
		
		JLabel lblNewLabel_11_1 = new JLabel("sign up");
		lblNewLabel_11_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Register rgs=new Register();
				 rgs.secondFrame.setVisible(true);
				 acceui.dispose();
			}
		});
		lblNewLabel_11_1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 21));
		lblNewLabel_11_1.setBounds(0, 0, 129, 42);
		newe.add(lblNewLabel_11_1);
		JLabel menu = new JLabel("");
		menu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(koulchi.isVisible()) {
					koulchi.setVisible(false);
					
				}
				else {
					koulchi.setVisible(true);
				}
			}
		});
		menu.setBounds(57, 145, 49, 40);
		ImageIcon icon=new ImageIcon(this.getClass().getResource("/m2.png"));
		menu.setIcon(icon);
		droit.add(menu);
		
		JLabel lblNewLabel = new JLabel("Menu");
		lblNewLabel.setBounds(10, 145, 45, 40);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		droit.add(lblNewLabel);
		
		JPanel gauche = new JPanel();
		gauche.setBackground(Color.LIGHT_GRAY);
		gauche.setBounds(0, 0, 550, 585);
		JLabel diaporama = new JLabel("");
		diaporama.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				ImageIcon icon1=new ImageIcon(this.getClass().getResource("/taj.jpg"));
				diaporama.setIcon(icon1);
				diaporama.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						ImageIcon icon1=new ImageIcon(this.getClass().getResource("/cous.jpg"));
						diaporama.setIcon(icon1);
						diaporama.addMouseListener(new MouseAdapter() {
							@Override
							public void mouseClicked(MouseEvent e) {
								ImageIcon icon1=new ImageIcon(this.getClass().getResource("/dishD (1).jpg"));
								diaporama.setIcon(icon1);
								
							}
						});
						
					}
				});
				
			}
		});
		diaporama.addMouseListener(new MouseAdapter (){
			@Override
			public void mouseExited(MouseEvent e) {
				ImageIcon icon1=new ImageIcon(this.getClass().getResource("/dishD (1).jpg"));
				diaporama.setIcon(icon1);
				
			}
			
			
		});
		
		
		diaporama.setBounds(-160, 0, 880, 590);
		ImageIcon icon1=new ImageIcon(this.getClass().getResource("/dishD (1).jpg"));
		gauche.setLayout(null);
		
		JLabel title = new JLabel("Ce que vous méritez...");
		title.setForeground(Color.WHITE);
		title.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 40));
		title.setBounds(32, 318, 492, 49);
		gauche.add(title);
		diaporama.setIcon(icon1);
		gauche.add(diaporama);
		

		conteneur.add(gauche);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(550, 10, 185, 82);
		acceui.getContentPane().add(lblNewLabel_1);

	}
}
