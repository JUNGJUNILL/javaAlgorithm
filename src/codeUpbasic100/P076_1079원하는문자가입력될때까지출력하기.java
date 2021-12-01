package codeUpbasic100;

import java.util.*;

public class P076_1079원하는문자가입력될때까지출력하기 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		while(true){
			String s=sc.next(); 
			System.out.println(s);
			if(s.equals("q")) break; 
		}
		
	}
}
