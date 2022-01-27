package programmers_level02;

public class P011_나라의숫자 {
	
    static  String solution(int n) {
        String answer = "";
        return answer;
    }

	//https://programmers.co.kr/learn/courses/30/lessons/12899
	public static void main(String[] args) {
		String str=""; 
		
		str="정"+str; 
		str="준"+str; 
		str="일"+str;
		System.out.println(str);

		String answer=""; 
		int n=10; 
		String[] number={"4","1","2"}; 
		
		while(n>0){
			answer = number[n % 3] + answer; 
			//answer = number[1] + answer; 
			//answer = "1"+""; 
			//answer = "1"
			
			//answer = number[0] + answer; 
			//answer = "4"+"1"+""
			//answer = 41 

			n= (n-1) / 3; 	
			//n = 9 / 3
			//n=3 
			
			//n = 2 / 3; 
			//n = 0 
			//end of while
		}
		
		System.out.println(answer);
		
	}
}
