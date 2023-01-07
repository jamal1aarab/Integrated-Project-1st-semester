package fenetre2;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;




import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;

import java.awt.*;
public class New_user {

	public class page extends JFrame {
		private JTextField username,Name,FamilyName,Scolarity;
		private JTextField password;
		private JPasswordField passw1;
		private JLabel lblUsername,lblPassword,lblName,lblFName,lblScol;
		private JButton btnSign_In,btnClose,Submit;
		public page(){
			
			setTitle("Login");
			setSize(300,500);
			setResizable(false);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setLayout(null);
		// TODO Auto-generated method stub
		JFrame Login=new JFrame();
		Login.setVisible(true);
		Login.setSize(400,400);
		Login.setTitle("Sign up ");
		Login.setResizable(true);
		Login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Login.setLocationRelativeTo(null);
		lblName=new JLabel("Nom :");
		Name=new JTextField();
		lblName.setBounds(15,100,260,20);
		add(lblName);
		Name.setBounds(15,100,260,20);
		add(Name);
		lblFName=new JLabel("Nom de Famille :");
		FamilyName=new JTextField();
		lblFName.setBounds(15,100,260,20);
		add(lblFName);
		FamilyName.setBounds(15,100,260,20);
		add(FamilyName);
		lblScol=new JLabel("Annee de scolarité :");
		Scolarity=new JTextField();
		lblScol.setBounds(15,100,260,20);
		add(lblScol);
		Scolarity.setBounds(15,100,260,20);
		add(Scolarity);
		lblUsername=new JLabel("Username :");
		username=new JTextField();
		lblUsername.setBounds(15,100,260,20);
		add(lblUsername);
		username.setBounds(15,100,260,20);
		add(username);
		lblPassword=new JLabel("Password :");
		password=new JPasswordField();
		lblPassword.setBounds(15,100,260,20);
		add(lblPassword);
		password.setBounds(15,100,260,20);
		add(password);
		Submit=new JButton("Submit");
		Submit.setBounds(15,100,100,20);
		add(Submit);
		
		

	}

}}
