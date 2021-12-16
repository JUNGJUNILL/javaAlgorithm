package ����_�˰���_����02;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class P007_�׷���1_�̺б׷��� {
	
	
	//3-c 
	//(3-1)1->2�� �ٲܼ� �ְ�, 
	//(3-2)2->1�� �ٲ� �� �ִ�.
	public static boolean DFS(ArrayList<Integer>[] a,int[] color,int x, int c){
		
		color[x]=c; 
		for(int y : a[x]){
			if(color[y] == 0){
				
				if(!DFS(a,color,y,3-c)){
					return false; 
				}
				
			}else if(color[y]==color[x]){
				return false; 
			}
			
		}
		return true; 
		
		
	}

	public static void main(String[] args) {
		
		int n=3; 
		int m=2; 
		ArrayList<Integer>[] a=(ArrayList<Integer>[])new ArrayList[n+1]; 
		
		for(int i=1; i<=n; i++){
			a[i]=new ArrayList<Integer>(); 
		}
		
		/*1, 3
		  2, 3
		 */
		a[1].add(3); 
		a[3].add(1); 
		
		a[2].add(3); 
		a[3].add(2); 
		
		int[] color=new int[n+1]; 
		boolean ok=true; 
		
		for(int i=1; i<=n; i++){
			if(color[i]==0){
				if(!DFS(a,color,i,1)){
					ok=false; 
				}
			}
		}
		
		   if (ok) {
               System.out.println("YES");
           } else {
               System.out.println("NO");
           }
		
	
	}
}