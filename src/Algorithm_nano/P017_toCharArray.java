package Algorithm_nano;

public class P017_toCharArray {

	public static void main(String[] args) {

		//String.toCharArray()
		//캐릭터 배열을 반환한다.
		
		String str="AAA";
		char[][] a=new char[3][3]; 
		  for (int i=0; i<3; i++) {
	            a[i] =str.toCharArray(); 
	        }
		  
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a[i].length; j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
