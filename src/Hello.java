import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

class Union_Find01{
	
	public int getParent(int[] parent, int x){
		if(parent[x]==x){return x;}; 
		return parent[x] =getParent(parent, parent[x]); 
	}
	
	public void unionParent(int[] parent, int a, int b){
		a = getParent(parent, a); 
		b = getParent(parent, b); 
		
		if(a<b){
			parent[b] = a; 
		}else{
			parent[a] = b; 
		}
	}
	
	public int findParent(int[] parent, int a, int b){
		
		a = getParent(parent, a); 
		b = getParent(parent, b);
		
		if(a==b){
			return 1; //서클임
		}else{
			return 0; //서클아님
		}
		
	}
}

class Edge implements Comparable<Edge>{
	
	public int[] node = new int[2]; 
	public int distance; 
	
	public Edge(int a, int b ,int distance) {
		this.node[0] = a; 
		this.node[1] = b; 
		this.distance = distance; 
	}
	
	@Override
	public int compareTo(Edge o) {
		return this.distance - o.distance; 
	}	
}

public class Hello {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		int node = sc.nextInt()+1; 
		int d = sc.nextInt(); 
		
		int[] table =new int[node]; 
		
		for(int i=1; i<node; i++){
			table[i] = i; 
		}
		
		Union_Find01 u=new Union_Find01(); 
		Vector<Edge> v =new Vector<Edge>(); 
		
		
		for(int i=0; i<d; i++){
			int v1 = sc.nextInt(); 
			int v2 = sc.nextInt(); 
			int v3  = sc.nextInt(); 
			v.add(new Edge(v1, v2, v3)); 
		}
		
		Collections.sort(v);
		
		int sum =0; 

		for(int i=0; i<v.size(); i++){
			
			if(u.findParent(table, v.get(i).node[0], v.get(i).node[1])==0){
				
				sum+=v.get(i).distance; 
				u.unionParent(table, v.get(i).node[0], v.get(i).node[1]);
				
			}		
		}
		
		System.out.println(sum);
	
	}
}
