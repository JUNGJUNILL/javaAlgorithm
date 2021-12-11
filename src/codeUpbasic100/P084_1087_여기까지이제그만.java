package codeUpbasic100;

import java.util.Scanner;

public class P084_1087_여기까지이제그만 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in); 
		int num=sc.nextInt(); 
		int temp=0; 
		while(true){
			
			for(int i=1; i<=num; i++){
				temp+=i; 
				if(num<=temp) break;
			}
			
			if(temp != 0) break;
		}
		
		System.out.println(temp);
	}

}
