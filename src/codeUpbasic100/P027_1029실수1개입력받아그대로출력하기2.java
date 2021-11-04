package codeUpbasic100;

import java.util.Scanner;
import java.util.Stack;
import java.util.concurrent.SynchronousQueue;

public class P027_1029실수1개입력받아그대로출력하기2 {

	public static void main(String[] args) {

		float f = 3.14159265359f; 
		//명시적 형변환
		//float 4byte 
		//3.14159265359 이 숫자는 4byte이상의 숫자이므로 
		//큰걸 작은거에 담을대는 명시적으로 지정을 해 주어야 한다.
		
			
		double abc = 3.14159265359;
		System.out.println(f);
		System.out.println(abc);
	}

}
