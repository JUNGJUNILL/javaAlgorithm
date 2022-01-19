package programmers_level03;

 public class P001_N_Queen_backtracking {
	 
	    static int[] cols;
	    static int answer;
	    static int N;
	    
	    public static int solution(int n) {
	     answer=0;
	     N=n;
	     cols=new int[n]; 
	     nQueens(0); 
	     
	     return answer;    
	        
	        
	    }
	    
	    public static void nQueens(int level){
	        
	        if(N==level){
	            answer++;
	            return; 
	        }
	        
	        for(int i=0; i<N; i++){
	            cols[level]=i; 
	            if(promising(level)){
	                nQueens(level+1);
	            }
	        }
	        
	        
	        
	    }

	    public static boolean promising(int level){
	        
	        for(int i=0; i<level; i++){
	            if(cols[level]==cols[i]){
	                return false; 
	            }else if(level-i==Math.abs(cols[level]-cols[i])){
	                return false; 
	            }
	        }
	        return true;
	        
	    }
	    
		public static void main(String[] args) {
			
			System.out.println(solution(4));
		}


}
