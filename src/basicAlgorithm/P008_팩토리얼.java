package basicAlgorithm;

public class P008_���丮�� {

	public static void main(String[] args) {

		//�̰��� ����� �ڵ���...
		
		int a=5; 
		int result = factorial(a); 
		System.out.println(result);
	}
	
	//���� n<=1�� �ش��ϴ� base case�� �����س��� ���ߴ�..
	//�ݼ�����..
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
