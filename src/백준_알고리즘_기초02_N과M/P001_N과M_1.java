package ����_�˰���_����02_N��M;

import java.util.Scanner;

public class P001_N��M_1 {

	
	static int[] arr; 
	static boolean[] check; 
	static void Permu(int k, int kind, int MAX){
		if(k==kind){
			for(int i=0; i<kind; i++){
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
		
		for(int i=1; i<=MAX; i++){
			if(!check[i]){
				arr[k]=i; 
				check[i]=true;
				Permu(k+1, kind, MAX);
				check[i]=false; 
			}
		}
		
	}
	
	//���� �����̴�.
	//https://www.acmicpc.net/problem/15649
	//http://codeplus.codes/ca1af2d3cdd04f3b9fc5ad9810d9770c
	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in); 
		int N=sc.nextInt(); 
		int M=sc.nextInt();
		
		arr=new int[N+1]; 
		check=new boolean[N+1]; 
		
		
		Permu(0,M,N); 
		
		
		
		
		
		
	}
}
