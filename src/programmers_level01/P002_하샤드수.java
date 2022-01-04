package programmers_level01;

import java.util.Stack;

public class P002_ÇÏ»þµå¼ö {

    public static boolean solution(int x) {
        boolean answer;
        int temp=0; 
        int num=x; 
        Stack<Integer> stack=new Stack<>(); 
        while(num>0){
        	int index = num % 10;
        	stack.push(index); 
        	num/=10; 
        }
        
        for(int i : stack){
        	temp+=i; 
        }

        if(x % temp==0){
        	answer=true; 
        }else{
        	answer=false;
        }
        
        return answer;
    }
	public static void main(String[] args) {
System.out.println(solution(10));
System.out.println(solution(12));
System.out.println(solution(11));
System.out.println(solution(13));



	}

}
