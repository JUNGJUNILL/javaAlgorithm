package datastructure_완전탐색_백트레킹;

import com.sun.org.apache.bcel.internal.generic.BREAKPOINT;

public class P017_백준_날짜계산 {

	//https://www.acmicpc.net/problem/1476
	public static void main(String[] args) {

		/*
		 이 세 수는 서로 다른 범위를 가진다
		 지구 E  1 ≤ E ≤ 15
		 태양 S  1 ≤ S ≤ 28
		 달   M  1 ≤ M ≤ 19
		 */
		
		int num=1; 
		int E=15; 
		int S=28; 
		int M=19; 
		
		int insertE=1;
		int insertS=2; 
		int insertM=3;
		
		int ee=1;
		int ss=1;
		int mm=1;
		
		
		int index=0; 
		while(true){
			index++; 
			if(insertE==1 && insertS==1 && insertM==1) break; 
			
			for(int e=1; e<=index; e++){
				if(e % E==1){
					ee=1; 
				}else{
					ee++; 
				}
			}
			
			for(int s=1; s<=index; s++){
				if(s % S==1){
					ss=1; 
				}else{
					ss++; 
				}
			}
			
			for(int m=1; m<=index; m++){
				if(m % M==1){
					mm=1; 
				}else{
					mm++; 
				}
			}
			
			if(ee==insertE && ss==insertS && mm==insertM)break;
			
		
		}
		System.out.println(index);
		
//		for(int i=1; i<=num; i++){		
//		 
//			if(i % E==1){
//				ee=1;
//			}else{
//				ee++; 
//			}
//			
//			if(i % S==1){
//				ss=1;
//			}else{
//				ss++; 
//			}
//			
//			if(i % M==1){
//				mm=1;
//			}else{
//				mm++; 
//			}
//		}
		
		
		
		

		
		
		
	}
}
