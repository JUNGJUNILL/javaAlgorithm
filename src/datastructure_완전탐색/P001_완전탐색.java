package datastructure_완전탐색;

public class P001_완전탐색 {

	//순열 - 선택 순서가 결과에 영향을 미치는 경우 
	//조합 - 선택 순서가 결과에 영향을 주지 않는 경우

	static int N =4; 
	static int[] nums={1,2,3,4}; 
	
	static int solve(int cnt, int used, int val){
		
		if(cnt == 2) return val; 
		
		int ret = 0; 
		for(int i=0; i<N; i++){
			if((used & 1 << i)!=0) continue; 
			ret = Math.max(ret, solve(cnt+1, used | 1<<i, val*10+nums[i])); 
		}
		/*
		 solve(0,0,0) 
		 for 4 
		 0
		  0 & 1<<0 0
		  max(0,solve(1, 0 | 1<< 0 (1), 0*10+1)) 
		 	     ->solve(1,1,1)
		 	     for 4
		 	     0
		 	      1 & 1<<0 1 continue
		 	     
		 	     1
		 	      1 & 1<<1 0
		 	      max(0,solve(2, 3, 12) return 12
		 	     
		 	     2
		 	      1 & 2<<1 0
		 	      max(12,solve(2, 5, 13) return 13
		 	     
		 	     3
		 	      1 & 3<<1 0
		 	      max(12,solve(2, 9, 14) return 14
		 	     
		 	     
		 1
		 
		 2
		 
		 3
	
		 
		 
		 
		 */
		return ret; 
		
	}
	
	public static void main(String[] args) {
		
			System.out.println(1 | 1<<3);
	}
}







