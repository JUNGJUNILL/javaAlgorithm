package silverAlgorithm;

public class P002_최대공약수와최소공배수 {


	public static void main(String[] args) {
		// https://www.acmicpc.net/problem/2609
		// 최대공약수란, https://calcproject.tistory.com/225
		// 최소공배수란, https://ko.khanacademy.org/math/cc-sixth-grade-math/cc-6th-factors-and-multiples/cc-6th-lcm/a/least-common-multiple-review
		
		//유클리드 호제법이라는 300년전에 만들어진 알고리즘을 활용해야 한다. 
		//gcd, lcm 이라는 것을 알아야 한다. 
		//gcd(x,y) 라고 할 때 x와 y는 최대공약수 라는 뜻이고
		//lcm(x,y) 라고 하면  x와 y는 최소공배수를 뜻한다. 
		
		
		int a =24;
		int b =18;
		System.out.println(gcd(a,b)); 
		System.out.println(lcm(a,b));
		
		
		
		}
	
	//최대공약수  
	public static int gcd(int a, int b){
		while(b>0){
			
				int temp = b; 
				b = a % b;
				a = temp; 
			
			}
		
		//18 > 0 true 
		//temp=18
		//b = 24 % 18 6
		//a=18
		
		//6 > 0 true 
		//temp=6
		//b = 24 % 6 0 ==>나머지가 0이 됐을 때, 마지막 계산에서 나누는 수로 사용된 6이 24와 16의 최대공약수가 된다. 
		//             ==>간단하게 말하면, 유클리드 호제법은 MOD 연산을 반복하면 된다. 
		//a=6
		
		
		//0 > 0 false 
		//return 6; 
		
		
		
		return a; 
		}
	
	//최소 공배수 
	//최소공배수 = 0이 아닌 두 수의 곱 / 두 수의 최대공약수 
	public static int lcm(int a, int b){
		return (a*b) / gcd(a,b); 
	}
	

}
