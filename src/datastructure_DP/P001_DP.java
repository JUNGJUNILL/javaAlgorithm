package datastructure_DP;

public class P001_DP {
	
	//Tip
	//��� ���� �𸣰�����, �ϳ��� �׷����鼭 ��Ģ ã�� 
	//��ȭ���� ��Ȯ�ϰ� ����� �ڵ� ¥�� 
	//��ȭ�� �ȼ���� �ڵ���� ¥�� ����� ��Ǭ��.
	
	//�ϳ��� ������ �� �ѹ��� Ǯ���� �ϴ� �˰���
	//ū ������ ���� ������ ���� �� �ִ�. 
	//���� �������� ���� ������ �װ��� ������ ū ���������� �����ϴ�.
	
	//�޸����̼�
	public static int[] arr=new int[100]; 
	public static int dp(int x){
		if(x==1)return 1;
		if(x==2)return 1; 
		if(arr[x] !=0) return arr[x]; 
		return arr[x] = dp(x-1) + dp(x-2); 
		
	}

	public static void main(String[] args) {

		System.out.println(dp(10));
		
		Fibonacci f = new Fibonacci(); 
		System.out.println(f.fibonacciBottomUp(30));

		
	}

}

//���Ҿ� ���
class Fibonacci{
	
	int arr[] =new int [100]; 
	public Fibonacci(){
		arr[1]=1; 
		arr[2]=1; 
	}
	
	public int fibonacciBottomUp(int x){
		
		for(int i=3; i<=x ; i++){
			arr[i] = arr[i-1] + arr[i-2]; 
		}
		return arr[x]; 
	}
	
	
}
