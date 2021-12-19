import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


public class Practice02 {

	
	static int getParent(int[] parent, int x){
		if(parent[x]==x) return x; 
		return parent[x]=getParent(parent, parent[x]); 
	}
	
	public static void main(String[] args) throws Exception {

		int[] table={0,1,2,1}; 
		System.out.println(getParent(table, 3));

	}
}