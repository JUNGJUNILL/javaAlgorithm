package datastructure_Graph;

public class Main {

	public static int getParent(int[] parent, int a){
		
		if(parent[a]==a){return a;}
		return parent[a] = getParent(parent, parent[a]); 
		
		
	}
	
	
	public static void main(String[] args) {

		

	}

}
