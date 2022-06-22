package leetCode.Arrays;

//Valid Mountain Array
//https://leetcode.com/explore/learn/card/fun-with-arrays/527/searching-for-items-in-an-array/3251/
public class P009_어렵 {
	
	  public static boolean validMountainArray(int[] A) {
		  
		  if(A==null || A.length <3) return false; //배열이 비었거나 배열의 길이가 2이면  false
		  
		  boolean result = A[0] < A[1]; 
		  if(!result) return result;  //최초 0번 배열과 1번 배열을 비교해 0번 배열이 1번배열보다 크다면 false
		  		  
		  for(int i=1; i<A.length; i++){
			  
			  if(A[i] == A[i-1]) return false; //i번 i-1번 배열이 같을 경우  false 		   
			  //i==1 
			  //A[1] == A[0] false 
			  
			  //i==2
			  //A[2]=3 == A[1]=2 false
			  
			  //i==3
			  //A[3]=3 == A[2]=3 true return false  
			  
			  
			  // false : 0,2,3,3,5,2,1,0
			  if(result){
				  
				  if(A[i] < A[i-1]) result=false; 
				  //i==1 
				  //A[1]=2 < A[0]=0 false 
				  
				  //i==2
				  //A[2]=3 < A[1]=2 false

				  
			  }else{
				
				  if(A[i] > A[i-1]) return false; 
				  
			  }
			  
			  
			  
		  }
		  
		  return !result; 
	  }
	  
	  public static boolean func001(int[] a){
		  
		  int i=0; 
		  
		  while(i<a.length && i+1 < a.length && a[i] < a[i+1]){
			  i++; 
		  }
		  
		  if(i==0 || i+1>=a.length){
			  return false; 
		  }
		  
		  while(i<a.length && i+1<a.length){
			  if(a[i]<=a[i++ +1]){
				  return false; 
			  }
		  }
		  
		  
		  return false; 
	  }
	  
	  

	public static void main(String[] args) {
		
		int[] arr={0,2,3,4,5,2,1,0};
		
		System.out.println(validMountainArray(arr));

		
		//반례로 좋은 예시 
		//(0,2,3,3,5,2,1,0 이것도 괜찮음)
		int[] arr2={1 ,2 ,3 ,5 ,2,5};

		System.out.println(validMountainArray(arr2));
	}

}
