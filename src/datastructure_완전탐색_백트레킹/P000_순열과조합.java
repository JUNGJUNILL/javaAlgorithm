package datastructure_����Ž��_��Ʈ��ŷ;

public class P000_���������� {

	//https://coding-factory.tistory.com/607
	
	//5P2
	//���� - ���� ������ ����� ������ ��ġ�� ��� 
	
	//�߱��� �޴� 5�� �� 2���� �޴��� ������� �Դ� ����� �� 
	//���� ù��°�� ���� �޴��� ���Ϸ��� �̶� ù��° �޴��� �� �� �ִ� ����� ����
	//5���� �Դϴ�. �׸��� ���� ù���� �޴��� ������ �޴��� ������ ������ 4������
	//�޴��� �ι�°�� ���� �޴��� �����Ѵٸ� �̶��� ����� ���� 4�� �˴ϴ�.
	//�׷��Ƿ� 5���� �޴� �� 2���� �޴��� ���ʴ�� ���� ����� ���� 20(5*4)���� �Դϴ�. 
	
	//�̶� �޴��� a�� b�� �����Ͽ��ٰ� �Ѵٸ�, a,b�� �� ���� �ְ�, b,a�� �ɼ��� �ֽ��ϴ�. 
	//�Դ� ������ �ٸ��⿡ a,b�� b,a�� ������ �ٸ� ����̸�, ������ ����Ѵٴ°��� �̷� �ǹ��Դϴ�.

	
	static int menu=5; 
	static int kind =2; 
	static int[] arr=new int[menu]; 
	static boolean[] visied=new boolean[menu];
	static int temp=0; 
	
	static void Permutation(int k,int kind, int MAX){
		
		if(k==kind){
			for(int i=0; i<kind; i++){
				
				System.out.printf("%c ",arr[i]+65);
			}
			temp++;
			System.out.println();
		}
		
		for(int i=0; i<MAX; i++){
			if(!visied[i]){
				arr[k]=i; 
				visied[i]=true; 
				Permutation(k+1,kind,MAX);
				visied[i]=false; 
			}
		}
		
		
	}
	
	
	
	//���� - ���� ������ ����� ������ ���� �ʴ� ���
	//�߱��� �޴� 5�� �� 2���� �޴��� �ֹ��ϴ� ����� �� 
	//�߱����� 5���� �޴�{a,b,c,d,e}�� �ִٰ� �غ��ô�. �̶� 5���� �޴�{a,b,c,d,e}�� 
	//2���� �޴��� �ֹ��ϴ� ����� ���� ����� �������?
	//���� ù��° �޴��� ��Ź�ϴ� ����� ���� 5���� �Դϴ�. 
	//�׸��� ���� ù��° �޴��� ������ �޴��� ������ ������ 4������ �޴���
	//�ι�°�� ���� �޴��� �����Ѵٰ� �����ϸ� �̶��� ����� ���� 4�� �˴ϴ�.
	
	//�׷��Ƿ�, 5���� �޴� �� 2���� �޴��� �ֹ��ϴ� ���� 20(5*4)���� �Դϴ�.
	//�̶�, �޴��� a,b�� �����Ͽ��ٰ� �Ѵٸ�, a,b���ɼ��� �ְ� b,a�� �� ���� �ֽ��ϴ�.
	//������ a,b�� b,a�� ���� ���⿡ ������ 2!�� ���־� �޴� 5���� 2���� �޴���
	//�ֹ��� ����� ���� 10(5*4 / 2)�� �˴ϴ�.
	
	
	static boolean[] hello=new boolean[5]; 
	static int temp02=0; 
	static void Combination(int idx, int k, int kind, int[] arr){
		if(k==kind){
			
			for(int i=0; i<arr.length; i++){
				if(hello[i]){
					System.out.printf("%c ",arr[i]+65);
				}
			}
			
			temp02++;
			System.out.println();
		}		
		
		
		for(int i=idx; i<arr.length; i++){
			if(hello[i]) continue; 
			hello[i]=true;
			Combination(i, k+1, kind,arr);
			hello[i]=false; 
		}
		
		
		
	}
	
	
	
	public static void main(String[] args) {

		int[] arr={1,2,3,4,5}; 
	    int[] arr01={0,1,2}; 
		Permutation(0,3,arr.length); 
		System.out.println("temp="+temp);
		System.out.println();
		Combination(0,0,2,arr01); 
		System.out.println("temp02="+temp02);
	}

}
