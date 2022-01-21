package programmers_level01;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class P007_제일작은수제거하기 {
	
    public static int[] solution(int[] arr) {
       
    	if(arr.length==1) return new int[]{-1}; 
    	int minindex = 0; 
	
    	for(int i=0; i<arr.length; i++){
    		if(arr[minindex] > arr[i]){
    			minindex=i; 
    		}
    	}
		
		int[] answer=new int[arr.length-1]; 
		int cnt=0; 
		//minindex==3 
		System.out.println(minindex);
		for(int i=0; i<arr.length; i++){
			if(i==minindex) continue; 
			answer[cnt]=arr[i]; 
			cnt++;
		}
	
		return answer; 

        
    }
	
	//https://programmers.co.kr/learn/courses/30/lessons/12935
	public static void main(String[] args) {
		
		int[] arr={5,1,2,4};

		for(int i : solution(arr)){
			System.out.println("아이="+i);
		}
		

	}
}
