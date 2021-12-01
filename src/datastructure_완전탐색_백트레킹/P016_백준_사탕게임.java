package datastructure_완전탐색_백트레킹;

import java.util.Scanner;

public class P016_백준_사탕게임 {


/*
알고리즘은 아래와 같습니다.

1. 양 옆을 바꾸고 제일 길게 먹을 수 있는 사탕의 길이를 파악합니다.
i) 가로로 제일 긴 사탕
ii) 세로로 제일 긴 사탕
iii) i)와 ii) 중 긴 사탕의 길이를 선택합니다.

2. 위 아래를 바꾸고 제일 길게 먹을 수 있는 사탕의 길이를 파악합니다.
i) 가로로 제일 긴 사탕
ii) 세로로 제일 긴 사탕
iii) 마찬가지로 i)와 ii) 중 긴 사탕의 길이를 선택합니다.

3. 1과 2에서 구한 길이 중 더 긴 값을 출력합니다.

출처: https://jaimemin.tistory.com/1068 [꾸준함]
*/
	static int check(char[][] a){
		
		int n=a.length; 
		int ans=1;
		
		for(int i=0; i<n; i++){
			
			int cnt = 1; 
			for(int j=1; j<n; j++){
				if(a[i][j] == a[i][j-1]){
					cnt+=1;
				}else{
					cnt=1;
				}
				if(ans < cnt) ans =cnt;
			}
			cnt=1;
			for(int j=1; j<n; j++){
				if(a[j][i]==a[j-1][i]){
					cnt+=1;
				}else{
					cnt=1;
				}
				if(ans <cnt) ans = cnt;
			}
			
			
		}
		
		return ans;

		
	}
	
	
	//https://www.acmicpc.net/problem/3085
	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in); 
		int num=sc.nextInt();
		char[][] a = new char[num][num]; 
		for(int i=0; i<num; i++){
			a[i]=sc.next().toCharArray(); 
		}
		int ans=0; 
		for(int i=0; i<num; i++){
			for(int j=0; j<num; j++){
				if(j+1 < num){
					char t=a[i][j]; 
					a[i][j]=a[i][j+1]; 
					a[i][j+1]=t; 
					int temp=check(a); 
					if(ans<temp) ans=temp; 
					t=a[i][j]; 
					a[i][j] =a[i][j+1]; 
					a[i][j+1]=t; 
				}
				if(i+1<num){
					char t=a[i][j]; 
					a[i][j]=a[i+1][j]; 
					a[i+1][j]=t; 
					int temp = check(a); 
					if(ans<temp) ans=temp; 
					t=a[i][j];
					a[i][j] = a[i+1][j]; 
					a[i+1][j]=t; 
				}
			}
		}
		System.out.println(ans);
		
	}

}
