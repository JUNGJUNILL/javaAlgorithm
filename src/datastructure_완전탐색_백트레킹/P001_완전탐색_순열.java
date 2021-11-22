package datastructure_����Ž��_��Ʈ��ŷ;

public class P001_����Ž��_���� {

	//���� - ���� ������ ����� ������ ��ġ�� ��� 
	//���� - ���� ������ ����� ������ ���� �ʴ� ���

	
	//1,2,3,4 ���� 2���� ������ ���� ū ������ ���� �����ϴ� �Լ��� �ۼ��Ͻÿ�..
	static int[] nums={1,2,3,4}; 
	static int N =nums.length;  
	
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
		 	      max(13,solve(2, 9, 14) return 14
		 	     
		 	     
		 1
		  0 & 1<<1 0
		  max(14, solve(1, 2, 2) )
		           ->solve(1, 2, 2) 
		           for 4
		           0
		           2 & 2<<0 2 continue
		           
		           1
		           2 & 2<<1 0 
		           max(14, solve(2, 6, 22) ) return 22
	           
		           2
		           2 & 2<<2 0
		           max(22, solve(2, 6, 23) ) return 23
		           
		           3
		           2 & 1<<3 0
		           max(23, solve(2,  10, 24) ) return 24
		 
		 2
		  0 & 1 << 2 0
		  max(24, solve(1, 4, 3) ) 
		           ->solve(1, 4, 3) , cnt+1, used | 1<<i, val*10+nums[i]
		           for 4 
		           0
		           max(24, solve(2, 5, 31) return 31
		            
		           1
		           max(31, solve(2, 6, 32) return 32
		           
		           2
		           max(32, solve(2, 7, 33) return 33 
		           
		           3
		           max(33, solve(2, 8, 34) return 34
		 
		 
		 
		 3
		  0 & 1 << 3 0 
		  max(34, solve(1, 8, 4 ) ) , cnt+1, used | 1<<i, val*10+nums[i]
	               -> solve(1, 8, 4) 
	               for 4
	               0
	               max(34, solve(2, 9, 41) ) return 41
	               
	               1
	               max(41, solve(2, 10, 42) ) return 42
	               
	               
	               2
	               max(42, solve(2, 10, 43) ) return 43
	               
	               
	               3
	               8 & 1 << 3 8 continue 
	               max(43, solve(2, 8, 44) ) return 44
		 
		 			return 43
		 
		 */
		return ret; 
		
	}
	
	public static void main(String[] args) {
		

			System.out.println(solve(0, 0, 0));
	}
}







