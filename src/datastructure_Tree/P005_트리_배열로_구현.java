package datastructure_Tree;

public class P005_트리_배열로_구현 {

	public static void main(String[] args) {

		
		int a = 5; 
		int[] parent = new int[a+1]; 
		
		//1 2 3 4 5 트리를 만듬 
		//노드의 부모 노드 인덱스      = i/2 
		//노드 i의 왼쪽 자식 인덱스   = 2i
		//노드 i의 오른쪽 자식 인덱스= 2i+1
		for(int i=1; i<=parent.length-1; i++){
			parent[i] = i; 
			System.out.println("노드의 요소="+parent[i] +
							   " 각 노드의 부모="+i/2+
							   " 각 노드의 왼쪽 자식 인덱스="+(2*i)+ 
							   " 각 노드의 오른쪽 자식 인덱스="+((2*i)+1));
		}
		
		//https://minhamina.tistory.com/80
//		0 1 2 3 4 5
//         
//		System.out.println(parent[parent.length-1]);

	}

}
