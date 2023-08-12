package tobi_Spring.Chapter001_Ex003_Ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import tobi_Spring.Chapter001_Ex002_Ioc.User;

public class Main {

	public static void main(String[] args) throws Exception{

	ApplicationContext context = new AnnotationConfigApplicationContext(DaoFactory.class);
	
	UserDAO dao = context.getBean("userDao",UserDAO.class);
	User user=dao.getUser("qq");
	System.out.println(user.getPassword());
	
	CountingConnectionMaker ccm = context.getBean("connectionMaker",CountingConnectionMaker.class);
	System.out.println(ccm.getCounter());
	
	}
}
