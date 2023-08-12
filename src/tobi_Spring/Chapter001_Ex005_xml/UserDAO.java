package tobi_Spring.Chapter001_Ex005_xml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import tobi_Spring.Chapter001_Ex005_xml.ConnectionMaker;
import tobi_Spring.Chapter001_Ex005_xml.User;

public class UserDAO {
	
	
	//UserDAO�� �ڽ��� ���ɻ����� å���� ����� ������ ������ �۾��� ���� SQL�� �����ϰ�,
	//�̸� �����ϴ� ���� ������ �� �� �ְ� �ƴ�.
	//�� �̻� DB ���ؼ��� �������� ����� ��� �����ϵ� UserDAO �ڵ�� �ƹ��� ������ ���� �ʴ´�.
	private ConnectionMaker connectionMaker; 
	public void setConnectionMaker(ConnectionMaker connectionMaker) {
		this.connectionMaker = connectionMaker;
	}

	
	
	protected void add(User user) throws ClassNotFoundException, SQLException{
		
		Connection c =connectionMaker.makeConnection();  

		PreparedStatement ps = c.prepareStatement(
				"insert into mvc_user (userid, password) values(?,?)"
				);
		
		ps.setString(1, user.getId());
		ps.setString(2, user.getPassword()); 
		
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
		user.setPassword(rs.getString("password"));
		
		rs.close();
		ps.close();
		c.close();
		
		return user;
		
	}
	

}
