package datastructure_Graph;

public class P004_UNION_FIND {

	public static void main(String[] args) {
		
		Union_Find u =new Union_Find(); 
		int[] parent = new int[11]; 
		
		for(int i=1; i<=parent.length-1; i++){
			parent[i] = i; 
		}
		
		u.unionParent(parent, 1,2);
		u.unionParent(parent, 2,3);
		u.unionParent(parent, 3,4);

		u.unionParent(parent, 5,6);
		u.unionParent(parent, 6,7);
		u.unionParent(parent, 7,8);
		
		u.findParent(parent, 1 ,5);
		
		u.unionParent(parent, 1,5);
	
		u.findParent(parent, 1 ,5);
	}

}

class Union_Find{
	
	public int getParent(int[] parent , int x){
		
		if(parent[x] == x){return x;}
		return parent[x] = getParent(parent, parent[x]); 

	}
	
	public void unionParent(int[] parent , int a , int b){
		a = getParent(parent, a); 
		b = getParent(parent, b); 
		
		if(a<b)parent[b] = a; 
		else parent[a] = b; 
		
	}
	
	public void findParent(int[] parent,int a, int b){
		a=getParent(parent,a); 
		b=getParent(parent, b); 
		
		if(a==b) System.out.println(a+"와 "+b+"는 연결되어 있다.");
		else  System.out.println(a+"와 "+b+"는 연결되어있지 않다."); 
	}
	
	
}
