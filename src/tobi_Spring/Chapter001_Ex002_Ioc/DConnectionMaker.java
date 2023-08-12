package tobi_Spring.Chapter001_Ex002_Ioc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DConnectionMaker implements ConnectionMaker{

	@Override
	public Connection makeConnection() throws ClassNotFoundException, SQLException {
		Class.forName("org.mariadb.jdbc.Driver"); 
		Connection c =DriverManager.getConnection("jdbc:mariadb://210.114.22.76:3306/yse_spring_mvc","root","wnsdlfA!213"); 

		return c;
	}
	
	

}
