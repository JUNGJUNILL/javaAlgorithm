package tobi_Spring.Chapter001_Ex001;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLDataException;
import java.sql.SQLException;

public class UserDAO {
	
	
	public void add(User user) throws ClassNotFoundException, SQLException{
		
		Class.forName("org.mariadb.jdbc.Driver"); 
		Connection c =DriverManager.getConnection("jdbc:mariadb://210.114.22.76:3306/yse_spring_mvc","root","wnsdlfA!213"); 
		
		PreparedStatement ps = c.prepareStatement(
				"insert into mvc_user (userid, password) values(?,?)"
				);
		
		ps.setString(1, user.getId());
		ps.setString(2, user.getPassword()); 
		
		ps.execute(); 	
		ps.close();
		c.close(); 

	}
	
	public User get(String id) throws ClassNotFoundException, SQLException{
		
		Class.forName("org.mariadb.jdbc.Driver"); 
		Connection c =DriverManager.getConnection("jdbc:mariadb://210.114.22.76:3306/yse_spring_mvc","root","wnsdlfA!213"); 

		PreparedStatement ps = c.prepareStatement(
					"select * from mvc_user where userid=?"
				);
		
		ps.setString(1, id);
		
		ResultSet rs = ps.executeQuery(); 
		rs.next();
		
		User user=new User(); 
		user.setId(rs.getString("userid")); 
		user.setPassword(rs.getString("password"));
		
		rs.close();
		ps.close();
		c.close();
		
		return user;
		
	}
	

	
	
}
