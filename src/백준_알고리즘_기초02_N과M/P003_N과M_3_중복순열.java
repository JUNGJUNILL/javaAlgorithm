package ����_�˰���_����02_N��M;

import java.util.Scanner;

public class P003_N��M_3_�ߺ����� {
	
	static int[] arr; 
	static boolean[] check; 
	static void MutiplePermutation(int k, int n, int m){
		if(k==m){

			for(int i=0; i<m; i++){
				System.out.print(arr[i]+1+" ");
			}
			System.out.println();
			return;
		}
		
		for(int i=0; i<n; i++){
			//�ߺ��� üũ�ϴ� �κ��� ���ָ� �ȴ�.
			arr[k]=i; 		
			MutiplePermutation(k+1, n, m);
			
		}
	}

	
	//�ߺ�����
	//https://www.acmicpc.net/problem/15651
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in); 
		int N=sc.nextInt(); 
		int M=sc.nextInt();
	
		arr=new int[N]; 
		MutiplePermutation(0, N, M);
	

	}

}
