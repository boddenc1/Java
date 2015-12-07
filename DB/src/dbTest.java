import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
//import java.sql.*;

public class dbTest {

	public static void main(String[] args) {
		 Connection conn = null;
		  Statement stmt = null;
		  int rs = 0;
		  String connUrl = null;
		  String connUser = null;
		  String connPass = null;
		    
		    try{
		      Class.forName("com.mysql.jdbc.Driver").newInstance();
		      connUrl = "jdbc:mysql://localhost:3306/csc335_project";
		      connUser = "root";
		      connPass = "toor";
		      conn = DriverManager.getConnection(connUrl,connUser,connPass);
		      System.out.println("YEERRRRRRRRRP!!1");
		      //stmt = conn.createStatement();
		    }
		    catch(Exception e)
		    {
		      e.printStackTrace();
		    }
		  }
		}