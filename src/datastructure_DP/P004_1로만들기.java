package datastructure_DP;

public class P004_1로만들기 {
	 /*
	 정수 X가 주어졌을 때, 정수 X에 사용할 수 있는 연산은 다음과 같이 4가지입니다. 
	 
	 1.X가 5로 나누어 떨어지면, 5로 나눕니다. 
	 2.X가 3으로 나누어 떨어지면, 3으로 나눕니다. 
	 3.X가 2로 나누어 떨어지면, 2로 나눕니다.
	 4.X에서 1을 뺍니다. 
	 
	 정수 X가 주어졌을 때, 연산 4개를 적절히 사용해서 값을 1로 만들고자 합니다. 
	 연산을 사용하는 횟수의 최솟값을 출력하세요. 
	 
	 26 -> 25 -> 5 -> 1 연산횟수 3번 
	 */
	
	public static int[] d =new int[30001];
	public static void main(String[] args) {
		
		int x =26; 
		for(int i=2; i<=x; i++){
			d[i] = d[i-1]+1; 
			if(i % 2 ==0){
				d[i] = Math.min(d[i], d[i/2]+1); 
			}else if(i % 3 ==0){
				d[i] = Math.min(d[i], d[i/3]+1); 
			}else if(i % 5 ==0){
				d[i] = Math.min(d[i], d[i/5]+1); 
			}
			
			
		}
		
		System.out.println(d[x]);
		

	}

}
