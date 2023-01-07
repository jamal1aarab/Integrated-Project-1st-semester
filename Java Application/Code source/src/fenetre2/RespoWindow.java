package fenetre2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.border.MatteBorder;

public class RespoWindow {

	JFrame respow;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RespoWindow window = new RespoWindow();
					window.respow.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RespoWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		respow = new JFrame();
		// respow.setIconImage(Toolkit.getDefaultToolkit().getImage(RespoWindow.class.getResource("/fenetre2/image.jpg")));
		respow.setTitle("Application restaurant ");
		respow.setResizable(false);
		respow.getContentPane().setBackground(SystemColor.inactiveCaptionBorder);
		respow.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1920, 51);
		panel.setBackground(SystemColor.info);
		respow.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("                     Opérations  :");
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.ITALIC, 36));
		lblNewLabel.setBounds(119, 0, 518, 39);
		panel.add(lblNewLabel);
		
		Button button_1 = new Button("exit");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Acc c=new Acc();
				c.acceui.setVisible(true);
				respow.dispose();
			}
		});
		button_1.setBackground(Color.WHITE);
		button_1.setForeground(Color.RED);
		button_1.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 14));
		button_1.setBounds(1451, 0, 89, 39);
		panel.add(button_1);
		SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy ");
	    Date date = new Date();
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(537, 70, 381, 45);
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		respow.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel(s.format(date));
		lblNewLabel_1.setBounds(112, 10, 144, 24);
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.ITALIC, 23));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(308, 200, 559, 67);
		panel_2.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		respow.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Total petit déjeuner  :");
		lblNewLabel_2.setBounds(6, 15, 151, 19);
		panel_2.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBounds(308, 267, 559, 64);
		panel_2_1.setLayout(null);
		panel_2_1.setBorder(new MatteBorder(1, 2, 2, 2, (Color) new Color(0, 0, 0)));
		respow.getContentPane().add(panel_2_1);
		
		JLabel lblNewLabel_2_3 = new JLabel("Total déjeuner  :");
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2_3.setBounds(6, 15, 151, 19);
		panel_2_1.add(lblNewLabel_2_3);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setBounds(308, 328, 559, 68);
		panel_2_2.setLayout(null);
		panel_2_2.setBorder(new MatteBorder(3, 2, 2, 2, (Color) new Color(0, 0, 0)));
		respow.getContentPane().add(panel_2_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Total diner  :");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2_1.setBounds(6, 15, 151, 19);
		panel_2_2.add(lblNewLabel_2_1);
		
		Button button = new Button("Commit  ");
		button.setBounds(645, 471, 203, 68);
		button.setBackground(Color.ORANGE);
		button.setForeground(SystemColor.textHighlightText);
		button.setFont(new Font("Courier New", Font.BOLD | Font.ITALIC, 16));
		respow.getContentPane().add(button);

		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		panel_3.setBounds(859, 200, 221, 67);
		respow.getContentPane().add(panel_3);
		panel_3.setLayout(null);


	
		JLabel nbrPDejeuner = new JLabel();
		nbrPDejeuner.setFont(new Font("Tahoma", Font.PLAIN, 18));
		nbrPDejeuner.setHorizontalAlignment(SwingConstants.CENTER);
		nbrPDejeuner.setBounds(27, 10, 143, 47);
		panel_3.add(nbrPDejeuner);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		panel_4.setBounds(859, 252, 221, 79);
		respow.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JLabel nbrDejeuner = new JLabel();
		nbrDejeuner.setHorizontalAlignment(SwingConstants.CENTER);
		nbrDejeuner.setFont(new Font("Tahoma", Font.PLAIN, 18));
		nbrDejeuner.setBounds(42, 21, 126, 48);
		panel_4.add(nbrDejeuner);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		panel_5.setBounds(859, 313, 221, 83);
		respow.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		JLabel nbrDiner = new JLabel();
		nbrDiner.setHorizontalAlignment(SwingConstants.CENTER);
		nbrDiner.setFont(new Font("Tahoma", Font.PLAIN, 18));

		nbrDiner.setBounds(47, 28, 131, 45);
		panel_5.add(nbrDiner);
		respow.setBounds(0, 0, 1920, 1080);
		respow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);




		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String result[]=new String[6];
				result=total();
				nbrDejeuner.setText(result[0]);
				nbrDiner.setText(result[1]);
				nbrPDejeuner.setText(result[2]);
				

			}
		});

	}
public String[] total() {
	 String totalp[]= new String[10];
	 
	 try {

		 Class.forName("oracle.jdbc.driver.OracleDriver");
		 Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","TheFourMusketeers","ayoub123");
		 Statement stmt=con.createStatement();
		 stmt.executeQuery("ALTER SESSION SET NLS_DATE_FORMAT = 'dd/mm/yyyy'");
		 ResultSet rs=stmt.executeQuery("select repas,sum(quantite) from ticket where DATE_TICKET= trunc (sysdate) group by repas order by repas");
		 int i=0;
		 while (rs.next()) {
			 totalp[i]=rs.getString(2);
			 i++;

		 }
		 con.close();
	 }
	 catch(Exception e) {
		System.out.println(e);
		 
	 }

	 return totalp;
	
}
}







