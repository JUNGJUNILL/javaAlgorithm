package tobi_Spring.Chapter001_Ex003_Ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //애플리케이션 컨텍스트 또는 빈 팩토리가 사용할 설정정보라는 표시
public class DaoFactory {
	
	
	@Bean
	public ConnectionMaker realConnectionMaker() {
		return new DConnectionMaker();
	}
	
	@Bean
	public ConnectionMaker connectionMaker() {
		return new CountingConnectionMaker(realConnectionMaker());
	}
	
	//수정자 메서드를 이용한 DI 방식
	@Bean
	public UserDAO userDao() {
		UserDAO dao = new UserDAO(); 
		dao.setConnectionMaker(connectionMaker());
		return dao; 
	}
	

}
