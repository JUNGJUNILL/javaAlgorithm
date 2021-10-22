package silverAlgorithm;

public class P002_�ִ��������ּҰ���� {


	public static void main(String[] args) {
		// https://www.acmicpc.net/problem/2609
		// �ִ�������, https://calcproject.tistory.com/225
		// �ּҰ������, https://ko.khanacademy.org/math/cc-sixth-grade-math/cc-6th-factors-and-multiples/cc-6th-lcm/a/least-common-multiple-review
		
		//��Ŭ���� ȣ�����̶�� 300������ ������� �˰����� Ȱ���ؾ� �Ѵ�. 
		//gcd, lcm �̶�� ���� �˾ƾ� �Ѵ�. 
		//gcd(x,y) ��� �� �� x�� y�� �ִ����� ��� ���̰�
		//lcm(x,y) ��� �ϸ�  x�� y�� �ּҰ������ ���Ѵ�. 
		
		
		int a =24;
		int b =18;
		System.out.println(gcd(a,b)); 
		System.out.println(lcm(a,b));
		
		
		
		}
	
	//�ִ�����  
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
		//b = 24 % 6 0 ==>�������� 0�� ���� ��, ������ ��꿡�� ������ ���� ���� 6�� 24�� 16�� �ִ������� �ȴ�. 
		//             ==>�����ϰ� ���ϸ�, ��Ŭ���� ȣ������ MOD ������ �ݺ��ϸ� �ȴ�. 
		//a=6
		
		
		//0 > 0 false 
		//return 6; 
		
		
		
		return a; 
		}
	
	//�ּ� ����� 
	//�ּҰ���� = 0�� �ƴ� �� ���� �� / �� ���� �ִ����� 
	public static int lcm(int a, int b){
		return (a*b) / gcd(a,b); 
	}
	

}
