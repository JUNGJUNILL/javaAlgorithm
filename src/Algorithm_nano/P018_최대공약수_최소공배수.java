package Algorithm_nano;

public class P018_�ִ�����_�ּҰ���� {

	
	//https://math100.tistory.com/135
	
	//�ִ�����
	//��Ŭ���� ȣ����
	static int gcd(int a, int b){
		while(b>0){
			int temp = b; 
			b=a % b; 
			a = temp; 
		}
		return a; 
	}
	
	//�ּҰ����
	static int lcm(int a, int b){
		return (a*b) / gcd(a,b); 
	}
	
	public static void main(String[] args) {

		System.out.println(gcd(2,14));
		System.out.println(lcm(8,14));
		
	}

}
