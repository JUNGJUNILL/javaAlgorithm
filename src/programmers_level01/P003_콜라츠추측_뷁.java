package programmers_level01;

public class P003_�ݶ�������_�� {

    public static int solution(int num) {
    	long n = num; //�� �κ��� �������� ���ߴ�.

    	int answer = 0;
        
        while( 1!=n ){
        	
        	if(n % 2==0){
        		n=n/2; 
        	}else{
        		n=(n*3)+1; 
        	}
        	answer++;
        	if(500 < answer){
        		return -1; 
        	}
        	
        }
 
     
     return answer;
    }
    
    //�̰͵� ���� : ����Լ��� �̿�
	static int count=0; 
    static int recursive(long x){
    	long n=x; //�� �κ��� �������� ���ߴ�.
  

    	if(x==1) return count; 
 
    	if(n % 2==0){
    		n=n/2; 
    	}else{
    		n=(n*3)+1; 
    	}
    	count++; 
    	recursive(n); 
       	if(x!=1 && count>500) return -1; 

    	return count; 
    	
    	
    	
    }

    //https://mozzioi.tistory.com/28
    //https://programmers.co.kr/learn/courses/30/lessons/12943
	public static void main(String[] args) {

		
		
		System.out.println(solution(626331));
		System.out.println(recursive(626331));
	}
}
