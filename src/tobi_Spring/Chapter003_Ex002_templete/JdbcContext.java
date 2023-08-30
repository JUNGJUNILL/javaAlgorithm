package tobi_Spring.Chapter003_Ex002_templete;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

public class JdbcContext {
	
	private DataSource dataSource;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	
	protected void workWithStatementStrategy(StatementStrategy stmt) throws Exception{
			
			Connection c = null;
			PreparedStatement ps = null;
			ResultSet rs = null; 
			
			try{		
					c = this.dataSource.getConnection();
					
					//여기만 변한다---------------------------------------------
					ps = stmt.makePreparedStatement(c);
					//여기만 변한다---------------------------------------------
					System.out.println(ps.toString());
					rs = ps.executeQuery();		
									
					if(rs!=null) {
						while(rs.next()) {
							System.out.println("userName : "+rs.getString(1) + " passowrld : " + rs.getString(2)  + " name : " + rs.getString(3));
						}
					}

			}catch(SQLException e) {
				throw e;
				
			}finally {
				
				if(ps != null) { try {ps.close();}catch(SQLException e) {} }
				if(c != null) { try {c.close();}catch(SQLException e) {} }
				
			}
			
		}
	
	
	
	protected void excuteSQL(String query) throws Exception {
		workWithStatementStrategy(
				
					new StatementStrategy() {					
						@Override
						public PreparedStatement makePreparedStatement(Connection c) throws Exception {
							return c.prepareStatement(query);
							
						}
					}
				);
	}
	
	

}
