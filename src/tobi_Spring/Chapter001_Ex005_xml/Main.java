package tobi_Spring.Chapter001_Ex005_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) throws Exception{

	ApplicationContext context = new GenericXmlApplicationContext("tobi_Spring/Chapter001_Ex005_xml/applicationContext.xml");
	
	UserDAO dao = context.getBean("userDao",UserDAO.class);
	UserDAO dao2 = context.getBean("userDao",UserDAO.class);
	
	//�������� bean���� �̱������� �ڵ����� ���� �� �ֱ� ������ ��µǴ� ���� �Ȱ���.
	System.out.println(dao);
	System.out.println(dao2);
	
	User user=dao.getUser("qq");
	System.out.println(user.getPassword());
	
	}
}
