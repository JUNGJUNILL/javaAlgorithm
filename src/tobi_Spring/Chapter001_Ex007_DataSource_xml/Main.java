package tobi_Spring.Chapter001_Ex007_DataSource_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import tobi_Spring.Chapter001_Ex007_DataSource_xml.*;

public class Main {

	public static void main(String[] args) throws Exception{

		ApplicationContext context = new GenericXmlApplicationContext("tobi_Spring/Chapter001_Ex007_DataSource_xml/applicationContext.xml");

	UserDAO dao = context.getBean("userDao",UserDAO.class);
	System.out.println(dao);
	
	User user=dao.getUser("hello");
	System.out.println(user.getId()+ " " +user.getPassword());
	
	}
}
