package tobi_Spring.Chapter003_Ex001_templete;

import java.sql.Connection;
import java.sql.SQLException;

public interface ConnectionMaker {

	public Connection makeConnection() throws ClassNotFoundException, SQLException; 
}
