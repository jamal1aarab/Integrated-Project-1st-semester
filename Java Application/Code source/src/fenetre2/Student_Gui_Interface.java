package fenetre2;

import javax.swing.JLabel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Student_Gui_Interface {



    public static void main(String[] args) {
        int mle=1145;
        Tickets1 window = new Tickets1();
        window.initialize(mle);

        window.ThirdFrame.setVisible(true);
    }
    


}
