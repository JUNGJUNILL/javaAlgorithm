package 백준_알고리즘_기초02_N과M_백트레킹;

public class P015_N_Queen {

	static int N; 
	static int[] cols;
	
	static int queens(int level){
		//level이 0일 때는 promising은 반드시 1을 반환 할 것이다.
		if(promising(level)==0){
			return 0; 
		
		//말들이 조건과 같이 잘 놓은 경우
		}else if(level==N){	
			return 1; 
		}
		
		int answer=0; 	
		for(int i=1; i<=N; i++){
			cols[level+1]=i; 	

			answer+=queens(level+1);
					
		}
		return answer;
	}
	
	//말들간에 충돌의 여지가 있는가?
	//1부터 level-1 말들이 
	//level 말과 충돌하는지 확인
	static int promising(int level){
		
		//마지막에 놓은 말이 이전에 놓은 다른 말들과
		//충돌하는지 검사하는 것으로 충분
		for(int i=1; i<level; i++){
			
			//같은 열에 놓였는지 검사 
			if(cols[i]==cols[level]){
				return 0; 
				
			//대각선상에 놓였는지
			}else if(level-i == Math.abs(cols[level]-cols[i])){
				return 0; 
			}
		}
		
		return 1; 
		
	}
	
	
	public static void main(String[] args) {
		N=4; 
		cols=new int[N+1]; 
		
		System.out.println(queens(0));
		
	}
	

}
