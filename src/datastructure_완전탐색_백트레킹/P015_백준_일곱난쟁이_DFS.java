package datastructure_완전탐색_백트레킹;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class P015_백준_일곱난쟁이_DFS {
	
	static int[] numArr, visited; 
	static ArrayList<Integer> list = new ArrayList<>();
	
	public static boolean DFS(int start, int toPick, int sum){
		
		if(toPick==0 && sum==100){
			for(int i=0; i<list.size(); i++){
				System.out.println(list.get(i));
			}
			return true; 
		}
		
		for(int i=0; i<9; i++){
			if(visited[i]==0){
				visited[i]=1; 
				list.add(numArr[i]); 
				if(DFS(i,toPick-1, sum+numArr[i])==false){
					list.remove(list.size()-1);
					visited[i] = 0;
				}else{
					break; 
				}
			}
		}
		/*
		 for 9
		 0 visited[0]=0 true, visited[0]=1, ArrayList(numArr[0]==7) 
		 	
		 1
		 2
		 3
		 4
		 5
		 6
		 7
		 8
		 9
		 
		 */
		
		return false; 
	}

	public static void main(String[] args) {

			numArr = new int[9];
			visited = new int[9];
			numArr[0]=20;
			numArr[1]=7;
			numArr[2]=23;
			numArr[3]=19;
			numArr[4]=10;
			numArr[5]=15;
			numArr[6]=25;
			numArr[7]=8;
			numArr[8]=13;
			
			Arrays.sort(numArr);			
			
			DFS(0,7,0); 
		
	}

}
