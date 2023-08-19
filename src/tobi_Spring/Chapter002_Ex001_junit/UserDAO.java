package tobi_Spring.Chapter002_Ex001_junit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import tobi_Spring.Chapter002_Ex001_junit.*;

public class UserDAO {
	
	
	//UserDAO는 자신의 관심사이자 책임인 사용자 데이터 엑세스 작업을 위해 SQL을 생성하고,
	//이를 실행하는 데만 집중을 할 수 있게 됐다.
	//더 이상 DB 컨넥션을 가져오는 방법을 어떻게 변경하든 UserDAO 코드는 아무런 영향을 받지 않는다.
	private ConnectionMaker connectionMaker; 
	public void setHello(ConnectionMaker connectionMaker) {
		this.connectionMaker = connectionMaker;
	}
	
	private DataSource dataSource;
	public void setDataSource(DataSource dataSource) {
		this.connectionMaker=(ConnectionMaker) dataSource;
	}

	
	
	protected void add(User user) throws ClassNotFoundException, SQLException{
		
		Connection c =connectionMaker.makeConnection();  

		PreparedStatement ps = c.prepareStatement(
				"insert into mvc_user (userid, name, password) values(?,?,?)"
				);
		
		ps.setString(1, user.getId());
		ps.setString(2, user.getName());
		ps.setString(3, user.getPassword()); 
		
		ps.execute(); 	
		ps.close();
		c.close(); 
		
	}
	
	protected User getUser(String id) throws ClassNotFoundException, SQLException{
		
		Connection c =connectionMaker.makeConnection();  

		PreparedStatement ps = c.prepareStatement(
					"select * from mvc_user where userid=?"
				);
		
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
	
	protected void deleteAll() throws ClassNotFoundException, SQLException {
		Connection c =connectionMaker.makeConnection();  		
		PreparedStatement ps = c.prepareStatement("delete from mvc_user");
		ps.executeUpdate(); 
		
		ps.close();
		c.close();
		
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
