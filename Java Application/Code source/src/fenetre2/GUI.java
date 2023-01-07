package fenetre2;

import java.sql.*;
import java.util.Scanner;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Image;

import javax.swing.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class GUI extends JFrame {
	//private JFrame frame;

	private JPanel contentPane;
	private static JTextField matriculefield;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
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
	public GUI() {
		setResizable(false);
		
		connection=sqlplusconnection.dbconnector();
		
		setBackground(new Color(154, 153, 150));
		setTitle("EMI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1034, 598);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setForeground(new Color(153, 193, 241));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMatricule = new JLabel("Matricule");
		lblMatricule.setFont(new Font("DejaVu Serif", Font.BOLD, 22));
		lblMatricule.setBounds(173, 207, 169, 17);
		contentPane.add(lblMatricule);
		
		matriculefield = new JTextField();
		matriculefield.setBounds(360, 196, 489, 28);
		contentPane.add(matriculefield);
		matriculefield.setColumns(10);
		
		//boutton OK page matricule 
		
		JButton btnOk1 = new JButton("OK");
		btnOk1.setBounds(410, 362, 238, 40);
		btnOk1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				try {
					String query="select mle from users2 where mle=?";
					PreparedStatement pst=connection.prepareStatement(query);
					pst.setString(1, matriculefield.getText());
					
					ResultSet rs=pst.executeQuery();
					int count=0;
					while(rs.next()) {
						count++;
						
					}
					if ( count==1)
					{
						JOptionPane.showMessageDialog(null, "Matricule correcte !");
						dispose();
						Montant montant=new Montant();
						montant.setVisible(true);
					}
					else if (count >1)
					{
						JOptionPane.showMessageDialog(null, "Matricule dupliqué !");
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Matricule non correcte !!");
					}
					rs.close();
					pst.close();
				}catch(Exception ee)
				{
					JOptionPane.showMessageDialog(null, ee);
				}				
			}
		});
		contentPane.add(btnOk1);
		
		JLabel label = new JLabel("");
		label.setBounds(330, 0, 434, 112);
		Image image = new ImageIcon(this.getClass().getResource("/logoEmi1.jpg")).getImage();
		label.setIcon(new ImageIcon(image));
		contentPane.add(label);
	}

	static JTextField getMatricule() {
		return matriculefield;
		
	}
}
