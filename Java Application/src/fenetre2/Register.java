package fenetre2;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Button;
import java.awt.Choice;
import java.awt.Label;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Types;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Register {

	 JFrame secondFrame;
	private final JPanel panel = new JPanel();
	private JTextField Name;
	private JTextField FamilyName;
	private JTextField Scolarity;
	private JTextField mat;
	private JPasswordField mdp;
	private JTextField mot;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register window = new Register();
					window.secondFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Register() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		secondFrame = new JFrame();
		secondFrame.setIconImage(Toolkit.getDefaultToolkit().getImage(Register.class.getResource("/fenetre2/image.jpg")));
		secondFrame.getContentPane().setBackground(Color.LIGHT_GRAY);
		secondFrame.setBounds(0, 0, 1920, 1080);
		secondFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		secondFrame.getContentPane().setLayout(null);
		panel.setBounds(0, 0, 1540, 43);
		panel.setBackground(Color.DARK_GRAY);
		secondFrame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Register");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setBounds(154, 10, 102, 23);
		panel.add(lblNewLabel);
		ImageIcon icon=new ImageIcon(this.getClass().getResource("/logoEmi1.png"));
		
		Name = new JTextField("Adam");
		Name.setBounds(529, 219, 172, 19);
		secondFrame.getContentPane().add(Name);
		Name.setColumns(10);
		
		FamilyName = new JTextField("bennani");
		FamilyName.setColumns(10);
		FamilyName.setBounds(529, 283, 172, 19);
		secondFrame.getContentPane().add(FamilyName);
		
		Scolarity = new JTextField("3");
		Scolarity.setColumns(10);
		Scolarity.setBounds(529, 351, 172, 19);
		secondFrame.getContentPane().add(Scolarity);
		
		mat = new JTextField("0000");
		mat.setColumns(10);
		mat.setBounds(529, 404, 172, 19);
		secondFrame.getContentPane().add(mat);
		
		mdp = new JPasswordField("12121");
		mdp.setColumns(10);
		mdp.setBounds(529, 461, 172, 19);
		secondFrame.getContentPane().add(mdp);
		
		JLabel lblNewLabel_1 = new JLabel("Name  : ");
		lblNewLabel_1.setFont(new Font("Yu Gothic", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_1.setBounds(337, 221, 90, 19);
		secondFrame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("FamilyName  :");
		lblNewLabel_1_1.setFont(new Font("Yu Gothic", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_1_1.setBounds(314, 285, 131, 19);
		secondFrame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Scolarity  :");
		lblNewLabel_1_2.setFont(new Font("Yu Gothic", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_1_2.setBounds(324, 353, 105, 19);
		secondFrame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Matricule  :");
		lblNewLabel_1_3.setFont(new Font("Yu Gothic", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_1_3.setBounds(314, 406, 105, 19);
		secondFrame.getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Password  :");
		lblNewLabel_1_4.setFont(new Font("Yu Gothic", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_1_4.setBounds(314, 463, 105, 19);
		secondFrame.getContentPane().add(lblNewLabel_1_4);
		
		mot = new JTextField();
		mot.setBounds(529, 527, 172, 19);
		secondFrame.getContentPane().add(mot);
		mot.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Mot qui vous décrit[jamais l'oublier ] :");
		lblNewLabel_2.setFont(new Font("Yu Gothic", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel_2.setBounds(198, 518, 254, 42);
		secondFrame.getContentPane().add(lblNewLabel_2);
		
		Button submit = new Button("Submit ");
		submit.setForeground(Color.WHITE);
		submit.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 17));
		submit.setBackground(Color.DARK_GRAY);
		submit.setBounds(453, 589, 239, 43);
		secondFrame.getContentPane().add(submit);
		
		Choice choice = new Choice();
		choice.setBounds(546, 123, 82, 18);
		choice.addItem("Student");
		choice.addItem("Responsable");
		
		secondFrame.getContentPane().add(choice);
		
		Label label = new Label("Identiant  :");
		label.setFont(new Font("Arial Black", Font.ITALIC, 15));
		label.setBounds(397, 121, 103, 21);
		secondFrame.getContentPane().add(label);
		
		JLabel logo = new JLabel("");
		logo.setBounds(1251, 42, 289, 129);
		secondFrame.getContentPane().add(logo);
		logo.setIcon(icon);
		
		Button pick = new Button("pick");
		pick.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String data = choice.getItem(choice.getSelectedIndex());   
				 int comparaison = data.compareToIgnoreCase("responsable");
				 if(comparaison==0) {
					 Scolarity.setEnabled(false);
				 }
			}
		});
		pick.setBounds(663, 121, 110, 21);
		secondFrame.getContentPane().add(pick);
		
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!mat.getText().isEmpty() && !mdp.getText().isEmpty()) {
					String pwd=mdp.getText();
					String word=mot.getText();
					String mle=mat.getText();
					String sco=Scolarity.getText();
					String user=Name.getText();
					String fm=FamilyName.getText();
					String entry;
					try
					{
						String query="INSERT INTO users2 values(?,?,?,?)";
						String query1="INSERT INTO recoverAccount values(?,?,?,?,?,?)";
						
						
						Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","TheFourMusketeers","ayoub123");
					PreparedStatement statement = con.prepareStatement(query);
					PreparedStatement statement1 = con.prepareStatement(query1);
					Statement stmt=con.createStatement();
						ResultSet rs=stmt.executeQuery("select * from users2" ); 	   
					       while (rs.next()) {
					       entry=rs.getString(1);
					       if(entry==mle) {
					    	   JOptionPane.showMessageDialog(null, "ce matricule existe déjà");break;
					       }
					       }
					       

					
			        statement.setObject(1, mle);
			        statement.setObject(2,pwd);
			        statement.setObject(3, sco);
			        statement.setObject(4, 0);
			    
			        
			        statement1.setObject(1, mle);
			        statement1.setObject(2, pwd);
			        statement1.setObject(3, sco);
			        statement1.setObject(4, word);
			        statement1.setObject(5,user );
			        statement1.setObject(6,fm );
			        

			        statement.executeQuery();
			        statement1.executeQuery();
			        
			        
					con.close();
							
					}
					catch(Exception e1) {
						System.out.println(e1);
					}
					JOptionPane.showMessageDialog(null, "successful!");
					
				}
				else {
					JOptionPane.showMessageDialog(null,"un des champs n'est pas rempli");
				}
				
			}
		});
	}
	}

