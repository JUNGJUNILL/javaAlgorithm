package basicAlgorithm;

public class P015_�űԾ��̵���õ {

	public static void main(String[] args) {
			
		
		String abc = "...!@BaT#*..y.abcdefghijklm"; 
		//a�� 97
		//z�� 122
		
		//-�� 45
		//.�� 46
		//_�� 95
		
		//0�� 48
		//9�� 57
		//�Ƹ� ������ ����ǥ�������� �ؾ����� ������ �ʹ�. 
		
	
		//1�ܰ� 
		
		//System.out.println(abc.toLowerCase());
		abc =abc.toLowerCase();


		String temp=""; 
	
		
		
		//2�ܰ�
		for(int i=0; i<abc.length(); i++){
			
			//���ĺ�
			if(97 <= abc.charAt(i) && abc.charAt(i) <=122){
				
				temp = temp+String.valueOf(abc.charAt(i)); 
			
			//����
			}else if(48 <= abc.charAt(i) && abc.charAt(i) <=57){
				temp = temp+String.valueOf(abc.charAt(i)); 

			//. - _ Ư������
			}else if(abc.charAt(i)==45||abc.charAt(i)==46||abc.charAt(i)==95){
				
				temp = temp+String.valueOf(abc.charAt(i)); 		
			}
			
		}

		//3�ܰ�
		//���ڿ��� �ߺ����� ��� �ϸ� ���� �� ������? 
		//õ���� �߻�...
		while(temp.contains("..")){
			temp=temp.replace("..", "."); 
		}

		System.out.println(temp);
		
		//4�ܰ�
		while(temp.charAt(0)=='.'){
		

		}
		
		
		System.out.println(temp);
		
		
	
	}

}
