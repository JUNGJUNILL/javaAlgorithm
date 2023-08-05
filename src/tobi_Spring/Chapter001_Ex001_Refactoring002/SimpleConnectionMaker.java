package tobi_Spring.Chapter001_Ex001_Refactoring002;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SimpleConnectionMaker {
	
	public Connection makeNewConnection() throws ClassNotFoundException, SQLException{
		Class.forName("org.mariadb.jdbc.Driver"); 
		Connection c =DriverManager.getConnection("jdbc:mariadb://210.114.22.76:3306/yse_spring_mvc","root","wnsdlfA!213"); 

		return c;
		
	}

}
