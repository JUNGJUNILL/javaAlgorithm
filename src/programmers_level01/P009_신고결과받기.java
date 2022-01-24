package programmers_level01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

import javax.sound.sampled.Port;

public class P009_신고결과받기 {
	
    static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = {};
        return answer;
    }

	public static void main(String[] args) {
		
		String[] id_list={"muzi", 
						  "frodo", 
						  "apeach", 
						  "neo"}; 
		
		String[] report = {"muzi frodo",
						     "apeach frodo",
						     "frodo neo",
						     "muzi neo",
						     "apeach muzi"};
		//신고는 중복으로 할 수있지만, 한번만 신고한 것으로 친다. 
		int k=2;
		Queue<String> q=new LinkedList<>(); 
		ArrayList<String> list =new ArrayList<>(); 
		String test01=""; 
		for(int i=0; i<id_list.length; i++){
			
			int number=0; 
			for(int j=0; j<report.length; j++){
				
				if(id_list[i].contains(report[j].split(" ")[1])){
					number++; 
				}
				if(number >=k){
					list.add(id_list[i]); 
					test01+=" "+id_list[i];
					break;
				}
			}
		}
	
		System.out.println("test01="+test01);
		String[] array01=id_list.clone(); 

		
				
		for(int i=0; i<id_list.length; i++){
			
			for(int j=0; j<report.length; j++){
				
				if(id_list[i].contains(report[j].split(" ")[0])){
					array01[i]+=" "+report[j].split(" ")[1]; 
				}
			}	
		}
		
		int[] answer=new int[id_list.length]; 

		
		for(int i=0; i<array01.length; i++){
			
			int temp=0; 
			if(array01[i].split(" ").length==1) continue; 
			
			for(int n=1; n<array01[i].split(" ").length; n++){
				if(test01.contains(array01[i].split(" ")[n])){
					temp++;
				}
				answer[i]=temp; 
			}
			
		}
	
		for(int i : answer){
			System.out.println(i);
		}
		
		

	}

}
