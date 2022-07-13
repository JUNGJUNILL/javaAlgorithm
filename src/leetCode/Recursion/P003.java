package leetCode.Recursion;

//Climbing Stairs
//https://leetcode.com/explore/learn/card/recursion-i/255/recursion-memoization/1662/
public class P003 {
	
	  //다이나믹 프로그래밍
	  //dp는 진짜 감을 못잡겠다
	  public static int climbStairs(int n) {
	        
		  // 2 = {1,1} , {2} 2가지
		  
		  // 3 = {1,1,1} ,{1,2} , {2,1} 3가지
		  if(n<=1){
			  return 1; 
		  }
		  
		  int[] dp = new int[n+1]; 
		  dp[1]=1;
		  dp[2]=2; 
		  
		  //n=3
		  //0 1 2 0
		  
		  for(int i=3; i<=n; i++){
			  dp[i] = dp[i-1] + dp[i-2]; 
		  }
		  //dp[3] = dp[2] + dp[1]
		  //3
		  
		  
 		  return dp[n]; 
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
