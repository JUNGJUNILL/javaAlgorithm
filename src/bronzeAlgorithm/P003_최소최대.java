package bronzeAlgorithm;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class P003_최소최대 {

	public static void main(String[] args) {

		/*
		 https://www.acmicpc.net/problem/10818
		문제
		N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
		
		입력
		첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.
		
		출력
		첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
		*/
		
		 Scanner sc = new Scanner(System.in);
	     int n = sc.nextInt();
	     int min = 1000000;
	     int max = -1000000; 
	     
		 int[] number = new int[n]; 
		 
		 for(int i=0; i<n; i++){
			 number[i] =sc.nextInt(); 
			 
			 //가장 큰 값을 얻기 위해서는 가장 작은 값이랑 비교를 해야하고 
			 //가장 작은 값을 얻기 위해서는 가장 큰 값이랑 비교해야 한다. 
			 //그렇기 때문에 
		     //int min = 1000000;
		     //int max = -1000000;  이런게 나올 수 있는 것이다.
			 
			 
			 if(max < number[i])  max = number[i]; 
			//음수 < 1 true max는 = 1 
			// 1 < 2 true max는 = 2
			// 2 < 3 true max는 = 3
			// 3 < 4 true max는 = 4
			// 4 < 5 true max는 = 5  최종결과
			 
			 if(min > number[i])  min = number[i]; 
			//1000000 > 1 true min = 1
			//  1 > 2 false min = 1
			//  1 > 3 false min = 1
			//  1 > 4 false min = 1
			//  1 > 5 false min = 1 최종결과
			 
			 
		 }
		 
		 System.out.println(min+" "+max);
	
	     
	}

}
