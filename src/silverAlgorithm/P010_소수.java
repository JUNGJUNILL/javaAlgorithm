package silverAlgorithm;

public class P010_소수 {

	public static void main(String[] args) {

		int a=1; 
		int b=5; 
		int sum=0; 
		int min=b; 
		
		for(int i=a; i<=b; i++){
			
			//1 ~ 5
			//i == 1
			int result=0; 
			
			if(i==1){
				result=result+1;
			}
			
			//i가 3부터 for문을 돌게 되어있다.
			
			//i가 4 인경우.. 2 <4 , 2 % 4 --0 break;
			
			//i가 5 인경우.. 2 <5 , 2 % 5 --1
			//i가 5 인경우.. 3 <5 , 3 % 5 --2
			//i가 5 인경우.. 4 <5 , 4 % 5 --1

			for(int j=2; j<i; j++){
				if(i % j == 0){
					result=result+1;
					break;
				}
			}
			//i가 1인경우 해당 로직 실행 안됨
			//i가 2인 경우 sum = 2 , 5>2 true=>min=2
			//i가 3인 경우 sum = 5 , 5>5 false=>min=2
			//i가 4인 경우 result=1이 된다. 
			//i가 5인 경우 sum = 10, 5>5 false=>min=2 
	
			if(result == 0){
				sum = sum+i;
				if(min > i){
					min = i; 
				}
			}	
			
			
		}
		
		
		if(sum == 0){
			System.out.println(-1);
		}else{
			System.out.println(sum);
			System.out.println(min);
		}
		
		
	}

}
