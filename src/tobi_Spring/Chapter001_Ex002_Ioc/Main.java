package tobi_Spring.Chapter001_Ex002_Ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) throws Exception{
	
	//스프링에서는 빈의 생성과 관계설정 같은 제어를 담당하는 IoC 오브젝트를 빈 팩토리 라고 한다.
	//보통 빈 팩토리보다는 이를 좀 더 확장한 애플리케이션 컨텍스트를 주로 사용한다.
	//애플리케이션 컨텍스트는 별도의 정보를 참고해서 빈의 생성, 관계설정 등의 제어 작업을 총괄한다.
		
	//애플리케이션 컨텍스트 == IoC 컨테이너(스프링 컨테이너)
		
	//애플리케이션 컨텍스트는 DaoFactory 클래스를 설정정보로 등록해두고 @Bean이 붙은 메소드의 이름을
	//가져와 빈 목록을 만들어준다. 클라이언트가 애플리케이션 컨텍스트의 getBean 메서를 호출하면 자신의 빈
	//목록에서 요청한 이름이 있는지 찾고, 있다면 빈을 생성하는 메소드를 호출해서 오브젝트를 생성 시킨 후 
	//클라이언트에 돌려준다.
		
	//빈
	//스프링이 IoC 방식으로 관리하는 오브젝트라는 뜻
		
	//빈스코프
	//스프링이 관리하는 오브젝트, 즉, 빈이 생성되고, 존재하고, 적용되는 범위
	//스프링 빈의 기본 스코프는 싱글톤이다. 싱글톤 스코프는 컨테이너 내에 한 개의 오브젝트만 만들어져서,
	//강제로 제거 하지 않는 한 스프링 컨테이너가 존재하는 동안 계속 유지된다.
	//스프링에서 만들어지는 대부분의 빈은 싱글톤 스코프를 갖는다.
	
	ApplicationContext context = new AnnotationConfigApplicationContext(DaoFactory.class);
	
	
	UserDAO dao = context.getBean("userDao",UserDAO.class);
	UserDAO dao2 = context.getBean("userDao",UserDAO.class);
	
	//스프링이 bean들을 싱글톤으로 자동으로 관리 해 주기 때문에 출력되는 값은 똑같다.
	System.out.println(dao);
	System.out.println(dao2);
	
	User user=dao.getUser("qq");
	System.out.println(user.getPassword());
	
	}
}
