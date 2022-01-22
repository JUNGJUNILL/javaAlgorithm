package programmers_level02;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;

public class P004_주차요금계산 {

	public static int[] solution(int[] fees, String[] records) {
       
        

        
		Arrays.sort(records, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.split(" ")[1].compareTo(o2.split(" ")[1]);
			}
		});
		
		
        Queue<String> q=new LinkedList<>(); 
		for(int i=0; i<records.length; i++){
			
			if(!q.contains(records[i].split(" ")[1])){
				q.add(records[i].split(" ")[1]);
			}
		}
		 int[] answer =new int[q.size()];


	
		int count=0;
		while(!q.isEmpty()){
			//주차시간
			int minSum =parkingTime(q.poll(),records);
			
			//주차요금
			int price=0;
			if(minSum <= fees[0]){
				price = fees[1]; 
			}else{
				price = ( (int)Math.ceil((minSum-fees[0]) /(float)fees[2]) * fees[3])+fees[1];
				
			}
			System.out.println("price="+price);
			answer[count]=price;
			count++;
			
		}
		

		
		
    
 	   return answer; 
 	  
    }
	
	static int parkingTime(String carNo, String[] records){
		
		LocalTime startTime=null;
		LocalTime endTime =null;
		Duration between =null;
		ArrayList<String> list =new ArrayList<>(); 
		for(int i=0; i<records.length; i++){
			if(records[i].contains(carNo)){
				list.add(records[i]); 
			}
		}
		
		int startHour=0; 
		int startMin=0;
		int endHour=0;
		int endMin=0;
		int minSum=0;
			
		for(int i=0; i<list.size(); i++){
			
			if(list.get(i).contains("IN")){
			
				startHour=Integer.parseInt(list.get(i).split(" ")[0].split(":")[0]);
				startMin=Integer.parseInt(list.get(i).split(" ")[0].split(":")[1]);
				startTime=LocalTime.of(startHour, startMin);
				
				
				//마지막 배열의 요소에 OUT이 없으면 23:59에 출차한 것으로 간주한다.
				if(i==list.size()-1 && list.get(i).contains("IN")){
					endHour=23;
					endMin=59; 
				}else{
					endHour=startHour;
					endMin=startMin; 
				}
				endTime=LocalTime.of(endHour, endMin);
		
			}else if(list.get(i).contains("OUT")){
				endHour=Integer.parseInt(list.get(i).split(" ")[0].split(":")[0]);
				endMin=Integer.parseInt(list.get(i).split(" ")[0].split(":")[1]); 
				endTime=LocalTime.of(endHour, endMin);	
			}

			between= Duration.between(startTime, endTime); 
			minSum+=between.getSeconds()/60;

		}
		
		return minSum;
	}
	//https://programmers.co.kr/learn/courses/30/lessons/92341
	public static void main(String[] args) {
		
		//기본시간
		//기본요금
		//단위시간
		//단위요금
		int[] fees = {1	,461,	1	,10}; 
		String[] records={
				"00:00 1234 IN"
		};
		System.out.println(parkingTime("1234", records));
		
//		int[] fees = {
//				180, 5000, 10, 600
//		};
//
//		String[] records={
//				"05:34 5961 IN", 
//				"06:00 0000 IN", 
//				"06:34 0000 OUT", 
//				"07:59 5961 OUT", 
//				"07:59 0148 IN", 
//				"18:59 0000 IN", 
//				"19:09 0148 OUT", 
//				"22:59 5961 IN", 
//				"23:00 5961 OUT"	
//		};
		


		for(int index : solution(fees, records)){
			System.out.println(index);
		}
	
		
		
		

		
		
	}

}
