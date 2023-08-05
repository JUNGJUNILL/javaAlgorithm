package tobi_Spring.Chapter001_Ex001_Refactoring004;

import java.sql.Connection;
import java.sql.SQLException;

public interface ConnectionMaker {

	public Connection makeConnection() throws ClassNotFoundException, SQLException; 
}
