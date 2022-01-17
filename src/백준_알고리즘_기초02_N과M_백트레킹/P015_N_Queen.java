package ����_�˰���_����02_N��M_��Ʈ��ŷ;

public class P015_N_Queen {

	static int N; 
	static int[] cols;
	
	static int queens(int level){
		//level�� 0�� ���� promising�� �ݵ�� 1�� ��ȯ �� ���̴�.
		if(promising(level)==0){
			return 0; 
		
		//������ ���ǰ� ���� �� ���� ���
		}else if(level==N){	
			return 1; 
		}
		
		int answer=0; 	
		for(int i=1; i<=N; i++){
			cols[level+1]=i; 	

			answer+=queens(level+1);
					
		}
		return answer;
	}
	
	//���鰣�� �浹�� ������ �ִ°�?
	//1���� level-1 ������ 
	//level ���� �浹�ϴ��� Ȯ��
	static int promising(int level){
		
		//�������� ���� ���� ������ ���� �ٸ� �����
		//�浹�ϴ��� �˻��ϴ� ������ ���
		for(int i=1; i<level; i++){
			
			//���� ���� �������� �˻� 
			if(cols[i]==cols[level]){
				return 0; 
				
			//�밢���� ��������
			}else if(level-i == Math.abs(cols[level]-cols[i])){
				return 0; 
			}
		}
		
		return 1; 
		
	}
	
	
	public static void main(String[] args) {
		N=4; 
		cols=new int[N+1]; 
		
		System.out.println(queens(0));
		
	}
	

}
