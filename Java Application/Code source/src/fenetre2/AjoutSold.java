package fenetre2;

import java.awt.EventQueue;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Button;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.border.BevelBorder;
import javax.swing.SwingConstants;
import java.awt.Window.Type;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.JButton;

public class AjoutSold {

	JFrame sold;
	private static JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AjoutSold window = new AjoutSold();
					window.sold.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AjoutSold() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		sold = new JFrame();
		sold.setBackground(Color.LIGHT_GRAY);
		sold.setResizable(false);
		sold.setIconImage(Toolkit.getDefaultToolkit().getImage(AjoutSold.class.getResource("/fenetre2/image.jpg")));
		sold.setTitle("Application restaurant :");
		sold.getContentPane().setBackground(Color.LIGHT_GRAY);
		sold.getContentPane().setLayout(null);
		
		JLabel logo = new JLabel("");
		logo.setBounds(0, 0, 436, 0);
		sold.getContentPane().add(logo);
		
		JLabel logo_1 = new JLabel("");
		logo_1.setBounds(612, 10, 300, 110);
		sold.getContentPane().add(logo_1);
		
		JLabel logo_2 = new JLabel("");
		logo_2.setBounds(612, 10, 352, 134);
		logo_2.setHorizontalAlignment(SwingConstants.CENTER);
		ImageIcon icon=new ImageIcon(this.getClass().getResource("/logoEmi1.png"));
		logo_2.setIcon(icon);
		sold.getContentPane().add(logo_2);
		
		textField = new JTextField();
		textField.setBounds(486, 369, 691, 29);
		textField.setColumns(10);
		sold.getContentPane().add(textField);
		
		Button button = new Button("OK");
		button.setBounds(614, 552, 239, 69);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","TheFourMusketeers","ayoub123");
					
					
					String query="select mle from users2 where mle=?";
					PreparedStatement pst=connection.prepareStatement(query);
					pst.setString(1, textField.getText());
					
					ResultSet rs=pst.executeQuery();
					int count=0;
					
					while (rs.next()) {
						count++;
					}
					
					if (count==1)
					{
						sold.dispose();
						AjoutSold2 montant=new AjoutSold2();
						montant.setVisible(true);
					}
					
					else 
					{
						JOptionPane.showMessageDialog(null, "Matricule Non Correcte !!");
					}
					rs.close();
					pst.close();
				}catch(Exception ee)
				{
					JOptionPane.showMessageDialog(null, ee);
				}
				
				
				
			}
		});
		button.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 12));
		sold.getContentPane().add(button);
		
		JLabel lblNewLabel = new JLabel("Matricule");
		lblNewLabel.setBounds(294, 365, 211, 29);
		lblNewLabel.setFont(new Font("Berlin Sans FB", Font.PLAIN, 22));
		sold.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1540, 10);
		panel.setBackground(Color.DARK_GRAY);
		sold.getContentPane().add(panel);
		
		JButton btnNewButton = new JButton("se déconnecter ");
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginForm lg=new LoginForm();
				lg.enter.setVisible(true);
				sold.dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 21));
		btnNewButton.setBounds(1322, 10, 233, 69);
		sold.getContentPane().add(btnNewButton);
		sold.setBounds(0, 0, 1920, 1080);
		sold.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static JTextField getmatricule() {
		return textField;
	}
}


	

