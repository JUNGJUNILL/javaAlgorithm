package tobi_Spring.Chapter003_Ex001_templete;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DeleteAllStatement implements StatementStrategy{

	@Override
	public PreparedStatement makePreparedStatement(Connection c) throws Exception {
		PreparedStatement ps = c.prepareStatement("delete from mvc_user"); 
		return ps;
	}

	
	
}
