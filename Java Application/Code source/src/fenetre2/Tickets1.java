package fenetre2;

import java.awt.EventQueue;

import javax.print.attribute.standard.PageRanges;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import java.awt.Button;
import java.awt.Label;
import java.awt.Choice;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;



public class Tickets1 {
    static String code_afficher="1212";
	JFrame ThirdFrame;
	JFrame ThirdFrame1;
	JFrame ThirdFrame2;
    static JLabel lblPrnomYyyy1;
    static JLabel lblNewLabel0;
    static String str_firstName;
    static String str_secondName;
    static int nbrT;
    static String TicketT;
    

  
    // Class.forName("oracle.jdbc.driver.OracleDriver"); 
    // static Connection con;
    // static Statement stmt;
    // static int mle;




	public Tickets1() {
		initialize(45);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	 public void initialize(int mle) {
		ThirdFrame = new JFrame();
        ThirdFrame1= new JFrame();
        ThirdFrame2= new JFrame();
        

		ThirdFrame.setResizable(true);
        ThirdFrame.setSize(1800,1080);
		// ThirdFrame.setIconImage(Toolkit.getDefaultToolkit().getImage(Tickets.class.getResource("/fenetre2/image.jpg")));
		ThirdFrame.getContentPane().setBackground(Color.LIGHT_GRAY);
		ThirdFrame.getContentPane().setLayout(null);
        // ThirdFrame.setVisible(true);
		
		
		JLabel emi = new JLabel("");
		emi.setBounds(260, 180, 900, 500);
		ImageIcon icon4=new ImageIcon(this.getClass().getResource("/WhatsApp Image 2022-12-27 at 13.37.28.jpeg"));
		emi.setIcon(icon4);
		ThirdFrame.add(emi);
		
		
		JPanel panel1 = new JPanel();
        panel1.setBounds(0, 0, 1800, 67);
		ThirdFrame.getContentPane().add(panel1);
		
		JLabel img = new JLabel("");
		img.setBounds(164, 0, 272, 67);
		// ImageIcon icon=new ImageIcon(this.getClass().getResource("/logoEmi1.png"));
		panel1.setLayout(null);
		// img.setIcon(icon);
		// panel.add(img);
        put_name( mle);
		
		JLabel lblNewLabel0 = new JLabel("<html>SecondName: &nbsp "+str_secondName+"</html>");
		lblNewLabel0.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel0.setBounds(3, 10, 300, 25);
        lblNewLabel0.setForeground(Color.darkGray);
		panel1.add(lblNewLabel0);

		
		JLabel lblPrnomYyyy1 = new JLabel("<html>FirstName: &nbsp "+str_firstName+"</html>");
		lblPrnomYyyy1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblPrnomYyyy1.setBounds(3, 32, 300, 25);
        lblPrnomYyyy1.setForeground(Color.DARK_GRAY);
		panel1.add(lblPrnomYyyy1);


        // lblPrnomYyyy1.setText("<html>FirstName:&nbsp "+str_firstName+"</html>");
        // lblNewLabel0.setText("<html>SecondName:&nbsp "+str_secondName+"</html>");
		
		JPanel panel_10 = new JPanel();
		panel_10.setBounds(0, 65, 1800, 37);
		panel_10.setBackground(Color.DARK_GRAY);
		ThirdFrame.getContentPane().add(panel_10);
		panel_10.setLayout(null);
		
		Button button01 = new Button("Accueil");
		button01.setForeground(Color.WHITE);
		button01.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 13));
		button01.setBackground(Color.ORANGE);
		button01.setBounds(0, 0, 150, 45);
		panel_10.add(button01);

        Button button11 = new Button("acheter");
        button11.setForeground(Color.WHITE);
		button11.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 13));
		button11.setBackground(Color.ORANGE);
		button11.setBounds(150, 0, 150, 45);

		panel_10.add(button11);

        Button button21 = new Button("mes tickets");
        button21.setForeground(Color.WHITE);
		button21.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 13));
		button21.setBackground(Color.ORANGE);
		button21.setBounds(300, 0, 150, 45);
		panel_10.add(button21);

        Button button_disconnect3 = new Button("déconnecter");
        button_disconnect3.setForeground(Color.WHITE);
		button_disconnect3.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 13));
		button_disconnect3.setBackground(Color.ORANGE);
		button_disconnect3.setBounds(1150, 0, 150, 45);
		panel_10.add(button_disconnect3);

		
        
                
		
		JLabel label1 = new JLabel("Mes repas");
		label1.setForeground(Color.WHITE);
		label1.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 12));
		label1.setBounds(98, 6, 87, 31);
		panel_10.add(label1);
		
        // String solde= Float.toString(recuperer_solde(mle));
		JLabel label_11 = new JLabel();
		label_11.setForeground(Color.WHITE);
		label_11.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 12));
		label_11.setBounds(960, 5, 500, 27);
        label_11.setForeground(Color.GREEN);
		panel_10.add(label_11);
		
		JPanel panel_21 = new JPanel();
		panel_21.setBackground(Color.DARK_GRAY);
		panel_21.setBounds(0, 700, 1800, 90);
		ThirdFrame.getContentPane().add(panel_21);
		panel_21.setLayout(null);
		
		JLabel lblNewLabel_21 = new JLabel("Info  :\r\n");
		lblNewLabel_21.setBounds(10, 0, 41, 17);
		lblNewLabel_21.setForeground(Color.WHITE);
		lblNewLabel_21.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_21.add(lblNewLabel_21);
		
		JLabel lblNewLabel_31 = new JLabel(".EMI");
		lblNewLabel_31.setBounds(20, 22, 45, 17);
		lblNewLabel_31.setForeground(Color.YELLOW);
		lblNewLabel_31.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
		panel_21.add(lblNewLabel_31);
		
		JLabel lblNewLabel_3_10 = new JLabel(".Université Med V");
		lblNewLabel_3_10.setBounds(10, 37, 138, 13);
		lblNewLabel_3_10.setForeground(Color.YELLOW);
		lblNewLabel_3_10.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
		panel_21.add(lblNewLabel_3_10);
		
		JLabel lblNewLabel_90 = new JLabel("© Equipe EMI");
		lblNewLabel_90.setBounds(10, 60, 97, 19);
		lblNewLabel_90.setForeground(Color.RED);
		lblNewLabel_90.setFont(new Font("Tw Cen MT", Font.BOLD, 10));
		panel_21.add(lblNewLabel_90);
		
		JLabel lblNewLabel_40 = new JLabel("Contactez nous  :");
		lblNewLabel_40.setBounds(1052, 4, 146, 13);
		lblNewLabel_40.setForeground(Color.WHITE);
		lblNewLabel_40.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		panel_21.add(lblNewLabel_40);
		
		JLabel lblNewLabel_50 = new JLabel("BP765,Avenue Ibn Sina Agdal Rabat Maroc\r\n");
		lblNewLabel_50.setBounds(997, 19, 229, 17);
		lblNewLabel_50.setForeground(Color.WHITE);
		lblNewLabel_50.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
		panel_21.add(lblNewLabel_50);
		
		JLabel lblNewLabel_60 = new JLabel("Phone : (+212) 537 68 71 50");
		lblNewLabel_60.setBounds(1007, 35, 167, 17);
		lblNewLabel_60.setForeground(Color.WHITE);
		lblNewLabel_60.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
		panel_21.add(lblNewLabel_60);
		
		JLabel lblNewLabel_80 = new JLabel("contact @emi.ac.ma");
		lblNewLabel_80.setBounds(1069, 50, 124, 13);
		lblNewLabel_80.setForeground(Color.YELLOW);
		lblNewLabel_80.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
		panel_21.add(lblNewLabel_80);
		
		JLabel lblNewLabel_70 = new JLabel("Email  :");
		lblNewLabel_70.setForeground(Color.WHITE);
		lblNewLabel_70.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
		lblNewLabel_70.setBounds(1020, 50, 45, 13);
		panel_21.add(lblNewLabel_70);
		

		ThirdFrame.setBounds(0, 0, 2000, 1080);
		ThirdFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //////////////////////////////////////////////////////////////
        ThirdFrame1.setResizable(true);
		ThirdFrame1.getContentPane().setBackground(Color.LIGHT_GRAY);
		ThirdFrame1.getContentPane().setLayout(null);
        // ThirdFrame1.setVisible(true);
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1800, 67);
		ThirdFrame1.getContentPane().add(panel);
		
		img.setBounds(164, 0, 272, 67);
		// ImageIcon icon=new ImageIcon(this.getClass().getResource("/logoEmi1.png"));
		panel.setLayout(null);
		// img.setIcon(icon);
		panel.add(img);

        
		JLabel lblNewLabel = new JLabel("<html>SecondName:&nbsp "+str_secondName+"</html>");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel.setBounds(3, 10, 300, 25);
        lblNewLabel.setForeground(Color.darkGray);
		panel.add(lblNewLabel);
		
		JLabel lblPrnomYyyy = new JLabel("<html>FirstName:&nbsp "+str_firstName+"</html>");
		lblPrnomYyyy.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblPrnomYyyy.setBounds(3, 32, 300, 25);
        lblPrnomYyyy.setForeground(Color.DARK_GRAY);
		panel.add(lblPrnomYyyy);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 65, 1800, 37);
		panel_1.setBackground(Color.DARK_GRAY);
		ThirdFrame1.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		Button button = new Button("Accueil");
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 13));
		button.setBackground(Color.ORANGE);
		button.setBounds(0, 0, 150, 45);
		panel_1.add(button);

        Button button1 = new Button("acheter");
        button1.setForeground(Color.WHITE);
		button1.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 13));
		button1.setBackground(Color.ORANGE);
		button1.setBounds(150, 0, 150, 45);
		panel_1.add(button1);

        Button button2 = new Button("mes tickets");
        button2.setForeground(Color.WHITE);
		button2.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 13));
		button2.setBackground(Color.ORANGE);
		button2.setBounds(300, 0, 150, 45);
		panel_1.add(button2);

        Button button_disconnect = new Button("déconnecter");
        button_disconnect.setForeground(Color.WHITE);
		button_disconnect.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 13));
		button_disconnect.setBackground(Color.ORANGE);
		button_disconnect.setBounds(1150, 0, 150, 45);
		panel_1.add(button_disconnect);


        Button button_acheter = new Button("Acheter");
        button_acheter.setForeground(Color.WHITE);
		button_acheter.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 13));
		button_acheter.setBackground(Color.green);
		button_acheter.setBounds(260, 350, 100, 45);
        ThirdFrame1.getContentPane().add(button_acheter);

  
        // JLabel label_111 = new JLabel("<html> &nbsp Solde: &nbsp "+solde+"&nbsp Dirham </html>");
		// // label_111.setForeground(Color.WHITE);
		// label_111.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 12));
		// label_111.setBounds(960, 60, 500, 27);
        // label_111.setForeground(Color.GREEN);
		// panel_1.add(label_111);



        JTextArea label_recu= new JTextArea("\n\n  votre recu s'affichera in shaa alah ici");
        label_recu.setForeground(Color.white);
		label_recu.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 12));
		label_recu.setBackground(Color.darkGray);
		label_recu.setBounds(500, 200, 600, 150);
        label_recu.setSize(600,150);
		ThirdFrame1.getContentPane().add(label_recu);

        

		int x = 0;
        
                
		JLabel label = new JLabel("Mes repas");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 12));
		label.setBounds(98, 6, 87, 31);
		panel_1.add(label);
		
		JLabel label_1 = new JLabel();
		label_1.setForeground(Color.green);
		label_1.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 12));
		label_1.setBounds(960, 5, 500, 27);
		panel_1.add(label_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.DARK_GRAY);
		panel_2.setBounds(0, 700, 1800, 90);
		ThirdFrame1.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Info  :\r\n");
		lblNewLabel_2.setBounds(10, 0+x, 41, 17);
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel(".EMI");
		lblNewLabel_3.setBounds(20, 22+x, 45, 17);
		lblNewLabel_3.setForeground(Color.YELLOW);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
		panel_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel(".Université Med V");
		lblNewLabel_3_1.setBounds(10, 37+x, 138, 13);
		lblNewLabel_3_1.setForeground(Color.YELLOW);
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
		panel_2.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_9 = new JLabel("© Equipe EMI");
		lblNewLabel_9.setBounds(10, 60+x, 97, 19);
		lblNewLabel_9.setForeground(Color.RED);
		lblNewLabel_9.setFont(new Font("Tw Cen MT", Font.BOLD, 10));
		panel_2.add(lblNewLabel_9);
		
		JLabel lblNewLabel_4 = new JLabel("Contactez nous  :");
		lblNewLabel_4.setBounds(1052, 4+x, 146, 13);
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		panel_2.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("BP765,Avenue Ibn Sina Agdal Rabat Maroc\r\n");
		lblNewLabel_5.setBounds(997, 19+x, 229, 17);
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
		panel_2.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Phone : (+212) 537 68 71 50");
		lblNewLabel_6.setBounds(1007, 35+x, 167, 17);
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
		panel_2.add(lblNewLabel_6);
		
		JLabel lblNewLabel_8 = new JLabel("contact @emi.ac.ma");
		lblNewLabel_8.setBounds(1069, 50+x, 124, 13);
		lblNewLabel_8.setForeground(Color.YELLOW);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
		panel_2.add(lblNewLabel_8);
		
		JLabel lblNewLabel_7 = new JLabel("Email  :");
		lblNewLabel_7 = new JLabel("Email  :");
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
		lblNewLabel_7.setBounds(1020, 50+x, 45, 13);
		panel_2.add(lblNewLabel_7);
		
		Choice choice = new Choice();
		choice.setBounds(360, 200, 120, 18);
		choice.addItem("petit dejeuner");
		choice.addItem("dejeuner");
		choice.addItem("diner");
		choice.setBackground(Color.gray);
		choice.setForeground(Color.white);
		ThirdFrame1.getContentPane().add(choice);
		
		Choice coise_nbr_ticket = new Choice();
		coise_nbr_ticket.setBounds(360, 250, 120, 23);
		coise_nbr_ticket.addItem("1");
		coise_nbr_ticket.addItem("2");
		coise_nbr_ticket.addItem("3");
		coise_nbr_ticket.setBackground(Color.gray);
		coise_nbr_ticket.setForeground(Color.white);
		ThirdFrame1.getContentPane().add(coise_nbr_ticket);
		

        Choice choice_Day = new Choice();
		choice_Day.setBounds(360, 300, 36, 23);
		choice_Day.addItem("01");choice_Day.addItem("02");choice_Day.addItem("03");
        choice_Day.addItem("04");choice_Day.addItem("05");choice_Day.addItem("06");
        choice_Day.addItem("08");choice_Day.addItem("09");choice_Day.addItem("10");
        choice_Day.addItem("11");
		choice_Day.addItem("12");choice_Day.addItem("13");choice_Day.addItem("14");
        choice_Day.addItem("15");choice_Day.addItem("16");choice_Day.addItem("17");
        choice_Day.addItem("18");choice_Day.addItem("19");choice_Day.addItem("20");
        choice_Day.addItem("21");
		choice_Day.addItem("22");choice_Day.addItem("23");
        choice_Day.addItem("24");choice_Day.addItem("25");
        choice_Day.addItem("26");choice_Day.addItem("27");choice_Day.addItem("28");
        choice_Day.addItem("29");choice_Day.addItem("30");choice_Day.addItem("31");
		choice_Day.setBackground(Color.gray);
		choice_Day.setForeground(Color.white);
		ThirdFrame1.getContentPane().add(choice_Day);

        Choice choice_month = new Choice();
		choice_month.setBounds(396, 300, 36, 23);
		choice_month.addItem("01");choice_month.addItem("02");choice_month.addItem("03");
        choice_month.addItem("04");
		choice_month.addItem("05");choice_month.addItem("06");choice_month.addItem("07");
        choice_month.addItem("08");
		choice_month.addItem("09");choice_month.addItem("10");choice_month.addItem("11");
        choice_month.addItem("12");
		choice_month.setBackground(Color.gray);
		choice_month.setForeground(Color.white);
		ThirdFrame1.getContentPane().add(choice_month);

        Choice choice_year = new Choice();
		choice_year.setBounds(432, 300, 48, 23);
		choice_year.addItem("2022");choice_year.addItem("2023");choice_year.addItem("2024");
		choice_year.addItem("2025");choice_year.addItem("2026");choice_year.addItem("2027");
		choice_year.addItem("2028");choice_year.addItem("2029");choice_year.addItem("2030");
		choice_year.setBackground(Color.gray);
		choice_year.setForeground(Color.white);
		ThirdFrame1.getContentPane().add(choice_year);

		
		JLabel type_Repas_Label = new JLabel("type de repas :");
		type_Repas_Label.setBackground(Color.BLACK);
		type_Repas_Label.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		type_Repas_Label.setBounds(100, 200, 200, 23);
		ThirdFrame1.getContentPane().add(type_Repas_Label);
		
		JLabel nbr_Repas_Label = new JLabel("Nombre de repas  :");
		nbr_Repas_Label.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		nbr_Repas_Label.setBounds(100, 250, 200, 23);
		ThirdFrame1.getContentPane().add(nbr_Repas_Label);


        JLabel datelabel = new JLabel("Date  :");
		datelabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		datelabel.setBounds(100, 300, 200, 23);
		ThirdFrame1.getContentPane().add(datelabel);

		ThirdFrame1.setBounds(0,0 , 1800, 1080);
		ThirdFrame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel recu_label =new JLabel();
        recu_label.setBounds(500,200,400,300);
        recu_label.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
        ThirdFrame1.add(recu_label);



        //////////////////////////////////////////////////////////////
        ThirdFrame2.setResizable(true);
        ThirdFrame2.setSize(1800,1080);
		// ThirdFrame2.setIconImage(Toolkit.getDefaultToolkit().getImage(Tickets.class.getResource("/fenetre2/image.jpg")));
		ThirdFrame2.getContentPane().setBackground(Color.LIGHT_GRAY);
		ThirdFrame2.getContentPane().setLayout(null);
        // ThirdFrame2.setVisible(true);
       
		
		
		JPanel panel_voir_ticket = new JPanel();
        panel_voir_ticket.setBounds(0, 0, 1800, 67);
		ThirdFrame2.getContentPane().add(panel_voir_ticket);
		
		// JLabel img = new JLabel("");
		img.setBounds(164, 0, 272, 67);
		// ImageIcon icon=new ImageIcon(this.getClass().getResource("/logoEmi1.png"));
		panel_voir_ticket.setLayout(null);
		// img.setIcon(icon);
		// panel.add(img);


		
		JLabel voir_ticket_Label = new JLabel("<html>SecondName:&nbsp "+str_secondName+"</html>");
		voir_ticket_Label.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		voir_ticket_Label.setBounds(3, 10, 300, 25);
        voir_ticket_Label.setForeground(Color.darkGray);
		panel_voir_ticket.add(voir_ticket_Label);
		
		JLabel voir_ticket_label_prenom = new JLabel("<html>FirstName:&nbsp "+str_firstName+"</html>");
		voir_ticket_label_prenom.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		voir_ticket_label_prenom.setBounds(3, 32, 300, 25);
        voir_ticket_label_prenom.setForeground(Color.darkGray);
		panel_voir_ticket.add(voir_ticket_label_prenom);
		
		JPanel panel_voir_ticket2 = new JPanel();
		panel_voir_ticket2.setBounds(0, 65, 1800, 37);
		panel_voir_ticket2.setBackground(Color.DARK_GRAY);
		ThirdFrame2.getContentPane().add(panel_voir_ticket2);
		panel_voir_ticket2.setLayout(null);
		
		Button voir_tickeButton = new Button("Accueil");
		voir_tickeButton.setForeground(Color.WHITE);
		voir_tickeButton.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 13));
		voir_tickeButton.setBackground(Color.ORANGE);
		voir_tickeButton.setBounds(0, 0, 150, 45);
		panel_voir_ticket2.add(voir_tickeButton);

        Button voir_ticket_button1 = new Button("acheter");
        voir_ticket_button1.setForeground(Color.WHITE);
		voir_ticket_button1.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 13));
		voir_ticket_button1.setBackground(Color.ORANGE);
		voir_ticket_button1.setBounds(150, 0, 150, 45);
		panel_voir_ticket2.add(voir_ticket_button1);

        Button voir_ticket_button2 = new Button("mes tickets");
        voir_ticket_button2.setForeground(Color.WHITE);
		voir_ticket_button2.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 13));
		voir_ticket_button2.setBackground(Color.ORANGE);
		voir_ticket_button2.setBounds(300, 0, 150, 45);
		panel_voir_ticket2.add(voir_ticket_button2);

        Button button_disconnect1 = new Button("déconnecter");
        button_disconnect1.setForeground(Color.WHITE);
		button_disconnect1.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 13));
		button_disconnect1.setBackground(Color.ORANGE);
		button_disconnect1.setBounds(1150, 0, 150, 45);
		panel_voir_ticket2.add(button_disconnect1);

        
                
		
		JLabel voir_ticket_label = new JLabel("Mes repas");
		voir_ticket_label.setForeground(Color.WHITE);
		voir_ticket_label.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 12));
		voir_ticket_label.setBounds(98, 6, 87, 31);
		panel_voir_ticket2.add(voir_ticket_label);

		JLabel voir_ticket_label1 = new JLabel();
		voir_ticket_label1.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 12));
		voir_ticket_label1.setForeground(Color.GREEN);
		voir_ticket_label1.setBounds(960, 5, 500, 27);
		panel_voir_ticket2.add(voir_ticket_label1);
		
		JPanel voir_ticket_panel2 = new JPanel();
		voir_ticket_panel2.setBackground(Color.DARK_GRAY);
		voir_ticket_panel2.setBounds(0, 700, 1800, 90);
		ThirdFrame2.getContentPane().add(voir_ticket_panel2);
		voir_ticket_panel2.setLayout(null);
		
		JLabel voir_ticket_label_footer1 = new JLabel("Info  :\r\n");
		voir_ticket_label_footer1.setBounds(10, 0+x, 41, 17);
		voir_ticket_label_footer1.setForeground(Color.WHITE);
		voir_ticket_label_footer1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		voir_ticket_panel2 .add(voir_ticket_label_footer1);
		
		JLabel voir_ticket_label_footer2 = new JLabel(".EMI");
		voir_ticket_label_footer2.setBounds(20, 22+x, 45, 17);
		voir_ticket_label_footer2.setForeground(Color.YELLOW);
		voir_ticket_label_footer2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
		voir_ticket_panel2 .add(voir_ticket_label_footer2);
		
		JLabel voir_ticket_label_footer3 = new JLabel(".Université Med V");
		voir_ticket_label_footer3.setBounds(10, 37+x, 138, 13);
		voir_ticket_label_footer3.setForeground(Color.YELLOW);
		voir_ticket_label_footer3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
		voir_ticket_panel2 .add(voir_ticket_label_footer3);
		
		JLabel voir_ticket_label_footer4 = new JLabel("© Equipe EMI");
		voir_ticket_label_footer4.setBounds(10, 60+x, 97, 19);
		voir_ticket_label_footer4.setForeground(Color.RED);
		voir_ticket_label_footer4.setFont(new Font("Tw Cen MT", Font.BOLD, 10));
		voir_ticket_panel2 .add(voir_ticket_label_footer4);
		
		JLabel voir_ticket_label_footer5 = new JLabel("Contactez nous  :");
		voir_ticket_label_footer5.setBounds(1052, 4+x, 146, 13);
		voir_ticket_label_footer5.setForeground(Color.WHITE);
		voir_ticket_label_footer5.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		voir_ticket_panel2 .add(voir_ticket_label_footer5); 
        
		
		JLabel voir_ticket_label_footer6 = new JLabel("BP765,Avenue Ibn Sina Agdal Rabat Maroc\r\n");
		voir_ticket_label_footer6.setBounds(997, 19+x, 229, 17);
		voir_ticket_label_footer6.setForeground(Color.WHITE);
		voir_ticket_label_footer6.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
		voir_ticket_panel2 .add(voir_ticket_label_footer6);
		
		JLabel voir_ticket_label_footer7 = new JLabel("Phone : (+212) 537 68 71 50");
		voir_ticket_label_footer7.setBounds(1007, 35+x, 167, 17);
		voir_ticket_label_footer7.setForeground(Color.WHITE);
		voir_ticket_label_footer7.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
		voir_ticket_panel2 .add(voir_ticket_label_footer7);
		
		JLabel vior_ticket_label_footer8 = new JLabel("contact @emi.ac.ma");
		vior_ticket_label_footer8.setBounds(1069, 50+x, 124, 13);
		vior_ticket_label_footer8.setForeground(Color.YELLOW);
		vior_ticket_label_footer8.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
		voir_ticket_panel2 .add(vior_ticket_label_footer8);
		
		JLabel voir_ticket_label_footer9 = new JLabel("Email  :");
		voir_ticket_label_footer9.setForeground(Color.WHITE);
		voir_ticket_label_footer9.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
		voir_ticket_label_footer9.setBounds(1020, 50+x, 45, 13);
		voir_ticket_panel2 .add(voir_ticket_label_footer9);



   
        JTextArea see= new JTextArea("\n\n\n\n\n\n\n\n  Vos tickets s'afficherent ici");
		see.setBackground(Color.darkGray);
		see.setForeground(Color.green);
		see.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		see.setLineWrap(true);
		see.setEditable(false);
		see.setBounds(450, 200, 250, 350);
		see.setSize(250,350);
		see.setVisible(false);
		ThirdFrame2.add(see);



		JLabel  page1_label= new JLabel("Page1");
		page1_label.setBackground(Color.BLACK);
		page1_label.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		page1_label.setBounds(454, 170, 200, 23);
		page1_label.setVisible(false);
		ThirdFrame2.getContentPane().add(page1_label);

		JTextArea see1= new JTextArea("\n\n\n\n\n\n\n\n  Vos tickets s'afficherent ici");
		see1.setBackground(Color.darkGray);
		see1.setForeground(Color.green);
		see1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		see1.setLineWrap(true);
		see1.setEditable(false);
        see1.setBounds(703, 200, 250, 350);
        see1.setSize(250,350);
		see1.setVisible(false);
        ThirdFrame2.add(see1);

		JLabel  page2_label= new JLabel("Page2");
		page2_label.setBackground(Color.BLACK);
		page2_label.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		page2_label.setBounds(707, 170, 200, 23);
		page2_label.setVisible(false);
		ThirdFrame2.getContentPane().add(page2_label);

		JTextArea see2= new JTextArea("\n\n\n\n\n\n\n\n  Vos tickets s'afficherent ici");
		see2.setBackground(Color.darkGray);
		see2.setForeground(Color.green);
		see2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		see2.setLineWrap(true);
		see2.setEditable(false);
        see2.setBounds(956, 200, 250, 350);
        see2.setSize(250,350);
		see2.setVisible(false);
        ThirdFrame2.add(see2);

		JLabel  page3_label= new JLabel("Page3");
		page3_label.setBackground(Color.BLACK);
		page3_label.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		page3_label.setBounds(960, 170, 200, 23);
		page3_label.setVisible(false);
		ThirdFrame2.getContentPane().add(page3_label);



		
        Choice choice_Day_affiche_ticket = new Choice();
		choice_Day_affiche_ticket.setBounds(220, 300, 36, 23);
		choice_Day_affiche_ticket.addItem("01");choice_Day_affiche_ticket.addItem("02");choice_Day_affiche_ticket.addItem("03");
        choice_Day_affiche_ticket.addItem("04");choice_Day_affiche_ticket.addItem("05");choice_Day_affiche_ticket.addItem("06");
        choice_Day_affiche_ticket.addItem("08");choice_Day_affiche_ticket.addItem("09");choice_Day_affiche_ticket.addItem("10");
        choice_Day_affiche_ticket.addItem("11");
		choice_Day_affiche_ticket.addItem("12");choice_Day_affiche_ticket.addItem("13");choice_Day_affiche_ticket.addItem("14");
        choice_Day_affiche_ticket.addItem("15");choice_Day_affiche_ticket.addItem("16");choice_Day_affiche_ticket.addItem("17");
        choice_Day_affiche_ticket.addItem("18");choice_Day_affiche_ticket.addItem("19");choice_Day_affiche_ticket.addItem("20");
        choice_Day_affiche_ticket.addItem("21");
		choice_Day_affiche_ticket.addItem("22");choice_Day_affiche_ticket.addItem("23");
        choice_Day_affiche_ticket.addItem("24");choice_Day_affiche_ticket.addItem("25");
        choice_Day_affiche_ticket.addItem("26");choice_Day_affiche_ticket.addItem("27");choice_Day_affiche_ticket.addItem("28");
        choice_Day_affiche_ticket.addItem("29");choice_Day_affiche_ticket.addItem("30");choice_Day_affiche_ticket.addItem("31");
		choice_Day_affiche_ticket.setBackground(Color.gray);
		choice_Day_affiche_ticket.setForeground(Color.white);
		ThirdFrame2.getContentPane().add(choice_Day_affiche_ticket);

        Choice choice_month_affiche_ticket = new Choice();
		choice_month_affiche_ticket.setBounds(256, 300, 36, 23);
		choice_month_affiche_ticket.addItem("01");choice_month_affiche_ticket.addItem("02");choice_month_affiche_ticket.addItem("03");
        choice_month_affiche_ticket.addItem("04");
		choice_month_affiche_ticket.addItem("05");choice_month_affiche_ticket.addItem("06");choice_month_affiche_ticket.addItem("07");
        choice_month_affiche_ticket.addItem("08");
		choice_month_affiche_ticket.addItem("09");choice_month_affiche_ticket.addItem("10");choice_month_affiche_ticket.addItem("11");
        choice_month_affiche_ticket.addItem("12");
		choice_month_affiche_ticket.setBackground(Color.gray);
		choice_month_affiche_ticket.setForeground(Color.white);
		ThirdFrame2.getContentPane().add(choice_month_affiche_ticket);

        Choice choice_year_affiche_ticket = new Choice();
		choice_year_affiche_ticket.setBounds(292, 300, 48, 23);
		choice_year_affiche_ticket.addItem("2022");choice_year_affiche_ticket.addItem("2023");choice_year_affiche_ticket.addItem("2024");
		choice_year_affiche_ticket.addItem("2025");choice_year_affiche_ticket.addItem("2026");choice_year_affiche_ticket.addItem("2027");
		choice_year_affiche_ticket.addItem("2028");choice_year_affiche_ticket.addItem("2029");choice_year_affiche_ticket.addItem("2030");
		choice_year_affiche_ticket.setBackground(Color.gray);
		choice_year_affiche_ticket.setForeground(Color.white);
		ThirdFrame2.getContentPane().add(choice_year_affiche_ticket);

		
		JLabel  find_ticket= new JLabel("Chercher des tickets :");
		find_ticket.setBackground(Color.BLACK);
		find_ticket.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		find_ticket.setBounds(30, 300, 200, 23);
		ThirdFrame2.getContentPane().add(find_ticket);

		Button chercher_ticket = new Button("Chercher");
		chercher_ticket.setForeground(Color.GREEN);
		chercher_ticket.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 13));
		chercher_ticket.setBackground(Color.white);
		chercher_ticket.setBounds(30, 340, 150, 45);
		ThirdFrame2.add(chercher_ticket);

		Button afficher_ticket = new Button("Tous les tickets");
		afficher_ticket.setForeground(Color.green);
		afficher_ticket.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 13));
		afficher_ticket.setBackground(Color.white);
		afficher_ticket.setBounds(30, 200, 150, 45);
		ThirdFrame2.add(afficher_ticket);




		//////////////////////////////////////////
		//annuler les tickets
		Choice choice_Day_annnuler_ticket = new Choice();
		choice_Day_annnuler_ticket.setBounds(200, 450, 36, 23);
		choice_Day_annnuler_ticket.addItem("01");choice_Day_annnuler_ticket.addItem("02");choice_Day_annnuler_ticket.addItem("03");
        choice_Day_annnuler_ticket.addItem("04");choice_Day_annnuler_ticket.addItem("05");choice_Day_annnuler_ticket.addItem("06");
        choice_Day_annnuler_ticket.addItem("08");choice_Day_annnuler_ticket.addItem("09");choice_Day_annnuler_ticket.addItem("10");
        choice_Day_annnuler_ticket.addItem("11");
		choice_Day_annnuler_ticket.addItem("12");choice_Day_annnuler_ticket.addItem("13");choice_Day_annnuler_ticket.addItem("14");
        choice_Day_annnuler_ticket.addItem("15");choice_Day_annnuler_ticket.addItem("16");choice_Day_annnuler_ticket.addItem("17");
        choice_Day_annnuler_ticket.addItem("18");choice_Day_annnuler_ticket.addItem("19");choice_Day_annnuler_ticket.addItem("20");
        choice_Day_annnuler_ticket.addItem("21");
		choice_Day_annnuler_ticket.addItem("22");choice_Day_annnuler_ticket.addItem("23");
        choice_Day_annnuler_ticket.addItem("24");choice_Day_annnuler_ticket.addItem("25");
        choice_Day_annnuler_ticket.addItem("26");choice_Day_annnuler_ticket.addItem("27");choice_Day_annnuler_ticket.addItem("28");
        choice_Day_annnuler_ticket.addItem("29");choice_Day_annnuler_ticket.addItem("30");choice_Day_annnuler_ticket.addItem("31");
		choice_Day_annnuler_ticket.setBackground(Color.gray);
		choice_Day_annnuler_ticket.setForeground(Color.white);
		ThirdFrame2.getContentPane().add(choice_Day_annnuler_ticket);

        Choice choice_month_ann_ticket = new Choice();
		choice_month_ann_ticket.setBounds(236, 450, 36, 23);
		choice_month_ann_ticket.addItem("01");choice_month_ann_ticket.addItem("02");choice_month_ann_ticket.addItem("03");
        choice_month_ann_ticket.addItem("04");
		choice_month_ann_ticket.addItem("05");choice_month_ann_ticket.addItem("06");choice_month_ann_ticket.addItem("07");
        choice_month_ann_ticket.addItem("08");
		choice_month_ann_ticket.addItem("09");choice_month_ann_ticket.addItem("10");choice_month_ann_ticket.addItem("11");
        choice_month_ann_ticket.addItem("12");
		choice_month_ann_ticket.setBackground(Color.gray);
		choice_month_ann_ticket.setForeground(Color.white);
		ThirdFrame2.getContentPane().add(choice_month_ann_ticket);

        Choice choice_year_annuler_ticket = new Choice();
		choice_year_annuler_ticket.setBounds(272, 450, 48, 23);
		choice_year_annuler_ticket.addItem("2022");choice_year_annuler_ticket.addItem("2023");choice_year_annuler_ticket.addItem("2024");
		choice_year_annuler_ticket.addItem("2025");choice_year_annuler_ticket.addItem("2026");choice_year_annuler_ticket.addItem("2027");
		choice_year_annuler_ticket.addItem("2028");choice_year_annuler_ticket.addItem("2029");choice_year_annuler_ticket.addItem("2030");
		choice_year_annuler_ticket.setBackground(Color.gray);
		choice_year_annuler_ticket.setForeground(Color.white);
		ThirdFrame2.getContentPane().add(choice_year_annuler_ticket);

		Choice delelte_repas = new Choice();
		delelte_repas.setBounds(320, 450, 100, 18);
		delelte_repas.addItem("petit dejeuner");
		delelte_repas.addItem("dejeuner");
		delelte_repas.addItem("diner");
		delelte_repas.setBackground(Color.gray);
		delelte_repas.setForeground(Color.white);
		ThirdFrame2.getContentPane().add(delelte_repas);

		
		JLabel  annuler_ticket= new JLabel("Annuler un ticket :");
		annuler_ticket.setBackground(Color.BLACK);
		annuler_ticket.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		annuler_ticket.setBounds(30, 450, 200, 23);
		ThirdFrame2.getContentPane().add(annuler_ticket);

		Button anuler_ticket_Button = new Button("Annuler");
		anuler_ticket_Button.setForeground(Color.GREEN);
		anuler_ticket_Button.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 13));
		anuler_ticket_Button.setBackground(Color.white);
		anuler_ticket_Button.setBounds(30, 490, 150, 45);
		ThirdFrame2.add(anuler_ticket_Button);

/////////////////////////////////
Float solde1=recuperer_solde(mle);
label_1.setText("<html> &nbsp solde: &nbsp "+ Float.toString(solde1)+" &nbsp Dirham</html>");
voir_ticket_label1.setText("<html> &nbsp solde: &nbsp "+ Float.toString(solde1)+" &nbsp Dirham</html>");
label_11.setText("<html> &nbsp solde: &nbsp "+ Float.toString(solde1)+" &nbsp Dirham</html>");
if (solde1>10) {
	label_1.setForeground((Color.GREEN));
	label_11.setForeground((Color.GREEN));
	voir_ticket_label1.setForeground((Color.GREEN));

}
else{
	label_1.setForeground((Color.RED));
	label_11.setForeground((Color.RED));
	voir_ticket_label1.setForeground((Color.RED));
}
///////////////////////////




	
		ThirdFrame2.setBounds(0, 0, 2000, 1080);
		ThirdFrame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //////////////////////////////////////////////////////////////

    button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                ThirdFrame1.setVisible(false);
                ThirdFrame.setVisible(true);
                
                ;}});

            
            button11.addActionListener(new ActionListener(){
                public void actionPerformed( ActionEvent e){
                    ThirdFrame.setVisible(false);
                    ThirdFrame1.setVisible(true);
					
                }
            });

    voir_tickeButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            ThirdFrame2.setVisible(false);
            ThirdFrame.setVisible(true);
            
            }});

    voir_ticket_button1.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            ThirdFrame2.setVisible(false);
            ThirdFrame1.setVisible(true);
            
            }});

    button2.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            ThirdFrame1.setVisible(false);
            ThirdFrame2.setVisible(true);
            
        }});
    button_disconnect3.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            ThirdFrame2.setVisible(false);
            Acc acc= new Acc();
            acc.acceui.setVisible(true);
            
            
        }});
    button_disconnect.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            ThirdFrame2.setVisible(false);
            Acc acc= new Acc();
            acc.acceui.setVisible(true);
            
            
        }});
    button_disconnect1.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            ThirdFrame2.setVisible(false);
            Acc acc= new Acc();
            acc.acceui.setVisible(true);
            
            
        }});
            
            
    button21.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            ThirdFrame.setVisible(false);
            ThirdFrame2.setVisible(true);
          
            }});
	
    anuler_ticket_Button.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
			page1_label.setVisible(false);
			page2_label.setVisible(false);
			page3_label.setVisible(false);
			see1.setVisible(false);
			see2.setVisible(false);
			

			Float prix=0f;
			
			String delete_repas="'"+delelte_repas.getItem(delelte_repas.getSelectedIndex())+"'";
			System.out.println("le repas est "+delete_repas);
			String mess="";


			String date_annuler=choice_Day_annnuler_ticket.getItem(choice_Day_annnuler_ticket.getSelectedIndex())+
			"/"+choice_month_ann_ticket.getItem(choice_month_ann_ticket.getSelectedIndex())+"/"+ 
			choice_year_annuler_ticket.getItem(choice_year_annuler_ticket.getSelectedIndex());
			String date_ticket_d="'"+date_annuler+"'";
			String array;
			int flag=verify_date(date_annuler);
			if (flag<0) {
				
				if (delelte_repas.getItem(delelte_repas.getSelectedIndex())=="petit dejeuner") {
					prix=1f;
				}
				else{
					prix=1.5f;
				}
				array=anuller_ticket(mle,date_ticket_d, delete_repas,prix);
				if (array==null) {
					see.setForeground(Color.red);
					see.setVisible(true);
					mess="\n\n\n\n\n  Cette ticket n'existe pas dans la liste\n   de votre ticket";
					// see.setText("\n\n\n\n\n  Cette ticket n'existe pas dans la liste\n   de votre ticket");
					
					
				}
				else{
					Float solde1=recuperer_solde(mle);
					label_1.setText("<html> &nbsp solde: &nbsp "+ Float.toString(solde1)+" &nbsp Dirham</html>");
					voir_ticket_label1.setText("<html> &nbsp solde: &nbsp "+ Float.toString(solde1)+" &nbsp Dirham</html>");
					label_11.setText("<html> &nbsp solde: &nbsp "+ Float.toString(solde1)+" &nbsp Dirham</html>");
					if (solde1>10) {
						label_1.setForeground((Color.GREEN));
						label_11.setForeground((Color.GREEN));
						voir_ticket_label1.setForeground((Color.GREEN));

					}
					else{
						label_1.setForeground((Color.RED));
						label_11.setForeground((Color.RED));
						voir_ticket_label1.setForeground((Color.RED));
					}
					see.setVisible(true);
					see.setForeground(Color.orange);
					mess="\n\n   Vos tickets ont été supprimer avec\n   succès\n\n";
					
						mess+=array;
					
					// see.setText("\n\n\n\n\n   Votre ticket a été supprimer avec\n   succès");
					
				}
				see.setText(mess);
				
			}
			else {
				see.setVisible(true);
				see.setForeground(Color.RED);
				see.setText("\n\n Vous n'avez pas le droit d'annuller\n\n  les tickets d'aujourd'hui");
				
			}

          
            }});

	// 
    afficher_ticket.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {

            String[] dat= new String[100];
            dat=data(mle);
			// <html> &nbsp &nbsp
            String message1="\n  ";
			String message2="\n  ";
			String message3="\n  ";
            for (int i = 0; i < dat.length; i++) {
				if (i<10 && dat[i]!=null) {
					page1_label.setVisible(true);
					see.setVisible(true);
					message1=message1+dat[i]+"\n\n  ";
				};
				if (i<20 && i>9 && dat[i]!=null) {
					page2_label.setVisible(true);
					see1.setVisible(true);
					message2=message2+dat[i]+"\n\n  ";
				};
				if (i>=20 && dat[i]!=null) {
					page3_label.setVisible(true);
					see2.setVisible(true);
					message3=message3+dat[i]+"\n\n  ";
				}

                // System.out.println(dat[i]);
                
            }
            // message1=message1;
			see.setForeground(Color.green);
            see.setText(message1);
            see1.setText(message2);
            see2.setText(message3);

            }});
    chercher_ticket.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            

    String date_cher=choice_Day_affiche_ticket.getItem(choice_Day_affiche_ticket.getSelectedIndex())+
    "/"+choice_month_affiche_ticket.getItem(choice_month_affiche_ticket.getSelectedIndex())+"/"+ choice_year_affiche_ticket.getItem(choice_year_affiche_ticket.getSelectedIndex());
    String date_ticket="'"+ date_cher+"'";
    
    String[] code_ticket= new String[10];
    int Flag=0;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    LocalDate date = LocalDate.now();
    LocalDate date_ticket1 = LocalDate.parse(date_cher, formatter);
    Flag=date.compareTo(date_ticket1);
    if (Flag>=0) {
        code_ticket=find_data(mle,date_ticket);
        // <html> &nbsp &nbsp
        String message1_ticket="\n  ";
        String message1_ticket1="\n  ";
        String message1_ticket2="\n  ";
        for (int i = 0; i < code_ticket.length; i++) {
            page1_label.setVisible(false);
            see1.setVisible(false);
            page2_label.setVisible(false);
            see2.setVisible(false);
            see2.setVisible(false);
            page3_label.setVisible(false);
            if (code_ticket[0]==null) {
                see.setForeground(Color.red);
                see.setVisible(true);
                message1_ticket="\n\n\n\n\n  Vous n'avez aucun ticket qui\n\n  correspond  à cette date   ";
                
            }
            if (i<10 && code_ticket[i]!=null) {
                see.setForeground(Color.green);
                see.setVisible(true);
                page1_label.setVisible(true);
                message1_ticket=message1_ticket+code_ticket[i]+"\n\n  ";
            };
            if (i<20 && i>9 && code_ticket[i]!=null) {
                see1.setVisible(true);
                page2_label.setVisible(true);
                message1_ticket1=message1_ticket1+code_ticket[i]+"\n\n  ";
            };
            if (i>=20 && code_ticket[i]!=null) {
                see2.setVisible(true);
                page3_label.setVisible(true);
                message1_ticket2=message1_ticket2+code_ticket[i]+"\n\n  ";
            }
            
            // message1=message1+code_ticket[i]+"\n\n  ";
        }
        // message1=message1;
        see.setText(message1_ticket);
        see1.setText(message1_ticket1);
        see2.setText(message1_ticket2);
    } else {
        see.setVisible(true);
        see.setForeground(Color.RED);
        see.setText("\n\n\n\nCette date n'est pas valide");
    }


    }});


    button_acheter.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            // recuperer_solde(mle);
            String date;
            date= choice_Day.getItem(choice_Day.getSelectedIndex())+"/"+choice_month.getItem(choice_month.getSelectedIndex())+"/"+ choice_year.getItem(choice_year.getSelectedIndex());
            String ticket_type;
            ticket_type=choice.getItem(choice.getSelectedIndex());
            int nbr_ticket;

            nbr_ticket=Integer.parseInt(coise_nbr_ticket.getItem(coise_nbr_ticket.getSelectedIndex()));

			int flag=verify_date(date);
			if (flag<0) {
				int state=acheter_ticket(mle,ticket_type,nbr_ticket ,date);    
				if (state==1) {
						// label.setText("hi there");
					String message;
					Float solde=recuperer_solde(mle);
					label_1.setText("<html> &nbsp solde: &nbsp "+ Float.toString(solde)+" &nbsp Dirham</html>");
					voir_ticket_label1.setText("<html> &nbsp solde: &nbsp "+ Float.toString(solde)+" &nbsp Dirham</html>");
					label_11.setText("<html> &nbsp solde: &nbsp "+ Float.toString(solde)+" &nbsp Dirham</html>");
					if (solde>10) {
						label_1.setForeground((Color.GREEN));
						label_11.setForeground((Color.GREEN));
						voir_ticket_label1.setForeground((Color.GREEN));

					}
					else{
						label_11.setForeground((Color.RED));
						label_1.setForeground((Color.RED));
						voir_ticket_label1.setForeground((Color.RED));
					}
					label_recu.setForeground(Color.GREEN);
					// <html> &nbsp Votre opération à été effectuer avec  succès <br> &nbsp +" </html>"
					message= "\n\n  Votre opération à été effectuer avec  succès \n\n  Votre code de ticket est:  "+code_afficher;
					label_recu.setText(message);

					// System.out.println("l'opération est effectuée avec  succès");
				}
				else{
					// <html> &nbsp 
					// <br> &nbsp Veuillez charger votre compte, puis essayez une autre fois </html>
					label_recu.setForeground(Color.RED);
					label_recu.setText("\n\n  Votre solde n'est pas suffisant pour effectuer cette opération\n\n   Veuillez charger votre compte, puis essayez une autre fois");
					// System.out.println("votre solde n'est pas suffisant pour effectuer cette opération");
				}
					
			}
			else{
				label_recu.setForeground(Color.red);
				label_recu.setText("\n\n Vous n'avez pas le droit d'acheter les tickets d'aujourd'hui");
			}
       
                ;}});
        }
        

//	cette methode genere aleatoirement un code de 4 chiffre.
public static String  random() {
    int max=9999;
     int random_int = (int)Math.floor(Math.random()*(max+1));
     String code=Integer.toString(random_int);
     int conteur=code.length();
     while(conteur<4) {
         code="0"+code;
         conteur++;
     }
     return code;
}
//cette methode verifie est ce que un code exixte dans la base de donnee ou non.
public static int verify(String code_string) {
     int code=Integer.parseInt(code_string);
     int table_code[]=new int[100000];
     int flag=1;
     int i =0;
     try{ 
        // connect TheFourMusketeers/AllForOneOneForAll
       Class.forName("oracle.jdbc.driver.OracleDriver"); 
       Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","TheFourMusketeers","ayoub123"); 
       Statement stmt=con.createStatement(); 
       ResultSet rs=stmt.executeQuery("select codeticket from ticket");   

       while (rs.next()) {
           
           table_code[i]= Integer.parseInt(rs.getString(1));
           i++;
       }
    //    con.close();
     }		
      
     catch(Exception e){ 
         System.out.println("verify ");
       System.out.println(e); 
     } 
//	     System.out.println(table_code[3]);
     for(int j=0;j<i;j++){
         if(code==table_code[j]) {
             flag=0;
             break;}
         flag=1;
     }		 
     return flag;
}

//	cette methode genere aleatoirement un code de 4 chiffre qui n'exist pas dans la base de donnee.Bien sur il servi de des methodes precedente.
public static String generate_code() {
    String code="0000";
//		return code_ticket;
    int flag=0;
    while(flag==0) {
        code=random();
        flag=verify(code);
    }
    return code;
}

//	cette fonction recuper le solde de l'utidiant a partir de la base de donnees
public static float recuperer_solde(int int_matricule) {
    
    String matricule=Integer.toString(int_matricule);
      float solde=1f;
      try 
      { 
       Class.forName("oracle.jdbc.driver.OracleDriver"); 
       Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","TheFourMusketeers","ayoub123"); 
       Statement stmt=con.createStatement(); 
       ResultSet rs=stmt.executeQuery("select solde from users2 where mle="+ matricule ); 	   
       while (rs.next()) {
       solde=rs.getFloat(1);
       }
      System.out.println(solde);
    //    con.close();
      }		 
      catch(Exception e){ 
             System.out.println("recuperer solde");
       System.out.println(e); 
      } 
    return solde;
}
//cette method fait remplacer le sode par une nouveau valeur apres l'achet des tickets;
public static void replace_solde(int int_matricule,float float_solde) {
    String solde =Float.toString(float_solde);
    System.out.println("it is workig");
    String matricule =Integer.toString(int_matricule);
      try 
      { 
       Class.forName("oracle.jdbc.driver.OracleDriver"); 
       Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","TheFourMusketeers","ayoub123"); 
       Statement stmt=(Statement) con.createStatement(); 
       stmt.executeQuery("update users2 set solde="+solde+"where mle="+matricule); 
       con.close();
      }
      catch(Exception e){
             System.out.println("replace solde ");
            System.out.println(e); 
      }
}
// cette method fait ajouter le code ticket dans la table des ticket.
public static void poser_le_code_ticket(String code,int int_matricule,String date_ticket,String repas,int int_nombre_repas) {
    String nombre_repas=Integer.toString(int_nombre_repas);
    String matricule =Integer.toString(int_matricule);
      try 
      { 
       Class.forName("oracle.jdbc.driver.OracleDriver"); 
       Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","TheFourMusketeers","ayoub123"); 
       Statement stmt=(Statement) con.createStatement(); 
       stmt.executeQuery("ALTER SESSION SET NLS_DATE_FORMAT = 'dd/mm/yyyy'");
       stmt.executeQuery("insert into ticket values("+code+","+date_ticket+","+repas+","+nombre_repas+","+matricule+")"); 
       con.close();
      }
      catch(Exception e){ 
             System.out.println("poser le code ticket");
             System.out.println(e); 
      }
}
public static int acheter_ticket(int int_matricule,String repas,int nombre_repas,String date_ticket) {
    float solde=recuperer_solde(int_matricule);

     
    float prix_total=0;
    float prix_repas=0;
    // String repas="red";
    if(repas=="diner"||  repas=="dejeuner" ){
        prix_repas=1.5f;
    }
    // if (int_repas==2) {
    //     prix_repas=1.5f;
    //     repas="dejeuner";
    // }
    else {
        prix_repas=1f;
    }
 
    prix_total=prix_repas*nombre_repas;
    
    solde=solde-prix_total;
    
    if(solde>=0) {
        String code=generate_code() ;
        code_afficher=code+"-"+date_ticket+"-"+Integer.toString(nombre_repas);//;
        date_ticket="'"+date_ticket+"'";
        repas="'"+repas+"'";
        code="'"+code+"'";
    
        replace_solde(int_matricule,solde);	
        poser_le_code_ticket( code, int_matricule,date_ticket,repas,nombre_repas);
    }
    else {
        // System.out.println("votre solde n'est pas suffisant pour effectuer cette opération");
        return 0;
    }
    // System.out.println("l'opération est effectuée avec  succès");
    return 1;
}


public static String[] data(int mle) {
  
    String[] data1=new String[100];
    int i=0;
    try{ 
        // connect TheFourMusketeers/AllForOneOneForAll
       Class.forName("oracle.jdbc.driver.OracleDriver"); 
       Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","TheFourMusketeers","ayoub123"); 
       Statement stmt=con.createStatement(); 
       stmt.executeQuery("ALTER SESSION SET NLS_DATE_FORMAT = 'dd/mm/yyyy'");
       ResultSet rs=stmt.executeQuery("select  codeticket,to_char(date_ticket,'dd.mm.yy') ,repas,quantite  from ticket  where  mle="+mle+"  order by date_ticket ");   
       while (rs.next()) {
           
           data1[i]= (rs.getString(1)+"-"+rs.getString(2)+"-"+rs.getString(3)+"-"+rs.getString(4));
            i++;
       }
       con.close();
    //    return data1;
     }		
      
     catch(Exception e){ 
         System.out.println("il ya une erreur dans la fonction data() ");
       System.out.println(e); 
     }
    //  System.out.println("hi there");
   
    return data1;
    


}



public static void put_name(int mle) {
try{ 
    // connect TheFourMusketeers/AllForOneOneForAll
    Class.forName("oracle.jdbc.driver.OracleDriver"); 
    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","TheFourMusketeers","ayoub123"); 
    Statement stmt=con.createStatement(); 
    ResultSet rs= stmt.executeQuery("select  name,FAMILYNAME from recoveraccount where mle="+mle);   
   while (rs.next()) {
       str_firstName=rs.getString(1);
       str_secondName=rs.getString(2);

    //    String data1[i]= (rs.getString(1)+"-"+rs.getString(2)+"-"+rs.getString(3)+"-"+rs.getString(4));
    
   }
   con.close();
//    return data1;
 }		
  
 catch(Exception e){ 
     System.out.println("verify ");
   System.out.println(e); 
 }
}


public static String[] find_data(int mle,String date) {
  
    String[] data1=new String[100];
    int i=0;
    try{ 
        // connect TheFourMusketeers/AllForOneOneForAll
       Class.forName("oracle.jdbc.driver.OracleDriver"); 
       Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","TheFourMusketeers","ayoub123"); 
       Statement stmt=con.createStatement(); 
       stmt.executeQuery("ALTER SESSION SET NLS_DATE_FORMAT = 'dd/mm/yyyy'");
       ResultSet rs=stmt.executeQuery("select  codeticket,to_char(date_ticket,'dd.mm.yy') ,repas,quantite  from ticket  where mle="+mle+"and date_ticket="+date);   
       while (rs.next()) {
           
           data1[i]= (rs.getString(1)+"-"+rs.getString(2)+"-"+rs.getString(3)+"-"+rs.getString(4));
            i++;
       }
       con.close();
    //    return data1;
     }		
      
     catch(Exception e){ 
         System.out.println("il ya une erreur dans la fonction find_data() ");
       System.out.println(e); 
     }
	 return data1;
}

public static String anuller_ticket(int mle,String date,String repas,float prix) {

	int[] list_array=new int[100];
	String list_for_solde="";
	String flag=null;
	try{ 
		int i=0;
		// connect TheFourMusketeers/AllForOneOneForAll
		Class.forName("oracle.jdbc.driver.OracleDriver"); 
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","TheFourMusketeers","ayoub123"); 
		Statement stmt=con.createStatement(); 
		stmt.executeQuery("ALTER SESSION SET NLS_DATE_FORMAT = 'dd/mm/yyyy'");
		ResultSet rs=stmt.executeQuery("select  codeticket,to_char(date_ticket,'dd.mm.yy') ,repas,quantite  from ticket  where mle="+mle+"and date_ticket="+date);   
		while (rs.next()) {
			flag=rs.getString(1);
			
			list_for_solde+= "\n\n  "+(rs.getString(1)+"-"+rs.getString(2)+"-"+rs.getString(3)+"-"+rs.getString(4));
			list_array[i]=rs.getInt(4);
			System.out.println(list_array[i]);
			System.out.println(rs.getString(1)+"-"+rs.getString(2)+"-"+rs.getString(3)+"-"+rs.getString(4));
			i++;
		}
		if (flag==null) {
			return null;
		
		}
		System.out.println("solde");
		stmt.executeQuery("ALTER SESSION SET NLS_DATE_FORMAT = 'dd/mm/yyyy'");
		stmt.executeQuery("delete from ticket where mle="+mle+"and date_ticket="+date);
		float solde=0;
	

		for (int index = 0; index < list_array.length; index++) {
			
			 solde+=prix*list_array[index];
		}
		
	   
	   
	   stmt.executeQuery("update users2 set solde=solde+"+solde+"where mle="+mle );
	   System.out.println("le solde est"+solde);
       con.close();
	   return list_for_solde;
    
     }		
      
     catch(Exception e){ 
		 System.out.println(" il y a un problem lors de la suppression d'un ticket ");
		 System.out.println(e); 
		
     }
	 return list_for_solde;
}
public int verify_date(String date_ticket) {
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	LocalDate date = LocalDate.now();
	date.plusDays(1);
    LocalDate date_ticket1 = LocalDate.parse(date_ticket, formatter);
    // System.out.println(date);
	return date.compareTo(date_ticket1);
}
}