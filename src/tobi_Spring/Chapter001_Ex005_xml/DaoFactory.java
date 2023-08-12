package tobi_Spring.Chapter001_Ex005_xml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration //���ø����̼� ���ؽ�Ʈ �Ǵ� �� ���丮�� ����� ����������� ǥ��
public class DaoFactory {
	
	
	@Bean
	public ConnectionMaker connectionMaker() {
		return new DConnectionMaker();
	}
	
	@Bean
	public UserDAO userDao() {
		UserDAO dao = new UserDAO(); 
		dao.setConnectionMaker(connectionMaker());
		return dao; 
	}

}
