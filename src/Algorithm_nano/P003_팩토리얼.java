package Algorithm_nano;

public class P003_���丮�� {
	
	public static int factorial(int x){
		
		//0! 1
		//1! 1
		//3! 6
		//5! 120
 
		//����Լ��� baseCase
		if(x==0){
			return 1;
		}else{
			return x*factorial(x-1);
		}

	}
	public static void main(String[] args) {
		System.out.println(factorial(5));
		
		/*
		 x�� 5�� ���.. 
		 5 * factorial(4) =24 =120 
		 4 * factorial(3) =6   =24 
		 3 * factorial(2) =2   = 6
		 2 * factorial(1) =1   = 1
		 1 * factorial(0) =1   = 1 
		 */
	}
}
