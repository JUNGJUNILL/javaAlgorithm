package datastructure_DP;

//https://www.leafcats.com/95
public class P002_�����ڸ��� {

	public static void main(String[] args) {
		//����(i) 1 2 3 4 
		//����(Pi) 1 5 8 9
		
		//���̰� 4�� ���.. 
		//���� 4�� ����� ���� �� �ִ� �ִ밪(9��) 
		//���� 3�� ����� ���� �� �ִ� �ִ밪(8��)�� ���� 1 ������ ��(1��)�� ���� ��(9��)
		//���� 2�� ����� ���� �� �ִ� �ִ밪(5��)�� ���� 2 ������ ��(5��)�� ���� ��(10��)
		//���� 1�� ����� ���� �� �ִ� �ִ밪(1��)�� ���� 3 ������ ��(8��)�� ���� ��(1��)
	
		//�� �� �ִ밪 10�� ����� �Ǿ� �Ѵ�. 
		
		//���� 4 n
		//�ִ밡�� Rn = max(Pi + Rn-1) (n�� 1���� n����) 
		
		//P1+R3  
		//P2+R2 
		//P3+R1
		//P4+R0  
		
		
		//���� 4�� ������ �ִ밪�� ���ϱ� ���ؼ� ���� 1,2,3 ������ �ִ밪�� ����
		//���� �̸� ����ϰ� �ȴ�. 
		
		Cut c01 =new Cut(); 
		System.out.println(c01.cutRod(4));
		
		Cut c02 =new Cut(); 
		System.out.println(c02.cutRod(3));
		
		Cut c03 =new Cut(); 
		System.out.println(c03.cutRod(2));

		
	}

}

//https://www.zerocho.com/category/Algorithm/post/584b979a580277001862f182
class Cut{

	int[] price ={0,1, 5, 8, 9}; 
	int[] r =new int[100]; 
	int q; 
	
	public int cutRod(int length){
		price = this.price;
		for(int j=1; j<=length; j++){
			
			q = -1; 
			
			for(int i=1; i<=j; i++){
				q = Math.max(q, price[i]+r[j-i]); 
			}
			r[j]=q;
			
		}
		return r[length]; 
		
	}
	
}
