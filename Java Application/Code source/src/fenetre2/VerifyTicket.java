package fenetre2;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Button;
import java.awt.Toolkit;

import java.sql.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VerifyTicket {

	JFrame vertic;
	private JTextField code;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VerifyTicket window = new VerifyTicket();
					window.vertic.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VerifyTicket() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		vertic = new JFrame();
		vertic.setIconImage(Toolkit.getDefaultToolkit().getImage(VerifyTicket.class.getResource("/fenetre2/image.jpg")));
		vertic.setResizable(false);
		vertic.getContentPane().setBackground(Color.LIGHT_GRAY);
		vertic.getContentPane().setLayout(null);
		
		code = new JTextField();
		code.setBounds(631, 424, 284, 29);
		vertic.getContentPane().add(code);
		code.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Numéro de ticket :");
		lblNewLabel.setBounds(378, 421, 193, 29);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		vertic.getContentPane().add(lblNewLabel);
		
		Button button = new Button("Next");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String codec=code.getText();
				int witness=0;
				try
				{
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","TheFourMusketeers","ayoub123");
					Statement stmt=con.createStatement();
					ResultSet rs=stmt.executeQuery("select * from ticket where date_ticket = trunc (sysdate)");
					while (rs.next()) {
						if(rs.getString(1).equals(codec)) { 
							witness=1;break;
							}
						
					}
					if(witness==1) {
						
						JOptionPane.showMessageDialog(null, "code ticket valid \n"+rs.getString(3)+"\n"+rs.getString(4)+" repas");
					}
					else {
						JOptionPane.showMessageDialog(null, "inexistant!");
					}
			}
				catch(Exception e1) {
					
				}
				}
		});
		button.setBounds(921, 424, 87, 29);
		button.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 12));
		vertic.getContentPane().add(button);
		
		JLabel logo = new JLabel("");
		logo.setBounds(597, 0, 291, 190);

		ImageIcon icon=new ImageIcon(this.getClass().getResource("/logoEmi1.png"));
		logo.setIcon(icon);
		vertic.getContentPane().add(logo);
		vertic.setBounds(0, 0, 1920, 1080);
		vertic.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
