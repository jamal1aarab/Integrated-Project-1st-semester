package fenetre2;

import java.sql.*;
import java.sql.Connection;
import javax.swing.*;

public class sqlplusconnection {
	
	public static Connection dbconnector(){
		try{  
		    //step1 load the driver class  
		    Class.forName("oracle.jdbc.driver.OracleDriver");  
		      
		    //step2 create  the connection object  
		    Connection con=DriverManager.getConnection(  
		    "jdbc:oracle:thin:@localhost:1521:xe","TheFourMusketeers","AllForOneOneForAll");
		    
		    // create statement object 
		    Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
		    	    ResultSet.CONCUR_READ_ONLY);
		    
		    // close connection  
		    //con.close();
		    //JOptionPane.showMessageDialog(null, "Connection Successfull !");
		    return con;
		}catch(Exception e)
		{
			//System.out.println(e);
			JOptionPane.showMessageDialog(null, e);
			return null;
		
		}
	}
}