package datastructure_����Ž��_��Ʈ��ŷ;

public class P022_����_123���ϱ� {
	
	//���Ƿ� ��ǰ 
	//�ϴ� ó���� ��� �ؾ����� ���� �� �𸣰���. 
	//���� Ǯ�̹��鿡�� ����Լ�(����Ž��)���� Ǯ����. 
	//����Ž���� ������ ����Լ��� ������? ��� ������ �� ������ ����.
	
	static int cnt=0;
	
	static void DFS(int num){
		
		if(num==0){
			cnt++;
			return;
			
		}else{
			
			if(num-1 >=0){
				DFS(num-1); 
			}
			if(num-2 >=0){
				DFS(num-2); 
			}
			if(num-3 >=0){
				DFS(num-3); 
			}
			
		}
		
	}
	
	

	//https://www.acmicpc.net/problem/9095
	public static void main(String[] args) {

	
		int[] arr={1,2,3}; 
		
		int num=4; 
		

		DFS(4); 
	
		System.out.println(cnt);

	}

}
