package Algorithm_basic_Top10;
import java.util.Scanner;

public class ��Ʈ��ŷ {

	static int N;//=4; 
	static int M;//=2; 
	static int[] arr=new int[10]; 
	static boolean[] isUsed=new boolean[10]; 
	
	static void func(int k){
		/*
		for(int n : arr){
			System.out.print(n+" ");
		}
		System.out.println();
		*/
		
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
	
	
	//https://www.acmicpc.net/problem/15649
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in); 
		N = sc.nextInt(); 
		M = sc.nextInt(); 
		func(0);
	}

}
