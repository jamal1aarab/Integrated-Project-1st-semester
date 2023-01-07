package fenetre2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Recover {

	JFrame recov;
	private JTextField mat;
	private JTextField name;
	private JTextField fm;
	private JTextField word;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Recover window = new Recover();
					window.recov.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Recover() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		recov = new JFrame();
		recov.setIconImage(Toolkit.getDefaultToolkit().getImage(Recover.class.getResource("/fenetre2/image.jpg")));
		recov.setResizable(false);
		recov.getContentPane().setBackground(Color.LIGHT_GRAY);
		recov.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1553, 42);
		panel.setBackground(Color.DARK_GRAY);
		recov.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("mot de passe oublié :");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel.setBounds(181, 10, 245, 22);
		panel.add(lblNewLabel);
		
		mat = new JTextField();
		mat.setBounds(630, 145, 333, 42);
		recov.getContentPane().add(mat);
		mat.setColumns(10);
		
		name = new JTextField();
		name.setBounds(630, 231, 333, 42);
		name.setColumns(10);
		recov.getContentPane().add(name);
		
		fm = new JTextField();
		fm.setBounds(630, 307, 333, 42);
		fm.setColumns(10);
		recov.getContentPane().add(fm);
		
		word = new JTextField();
		word.setBounds(630, 381, 333, 30);
		word.setColumns(10);
		recov.getContentPane().add(word);
		
		JLabel lblNewLabel_1 = new JLabel("Matricule  :");
		lblNewLabel_1.setBounds(455, 149, 174, 36);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		recov.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Name  :");
		lblNewLabel_1_1.setBounds(458, 231, 89, 40);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		recov.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("FamilyName  :");
		lblNewLabel_1_2.setBounds(444, 317, 126, 30);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		recov.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("RecoveryWord  :");
		lblNewLabel_1_3.setBounds(455, 381, 128, 40);
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		recov.getContentPane().add(lblNewLabel_1_3);
		
		Button go = new Button("GO !");
		go.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nom=name.getText();
				String pr=fm.getText();
				String mle=mat.getText();
				String mot=word.getText();
				String recov;
				try {

					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","TheFourMusketeers","ayoub123");
					Statement stmt=con.createStatement();
					ResultSet rs=stmt.executeQuery("select * from recoverAccount");
					
					int b=0;
					while (rs.next()) {
						recov=rs.getString(2);
						System.out.println(recov);
						if ( mle.equalsIgnoreCase(rs.getString(1))&& mot.equalsIgnoreCase(rs.getString(3))) {
							JOptionPane.showMessageDialog(null,"votre mot de passe est  :  "+recov);
							break;
						}
						
						
						
					}
				}
		
				catch(Exception e1)
				{
					System.out.println(e1);
				}
			
			}
		});
		go.setBounds(554, 526, 137, 21);
		go.setBackground(Color.BLUE);
		go.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 15));
		go.setForeground(Color.WHITE);
		recov.getContentPane().add(go);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(59, 59, 59));
		panel_1.setBounds(0, 735, 1553, 110);
		recov.getContentPane().add(panel_1);
		
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
		recov.setBounds(0, 0, 1920, 1080);
		recov.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
