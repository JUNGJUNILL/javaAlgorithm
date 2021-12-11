package datastructure_완전탐색_백트레킹;

public class P022_백준_123더하기 {
	
	//자의로 못품 
	//일단 처음에 어떻게 해야할지 조차 잘 모르겠음. 
	//많은 풀이법들에서 재귀함수(완전탐색)으로 풀었다. 
	//완전탐색이 나오면 재귀함수를 만들어볼까? 라는 생각을 해 보도록 하자.
	
	static int cnt=0;
	
	static void DFS(int num){
		
		if(num==0){
			cnt++;
			return;
			
		}else{
			
			if(num-1 >=0){
				DFS(num-1); 
			}
			if(num-2 >=0){
				DFS(num-2); 
			}
			if(num-3 >=0){
				DFS(num-3); 
			}
			
		}
		
	}
	
	

	//https://www.acmicpc.net/problem/9095
	public static void main(String[] args) {

	
		int[] arr={1,2,3}; 
		
		int num=4; 
		

		DFS(4); 
	
		System.out.println(cnt);

	}

}
