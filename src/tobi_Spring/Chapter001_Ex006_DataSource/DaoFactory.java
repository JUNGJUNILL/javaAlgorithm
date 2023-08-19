package tobi_Spring.Chapter001_Ex006_DataSource;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;


@Configuration //���ø����̼� ���ؽ�Ʈ �Ǵ� �� ���丮�� ����� ����������� ǥ��
public class DaoFactory {
	
	
	@Bean
	public DataSource dataSource() {
		SimpleDriverDataSource dataSource = new SimpleDriverDataSource(); 
		
		dataSource.setDriverClass(org.mariadb.jdbc.Driver.class);
		dataSource.setUrl("jdbc:mariadb://210.114.22.76:3306/yse_spring_mvc");
		dataSource.setUsername("root");
		dataSource.setPassword("wnsdlfA!213");
		
		return dataSource;
	}
	
	@Bean
	public UserDAO userDao() {
		UserDAO dao = new UserDAO(); 
		dao.setDataSource(dataSource());
		return dao; 
	}

}
