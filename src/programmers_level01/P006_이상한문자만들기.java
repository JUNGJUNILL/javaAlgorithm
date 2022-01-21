package programmers_level01;

public class P006_이상한문자만들기 {

	//문제 진짜 좆같네
	//이 문제 또는 시퀀스 관련 문제인 것 같다.
	// 코딜리티 LESSON01_BinaryGap02  와 비슷한 문제이다.
    public static String solution(String str) {
    	
    	String answer=""; 
    	int cnt=0; 
    	String[] array=str.split(""); 
 
    	for(int i=0; i<array.length; i++){
    		
    		if(array[i].equals(" ")){
    			cnt=0; 
    			answer+=" "; 
    		}else{
    			cnt++; 
    			if(cnt % 2==0){
    				answer+=array[i].toLowerCase();
    			}else{
    				answer+=array[i].toUpperCase(); 
    			}
    		}
    	}
    	
    	return answer; 
    	
    }
    
    
    //https://programmers.co.kr/learn/courses/30/lessons/12930
	public static void main(String[] args) {

		String str = "try hello world"; 
		
		System.out.println(solution(str));
		
	}
}
