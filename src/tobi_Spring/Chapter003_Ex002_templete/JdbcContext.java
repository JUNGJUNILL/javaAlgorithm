package tobi_Spring.Chapter003_Ex002_templete;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
			
			try{		
					c = this.dataSource.getConnection();
					
					//여기만 변한다---------------------------------------------
					ps = stmt.makePreparedStatement(c);
					//여기만 변한다---------------------------------------------
					System.out.println(ps.toString());
					ps.executeQuery();		
			}catch(SQLException e) {
				throw e;
				
			}finally {
				
				if(ps != null) { try {ps.close();}catch(SQLException e) {} }
				if(c != null) { try {c.close();}catch(SQLException e) {} }
				
			}
			
		}
	
	

}
