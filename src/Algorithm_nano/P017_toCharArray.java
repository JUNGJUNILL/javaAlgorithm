package Algorithm_nano;

public class P017_toCharArray {

	public static void main(String[] args) {

		//String.toCharArray()
		//ĳ���� �迭�� ��ȯ�Ѵ�.
		
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
