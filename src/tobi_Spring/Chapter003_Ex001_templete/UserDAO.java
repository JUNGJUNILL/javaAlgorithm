package tobi_Spring.Chapter003_Ex001_templete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import tobi_Spring.Chapter003_Ex001_templete.*;

public class UserDAO {
	
	
	//UserDAO�� �ڽ��� ���ɻ����� å���� ����� ������ ������ �۾��� ���� SQL�� �����ϰ�,
	//�̸� �����ϴ� ���� ������ �� �� �ְ� �ƴ�.
	//�� �̻� DB ���ؼ��� �������� ����� ��� �����ϵ� UserDAO �ڵ�� �ƹ��� ������ ���� �ʴ´�.
	private ConnectionMaker connectionMaker; 
	public void setHello(ConnectionMaker connectionMaker) {
		this.connectionMaker = connectionMaker;
	}

	protected void add(User user) throws Exception{
		
		Connection c = null;
		PreparedStatement ps = null;
		
		try{		
				c =connectionMaker.makeConnection();  
				
				//���⸸ ���Ѵ�---------------------------------------------
				StatementStrategy strategy = new InsertStatement(user);
				ps = strategy.makePreparedStatement(c);
				//���⸸ ���Ѵ�---------------------------------------------
				
				
				ps.executeUpdate(); 		
		}catch(SQLException e) {
			throw e;
			
		}finally {
			
			if(ps != null) { try {ps.close();}catch(SQLException e) {} }
			if(c != null) { try {c.close();}catch(SQLException e) {} }
			
		}
	}
	
	protected User getUser(String id) throws ClassNotFoundException, SQLException{
		
		Connection c = null;
		PreparedStatement ps = null;
		try {
			 c = connectionMaker.makeConnection();  
			 ps = c.prepareStatement("select * from mvc_user where userid=?");
			 
			 
		}catch(SQLException e) {
			
		}finally {
			
		}


		ps.setString(1, id);
		
		ResultSet rs = ps.executeQuery(); 
		rs.next();
		
		User user=new User(); 
		user.setId(rs.getString("userid")); 
		user.setName(rs.getString("name"));
		user.setPassword(rs.getString("password"));
		
		rs.close();
		ps.close();
		c.close();
		
		return user;
		
	}
	
	protected void deleteAll() throws Exception {
		
		
		Connection c = null;
		PreparedStatement ps = null;
		
		try{		
				c =connectionMaker.makeConnection();  
				
				//���⸸ ���Ѵ�---------------------------------------------
				StatementStrategy strategy = new DeleteAllStatement(); 
				ps = strategy.makePreparedStatement(c);
				//���⸸ ���Ѵ�---------------------------------------------
				
				
				ps.executeUpdate(); 		
		}catch(SQLException e) {
			throw e;
			
		}finally {
			
			if(ps != null) { try {ps.close();}catch(SQLException e) {} }
			if(c != null) { try {c.close();}catch(SQLException e) {} }
			
		}

	}
	
	protected void jdbcContextWithStatementStrategy(StatementStrategy stmt) throws Exception{
		
		Connection c = null;
		PreparedStatement ps = null;
		
		try{		
				c =connectionMaker.makeConnection();  
				
				//���⸸ ���Ѵ�---------------------------------------------
				ps = stmt.makePreparedStatement(c);
				//���⸸ ���Ѵ�---------------------------------------------
				System.out.println(ps.toString());
				
				ps.executeUpdate(); 		
		}catch(SQLException e) {
			throw e;
			
		}finally {
			
			if(ps != null) { try {ps.close();}catch(SQLException e) {} }
			if(c != null) { try {c.close();}catch(SQLException e) {} }
			
		}
		
	}
	
	protected PreparedStatement makeStatement(Connection c) throws SQLException {
		
		PreparedStatement ps;
		ps = c.prepareStatement("delete from mvc_user");
		return ps;
		
	}
	
	protected int getCount() throws ClassNotFoundException,SQLException {
		
		Connection c =connectionMaker.makeConnection();  
		PreparedStatement ps = c.prepareStatement("select count(*) from mvc_user");

		ResultSet rs = ps.executeQuery(); 
		rs.next();
		int count = rs.getInt(1);
		
		rs.close();
		ps.close();
		c.close();
		
		return count;
	}

	
	protected User getUser2(String id) throws ClassNotFoundException, SQLException{
		
		Connection c =connectionMaker.makeConnection();  

		PreparedStatement ps = c.prepareStatement(
					"select * from mvc_user where userid=?"
				);
		
		ps.setString(1, id);
		
		ResultSet rs = ps.executeQuery(); 
	
		User user=null;
		
		if(	rs.next()) {
			user = new User(); 
			user.setId(rs.getString("userid")); 
			user.setName(rs.getString("name"));
			user.setPassword(rs.getString("password"));			
		}
		
		
		
		rs.close();
		ps.close();
		c.close();
		
		if(user==null) throw new NullPointerException(); 
		
		return user;
		
	}
	


	

}
