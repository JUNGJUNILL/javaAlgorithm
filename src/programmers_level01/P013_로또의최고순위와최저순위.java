package programmers_level01;


//�ζ��� �ְ� ������ ���� ����
//https://school.programmers.co.kr/learn/courses/30/lessons/77484
public class P013_�ζ����ְ�������������� {
	
	//int[] lottos, int[] win_nums
	
	//������.. �����!!
    public static  int[] solution() {
    	/*
		    	1	6�� ��ȣ�� ��� ��ġ
				2	5�� ��ȣ�� ��ġ
				3	4�� ��ȣ�� ��ġ
				4	3�� ��ȣ�� ��ġ
				5	2�� ��ȣ�� ��ġ
    	 */
    	//������ ���� ���� �־��� �迭���� 
    	//���� �ζ��� ������ ���� ��� 
    	
    	//0�� ������ ���Ѵ�. 
    	
    	//0�� ������ ������ ��ȣ�� ���� �ζ��� ������ ���Ͽ�
    	//�ϳ��� ������ ����, 2�� �̻��� ��� �ּҴ� 5�� �ִ�� 0�� ����
    	
    	int[] lottos={45, 4, 35, 20, 3, 9};
    	int[] win_nums={20, 9, 3, 45, 4, 35}; //win_nums���� 0�� �������� �ʴ´�.
    	
    
    	
    	int zeroCount=0; 
    	int sameCount=0;
    	for(int i=0; i<lottos.length; i++){
    		if(lottos[i]==0){
    			zeroCount++; 
    			
    		}else{
    			
    			//a�� b �迭�� �ִµ�, a,b �迭�� ����� ����� ������ ���ϴ� �����?
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
