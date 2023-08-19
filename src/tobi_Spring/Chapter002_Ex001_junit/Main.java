package tobi_Spring.Chapter002_Ex001_junit;


import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import java.sql.SQLException;

import org.hamcrest.core.IsNot;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.springframework.beans.factory.parsing.EmptyReaderEventListener;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	@Test
	public void addAndGet() throws ClassNotFoundException, SQLException{
		
		ApplicationContext context = new GenericXmlApplicationContext("tobi_Spring/Chapter002_Ex001_junit/applicationContext.xml");
		UserDAO dao = context.getBean("userDao",UserDAO.class);
		User user = new User();
		user.setId("bb");
		user.setPassword("999");
		dao.add(user); 
		
		User user2 = dao.getUser(user.getId());

		assertThat(user2.getName(), is(user.getName()));
		assertThat(user2.getPassword(), is(user.getPassword()));
		
	}
	
	@Test
	public void addAndGet02() throws ClassNotFoundException, SQLException{
		
		ApplicationContext context = new GenericXmlApplicationContext("tobi_Spring/Chapter002_Ex001_junit/applicationContext.xml");
		UserDAO dao = context.getBean("userDao",UserDAO.class);
	
		User user = dao.getUser("qq");
		
		assertThat(dao.getCount(), is(4));
		
	}
	
	@Test
	public void addAndGet3() throws ClassNotFoundException, SQLException{
		
		ApplicationContext context = new GenericXmlApplicationContext("tobi_Spring/Chapter002_Ex001_junit/applicationContext.xml");
		UserDAO dao = context.getBean("userDao",UserDAO.class);
		User user1 = new User("hello","jun01","001");
		User user2 =new User("world","jun02","002");

		dao.deleteAll(); 
		assertThat(dao.getCount(), is(0));
		
		dao.add(user1);
		dao.add(user2);
		assertThat(dao.getCount(),is(2));

		User userTarget1 = dao.getUser(user1.getId());
		assertThat(userTarget1.getName(), is(user1.getName()));
		assertThat(userTarget1.getPassword(), is(user1.getPassword()));


		User userTarget2 = dao.getUser(user2.getId());
		assertThat(userTarget2.getName(), is(user2.getName()));
		assertThat(userTarget2.getPassword(), is(user2.getPassword()));
		
		
	}
	
	@Test
	public void count() throws ClassNotFoundException, SQLException{
		
		ApplicationContext context = new GenericXmlApplicationContext("tobi_Spring/Chapter002_Ex001_junit/applicationContext.xml");

		UserDAO dao = context.getBean("userDao",UserDAO.class);
		User user1 = new User("hello","jun01","001");
		User user2 =new User("world","jun02","002");
		User user3 = new User("helloworld","jun03","003");
		
		dao.deleteAll(); 
		assertThat(dao.getCount(),is(0));
		
		dao.add(user1);
		assertThat(dao.getCount(),is(1));
		
		dao.add(user2);
		assertThat(dao.getCount(),is(2));
		
		dao.add(user3);
		assertThat(dao.getCount(),is(3));

	}
	
	
	@Test(expected = NullPointerException.class)
	public void getUserFailure() throws ClassNotFoundException, SQLException{
		ApplicationContext context = new GenericXmlApplicationContext("tobi_Spring/Chapter002_Ex001_junit/applicationContext.xml");
		UserDAO dao = context.getBean("userDao",UserDAO.class);
		dao.deleteAll(); 
		assertThat(dao.getCount(),is(0));

		dao.getUser2("unknown_id");
		
	}
	



	
}
