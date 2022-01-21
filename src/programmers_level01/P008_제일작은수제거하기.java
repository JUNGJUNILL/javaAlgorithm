package programmers_level01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class P008_제일작은수제거하기 {
	
    public static int[] solution(int[] arr) {
       
    	if(arr.length==1) return new int[]{-1}; 
    
    	ArrayList<Integer> list=new ArrayList<>(); 
    	for(int i : arr){
    		list.add(i); 
    	}
    	
    	Integer min=Collections.min(list); 
    	list.remove(min); 
    	
    	int[] answer=new int[arr.length-1];
    	
    	for(int i=0; i<list.size(); i++){
    		answer[i]= list.get(i); 
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
