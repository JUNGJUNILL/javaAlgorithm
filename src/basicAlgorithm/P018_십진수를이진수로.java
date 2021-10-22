package basicAlgorithm;

public class P018_십진수를이진수로 {

	public static void main(String[] args) {

		
		int n = 5; 
		int[] a = new int[32]; 
		
		int i=1; 
		
		//1이 될 떄까지 반복
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
