package tobi_Spring.Chapter001_Ex001;

public class Main {

	public static void main(String[] args) throws Exception{

		UserDAO dao = new UserDAO(); 
		
		User user=new User();
		user.setId("hello");
		user.setPassword("word");
		
		dao.add(user);
		
		System.out.println(user.getId()+" ��� ����");

		User user2 = dao.get("qq"); 
		
		System.out.println(user2.getId());

		
		
		
	}

}
