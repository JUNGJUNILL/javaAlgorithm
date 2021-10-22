package basicAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class P009_약수 {


	public static void main(String[] args) {

//		int a = 78;  // 1,2,4,8,16  			    16의 약수
//       			 // 1,2,4,8      			 8의 약수 
//					// 1,2,3,13,26,39,78		78의 약수
		
				    
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		
		//큰수를 얻으려면 가장 작은 수와 비교하고
		//가장 작은 수를 얻으려면 가장 큰 수와 비교해야 한다.
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
	
		
		for(int i=0; i<T; i++){
			int N = in.nextInt();
			max = N > max ? N : max;
			min = N < min ? N : min;
		}
		

		
		System.out.println(max * min);
		
	}

}
