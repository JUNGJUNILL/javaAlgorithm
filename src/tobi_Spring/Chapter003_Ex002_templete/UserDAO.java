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
	
	//수정자 메소드이면서 jdbcContext에 대한 생성, DI 작업을 동시에 수행한다.
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
	
	protected void deleteAll() throws Exception {
		
		this.jdbcContext.workWithStatementStrategy(new StatementStrategy() {
			
			@Override
			public PreparedStatement makePreparedStatement(Connection c) throws Exception {

				return c.prepareStatement("DELETE FROM MVC_USER");
			}
		});
		
	}
	
	protected void deleteAll2() throws Exception {
	
		this.jdbcContext.excuteSQL("DELETE FROM MVC_USER");
	
	}

	
	protected void selectAll() throws Exception {
		
		this.jdbcContext.workWithStatementStrategy(new StatementStrategy() {
				
				@Override
				public PreparedStatement makePreparedStatement(Connection c) throws Exception {
	
					return c.prepareStatement("SELECT * FROM MVC_USER");
				}
			});
	}
	
	protected void selectAll2() throws Exception {

		this.jdbcContext.excuteSQL("SELECT * FROM MVC_USER");	
	
	}
	

}
