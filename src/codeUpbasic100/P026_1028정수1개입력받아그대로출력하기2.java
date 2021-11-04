package codeUpbasic100;

import java.util.Scanner;
import java.util.Stack;
import java.util.concurrent.SynchronousQueue;

public class P026_1028정수1개입력받아그대로출력하기2 {

	public static void main(String[] args) {

		
		//long형 데이터에 대한 이해 
		//long형 8바이트 64비트 
		//2의 63승-1  양
		//2의 63승     음
		//가장 맨 앞 비트는 사인비트이다.
		
		long longData = 4294967295l; 
		//명시적 형변환
		//4294967295는 8byte보다 크다. 
		//그러므로 큰걸 작은거에 넣을 때는 
		//명시적으로 형 변환을 해 주어야 한다.
		
		System.out.println(longData);
		
		
	}

}
