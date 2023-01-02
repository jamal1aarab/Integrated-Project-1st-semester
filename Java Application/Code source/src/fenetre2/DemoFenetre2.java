package fenetre2;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import javax.swing.SwingConstants;
import javax.swing.border.Border;


import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;

import java.awt.*;


public class DemoFenetre2 extends JFrame {
	//private JButton bouton=new JButton("Submit");
	//private JPanel conteneur=new JPanel();
	//private JLabel label=new JLabel("right on me");
	private JTextField username,Name,FamilyName,Scolarity;
	private JTextField password;
	private JPasswordField passw1;
	private JLabel lblUsername,lblPassword,lblName,lblFName,lblScol;
	private JButton btnSign_In,btnClose,Submit;
	private Color couleur_fond_champ = Color.WHITE;
	private Color couleur_contour_champ = new Color(102, 153, 204);
	private Color couleur_fond_champProtege = new Color(212, 231, 242);
	private Color couleur_contour_champProtege = new Color(102, 153, 204);
	private Color couleur_fond_champFocus = new Color(255, 255, 218);
	private Color couleur_contour_champFocus = new Color(255, 153, 0);
	
	public DemoFenetre2(){
		JLabel l = new JLabel("Bienvenue!", JLabel.CENTER);
		JMenuBar menuBar = new JMenuBar();
	    setJMenuBar(menuBar);
		JMenu menu = new JMenu("Accueil  ");
		menu.setBackground(couleur_contour_champ);
	    menu.add(menu);
	    menuBar.add(menu);
	    JMenu menu1, smenu;
	    JMenuItem e1, e2;
	    JMenuBar menubar = new JMenuBar();
	    // Créer le menu
	    menu = new JMenu("Menu");
	    // Créer le sous menu
	    smenu = new JMenu("Actualités");
	    // Créer les éléments du menu et sous menu
	    e1 = new JMenuItem("se connecter ");
	    e2 = new JMenuItem("creer un compte");
	    // Ajouter les éléments au menu
	    menu.add(e1); 
	    menu.add(e2); 
	    // Ajouter le sous menu au menu principale
	    menu.add(smenu);
	    // Ajouter le menu au barre de menu
	    menubar.add(menu);
	    // Ajouter la barre de menu au frame
	    setJMenuBar(menubar);
	    Border JMenu = BorderFactory.createRaisedBevelBorder();
	    getContentPane().setBackground(Color.LIGHT_GRAY);
	    pack();
	    
	    //inserer une image
	    /*try 
	    {
	     JPanel panel = new JPanel();
	     panel.setBounds(50, 50, 250, 250);
	     BufferedImage img = ImageIO.read(new File("image.jpg"));
	     JLabel pic = new JLabel(new ImageIcon(img));
	     panel.add(pic);
	     add(panel);}
	    catch (IOException e) {}*/
	    try {
	    add(l, BorderLayout.CENTER);
	      //enlever la décoration
	      setUndecorated(true);
	      //définir la bordure
	      getRootPane().setBorder(
	         BorderFactory.createMatteBorder(10, 4, 4, 4, Color.BLACK)
	      );}
	    catch(Exception e) {}
		setTitle("Login");
		setSize(300,500);
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		/*username.addKeyListener(new KeyAdapter() {
	         public void keyTyped(KeyEvent e) {
	             char c = e.getKeyChar();
	             if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
	                  e.consume();  // ignorer l'événement
	             }
	         }});*/
		
		
		lblUsername=new JLabel("Username :");
		username=new JTextField();
		lblUsername.setBounds(20,120,260,20);
		add(lblUsername);
		username.setBounds(20,150,260,20);
		add(username);
		lblPassword=new JLabel("Password :");
		password=new JPasswordField();
		lblPassword.setBounds(20,180,260,20);
		add(lblPassword);
		password.setBounds(20,210,260,20);
		add(password);
		btnSign_In=new JButton("Sign In");
		btnSign_In.setBounds(20,280,100,20);
		add(btnSign_In);
		btnClose=new JButton("New User?");
		btnClose.setBounds(140,280,100,20);
		add(btnClose);
	    setVisible(true);
	    
	    btnClose.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new_user();
				
			}
	    	
	    });
	    
	    btnSign_In.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String Username=username.getText();
				String Password=password.getText();
				int b = 0;
				try
				{
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","TheFourMusketeers","AllForOneOneForAll");
					Statement stmt=con.createStatement();
					ResultSet rs=stmt.executeQuery("select*from users");
					while (rs.next()) {
						
						if(Username.equals(rs.getString(1))&& Password.equals(rs.getString(2))) b++;
						
					}
					if (b==1) {
						showMsg("Success!");
						implement();
					}
					else showMsg("mot de passe ou username invalide!");
					
					
					
					con.close();
					
					
				}
				catch(Exception e1)
				{
					System.out.println(e1);
				}
				var str = "Solvetic\u2117" ;
				
				
				
			}
	    	
	    	
	    });
		
	}
	public void showMsg(String msg) {
		JOptionPane.showMessageDialog(this,msg);
		
	}
	public void implement() {
		
		JFrame Login=new JFrame();
		
		Login.setVisible(true);
		Login.setSize(400,400);
		Login.setTitle("Next_Page");
		Login.setResizable(true);
		Login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Login.setLocationRelativeTo(null);
		
		
	
	}
	public void new_user() {
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

}
