package datastructure_Tree;

public class P005_Ʈ��_�迭��_���� {

	public static void main(String[] args) {

		
		int a = 5; 
		int[] parent = new int[a+1]; 
		
		//1 2 3 4 5 Ʈ���� ���� 
		//����� �θ� ��� �ε���      = i/2 
		//��� i�� ���� �ڽ� �ε���   = 2i
		//��� i�� ������ �ڽ� �ε���= 2i+1
		for(int i=1; i<=parent.length-1; i++){
			parent[i] = i; 
			System.out.println("����� ���="+parent[i] +
							   " �� ����� �θ�="+i/2+
							   " �� ����� ���� �ڽ� �ε���="+(2*i)+ 
							   " �� ����� ������ �ڽ� �ε���="+((2*i)+1));
		}
		
		//https://minhamina.tistory.com/80
//		0 1 2 3 4 5
//         
//		System.out.println(parent[parent.length-1]);

	}

}
