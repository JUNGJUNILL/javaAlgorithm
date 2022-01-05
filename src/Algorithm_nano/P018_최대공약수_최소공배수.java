package Algorithm_nano;

public class P018_최대공약수_최소공배수 {

	
	//https://math100.tistory.com/135
	
	//최대공약수
	//유클리드 호제법
	static int gcd(int a, int b){
		while(b>0){
			int temp = b; 
			b=a % b; 
			a = temp; 
		}
		return a; 
	}
	
	//최소공배수
	static int lcm(int a, int b){
		return (a*b) / gcd(a,b); 
	}
	
	public static void main(String[] args) {

		System.out.println(gcd(2,14));
		System.out.println(lcm(8,14));
		
	}

}
