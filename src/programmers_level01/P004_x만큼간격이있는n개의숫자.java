package programmers_level01;

public class P004_x��ŭ�������ִ�n���Ǽ��� {

	//����
    static long[] solution1(int x, int n) {
        long[] answer = new long[n];  
        long temp=x; 
        answer[0]=temp; 
       
        for(int i=1; i<n; i++){
        	x+=temp; 
        	answer[i]=x; 
        }
        
        return answer;
    }
    
    
    //����
    static long[] solution2(int x, int n) {
        long[] answer = new long[n];  
        long temp=x; 

       
        for(int i=0; i<n; i++){
        	answer[i] =temp * (i+1);
        }
        
        return answer;
    }
    
    
    
	public static void main(String[] args) {

		for(long i : solution1(-4,2)){
			System.out.println(i);
		}
	}

}
