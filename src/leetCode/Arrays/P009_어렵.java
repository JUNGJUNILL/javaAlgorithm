package leetCode.Arrays;

//Valid Mountain Array
//https://leetcode.com/explore/learn/card/fun-with-arrays/527/searching-for-items-in-an-array/3251/
public class P009_��� {
	
	  public static boolean validMountainArray(int[] A) {
		  
		  if(A==null || A.length <3) return false; //�迭�� ����ų� �迭�� ���̰� 2�̸�  false
		  
		  boolean result = A[0] < A[1]; 
		  if(!result) return result;  //���� 0�� �迭�� 1�� �迭�� ���� 0�� �迭�� 1���迭���� ũ�ٸ� false
		  		  
		  for(int i=1; i<A.length; i++){
			  
			  if(A[i] == A[i-1]) return false; //i�� i-1�� �迭�� ���� ���  false 		   
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

		
		//�ݷʷ� ���� ���� 
		//(0,2,3,3,5,2,1,0 �̰͵� ������)
		int[] arr2={1 ,2 ,3 ,5 ,2,5};

		System.out.println(validMountainArray(arr2));
	}

}
