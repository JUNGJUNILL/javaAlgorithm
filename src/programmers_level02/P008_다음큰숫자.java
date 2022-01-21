package programmers_level02;

public class P008_다음큰숫자 {

    public static int solution(int n) {
        int answer = 0;
        
        String binary = Integer.toBinaryString(n);
        int binaryCount=0; 
        for(int i=0; i<binary.length(); i++){
        	if(binary.charAt(i)=='1'){
        		binaryCount++; 
        	}
        }
        
        int temp=n+1; 
        while(n <temp){
        	String nextBinary = Integer.toBinaryString(temp); 
            int nexBinaryCount=0; 
  
        	for(int i=0; i<nextBinary.length(); i++){
              	if(nextBinary.charAt(i)=='1'){
              		nexBinaryCount++; 
              	}
              }
        	
        	if(binaryCount==nexBinaryCount){
        		answer=temp; 
        		temp=0; 
        	}else{
        		temp++;
        	}
        	
        }
        
        
        
        return answer;
    }
	//https://programmers.co.kr/learn/courses/30/lessons/12911
	public static void main(String[] args) {
		
		System.out.println(solution(15));
	}

}
