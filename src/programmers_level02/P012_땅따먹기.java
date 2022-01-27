package programmers_level02;

import java.util.ArrayList;

public class P012_땅따먹기 {

//   static int solution(int[][] land) {
//        int answer = 0;
//
//        System.out.println("Hello Java");
//
//        return answer;
//    }

	static int[][] graph={
					{1,2,3,5},
					{5,6,7,8},
					{4,3,2,1}
					};
	
	
	
	//https://programmers.co.kr/learn/courses/30/lessons/12913
	public static void main(String[] args) {

		//일단 1차원 배열에서 배열의 최대값을 구하려면?
		
		int[] array={2,3,76,99}; 
		int hello=0; 
		int index=0; 
		for(int i=0; i<array.length; i++){
			
			if(hello<array[i]){
				hello=array[i]; 
				index=i; 
			}
			
		}
		//System.out.println(hello+" : "+index);
		//int max=0; 
		int temp=0; 
		int idx=-1; 
		String world="";
		int[] maxArray=new int[graph.length]; 
		for(int i=0; i<graph.length; i++){
			
			int max=0; 
			for(int j=0; j<graph[i].length; j++){

				if( i!=0 && String.valueOf(j).contains(world)) break; 
				if(max<graph[i][j]){
					max=graph[i][j]; 
					idx=j; 
				}
			}
			world+=idx; 
			temp+=max; 
			
		}
		System.out.println(world);
		
		System.out.println(temp+ " : "+idx);
		
		
	}
}
