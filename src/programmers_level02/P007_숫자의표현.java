package programmers_level02;

public class P007_숫자의표현 {
	
    public static int solution(int n) {
        int answer = 0;
     
        
        
        for(int i=1; i<=n; i++){
        	int sum=0; 
        	
        	for(int j=i; j<=n; j++){
        		sum+=j; 
        		if(sum==n){
        			answer++; 
        			break; 
        		}else if(sum > n){
        			break; 
        		}	
        	}
        }



        
        return answer;
    }

	//https://programmers.co.kr/learn/courses/30/lessons/12924
	public static void main(String[] args) {
		
		System.out.println(solution(15));
     
        
        	
	}
}