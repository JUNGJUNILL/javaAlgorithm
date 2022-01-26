package programmers_level02;

public class P011_나라의숫자 {
	
    static  String solution(int n) {
        String answer = "";
        return answer;
    }

	//https://programmers.co.kr/learn/courses/30/lessons/12899
	public static void main(String[] args) {
		String[] num={"4","1","2"};
		String answer=""; 
		int n=10; 
		
		while(n>0){
		answer = num[n%3] + answer; 
		n = (n-1) /3; 
			
		}
		System.out.println(answer);

	}

}
