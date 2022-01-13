
import java.util.*; 


public class Practice {

	static int[] arr01; 
	static boolean[] check01; 
	static void Permutation(int k, int n, int m){
		if(k==m){
			for(int i=0; i<m; i++){
				System.out.print(arr01[i]+1+" ");
			}
			System.out.println();
		}
		
		for(int i=0; i<n; i++){
			if(!check01[i]){
				arr01[k]=i; 
				check01[i]=true;
				Permutation(k+1, n, m);
				check01[i]=false; 
			}
		}
	}

	
	
	
	
	
	
	
	
	
	

	static int[] arr02; 
	static boolean[] check02; 
	static void Combination(int k , int s, int n, int m){
		if(k==m){
			for(int i=0; i<m; i++){
				System.out.print(arr02[i]+1+" ");
			}
			System.out.println();
		}
		
		
		for(int i=s; i<n; i++){
			if(!check02[i]){
				arr02[k]=i; 
				check02[i]=true; 
				Combination(k+1, i+1, n, m);
				check02[i]=false; 
				
			}
		}
	}
	
	public static void main(String[] args) {

		arr01=new int[3]; 
		check01=new boolean[3]; 
		Permutation(0, 3, 3);
		System.out.println();
		arr02=new int[3]; 
		check02=new boolean[3]; 
		Combination(0, 0, 3, 3);

		
	}
}