package ����_�˰���_����02_N��M;

import java.util.Scanner;

public class P004_N��M_4_�ߺ����� {

	static int[] arr; 
	static boolean[] check; 
	static void MultipleCombination(int k ,int s, int n, int m){
		if(k==m){
			
			for(int i=0; i<m; i++){
				System.out.print(arr[i]+1+" ");
			}
			System.out.println();	
			return; 
		}
	
		for(int i=s; i<n; i++){
			arr[k]=i;
			MultipleCombination(k+1, i, n, m);
		}
	
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in); 
		int N=sc.nextInt(); 
		int M=sc.nextInt(); 
		
		arr=new int[N];
		MultipleCombination(0, 0, N, M);

	}

}
