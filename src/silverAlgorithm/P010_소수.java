package silverAlgorithm;

public class P010_�Ҽ� {

	public static void main(String[] args) {

		int a=1; 
		int b=5; 
		int sum=0; 
		int min=b; 
		
		for(int i=a; i<=b; i++){
			
			//1 ~ 5
			//i == 1
			int result=0; 
			
			if(i==1){
				result=result+1;
			}
			
			//i�� 3���� for���� ���� �Ǿ��ִ�.
			
			//i�� 4 �ΰ��.. 2 <4 , 2 % 4 --0 break;
			
			//i�� 5 �ΰ��.. 2 <5 , 2 % 5 --1
			//i�� 5 �ΰ��.. 3 <5 , 3 % 5 --2
			//i�� 5 �ΰ��.. 4 <5 , 4 % 5 --1

			for(int j=2; j<i; j++){
				if(i % j == 0){
					result=result+1;
					break;
				}
			}
			//i�� 1�ΰ�� �ش� ���� ���� �ȵ�
			//i�� 2�� ��� sum = 2 , 5>2 true=>min=2
			//i�� 3�� ��� sum = 5 , 5>5 false=>min=2
			//i�� 4�� ��� result=1�� �ȴ�. 
			//i�� 5�� ��� sum = 10, 5>5 false=>min=2 
	
			if(result == 0){
				sum = sum+i;
				if(min > i){
					min = i; 
				}
			}	
			
			
		}
		
		
		if(sum == 0){
			System.out.println(-1);
		}else{
			System.out.println(sum);
			System.out.println(min);
		}
		
		
	}

}
