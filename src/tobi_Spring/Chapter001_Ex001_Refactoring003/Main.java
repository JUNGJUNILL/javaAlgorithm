package tobi_Spring.Chapter001_Ex001_Refactoring003;

public class Main {

	public static void main(String[] args) throws Exception{

		UserDAO dao = new UserDAO(); 
		
		User user=new User();
		user.setId("hello");
		user.setPassword("word");
		
		//dao.add(user);
		
		//System.out.println(user.getId()+" 등록 성공");

		User user2 = dao.getUser("qq"); 
		
		System.out.println(user2.getPassword());

		
		
		
	}

}
