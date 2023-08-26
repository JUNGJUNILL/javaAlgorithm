package tobi_Spring.Chapter003_Ex001_templete;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class InsertStatement implements StatementStrategy{
	
	User user;
	
	public InsertStatement(User user) {
		this.user = user;
	}

	@Override
	public PreparedStatement makePreparedStatement(Connection c) throws Exception {
		
		PreparedStatement ps = c.prepareStatement("INSERT INTO MVC_USER(userid, password, name) VALUES(?,?,?)");
		ps.setString(1, user.getId());
		ps.setString(2, user.getPassword());
		ps.setString(3, user.getName());
		
		return ps;
	
	}
	

}
