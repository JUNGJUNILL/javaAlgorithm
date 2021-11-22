import java.util.*;


public class Practice {
	
	public static void main(String[] args) throws Exception{

		
		/*
		백트레킹 기본 코드 분석 
		N=4, M=2
		func(0) 
			k(0)==M(2) false 
		
		for 4	
		1
			!isUsed[1]==true		
			arr[0]=1 
			isUsed[1]=true	
			func(1)
				k(1)==M(2) false 
				
			for 4
			1
				!isUsed[1]==false 
				
			2
				!isUsed[2]==true 
				arr[1]=2; 
				isUsed[2]=true;
				func(2)
					k(2)==M(2) true 
				
				for 2
				0 arr[0](1) , arr[1](2) ==> print(1, 2) 
				
				for 4
				1 !isUsed[1]==false 
				
				2 !isUsed[2]==false 
				
				3 !isUsed[3]==true 
				  arr[2]=3
				  isUsed[3]=true
				  func(3)
				  	k(3)==M(4) false 
				  
				  for 4
				  1 !isUsed[1]==false 
				  
				  2 !isUsed[2]==false 
				  
				  3 !isUsed[3]==false 
				  
				  4 !isUsed[4]==true 
				    arr[3]=4
				    isUsed[4]=true
				    func(4) 
				    	k(4)==M(2) false
				   
				    for 4 
				    1 !isUsed[1]==false 
				    
				    2 !isUsed[2]==false 
				     
				    3 !isUsed[3]==false 
				    
				    4 !isUsed[4]==false 
				
				4 !isUsed[4]==false 
				
				
			3 !isUsed[3]==false 
			
			4 !isUsed[4]==false 
			
					
				
			
			
		2
		
		
		3
		
		
		3
		
		
		
		
		 */
	
	}
}


