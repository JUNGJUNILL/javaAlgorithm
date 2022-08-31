package programmers_level01;


//로또의 최고 순위와 최저 순위
//https://school.programmers.co.kr/learn/courses/30/lessons/77484
public class P013_로또의최고순위와최저순위 {
	
	//int[] lottos, int[] win_nums
	
	//정답임.. 맞췄어!!
    public static  int[] solution() {
    	/*
		    	1	6개 번호가 모두 일치
				2	5개 번호가 일치
				3	4개 번호가 일치
				4	3개 번호가 일치
				5	2개 번호가 일치
    	 */
    	//최저인 경우는 현재 주어진 배열에서 
    	//맞은 로또의 개수가 같은 경우 
    	
    	//0의 갯수를 구한다. 
    	
    	//0의 갯수를 제외한 번호가 맞은 로또의 갯수랑 비교하여
    	//하나도 없으면 낙점, 2개 이상인 경우 최소는 5등 최대는 0의 갯수
    	
    	int[] lottos={45, 4, 35, 20, 3, 9};
    	int[] win_nums={20, 9, 3, 45, 4, 35}; //win_nums에는 0이 존재하지 않는다.
    	
    
    	
    	int zeroCount=0; 
    	int sameCount=0;
    	for(int i=0; i<lottos.length; i++){
    		if(lottos[i]==0){
    			zeroCount++; 
    			
    		}else{
    			
    			//a와 b 배열이 있는데, a,b 배열의 공통된 요소의 갯수를 구하는 방법은?
    			for(int j=0; j<win_nums.length; j++){
    				if(lottos[i]==win_nums[j]){
    					sameCount++;
    				}
    			}			
    		}		
    	}
    	
    	int max=0;
    	int min=0; 
    	int[] check={6,6,5,4,3,2,1}; 
    	
    	if(sameCount==0){
    		max=check[zeroCount];  
    		min=check[0]; 
    		
    	}else{
    		max=check[sameCount+zeroCount];
    		min=check[sameCount]; 
    		
    	}
    	
    	int[] answer =new int[2]; 
    	answer[0]=max;
    	answer[1]=min; 
        
        return answer;
        
    }

	public static void main(String[] args) {
		
		
		for(int i : solution()){
			System.out.println(i);
		}
		
	}
}
