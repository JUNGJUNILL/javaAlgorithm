package tobi_Spring.Chapter001_Ex001_Refactoring002;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import tobi_Spring.Chapter001_Ex001_Refactoring002.User;

public class UserDAO {
	
	private SimpleConnectionMaker connectionMaker; 
	
	protected UserDAO() {
		connectionMaker = new SimpleConnectionMaker(); 
	}
	
	protected void add(User user) throws ClassNotFoundException, SQLException{
		
		Connection c =connectionMaker.makeNewConnection();  

		PreparedStatement ps = c.prepareStatement(
				"insert into mvc_user (userid, password) values(?,?)"
				);
		
		ps.setString(1, user.getId());
		ps.setString(2, user.getPassword()); 
		
		ps.execute(); 	
		ps.close();
		c.close(); 

	}
	
	protected User getUser(String id) throws ClassNotFoundException, SQLException{
		
		Connection c =connectionMaker.makeNewConnection();  

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
