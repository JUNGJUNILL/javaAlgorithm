package Algorithm_nano;

public class P013_조합 {

	//조합
	//nCm
	static int[] arr01; 
	static boolean[] check01; 
	static void Combination(int k ,int s , int n, int m){
		if(k==m){
			for(int i=0; i<m; i++){
				System.out.print(arr01[i]+1+" ");
			}
			System.out.println();
		}
		
		for(int i=s; i<n; i++){
			if(!check01[i]){
				arr01[k]=i; 
				check01[i]=true; 
				Combination(k+1, i+1, n, m);
				check01[i]=false; 
			}
		}
	}
	
	
	//중복조합
	static int[] arr02; 
	
	static void MultipleCombination(int k, int s, int n, int m){
		if(k==m){
			for(int i=0; i<m; i++){
				System.out.print(arr02[i]+1+" ");
			}
			System.out.println();
			return; 
		}
		
		for(int i=s; i<n; i++){
			arr02[k]=i; 
			MultipleCombination(k+1, i, n, m);
		}
	}
	
	
	public static void main(String[] args) {
		
		int N=3; 
		int M=3; 
		arr01=new int[N]; 
		check01=new boolean[N]; 
		
		Combination(0, 0, N, M);
		System.out.println();
		
		arr02=new int[N]; 
		MultipleCombination(0, 0, N, M);
	}

}
