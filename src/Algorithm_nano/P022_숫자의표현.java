package Algorithm_nano;

public class P022_숫자의표현 {

	//https://programmers.co.kr/learn/courses/30/lessons/12924
	public static void main(String[] args) {

		
		 /*
		    1 + 2 + 3 + 4 + 5 = 15
			4 + 5 + 6 = 15
			7 + 8 = 15
			15 = 15
			4가지 경우의 수 
			이렇게 4를 출력해야 함
			
		 */
		
		
		
		
		
		
		
		
		
		int n=15; 
		int count=0; 
		
		for(int i=1; i<=n; i++){
			int temp=0;
	
			for(int j=i; j<=n; j++){
				temp+=j; 
				if(temp==n){
					count++;
					break; 
				}else if(temp > n){
					break; 
				}
				
			}
		}
		
		System.out.println(count);
		
	}

}
