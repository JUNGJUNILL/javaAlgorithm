package programmers_level02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class P003_최솟값만들기 {

	
	//가장 작은수와 가장 큰 수를 곱해서 더해나가다보면
	//그 값을 가장 작은 경우의 수가 나오게 되어있다. 
    static int solution(int []A, int []B){
        int answer = 0;
        int sumOne=0; 
        int sumTwo=0; 
        int len=A.length; 
        
        Arrays.sort(A); //1,2,4
        Arrays.sort(B); //4,4,5
        
        for(int i=0; i<len; i++){
        	
        	int j=len-i-1; 
        	//i=0 3-0-1 =2
        	//i=1 3-1-1 =1
        	//i=2 3-2-1 =0
        	
        	sumTwo = sumOne+A[i]*B[j]; 
        	
        	sumOne = sumTwo; 
        	
        	/*
        	 i=0 0+(1*5) = 5
        	 5
        	 
        	 i=1 5+(2*4) = 13
        	 13
        	 
        	 i=2 13+(4*4) = 29 
        	 29 
        	 */
        	
        }
        answer = sumTwo; 
        

        return answer;
    }
    //https://programmers.co.kr/learn/courses/30/lessons/12941
	public static void main(String[] args) {
		
		int[] A={1,4,2};
		int[] B={5,4,4};
	
		System.out.println(solution(A, B));
		

    
	}

}
