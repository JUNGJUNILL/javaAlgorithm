package tobi_Spring.Chapter001_Ex001_Refactoring001;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class UserDAO {
	
	public abstract Connection getConnetion() throws ClassNotFoundException, SQLException; 
	public abstract void addUser(User user) throws ClassNotFoundException, SQLException; 
	public abstract User getUser(String id) throws ClassNotFoundException, SQLException; 

	
}
