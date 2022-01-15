package 백준_알고리즘_기초02_N과M_백트레킹;

import java.util.Scanner;

public class P013_N_Queen {
	
	static int N; 
	static int[] vx=new int[16]; 
	static int[] vy=new int[16];
	
	static int go(int y, int x){
		
		for(int i=0; i<y; i++){
			if(y==vy[i] || x==vx[i]) return 0; 
			if(Math.abs(x-vx[i]) == Math.abs(y-vy[i])) return 0; 
		}
		
		if(y== N-1) return 1; 
		vy[y]=y;
		vx[y]=x; 
		
		
		int answer=0; 
		for(int i=0; i<N; i++){
			answer+=go(y+1, i); 
		}
		
		return answer; 
		
		
	}

	//https://st-lab.tistory.com/118
	//https://sevity.tistory.com/113?category=806671
	//https://www.acmicpc.net/problem/9663
	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in); 
		N=sc.nextInt(); 
		
		int temp=0;
		for(int i=0; i<N; i++){
			temp+=go(0, i);
		}
		System.out.println(temp);
	}

}
