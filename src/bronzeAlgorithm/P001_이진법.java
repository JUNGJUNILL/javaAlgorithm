package bronzeAlgorithm;

import java.util.Scanner;

public class P001_이진법 {

	public static void main(String[] args) {
				
		/*
		문제
		양의 정수 n이 주어졌을 때, 이를 이진수로 나타냈을 때 1의 위치를 모두 찾는 프로그램을 작성하시오. 최하위 비트(least significant bit, lsb)의 위치는 0이다.
		
		입력
		첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, n이 주어진다. (1 ≤ T ≤ 10, 1 ≤ n ≤ 106)
		
		출력
		각 테스트 케이스에 대해서, 1의 위치를 공백으로 구분해서 줄 하나에 출력한다. 위치가 낮은 것부터 출력한다. 
		 */
		     Scanner sc = new Scanner(System.in);
		        
		        int N = sc.nextInt();
		        for(int i=0; i<N; i++){
		        	int Bi = sc.nextInt(); 
		        	String Bin = Integer.toBinaryString(Bi); //2진수로 바꿔주는 함수
		        	for(int j=Bin.length()-1; j>=0; j--){
		        		if(Bin.charAt(j)=='1'){
		        			System.out.print(Bin.length()-j-1+" ");
		        		}
		        	}
		        	System.out.println();
		        }
	        
	     
	}

}
