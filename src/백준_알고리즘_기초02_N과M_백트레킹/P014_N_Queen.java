package 백준_알고리즘_기초02_N과M_백트레킹;
/*
N==4 
q(0)
0 (0,0)
	cols[0]=0
	ispromising(0) 
	return true 
	
	q(1)
	0
		cols[1]=0
		ispromising(1) 
		return false 
	1
		cols[1]=1 
		ispromising(1) 
		1-0 == abs(cols[1]-cols[0]) 
		return false 

	2 (1,2)
		cols[1]=2
		ispromising(1)
		cols[1]==cols[0] 
		1-0 == abc(cols[1]-cols[0])
		return true 
		
		q(2) 
		0
			cols[2]=0
			ispromising(2)
			level 0, 1 
			cols[2]==cols[0] 
			return false 
		
		1
			cols[2]=1
			ispromising(2)
			level 0, 1 
			cols[2]==cols[0] 
			2-0 == abs(cols[2] - cols[0])
			
			cols[2]==cols[1]
			2-1 == abs(cols[2]-cols[1])
			return false 
		2	return false 
		3	return false 

	3 (1,3)
		cols[1]=3
		ispromising(1)
		cols[1]==cols[0]
		1-0 == abs(cols[1]-cols[0])
		return true 
		
		q(2)
		0 return false
		1 (2,1) 
			cols[2]=1
			level = 0, 1 
			cols[2]==cols[0]
			2-0 == abs(cols[2]-cols[0])
			return true 
			
			q(3)
			0
				cols[3]=0
				return false
			1
				cols[3]=1
				return false
			2
				cols[3]=2
				return false
			3
				cols[3]=3
				return false
			
			
		2 return false
		3 return false
		
	
1 ★(0,1)
	cols[0]=1
	ispromising(0) 
	return true 
	
	q(1) 
	0	
		cols[1]=0
		ispromising(1)
		cols[1]==cols[0] 
		1-0 == abs(cols[1]-cols[0]) 
		return false 
		
	1
		cols[1]=1
		ispromising(1)
		cols[1]=cols[0]
		return false 
		
	2
		cols[1]=2 
		ispromising(1)
		cols[1]==cols[0]
		1-0 == abs(cols[1]-cols[0])
		return false 
		
	3 ★(1,3)
		cols[1]=3 
		return true 
		
		q(2)
		0 ★(2,0)
			cols[2]=0 
			ispromising(2)
			level 0 , 1
			cols[2] == cols[0]
			2 - 0 == abs(cols[2]-cols[0])
			
			cols[2] == cols[1]
			2-1 == abs(cols[2]-cols[1]) 
			return true 
			
			q(3) 
			0
				cols[3]=0
				ispromising(3)
				return false
			1
				cols[3]=1
				ispromising(3)
				return false
			2 ★(3,2)
				cols[3]=2
				ispromising(3)
				level 0, 1, 2
				cols[3] == cols[0]
				3-0 == abs(cols[3]-cols[0])
				
				cols[3] == cols[1]
				3-1 == abs(cols[3]-cols[1])
								
				cols[3] == cols[2]
				3-2 == abs(cols[3]-cols[2])
				return true
				
				q(4) count++ 종료 
				
			3
				ispromising(3)
				cols[3]=3
			
		
		1 return false
		2 return false
		3 return false
	
2 ★(0,2)
	cols[0]=2
	ispromising(0) 
	return true 
	
	q(1) 
	0 ★(1,0)
		cols[1]=0;
		ispromising(1)
		cols[1]==cols[0]
		1-0 ==abs(cols[1]-cols[0]) 
		return true 
		
		q(2) 
		0
			cols[2]=0
			ispromising(2)
			level 0, 1 
			cols[2]==cols[0]
			2-0 ==abs(cols[]-cols[])
			
			cols[2]==cols[1]
			return false
			
			
		1
			cols[2]=1
			ispromising(2)
			level 0, 1 
			cols[2]==cols[0]
			2-0==abs(cols[level]-cols[0])
			
			cols[2]==cols[1]
			2-1 == abs(cols[2]-cols[1])
			return true 
			
			
		2
			cols[2]=2
			ispromising(2)
			level 0, 1 
			cols[2]==cols[0]
			return false 
			
		3 ★(2,3)
			cols[2]=3
			ispromising(2)
			level 0, 1 
			cols[2]==cols[0]
			2-0==abs(cols[2]-cols[0])
			
			cols[2]==cols[1]
			2-1==abs(cols[2]-cols[1])
			return true 
			
			q(3) 
			0
				cols[3]=0
				ispromising(3)
				level 0, 1, 2
				cols[3]=cols[0]
				3-0==abs(cols[3]-cols[0])
				
				cols[3]=cols[1]
				return false 
				3-0==abs(cols[3]-cols[1])
				
				cols[3]=cols[1]
				3-0==abs(cols[3]-cols[1])
				
				
			1 ★(3,1)
				cols[3]=1
				ispromising(3)
				cols[3]==cols[0]
				3-0==abs(cols[3]-cols[0])
				
				cols[3]==cols[1]
				3-1==abs(cols[3]-cols[1])
		
				cols[3]==cols[2]
				3-2==abs(cols[3]-cols[2])
				return true 
				
				q(4) count++ 종료 

			
			2
				cols[3]=2
				
			
			3
				cols[3]=3
			
			
		
	1
		cols[1]=1
		return false
	2
		cols[1]=2
		return false
	3
		cols[1]=3
		return false
	

3 
 */
public class P014_N_Queen {
	
	static int[] cols; 
	static int N; 
	static int count=0; 
	static void nQueen(int level){
		if(level==N){
			count++;
			return; 
		}
		
		for(int i=0; i<N; i++){
			cols[level]=i; 
			if(ispromising(level)){
				nQueen(level+1);
			}
		}
		
	}
	
	static boolean ispromising(int level){
		
		
		for(int i=0; i<level; i++){
			//같은열?
			if(cols[level]==cols[i]){
				return false;
				
			//대각선상 위치?
			}else if(level-i==Math.abs(cols[level]-cols[i])){
				return false; 
			}
		}
		
		return true;
	}

	//https://st-lab.tistory.com/118
	public static void main(String[] args) {

		N=4; 
		cols=new int[N]; 
		nQueen(0);
		System.out.println(count);
	}

}
