package javaBasic;

import java.util.*;

public class P005_charAt {

	//이분그래프인지 아닌지 판별하는 함수 DFS
	public static boolean DFS(ArrayList<Integer>[] a, int[] color, int x, int c){
		color[x]=c; 
		for(int y : a[x]){
			if(color[y]==0){
					if(!DFS(a,color,y,3-c)){
						return false; 
					}
			}else if(color[x]==color[y]){
				return false; 
			}
		}
		return true; 
	}
	
	public static void main(String[] args) {
		
		int n=3; 
		ArrayList<Integer>[] list =new ArrayList[n+1]; 
		
		for(int i=1; i<=n; i++){
			list[i]=new ArrayList<Integer>(); 
		}
		list[1].add(3); 
		list[3].add(1); 
		
		list[2].add(3); 
		list[3].add(2); 
		
		int[] color=new int[n+1]; 
		boolean ok=true; 
		
		for(int i=1; i<=n; i++){
			if(color[i]==0){
				if(!DFS(list,color,i,1)){
					ok=false; 
				}
			}
		}
		
		if(ok){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
		
		
		
	}
}
