package tobi_Spring.Chapter003_Ex001_templete;

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

import tobi_Spring.Chapter003_Ex001_templete.UserDAO;

@TestExecutionListeners( { DependencyInjectionTestExecutionListener.class })
@ContextConfiguration(locations = "/tobi_Spring/Chapter003_Ex001_templete/applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class) 
public class Main {
	
	@Autowired
	private UserDAO dao;
	
	@Test
	public void test1() throws Exception{
		dao.deleteAll();
		assertThat(dao.getCount(), is(0));
		
	}
	
	
	@Test
	public void test2() throws Exception{
		StatementStrategy strategy = new DeleteAllStatement(); 
		dao.jdbcContextWithStatementStrategy(strategy);
	}
	
	@Test
	public void test3() throws Exception{
		User user = new User();
		user.setId("hello");
		user.setPassword("pwd");
		user.setName("world");
		
		StatementStrategy strategy = new InsertStatement(user);
		dao.jdbcContextWithStatementStrategy(strategy);

		
	}

}
