package 백준_알고리즘_기초02_N과M_백트레킹;

public class P014_N_Queen {

	static int N; 
	static int[] arr; 
	
	static int Queens(int level){
		
		//base case 
		if(promising(level)==0){
			return 0; 
		}else if(level==N){
			return 1; 
		}
		
		int answer=0; 
		for(int i=1; i<=N; i++){
			arr[level+1]=i;
			answer+=Queens(level+1); 
		}
		
		return answer;
		
		
	}
	static int promising(int level){
		
		for(int i=1; i<level; i++){
			if(arr[i]==arr[level]){
				return 0; 
			}else if(level-i == Math.abs(arr[level] - arr[i])){
				return 0;
			}
		}
		return 1; 
		
	}
	
	//https://st-lab.tistory.com/118
	public static void main(String[] args) {

		N=4; 
		arr=new int[N+1]; 
		System.out.println(Queens(0));
		
		
	}

}
