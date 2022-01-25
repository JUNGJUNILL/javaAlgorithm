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

    //내가 푼 문제.. 
    //일단 틀림나오고, 시간초과도 나오고... 어렵다.. 
    //배열의 중복 요소를 어떻게 처리하는지가 관건인거 같다.
    //https://programmers.co.kr/learn/courses/30/lessons/92334
	public static void main(String[] args) {
		
		String[] id_list={"muzi", "frodo", "apeach", "neo"}; 		
		String[] report = {"muzi frodo",
								 "apeach frodo",
								 "frodo neo",
								 "muzi neo",
								 "apeach muzi"};

		//신고는 중복으로 할 수있지만, 한번만 신고한 것으로 친다. 
		//즉, report의 요소가 전부 중복된 요소인지 아닌지 검증하는 로직이 필요함.
		ArrayList<String> overlapCheck =new ArrayList<>(); 
		for(String str : report){ 
			if(!overlapCheck.contains(str)){
				overlapCheck.add(str); 
			}
		}
		
		int reportLength = overlapCheck.size(); 
	
		int k=2;
		ArrayList<String> list =new ArrayList<>(); 
		String test01=""; 
		
		//배열의 k이상 중복된 요소를 list에 담았다. 
		for(int i=0; i<id_list.length; i++){
			
			int number=0; 
			for(int j=0; j<reportLength; j++){
				
				if(id_list[i].equals(overlapCheck.get(j).split(" ")[1])){
					number++; 
				}
				if(number >=k){
					list.add(id_list[i]); 
					break;
				}
			}
		}
		
		//신고당한 애들 
		for(String hello : list){
			System.out.println("report="+hello);
		}
		
	
		System.out.println("test01="+test01);
		//String[] array01=id_list.clone(); 

		
				
//		for(int i=0; i<id_list.length; i++){
//			
//			for(int j=0; j<reportLength; j++){
//				
//				if(id_list[i].contains(report[j].split(" ")[0])){
//					array01[i]+=" "+report[j].split(" ")[1]; 
//				}
//			}	
//		}
		
		int[] answer=new int[id_list.length]; 


		//각 애들이 누구를 신고했는지 알 수 있는 방법 
	
		for(int i=0; i<id_list.length; i++){
			
			int temp=0; 
			for(int j=0; j<report.length; j++){
				
				if(id_list[i].equals(report[j].split(" ")[0])){
					
					for(int n=0; n<list.size(); n++){
						if(report[j].split(" ")[1].equals(list.get(n))){
							temp++; 
						}
					}
				}
				answer[i]=temp; 

			}
			
		}
	
		
		for(int i : answer){
			System.out.println(i);
		}
		
		

	}

}
