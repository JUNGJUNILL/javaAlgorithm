package datastructure_����Ž��_��Ʈ��ŷ;

import java.util.Scanner;

public class P002_����_N��M_1 {

	//��Ʈ��ŷ �⺻ �ڵ� 
	static int N=4; //1���� 4������ ���� �ִµ� 
	static int M=2; //�ߺ� ���� 2���� �� ����
	static int[] arr=new int[10]; 
	static boolean[] isUsed=new boolean[10]; //Ư�� ���� ���������� true, false�� ��Ÿ���� �迭
	
	static void func(int k){

		for(int n : arr){
			System.out.print(n+" ");
		}
		System.out.println();
		
		if(k==M){
			for(int i=0; i<M; i++){
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
		
		for(int i=1; i<=N; i++){
			if(!isUsed[i]){
				arr[k] = i; 
				isUsed[i]=true; 
				func(k+1); 
				isUsed[i]=false;
			}
		}
	}
	
	public static void main(String[] args) {

		func(0); 
		
	}
}
