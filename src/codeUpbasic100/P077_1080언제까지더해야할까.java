package codeUpbasic100;

import java.util.*;

public class P077_1080언제까지더해야할까 {
	
//	static int temp=0; 
//	
//	static int recursive(int x){
//		if(x==0) return 0; 
//		recursive(x-1);
//		temp=temp+x; 
//		return temp;
//	}
	
	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in); 
		int num=sc.nextInt(); 
		int temp=0; 
		int temp01=0;
		for(int i=1; i<=num; i++){
			temp=temp+i; 
			System.out.println("아이="+i+" temp="+temp+" num="+num);
			if(temp>=num){
				 temp01=i; 
				 break;
			}
		}
		//어디까지 더해야 입력한 수보다 같거나 커질까?
		System.out.println(temp01);
	
	}
}
