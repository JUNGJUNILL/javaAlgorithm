package tobi_Spring.Chapter001_Ex006_DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import tobi_Spring.Chapter001_Ex006_DataSource.*;

public class Main {

	public static void main(String[] args) throws Exception{

	ApplicationContext context = new AnnotationConfigApplicationContext(DaoFactory.class);
	
	UserDAO dao = context.getBean("userDao",UserDAO.class);
	System.out.println(dao);
	
	User user=dao.getUser("qq");
	System.out.println(user.getId()+ " " +user.getPassword());
	
	}
}
