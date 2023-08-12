package tobi_Spring.Chapter001_Ex002_Ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) throws Exception{
	
	//������������ ���� ������ ���輳�� ���� ��� ����ϴ� IoC ������Ʈ�� �� ���丮 ��� �Ѵ�.
	//���� �� ���丮���ٴ� �̸� �� �� Ȯ���� ���ø����̼� ���ؽ�Ʈ�� �ַ� ����Ѵ�.
	//���ø����̼� ���ؽ�Ʈ�� ������ ������ �����ؼ� ���� ����, ���輳�� ���� ���� �۾��� �Ѱ��Ѵ�.
		
	//���ø����̼� ���ؽ�Ʈ == IoC �����̳�(������ �����̳�)
		
	//���ø����̼� ���ؽ�Ʈ�� DaoFactory Ŭ������ ���������� ����صΰ� @Bean�� ���� �޼ҵ��� �̸���
	//������ �� ����� ������ش�. Ŭ���̾�Ʈ�� ���ø����̼� ���ؽ�Ʈ�� getBean �޼��� ȣ���ϸ� �ڽ��� ��
	//��Ͽ��� ��û�� �̸��� �ִ��� ã��, �ִٸ� ���� �����ϴ� �޼ҵ带 ȣ���ؼ� ������Ʈ�� ���� ��Ų �� 
	//Ŭ���̾�Ʈ�� �����ش�.
		
	//��
	//�������� IoC ������� �����ϴ� ������Ʈ��� ��
		
	//������
	//�������� �����ϴ� ������Ʈ, ��, ���� �����ǰ�, �����ϰ�, ����Ǵ� ����
	//������ ���� �⺻ �������� �̱����̴�. �̱��� �������� �����̳� ���� �� ���� ������Ʈ�� ���������,
	//������ ���� ���� �ʴ� �� ������ �����̳ʰ� �����ϴ� ���� ��� �����ȴ�.
	//���������� ��������� ��κ��� ���� �̱��� �������� ���´�.
	
	ApplicationContext context = new AnnotationConfigApplicationContext(DaoFactory.class);
	
	
	UserDAO dao = context.getBean("userDao",UserDAO.class);
	UserDAO dao2 = context.getBean("userDao",UserDAO.class);
	
	//�������� bean���� �̱������� �ڵ����� ���� �� �ֱ� ������ ��µǴ� ���� �Ȱ���.
	System.out.println(dao);
	System.out.println(dao2);
	
	User user=dao.getUser("qq");
	System.out.println(user.getPassword());
	
	}
}
