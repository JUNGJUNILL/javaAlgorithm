package Algorithm_nano;

import java.util.Arrays;

public class P025_�ּڰ������ {

	//�� �迭���� ���Ͽ�
	//���� ���� ���� ���� ū���� ���ؼ� ���س����ٺ���
	//�� ���� ���� ���� ����� ���� ������ �Ǿ� �ִ�. 
	
	//https://programmers.co.kr/learn/courses/30/lessons/12941
	public static void main(String[] args) {
		
		
		
		int[] A={1,4,2};
		int[] B={5,4,4};
		
		int answer=0; 
		int temp=0; 
		int num01=0; 
		int num02=0; 
		
		
		Arrays.sort(A);
		Arrays.sort(B);
		
		for(int i=0; i<A.length; i++){
			int len = A.length-i-1;
			 /*
			 	0 2
			 	1 1
			 	2 0 
			 */
			num01 = num01+ A[i] * B[len]; 
			num02 = num01; 
			
		}
		answer = num02; 
		System.out.println(answer);
		
		
		for(int i=0; i<A.length; i++){
			temp+=A[i]*B[B.length-i-1]; 
		}
		System.out.println(temp);
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
