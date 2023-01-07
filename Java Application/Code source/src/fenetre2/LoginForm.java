package fenetre2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Button;
import java.awt.SystemColor;
import java.awt.Window;
import java.awt.Label;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Toolkit;

public class LoginForm {

	JFrame enter;
	 JTextField Username;
	private JPasswordField Password;
	static String  aUser;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginForm window = new LoginForm();
					window.enter.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		enter = new JFrame();
		enter.setIconImage(Toolkit.getDefaultToolkit().getImage(LoginForm.class.getResource("/fenetre2/image.jpg")));
		enter.getContentPane().setEnabled(false);
		enter.getContentPane().setBackground(new Color(214, 214, 214));
		enter.getContentPane().setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 675, 1800, 110);
		panel_1.setBackground(new Color(59, 59, 59));
		enter.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
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
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 73, 1800, 45);
		panel_2.setBackground(new Color(68, 68, 68));
		enter.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		Button button_2 = new Button("Acceuil\r\n");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Acc a=new Acc();
				a.acceui.setVisible(true);
				enter.dispose();
			}
		});
		button_2.setBackground(Color.ORANGE);
		button_2.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 13));
		button_2.setBounds(0, 0, 119, 45);
		panel_2.add(button_2);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 408, 426, -73);
		enter.getContentPane().add(panel);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 398, 436, -90);
		enter.getContentPane().add(panel_3);
		
		JLabel label = new JLabel("");
		label.setBounds(1241, 0, 315, 78);
		ImageIcon icon=new ImageIcon(this.getClass().getResource("/logoEmi1.png"));
		label.setIcon(icon);
		enter.getContentPane().add(label);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(245, 245, 245));
		panel_4.setBounds(378, 115, 806, 561);
		enter.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		Button button = new Button("j'ai oublié mon compte!");
		button.setBounds(222, 266, 209, 21);
		panel_4.add(button);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Recover rv=new Recover();
				rv.recov.setVisible(true);
				enter.dispose();
			}
		});
		button.setForeground(Color.RED);
		button.setFont(new Font("Dialog", Font.ITALIC, 12));
		button.setBackground(new Color(255, 255, 255));
		
		Button newUser = new Button("Créer un compte!");
		newUser.setBounds(463, 407, 180, 25);
		panel_4.add(newUser);
		newUser.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 Register reg=new Register();
				 reg.secondFrame.setVisible(true);
				 enter.dispose();
				 
				
			}
		});
		newUser.setBackground(SystemColor.controlHighlight);
		newUser.setForeground(Color.DARK_GRAY);
		
		Button submit = new Button("Se connecter");
		submit.setBounds(185, 407, 191, 25);
		panel_4.add(submit);
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String User=Username.getText();
				String Passw=Password.getText();
				aUser=User;
				int b = 0;
				try
				{
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","TheFourMusketeers","ayoub123");
					Statement stmt=con.createStatement();
					ResultSet rs=stmt.executeQuery("select * from users2");
					while (rs.next()) {
						
						if(User.equals(rs.getString(1))&& Passw.equals(rs.getString(2))) { 
							b+=1;
							}
						
					}
					if (b>=1) {
						JOptionPane.showMessageDialog(null,"success!");
						int comparaison = User.compareTo("1");
						int cmp1=User.compareTo("2");
						int cmp2=User.compareTo("0");
						if (comparaison!=0 && cmp1!=0 ) {
							Tickets1 tck=new Tickets1();
							tck.initialize(Integer.parseInt(aUser));
							tck.ThirdFrame2.setVisible(true);
							enter.dispose();
					}
						
						else if (comparaison==0) {
							
							AjoutSold gui=new AjoutSold();
							gui.sold.setVisible(true);
							enter.dispose();
						}
						if(cmp1==0) {
							VerifyTicket vr=new VerifyTicket();
							vr.vertic.setVisible(true);
							enter.dispose();
							
						}
						}
					else {
						JOptionPane.showMessageDialog(null,"mot de passe ou username invalide");
					}
					
					
					
					con.close();
					
					
				}
				catch(Exception e1)
				{
					System.out.println(e1);
				}
				
			}
			public static String prin() {
				return aUser;
				
			}
		});
		submit.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 13));
		submit.setBackground(UIManager.getColor("FormattedTextField.selectionBackground"));
		
		Password = new JPasswordField();
		Password.setBounds(212, 245, 401, 21);
		panel_4.add(Password);
		
		JLabel lblNewLabel = new JLabel("Password :");
		lblNewLabel.setBounds(50, 237, 71, 34);
		panel_4.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		Username = new JTextField();
		Username.setBounds(212, 121, 401, 25);
		panel_4.add(Username);
		Username.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Matricule :\r\n");
		lblNewLabel_1.setBounds(50, 120, 180, 25);
		panel_4.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		enter.setBackground(new Color(128, 128, 128));
		enter.setBounds(0, 0, 1920, 1080);
		enter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
