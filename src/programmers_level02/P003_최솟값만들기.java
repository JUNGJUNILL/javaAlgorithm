package programmers_level02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class P003_�ּڰ������ {

	
	//���� �������� ���� ū ���� ���ؼ� ���س����ٺ���
	//�� ���� ���� ���� ����� ���� ������ �Ǿ��ִ�. 
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
	
		

        /*
        �̰� ����ǵ��� �ڵ带 ¥���Ѵ�. 
        
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
        
        4+20+8  =32
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
        			
        3���� �� 8���õǾ�� �ϰ�
        4���� �� 6�����ؾ��Ѵ�. 
     
		*/
	}

}
