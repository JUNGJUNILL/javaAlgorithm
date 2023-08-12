package tobi_Spring.Chapter001_Ex003_Ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //���ø����̼� ���ؽ�Ʈ �Ǵ� �� ���丮�� ����� ����������� ǥ��
public class DaoFactory {
	
	
	@Bean
	public ConnectionMaker realConnectionMaker() {
		return new DConnectionMaker();
	}
	
	@Bean
	public ConnectionMaker connectionMaker() {
		return new CountingConnectionMaker(realConnectionMaker());
	}
	
	//������ �޼��带 �̿��� DI ���
	@Bean
	public UserDAO userDao() {
		UserDAO dao = new UserDAO(); 
		dao.setConnectionMaker(connectionMaker());
		return dao; 
	}
	

}
