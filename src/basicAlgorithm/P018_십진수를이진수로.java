package basicAlgorithm;

public class P018_���������������� {

	public static void main(String[] args) {

		
		int n = 5; 
		int[] a = new int[32]; 
		
		int i=1; 
		
		//1�� �� ������ �ݺ�
		while(n != 1){
			a[i++] = n%2;
			n /=2;  
		}
		a[i]=n; 

		
		
	
		int temp=0; 
		while(i>0){
		
			System.out.print(a[i]);
			i--;
		}
		
	
		

		
	}

}
