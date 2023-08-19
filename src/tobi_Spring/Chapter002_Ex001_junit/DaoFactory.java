package tobi_Spring.Chapter002_Ex001_junit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


//@Configuration //���ø����̼� ���ؽ�Ʈ �Ǵ� �� ���丮�� ����� ����������� ǥ��
public class DaoFactory {
	
	
	//@Bean
	public ConnectionMaker connectionMaker() {
		return new DConnectionMaker();
	}
	
	//@Bean
	public UserDAO userDao() {
		UserDAO dao = new UserDAO(); 
		dao.setHello(connectionMaker());
		return dao; 
	}

}
