package bronzeAlgorithm;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class P003_�ּ��ִ� {

	public static void main(String[] args) {

		/*
		 https://www.acmicpc.net/problem/10818
		����
		N���� ������ �־�����. �̶�, �ּڰ��� �ִ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
		�Է�
		ù° �ٿ� ������ ���� N (1 �� N �� 1,000,000)�� �־�����. ��° �ٿ��� N���� ������ �������� �����ؼ� �־�����. ��� ������ -1,000,000���� ũ�ų� ����, 1,000,000���� �۰ų� ���� �����̴�.
		
		���
		ù° �ٿ� �־��� ���� N���� �ּڰ��� �ִ��� �������� ������ ����Ѵ�.
		*/
		
		 Scanner sc = new Scanner(System.in);
	     int n = sc.nextInt();
	     int min = 1000000;
	     int max = -1000000; 
	     
		 int[] number = new int[n]; 
		 
		 for(int i=0; i<n; i++){
			 number[i] =sc.nextInt(); 
			 
			 //���� ū ���� ��� ���ؼ��� ���� ���� ���̶� �񱳸� �ؾ��ϰ� 
			 //���� ���� ���� ��� ���ؼ��� ���� ū ���̶� ���ؾ� �Ѵ�. 
			 //�׷��� ������ 
		     //int min = 1000000;
		     //int max = -1000000;  �̷��� ���� �� �ִ� ���̴�.
			 
			 
			 if(max < number[i])  max = number[i]; 
			//���� < 1 true max�� = 1 
			// 1 < 2 true max�� = 2
			// 2 < 3 true max�� = 3
			// 3 < 4 true max�� = 4
			// 4 < 5 true max�� = 5  �������
			 
			 if(min > number[i])  min = number[i]; 
			//1000000 > 1 true min = 1
			//  1 > 2 false min = 1
			//  1 > 3 false min = 1
			//  1 > 4 false min = 1
			//  1 > 5 false min = 1 �������
			 
			 
		 }
		 
		 System.out.println(min+" "+max);
	
	     
	}

}
