package fenetre2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.Button;
import javax.swing.SwingConstants;

public class AjoutSold2 extends JFrame {

	private JPanel contentPane;
	private JTextField montantfield;
	private Button btnNewButton;
	private JLabel logo;
	private JPanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AjoutSold2 frame = new AjoutSold2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AjoutSold2() {
		setForeground(Color.BLACK);
		setBackground(Color.BLACK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Montant");
		lblNewLabel.setFont(new Font("Berlin Sans FB", Font.PLAIN, 22));
		lblNewLabel.setBounds(294, 365, 211, 29);
		contentPane.add(lblNewLabel);
		
		
		final JTextField textField;
		textField = AjoutSold.getmatricule();
		
		montantfield = new JTextField();
		montantfield.setColumns(10);
		montantfield.setBounds(494, 369, 691, 29);
		contentPane.add(montantfield);
		
		btnNewButton = new Button("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","TheFourMusketeers","ayoub123");
					
					
					String query="update users2 set solde=solde+? where mle=?";
					PreparedStatement pst=connection.prepareStatement(query);
					pst.setString(1, montantfield.getText());
					pst.setString(2, textField.getText());
					
					ResultSet rs=pst.executeQuery();
					
					JOptionPane.showMessageDialog(null, "Montant ajouté avec succès !");
					
					dispose();
					AjoutSold solde=new AjoutSold();
					solde.sold.setVisible(true);
					
				}catch(Exception ee)
				{
					JOptionPane.showMessageDialog(null, "Montant non correcte !");
				}
				
				
				
			}
		});
		btnNewButton.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 12));
		btnNewButton.setBounds(614, 552, 239, 69);
		contentPane.add(btnNewButton);
		
		logo = new JLabel("");
		logo.setHorizontalAlignment(SwingConstants.CENTER);
		logo.setBounds(611, 10, 352, 134);
		ImageIcon icon=new ImageIcon(this.getClass().getResource("/logoEmi1.png"));
		logo.setIcon(icon);
		contentPane.add(logo);
		
		panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 1540, 10);
		contentPane.add(panel);
	}
}
