package tobi_Spring.Chapter002_Ex001_junit;


import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import java.sql.SQLException;

import org.hamcrest.core.IsNot;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.parsing.EmptyReaderEventListener;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;


//Junit이 매번 테스트 클래스의 오브젝트를 새로 만든다는 점이다.
//따라서 여러 테스트가 함께 참조할 애플리케이션 컨텍스트를 오브젝트 레벨에 저장해두면 곤란하다.
//그렇다면, 스태틱 필드에 애플리케이션 컨텍스르틑 저장 해 두면 어떻까?


@TestExecutionListeners( { DependencyInjectionTestExecutionListener.class })

@ContextConfiguration(locations = "/tobi_Spring/Chapter002_Ex001_junit/applicationContext.xml")
//테스트 컨텍스트가 자동으로 만들어줄 애플리케이션 컨텍스트 위치 지정
@RunWith(SpringJUnit4ClassRunner.class) 
//스프링 테스트 컨텍스트 프레임워크의 junit 확장 기능 지정
public class Main_refactoring_02 {
	
	@Autowired
	private UserDAO dao;
	
	@Autowired
	private ApplicationContext context;
	
	@Before
	public void setUp() {

	}

	@Test
	public void addAndGet() throws ClassNotFoundException, SQLException{
		
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

		User user = dao.getUser("qq");	
		assertThat(dao.getCount(), is(0));
		
	}
	
	@Test
	public void addAndGet3() throws ClassNotFoundException, SQLException{

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

		dao.deleteAll(); 
		assertThat(dao.getCount(),is(0));
		dao.getUser2("unknown_id");
		
	}
	



	
}
