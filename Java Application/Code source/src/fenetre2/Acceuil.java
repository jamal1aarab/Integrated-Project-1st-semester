package fenetre2;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Label;
import java.awt.Scrollbar;
import java.awt.Button;
import java.awt.Canvas;
import java.awt.ScrollPane;
import java.awt.Choice;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.List;
import java.awt.TextArea;
import java.awt.event.AdjustmentListener;
import java.awt.event.AdjustmentEvent;
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.SwingConstants;
import java.awt.Toolkit;

public class Acceuil {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Acceuil window = new Acceuil();
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
	public Acceuil() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(new Color(0, 0, 0));
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Acceuil.class.getResource("/fenetre2/image.jpg")));
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setResizable(false);
		frame.setBounds(100, 100, 450, 394);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel pageAcceuil = new JPanel();
		pageAcceuil.setBounds(0, 117, 436, 136);
		pageAcceuil.setBackground(new Color(176, 224, 230));
		
		frame.getContentPane().add(pageAcceuil);
		pageAcceuil.setLayout(null);
		
		JLabel acc = new JLabel("");
		acc.setBounds(77, 0, 277, 136);

		ImageIcon icon=new ImageIcon(this.getClass().getResource("/eat.jpg"));
		acc.setIcon(icon);
		pageAcceuil.add(acc);
		
		JSlider slider = new JSlider();
		slider.setOrientation(SwingConstants.VERTICAL);
		slider.setBackground(new Color(176, 224, 230));
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(slider.getValue()>=50) {
					ImageIcon icon=new ImageIcon(this.getClass().getResource("/spag.jpg"));
					acc.setIcon(icon);
					pageAcceuil.add(acc);}
				else {
					ImageIcon icon=new ImageIcon(this.getClass().getResource("/eat.jpg"));
					acc.setIcon(icon);
					pageAcceuil.add(acc);
					
				}
			}
		});
		slider.setValue(0);
		slider.setBounds(288, 73, 148, 22);
		pageAcceuil.add(slider);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(0, 250, 436, 110);
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(new Color(59, 59, 59));
		frame.getContentPane().add(panel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("Info  :\r\n");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(10, 0, 138, 31);
		panel_1_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel(".EMI");
		lblNewLabel_3.setForeground(Color.YELLOW);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
		lblNewLabel_3.setBounds(20, 28, 45, 13);
		panel_1_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel(".Université Med V");
		lblNewLabel_3_1.setForeground(Color.YELLOW);
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
		lblNewLabel_3_1.setBounds(20, 41, 138, 13);
		panel_1_1.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_4 = new JLabel("Contactez nous  :");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_4.setBounds(229, 11, 146, 13);
		panel_1_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("BP765,Avenue Ibn Sina Agdal Rabat Maroc\r\n");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
		lblNewLabel_5.setBounds(197, 19, 229, 31);
		panel_1_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Phone : (+212) 537 68 71 50");
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
		lblNewLabel_6.setBounds(207, 41, 167, 13);
		panel_1_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Email  :");
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
		lblNewLabel_7.setBounds(207, 55, 45, 13);
		panel_1_1.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("contact @emi.ac.ma");
		lblNewLabel_8.setForeground(Color.YELLOW);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
		lblNewLabel_8.setBounds(251, 55, 124, 13);
		panel_1_1.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("© Equipe EMI");
		lblNewLabel_9.setForeground(Color.RED);
		lblNewLabel_9.setFont(new Font("Tw Cen MT", Font.BOLD, 10));
		lblNewLabel_9.setBounds(10, 81, 97, 19);
		panel_1_1.add(lblNewLabel_9);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 63, 436, 55);
		panel_2.setBackground(new Color(68, 68, 68));
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		Button button_2 = new Button("Acceuil\r\n");
		button_2.setBounds(0, 0, 125, 53);
		button_2.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 13));
		button_2.setBackground(Color.ORANGE);
		panel_2.add(button_2);
		
		Choice choice = new Choice();
		choice.addItem("");
		choice.addItem("se connecter");
		choice.addItem("se deconnecter");
		choice.addItem("create account");
		choice.setBounds(257, 35, 90, 26);
		panel_2.add(choice);
		
		Button button = new Button("pick");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String data = choice.getItem(choice.getSelectedIndex());   
				 int comparaison = data.compareToIgnoreCase("se connecter");
				 if (comparaison==0) {
					 LoginForm lg=new LoginForm();
					 lg.enter.setVisible(true);
					 frame.dispose();
				 }
				 int cmp=data.compareToIgnoreCase("se deconnecter");
				 if (cmp==0) {
					 frame.dispose();
				 }
				 int cmp1=data.compareToIgnoreCase("create account");
				 if (cmp1==0) {
					 Register rgs=new Register();
					 rgs.secondFrame.setVisible(true);
					 frame.dispose();
				 }
				
			}
		});
		button.setBounds(346, 35, 90, 22);
		panel_2.add(button);
		
		

		
		
		JPanel panelLogo = new JPanel();
		panelLogo.setBounds(0, 0, 436, 64);
		
		frame.getContentPane().add(panelLogo);
		
		JLabel log = new JLabel("");
		log.setBounds(162, 0, 274, 64);

		ImageIcon icon1=new ImageIcon(this.getClass().getResource("/logoEmi1.png"));
		panelLogo.setLayout(null);
		log.setIcon(icon1);
		panelLogo.add(log);
		
		JLabel med = new JLabel("");
		med.setBounds(0, 0, 137, 64);
		
	}
}
