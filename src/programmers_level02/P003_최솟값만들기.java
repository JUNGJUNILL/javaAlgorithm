package programmers_level02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class P003_최솟값만들기 {

    static int solution(int []A, int []B){
        int answer = 0;
        
        int temp=0;
        int minInteger=Integer.MAX_VALUE; 
        
        for(int a : A){
        	for(int i=0; i<B.length; i++){      		
        		temp = a*B[i]; 
        		minInteger = 	minInteger > temp ? temp : minInteger;         	
        		
        	}
        }
        
        
        

      

        return answer;
    }
    //https://programmers.co.kr/learn/courses/30/lessons/12941
	public static void main(String[] args) {
		
		int[] A={1,2};
		int[] B={3,4};
		int length=A.length;
		int[][] Array=new int[length][length]; 
		int[][] hello=new int[length][length]; 
		int minInteger=Integer.MAX_VALUE; 
		int temp=0; 
		
		Stack<Integer> stack=new Stack<>(); 
		Queue<Integer> q=new LinkedList<>(); 
		
		
		for(int i=0; i<length; i++){
			for(int j=0; j<length; j++){
				Array[i][j] = A[i]*B[j]; 
			}
		}
		

		
		for(int k=0; k<length; k++){
			
			if(k==0){
				temp+=Array[k][k];	
			}else{
				
				while(!stack.isEmpty()){
					int count=0;
					count=count+1;
					temp+=Array[count][stack.pop()]; 
				}
				
				while(!q.isEmpty()){
					int count=0; 
					count=count+1;
					temp+=Array[count][q.poll()]; 
				}
				minInteger=minInteger>temp?temp:minInteger; 
				
			}
			
			System.out.println(temp);
			for(int i=0; i<length; i++){
				
				if(k!=i){
					stack.push(i); 
					q.add(i); 
				}	
			}
		}

		System.out.println(minInteger);
		

        /*
        이게 실행되도록 코드를 짜야한다. 
        
        5,4,4              index=0
         
        20,16,16          index=1,2
        				   index=1, index=2
        10,8,8            index=2, index=1 
        5+16+8   =29
        5+16+10  =31
        
        
        5,4,4              index=1
         
        20,16,16          index=0,2
        				   index=0, index=2
        10,8,8            index=2, index=0
        
        4+20+10  =34
        4+16+10   =30
        
        
        5,4,4              index=2
         
        20,16,16          index=0,1
        				   index=0, index=1
        10,8,8            index=1, index=0 
        
        4+20+8  =32
        4+20+10=34
        
        
        
        
        3,4      index=0        index=1
        6,8      index=1        index=0
        		3+8=11            4+6=10	
        			
        3뽑을 시 8선택되어야 하고
        4뽑을 시 6선택해야한다. 
     
		*/
	}

}
