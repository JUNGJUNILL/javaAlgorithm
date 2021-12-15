import java.beans.Visibility;
import java.util.*;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;


public class Practice {

	static boolean[] visited=new boolean[5]; 
	static ArrayList<Integer>[] list; 
	public static void DFS(int x, int len){
		if(len==4){
			System.out.println(1);
			return; 
		}
		visited[x]=true;
		for(int i=0; i<list[x].size(); i++){
			int temp= list[x].get(i); 
			if(!visited[temp]){
				visited[temp]=true;
				DFS(temp,len+1); 
				visited[temp]=false; 
				
			}
		}
		
		/*
		 DFS(0,0) 
		 [0] = {1} 
		 FOR 0 list[0].size()==1 
		 temp list[0].get(0)==1 
		 !visited[1] true
		 visited[1]=true
		 		DFS(1,1)
		 		[1] = {0,2}
		 		FOR 0 continue 
		 			   1 list[1].size()==2
		 			   temp = list[1].get(1)==2
		 			   !visited[2] true 
		 			   visited[2]=true 
		 			   			DFS(2,2) 
		 			   			[2] = {1,3}
		 			   			for 0 list[2].get(0)==1 continue 
		 			   				 1 list[2].get(1)==3 
		 			   				 temp = list[2].get(1)==3 
		 			   				 !visited[3] true 
		 			   				 visited[3]=true
		 			   				 		  DFS(3,3)
		 			   				 		  [3] = {2,4} 
		 			   				 		  FOR 0 list[3].get(0)==2 continue 
		 			   				 		         1 list[3].get(1)==4
		 			   				 		         temp list[3].get(1)==4 
		 			   				 		         !visited[4] true 
		 			   				 		         visited[4]=true 
		 			   				 		         		  DFS(4,4)--------------´ä
		 			   				 		         		  [4] = {3} 
		 			   				 		         		  FOR 0 list[4].get(0)==3 continue
		 			   				 		         		  
		 			   				 		         visited[4]=false 
		 			   				 visied[3]=false 
		 			   visited[2]=false
		 visited[1]=false; 
		 
		  DFS(1,0)
		     
		     
		  DFS(2,0)
		  
		  
		  DFS(3,0)
		  
   
		  DFS(4,0) 
		  
		  
		 */
		
		
		
	}
	public static void main(String[] args) {

		
		list =new ArrayList[5]; 
		for(int i=0; i<5; i++){
			list[i]=new ArrayList<>(); 
		}
		list[0].add(1); 
		list[1].add(0); 
		
		list[1].add(2); 
		list[2].add(1); 
		
		list[2].add(3); 
		list[3].add(2);
		
		list[3].add(4); 
		list[4].add(3); 
//		System.out.println("size="+list[3].size());
//		for(int j=0; j<5; j++){
//			visited=new boolean[5]; 
//		
//		}
		 		
		DFS(0,0);
		DFS(1,0);
		DFS(2,0); 
		DFS(3,0); 
		DFS(4,0);
		ArrayList<Integer> list0 =new ArrayList<>(); //[1]
		ArrayList<Integer> list1 =new ArrayList<>(); //[0,2]
		ArrayList<Integer> list2 =new ArrayList<>(); //[1,3]
		ArrayList<Integer> list3 =new ArrayList<>();//[2,4]
		ArrayList<Integer> list4 =new ArrayList<>();//[3]
		
		
		list0.add(1); 
		list1.add(0); 
		
		list1.add(2); 
		list2.add(1); 
		
		list2.add(3); 
		list3.add(2);
		
		list3.add(4); 
		list4.add(3); 
	}
}






