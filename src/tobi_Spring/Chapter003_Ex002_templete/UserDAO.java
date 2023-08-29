package tobi_Spring.Chapter003_Ex002_templete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import tobi_Spring.Chapter003_Ex002_templete.*;

public class UserDAO {
	
	
	private JdbcContext jdbcContext;
	
	//������ �޼ҵ��̸鼭 jdbcContext�� ���� ����, DI �۾��� ���ÿ� �����Ѵ�.
	public void setWorld(DataSource dataSource) {
		
		this.jdbcContext = new JdbcContext(); //IOC
		this.jdbcContext.setDataSource(dataSource); //DI
		
	}
	
	protected void add(User user) throws Exception{
		
		this.jdbcContext.workWithStatementStrategy(new StatementStrategy() {
			
			@Override
			public PreparedStatement makePreparedStatement(Connection c) throws Exception {
				PreparedStatement ps = c.prepareStatement("INSERT INTO MVC_USER(userid, password, name) VALUES(?,?,?)");
				ps.setString(1, user.getId());
				ps.setString(2, user.getPassword());
				ps.setString(3, user.getName());
				
				return ps;
			}
		});
	
	}
	
	


	
	protected PreparedStatement makeStatement(Connection c) throws SQLException {
		
		PreparedStatement ps;
		ps = c.prepareStatement("delete from mvc_user");
		return ps;
		
	}
	
	
	

}
