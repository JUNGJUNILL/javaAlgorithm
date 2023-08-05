package tobi_Spring.Chapter001_Ex001_Refactoring001;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class NUserDAO extends UserDAO{

	
	@Override
	public Connection getConnetion() throws ClassNotFoundException, SQLException {
		Class.forName("org.mariadb.jdbc.Driver"); 
		Connection c =DriverManager.getConnection("jdbc:mariadb://210.114.22.76:3306/yse_spring_mvc","root","wnsdlfA!213"); 

		return c;
	}

	@Override
	public void addUser(User user) throws ClassNotFoundException, SQLException {
		
		Connection c= getConnetion(); 
		
		PreparedStatement ps = c.prepareStatement(
				"insert into mvc_user (userid, password) values(?,?)"
				);
		
		ps.setString(1, user.getId());
		ps.setString(2, user.getPassword()); 
		
		ps.execute(); 	
		ps.close();
		c.close(); 
	}

	@Override
	public User getUser(String id) throws ClassNotFoundException, SQLException {
		
		Connection c= getConnetion(); 
		
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
