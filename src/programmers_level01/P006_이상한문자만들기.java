package programmers_level01;

public class P006_이상한문자만들기 {

	
    public static String solution(String str) {
        String answer = "";
        
        String[] array=str.split(""); 
        
        for(int i=0; i<array.length; i++){
        	System.out.println(array[i]);
        }
        
        return answer;
    }
    
    
    //https://programmers.co.kr/learn/courses/30/lessons/12930
	public static void main(String[] args) {

		String str="try hello world"; 
		
		System.out.println(solution(str));
	}
}
