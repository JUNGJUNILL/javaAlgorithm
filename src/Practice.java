
public class Practice {

	public static void main(String[] args) {

		
		String[] c = {"A","B","C","D"};

		
		for(int i=0; i<c.length; i++){
			int index = (i+1) % c.length; 
			System.out.println(index+" : "+c[index]);
		}
		
		
		
	}
}
