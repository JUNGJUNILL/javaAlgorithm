package bronzeAlgorithm;

import java.util.Scanner;


public class P007_�Ǻ���ġ��5 {

	public static void main(String[] args) {
		//https://www.acmicpc.net/problem/10870
		//��Ŀ��... 
		
		Scanner sc = new Scanner(System.in);
		int value=sc.nextInt(); 
		int a = fibonacci(value); 
		System.out.println(a);
	}
	
	public static int fibonacci(int a){
		
		if(a<2){
			return a; 
		}else{
			return fibonacci(a-1) + fibonacci(a-2); 
		}
		
	}
	
	//���� 3 �Է½�        2�� ��� �� ���̴�. 
	// 3 < 2 false 
	// f(2) + f(1) return 1 
	// f(1) + f(0) return 1+0
	
	
	//10�� �ԷµǾ��ٰ� �����ϸ� 10�� 2���� ���� �� ���� ��� ���� �� ���̰�.. 
	//f(10)= f(9)+f(8) = 34+21=55
	
	//f(9) = f(8)+f(7) = 21+13=34
	
	//f(8) = f(7)+f(6) = 13+8=21
	
	//f(7) = f(6)+f(5) = 8+5=13
	
	//f(6) = f(5)+f(4) = 5+3=8
	
	//f(5) = f(4)+f(3) = 3+2=5
	
	//f(4) = f(3)+f(2) = 2+1=3
	
    //f(3) = f(2)+f(1) = 1+1=2
	
	//f(2) = f(1)+f(0) = 1
	
	//f(1) = 1
}
