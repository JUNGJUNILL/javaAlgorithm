package Algorithm_nano;

import java.util.Arrays;

public class P012_순열 {

		
		//순열
		//nPm
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
	
		//중복순열
		//n^m
		static int[] arr02; 
		static void MultiplePermutation(int k, int n, int m){
			if(k==m){
				for(int i=0; i<m; i++){
					System.out.print(arr02[i]+1+" ");
				}	
				System.out.println();
				return; 
			}
			
			
			for(int i=0; i<n; i++){
				arr02[k]=i; 
				MultiplePermutation(k+1, n, m);
			}
			
		}
		
		public static void main(String[] args) {
	
			int N=3;
			int M=3; 
			arr01=new int[N]; 
			check01=new boolean[N]; 
			
			Permutation(0, N, M);
			System.out.println();
			
			arr02=new int[N]; 
			MultiplePermutation(0, N, M);
	}
}
