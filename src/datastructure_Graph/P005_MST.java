package datastructure_Graph;

import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

//벡터를 오름차순으로 정렬하기 위한 Comparator 구현 
//개발자라는 직업을 택하고 3년만에 Comparator를 이해 하였다. 
class MemberComparator implements Comparator{ 
	
	public int compare(Object arg0, Object arg1) { 
		return ((Edge)arg0).distance > ((Edge)arg1).distance ?1:-1; 
		} 
}


//간선의 정보를 담는 클래스 생성 
class Edge{
	
	public int[] node=new int[2]; 
	public int distance; 
	
	public Edge(int a, int b, int distance) {
		this.node[0] =a; 
		this.node[1] =b;
		this.distance = distance; 
	}
	
	
}


public class P005_MST {
	//합집합 찾기 알고리즘 
	//https://blog.naver.com/ndb796/221230967614
	
	public static int getParent(int[] parent , int x){
		
		if(parent[x]==x){return x;}
		
		return parent[x] = getParent(parent, parent[x]); 
		
	}
	
	//두 부모 노드를 합치는 함수
	public static void uinonParent(int[] parent, int a, int b){
		a =getParent(parent,a);
		b =getParent(parent,b);
		
		if(a<b){
			parent[b]=a;
		}else{
			parent[a]=b;
		}
	}
	
	
	//같은 부모를 가지는지 확인
	//두 노드를 연결 했을 때 서클이 생기는지 안생기는지
	public static int findParent(int[] parent, int a, int b){
		
		a =getParent(parent,a);
		b =getParent(parent,b);
		
		if(a==b){
			return 1; 
		}else{
			return 0;
		}
		
	}
	

	
	public static void main(String[] args) {
		
//		int[] parent = new int[11]; 
//		
//		for(int i=1; i<=10; i++){
//			parent[i]=i;
//		}
//		
//		uinonParent(parent,1,2); 
//		System.out.printf("1과 2는 연결되어 있나요? %d\n",findParent(parent,1,2));
//
//		uinonParent(parent,2,3);
//		uinonParent(parent,3,4);
//		uinonParent(parent,5,6);
//		uinonParent(parent,6,7);
//		uinonParent(parent,7,8);
//		System.out.printf("1과 5는 연결되어 있나요? %d\n",findParent(parent,1,5));
//		uinonParent(parent, 4, 5);
//		System.out.printf("1과 5는 연결되어 있나요? %d\n",findParent(parent,1,5));
//		System.out.printf("1과 8는 연결되어 있나요? %d\n",findParent(parent,1,8));
		
		
		//크루스칼 알고리즘
		//https://blog.naver.com/ndb796/221230994142
		int n=8; 
		int m=11; 
		Vector<Edge> v = new Vector<Edge>();  
		v.add(new Edge(1,7,12)); 
		v.add(new Edge(1,4,28)); 
		v.add(new Edge(1,2,67)); 
		v.add(new Edge(1,5,17)); 
		v.add(new Edge(2,4,24)); 
		
		v.add(new Edge(2,5,62)); 
		v.add(new Edge(3,5,20)); 
		v.add(new Edge(3,6,37)); 
		v.add(new Edge(4,7,13)); 
		v.add(new Edge(5,6,45)); 
		v.add(new Edge(5,7,73)); 

		v.add(new Edge(1,7,12)); 
		
		//백터의 가중치를 오름차순으로 정렬함
		Collections.sort(v ,new MemberComparator());
		
		int[] set = new int[n]; 
		for(int i=1; i<n; i++){
			set[i]=i; 
		}
		
		int sum=0; 
		
		for(int i=0; i<v.size(); i++){
					 
			if(findParent(set,v.get(i).node[0] , v.get(i).node[1]) == 0){
				
				sum=sum+v.get(i).distance; 
				uinonParent(set,v.get(i).node[0], v.get(i).node[1]); 
			}
					
		}
		
		System.out.println(sum);
	
		
		
	}
	
	
}
