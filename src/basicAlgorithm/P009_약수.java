package basicAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class P009_��� {


	public static void main(String[] args) {

//		int a = 78;  // 1,2,4,8,16  			    16�� ���
//       			 // 1,2,4,8      			 8�� ��� 
//					// 1,2,3,13,26,39,78		78�� ���
		
				    
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		
		//ū���� �������� ���� ���� ���� ���ϰ�
		//���� ���� ���� �������� ���� ū ���� ���ؾ� �Ѵ�.
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
