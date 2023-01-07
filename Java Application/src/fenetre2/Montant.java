package fenetre2;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Montant extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Montant frame = new Montant();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	Connection connection=null;
	
	/**
	 * Create the frame.
	 */
	public Montant() {
		setResizable(false);
		
		connection=sqlplusconnection.dbconnector();
		
		setTitle("EMI");
		setBackground(new Color(154, 153, 150));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1038, 598);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMontant = new JLabel("Montant");
		lblMontant.setFont(new Font("DejaVu Serif", Font.BOLD, 22));
		lblMontant.setBounds(173, 207, 169, 17);
		contentPane.add(lblMontant);
		
		JLabel label = new JLabel("");
		Image image = new ImageIcon(this.getClass().getResource("/logoEmi1.jpg")).getImage();
		label.setIcon(new ImageIcon(image));
		label.setBounds(330, 0, 434, 112);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setBounds(360, 196, 489, 28);
		contentPane.add(textField);
		textField.setColumns(10);
		
		final JTextField matriculefield;
		
		matriculefield = GUI.getMatricule();
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String query="update users2 set solde=solde+? where mle= ?";
					PreparedStatement pst=connection.prepareStatement(query);
					pst.setString(1, textField.getText());
					pst.setString(2, matriculefield.getText());
					
					ResultSet rs=pst.executeQuery();
					dispose();
					GUI gui=new GUI();
					gui.setVisible(true);
					rs.close();
					pst.close();
				} catch (Exception ee)
				{
					JOptionPane.showMessageDialog(null, "Montant incorrect");
				}
				
			}
		});
		btnOk.setBounds(410, 362, 238, 40);
		contentPane.add(btnOk);
	}
}