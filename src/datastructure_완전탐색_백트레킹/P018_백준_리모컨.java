package datastructure_완전탐색_백트레킹;

import java.util.*;

import javax.swing.text.Position;

public class P018_백준_리모컨 {

	//https://www.acmicpc.net/problem/1107
	//https://www.acmicpc.net/source/share/ed3372d551b749759cc79ae6dbf7845f
	
	static boolean[] broken=new boolean[10]; 
	static int possible(int c){
		
	    //반례 : 모든 경우의 정답을 구할 수 없다.
		if(c==0){
			if(broken[0]){
				return 0; 
			}else{
				return 1; 
			}
		}
		int len=0; 
		while(c>0){
			//고장난 버튼이 나오면 그 자리에서 return;
			if(broken[c%10]){
				return 0;
			}
			len+=1;
			c /=10; 
		}
		
		return len; 
		
	}
	
	public static void main(String[] args) {

		//Scanner sc =new Scanner(System.in); 
		int n=5457; 
		int m=3;
		//broken={F,F,F,F,F,F,T,T,T,F]
		broken[6]=true;
		broken[7]=true;
		broken[8]=true;
//		for(int i=0; i<m; i++){
//			int x = sc.nextInt(); 
//			broken[x]=true; 
//		}
		
		//정답의 초기값
		//현재 채널은 100이다.
		int ans =n -100; 
		if(ans<0){
			ans = -ans; 
		}

		
		for(int i=0; i<=1000000; i++){
			int c=i; //숫자 버튼만 이용
			int len = possible(c);//숫자버튼 누른 횟수 
			
			if(len>0){
				int press=c-n; 
				//5445-5357
	
				if(press<0){
					System.out.println("c="+c+" len="+len+" 몇번도냐?="+i);

					press = -press;
					//12
				}
				
				if(ans>len+press){
	
					System.out.println("c="+c+" len="+len+" 몇번도냐?="+i);
					ans = len+press;
	
				}
			}	
		}
		
		System.out.println(ans);
	}
	


}
