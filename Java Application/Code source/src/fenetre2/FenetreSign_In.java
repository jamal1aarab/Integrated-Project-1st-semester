package fenetre2;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JEditorPane;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JRadioButtonMenuItem;
import java.awt.Choice;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FenetreSign_In  extends JFrame{
	private JTextField username,Name,FamilyName,Scolarity;
	private JTextField password;
	private JLabel lblUsername,lblPassword,lblName,lblFName,lblScol;
	private JButton btnSign_In,btnClose,Submit;
	FenetreSign_In(){
		setTitle("Login");
		setSize(300,500);
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
	}
	
	

}
