package tobi_Spring.Chapter002_Ex001_junit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


//@Configuration //애플리케이션 컨텍스트 또는 빈 팩토리가 사용할 설정정보라는 표시
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
