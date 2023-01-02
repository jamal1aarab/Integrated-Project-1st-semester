package fenetre2;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import java.awt.Button;
import java.awt.Label;
import java.awt.Choice;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JTextField;

public class Tickets {

	JFrame ThirdFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tickets window = new Tickets();
					window.ThirdFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Tickets() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	 public void initialize() {
		ThirdFrame = new JFrame();
		ThirdFrame.setIconImage(Toolkit.getDefaultToolkit().getImage(Tickets.class.getResource("/fenetre2/image.jpg")));
		ThirdFrame.setResizable(false);
		ThirdFrame.getContentPane().setBackground(Color.LIGHT_GRAY);
		ThirdFrame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 436, 67);
		ThirdFrame.getContentPane().add(panel);
		
		JLabel img = new JLabel("");
		img.setBounds(164, 0, 272, 67);
		ImageIcon icon=new ImageIcon(this.getClass().getResource("/logoEmi1.png"));
		panel.setLayout(null);
		img.setIcon(icon);
		panel.add(img);
		
		JLabel lblNewLabel = new JLabel("Nom : ");
		lblNewLabel.setBounds(0, 10, 49, 25);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		panel.add(lblNewLabel);
		
		JLabel lblPrnomYyyy = new JLabel("Prénom  : ");
		lblPrnomYyyy.setBounds(0, 32, 108, 25);
		lblPrnomYyyy.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		panel.add(lblPrnomYyyy);
		String mle=LoginForm.aUser;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","TheFourMusketeers","ayoub123");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from recoverAccount where mle="+mle);
			while (rs.next()) {
				JLabel nomD = new JLabel(rs.getString(5));
				nomD.setBounds(46, 17, 108, 13);
				panel.add(nomD);
				
				JLabel prenomD = new JLabel(rs.getString(6));
				prenomD.setBounds(76, 39, 78, 13);
				panel.add(prenomD);
				
			}
			
			con.close();
			
		}
		catch(Exception e) {
			
		}
		
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 65, 436, 37);
		panel_1.setBackground(Color.DARK_GRAY);
		ThirdFrame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		Button button = new Button("Accueil");
		button.setBounds(0, 0, 97, 39);
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 13));
		button.setBackground(Color.ORANGE);
		panel_1.add(button);
		
		Label label = new Label("Mes repas");
		label.setBounds(98, 6, 87, 31);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 12));
		panel_1.add(label);
		
		Label label_1 = new Label("Solde");
		label_1.setBounds(284, 12, 59, 27);
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 12));
		panel_1.add(label_1);
		String gj = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","TheFourMusketeers","ayoub123");
			Statement stmt=con.createStatement();
			ResultSet rs1=stmt.executeQuery("select * from users2 where mle="+mle);
			while(rs1.next()) {
				gj=rs1.getString(4);
				
				
			}
			con.close();
			
			
		}
		catch(Exception e1) {
			
		}
		JLabel lblNewLabel_1 = new JLabel(gj+"dh");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(374, 10, 52, 29);
		panel_1.add(lblNewLabel_1);
		
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.DARK_GRAY);
		panel_2.setBounds(0, 243, 436, 90);
		ThirdFrame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Info  :\r\n");
		lblNewLabel_2.setBounds(10, 0, 41, 17);
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel(".EMI");
		lblNewLabel_3.setBounds(20, 22, 45, 17);
		lblNewLabel_3.setForeground(Color.YELLOW);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
		panel_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel(".Université Med V");
		lblNewLabel_3_1.setBounds(10, 37, 138, 13);
		lblNewLabel_3_1.setForeground(Color.YELLOW);
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
		panel_2.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_9 = new JLabel("© Equipe EMI");
		lblNewLabel_9.setBounds(10, 60, 97, 19);
		lblNewLabel_9.setForeground(Color.RED);
		lblNewLabel_9.setFont(new Font("Tw Cen MT", Font.BOLD, 10));
		panel_2.add(lblNewLabel_9);
		
		JLabel lblNewLabel_4 = new JLabel("Contactez nous  :");
		lblNewLabel_4.setBounds(252, 4, 146, 13);
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		panel_2.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("BP765,Avenue Ibn Sina Agdal Rabat Maroc\r\n");
		lblNewLabel_5.setBounds(197, 19, 229, 17);
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
		panel_2.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Phone : (+212) 537 68 71 50");
		lblNewLabel_6.setBounds(207, 35, 167, 17);
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
		panel_2.add(lblNewLabel_6);
		
		JLabel lblNewLabel_8 = new JLabel("contact @emi.ac.ma");
		lblNewLabel_8.setBounds(269, 50, 124, 13);
		lblNewLabel_8.setForeground(Color.YELLOW);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
		panel_2.add(lblNewLabel_8);
		
		JLabel lblNewLabel_7 = new JLabel("Email  :");
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
		lblNewLabel_7.setBounds(220, 50, 45, 13);
		panel_2.add(lblNewLabel_7);
		
		Choice choice = new Choice();
		choice.setBounds(277, 140, 71, 18);
		choice.addItem("1");
		choice.addItem("2");
		choice.addItem("3");
		
		ThirdFrame.getContentPane().add(choice);
		
		Choice choice_1 = new Choice();
		choice_1.setBounds(277, 175, 71, 18);
		choice_1.addItem("1");
		choice_1.addItem("2");
		choice_1.addItem("3");
		ThirdFrame.getContentPane().add(choice_1);
		
		Choice choice_2 = new Choice();
		choice_2.setBounds(277, 219, 71, 18);
		choice_2.addItem("1");
		choice_2.addItem("2");
		choice_2.addItem("3");
		ThirdFrame.getContentPane().add(choice_2);
		
		JLabel pti = new JLabel("Petit-dejeuner  :");
		pti.setBackground(Color.BLACK);
		pti.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		pti.setBounds(75, 140, 183, 18);
		ThirdFrame.getContentPane().add(pti);
		
		JLabel lblDjeuner = new JLabel("Déjeuner  :");
		lblDjeuner.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblDjeuner.setBounds(75, 175, 183, 18);
		ThirdFrame.getContentPane().add(lblDjeuner);
		
		JLabel lblDner = new JLabel("DÎner  :");
		lblDner.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblDner.setBounds(75, 219, 183, 18);
		ThirdFrame.getContentPane().add(lblDner);
		ThirdFrame.setBounds(100, 100, 449, 370);
		ThirdFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		String bb=LoginForm.aUser;
		System.out.println(bb);
	}
}
