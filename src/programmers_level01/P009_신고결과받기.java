package programmers_level01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

import javax.sound.sampled.Port;

public class P009_�Ű����ޱ� {
	
    static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = {};
        return answer;
    }

    //���� Ǭ ����.. 
    //�ϴ� Ʋ��������, �ð��ʰ��� ������... ��ƴ�.. 
    //�迭�� �ߺ� ��Ҹ� ��� ó���ϴ����� �����ΰ� ����.
    //https://programmers.co.kr/learn/courses/30/lessons/92334
	public static void main(String[] args) {
		
		String[] id_list={"muzi", "frodo", "apeach", "neo"}; 		
		String[] report = {"muzi frodo",
								 "apeach frodo",
								 "frodo neo",
								 "muzi neo",
								 "apeach muzi"};

		//�Ű�� �ߺ����� �� ��������, �ѹ��� �Ű��� ������ ģ��. 
		//��, report�� ��Ұ� ���� �ߺ��� ������� �ƴ��� �����ϴ� ������ �ʿ���.
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
		
		//�迭�� k�̻� �ߺ��� ��Ҹ� list�� ��Ҵ�. 
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
		
		//�Ű���� �ֵ� 
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


		//�� �ֵ��� ������ �Ű��ߴ��� �� �� �ִ� ��� 
	
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
