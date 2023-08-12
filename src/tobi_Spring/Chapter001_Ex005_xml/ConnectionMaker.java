package tobi_Spring.Chapter001_Ex005_xml;

import java.sql.Connection;
import java.sql.SQLException;

public interface ConnectionMaker {

	public Connection makeConnection() throws ClassNotFoundException, SQLException; 
}
