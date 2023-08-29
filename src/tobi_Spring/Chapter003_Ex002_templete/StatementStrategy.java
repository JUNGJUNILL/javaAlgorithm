package tobi_Spring.Chapter003_Ex002_templete;

import java.sql.Connection;
import java.sql.PreparedStatement;

public interface StatementStrategy {
	
	public PreparedStatement makePreparedStatement(Connection c) throws Exception;

}
