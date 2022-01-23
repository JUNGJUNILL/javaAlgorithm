package Algorithm_nano;

public class P026_charAt {

	//https://cokes.tistory.com/80
	public static void main(String[] args) {

		String stringNum ="1234567890"; 
		for(int i=0; i<stringNum.length(); i++){
	
			//이거슨 실제 int형이다.
			System.out.println(stringNum.charAt(i)-'0');
			
		}
	}
}
