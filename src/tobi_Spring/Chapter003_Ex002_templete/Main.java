package tobi_Spring.Chapter003_Ex002_templete;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.sql.SQLException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

import tobi_Spring.Chapter003_Ex002_templete.UserDAO;

@TestExecutionListeners( { DependencyInjectionTestExecutionListener.class })
@ContextConfiguration(locations = "/tobi_Spring/Chapter003_Ex002_templete/applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class) 
public class Main {
	
	@Autowired
	private UserDAO dao;
	
	@Test
	public void test1() throws Exception{
		User user = new User();
		user.setId("hello1");
		user.setPassword("pwd1");
		user.setName("world1");
		
		dao.add(user);
		
	}
	
	@Test
	public void test2() throws Exception {
		
		dao.deleteAll();
	}
	
	@Test
	public void test3() throws Exception {
		
		dao.selectAll();
	}
	
	
	@Test
	public void test4() throws Exception {
		
		dao.deleteAll2();
	}
	
	@Test
	public void test5() throws Exception {
		
		dao.selectAll2();
	}
	
	


}
