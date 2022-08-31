
public class Practice04 {

	public static void main(String[] args) {
		
		
		String abc = "12345";
		String aaa ="12345k"; 

		
		if(abc.matches("[0-9]+")){
			System.out.println("숫자임");
		}else{
			System.out.println("숫자아님");
		}
		
		
		
		System.out.println(Integer.parseInt(abc)+"");
		System.out.println(Integer.parseInt(aaa)+"");
	}

}
