package basicAlgorithm;

public class P008_팩토리얼 {

	public static void main(String[] args) {

		//이것이 우아한 코드지...
		
		int a=5; 
		int result = factorial(a); 
		System.out.println(result);
	}
	
	//나는 n<=1에 해당하는 base case를 생각해내지 못했다..
	//반성하자..
	public static int factorial(int n){
		if(n<=1){
			return 1;
		}else{
			return n*factorial(n-1);		
			//f(5)
			//5*f(4) =5*24=120
			
			//f(4)
			//4*f(3) =4*6
			
			//f(3)
			//3*f(2) =3*2
			
			//f(2)
			//2*f(1) =2*1
			
			//f(1)
			//1*f(0) =1*1
		}
	}

}
