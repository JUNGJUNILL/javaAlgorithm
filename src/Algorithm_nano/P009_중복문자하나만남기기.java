package Algorithm_nano;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class P009_�ߺ������ϳ�������� {

	public static void main(String[] args) {
		String str05 = "�����������������̻���"; 
		//return �� �����̻��� 
		//contains �Լ��� Ȱ���ؼ�... ��մ�!
		
		
		
		
		
		
		
		
		
		
		
		Queue<Character> q= new LinkedList<Character>(); 
		
		for(int i=0; i<str05.length(); i++){
			
			if(q.contains(str05.charAt(i))){
				q.remove(str05.charAt(i)); 
				q.add(str05.charAt(i)); 
			}else{
				q.add(str05.charAt(i)); 
			}
		}
		
		while(!q.isEmpty()){
			System.out.print(q.poll());
		}
		
	}
	
}
