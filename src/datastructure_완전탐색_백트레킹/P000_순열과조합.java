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
	static int[] arr01; 
	static boolean[] check01; 
	static void Permutation(int k,int n, int m){
		if(k==m){
			for(int i=0; i<m; i++){
				System.out.print(arr01[i]+1+" ");
			}
			System.out.println();
		}
		
		for(int i=0; i<n; i++){
			if(!check01[i]){
				arr01[k]=i; 
				check01[i]=true;
				Permutation(k+1, n, m);
				check01[i]=false; 
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
	
	static int[] arr02; 
	static boolean[] check02; 
	static void Combination(int k, int s, int n, int m){
		if(k==m){
			for(int i=0; i<m; i++){
				System.out.print(arr02[i]+1+" ");
			}
			System.out.println();
		}
		
		for(int i=s; i<n; i++){
			if(!check02[i]){
				arr02[k]=i; 
				check02[i]=true;
				Combination(k+1, i+1, n, m);
				check02[i]=false; 
			}
		}
		
		
	}
	
	
	
	public static void main(String[] args) {

		arr01=new int[5]; 
		check01=new boolean[5]; 
		
		//Permutation(0, 5, 5);
		
		System.out.println();
		
		arr02=new int[3]; 
		check02=new boolean[3]; 
		
		Combination(0, 0, 3, 3);
		
	}

}
