package programmers_level01;

public class P006_�̻��ѹ��ڸ���� {

	//���� ��¥ ������
	//�� ���� �Ǵ� ������ ���� ������ �� ����.
	// �ڵ���Ƽ LESSON01_BinaryGap02  �� ����� �����̴�.
    public static String solution(String str) {
    	
    	String answer=""; 
    	int cnt=0; 
    	String[] array=str.split(""); 
 
    	for(int i=0; i<array.length; i++){
    		
    		if(array[i].equals(" ")){
    			cnt=0; 
    			answer+=" "; 
    		}else{
    			cnt++; 
    			if(cnt % 2==0){
    				answer+=array[i].toLowerCase();
    			}else{
    				answer+=array[i].toUpperCase(); 
    			}
    		}
    	}
    	
    	return answer; 
    	
    }
    
    
    //https://programmers.co.kr/learn/courses/30/lessons/12930
	public static void main(String[] args) {

		String str = "try hello world"; 
		
		System.out.println(solution(str));
		
	}
}
