package silverAlgorithm;

import java.util.Scanner;

public class P006_쉽게푸는문제 {

	public static void main(String[] args) {

	  //https://www.acmicpc.net/problem/1292
	  //출력은 되지만 메모리 초과라고 뜸.. 	
	  // 아예 틀림... 
		
	  Scanner sc = new Scanner(System.in);
	  int A = sc.nextInt();
	  int B = sc.nextInt(); 
		
		String result=""; 
		for(int i=1; i<=B; i++){
			for(int j=0; j<i; j++){
				result = result+String.valueOf(i); 
			}
		}
		String test =result.substring(A-1, B); 
		
		int hello=0; 
		for(int i=0; i<test.length(); i++){
			hello=hello+(test.charAt(i)-'0');
		}
		System.out.println(hello);
		
		
	}

}
