package programmers_level01;

public class P012_������ȣ {

	public static void main(String[] args) {

		//�� ��¥..... 
		//https://ivory-room.tistory.com/23
		int z='z'; 
		int Z='Z'; 
		int n=1; 
		
		String s = "z"; 
		String answer=""; 
		
		
		char[] array=s.toCharArray(); 
		for(char str : array){
			if(str==' ') {
				answer+=" "; 
				continue; 
			}
			
			if(Character.isUpperCase(str)){
				
				if((int)(str+n) > Z){
					str='A'; 
					str=(char)(str+(n-1)); 
				}else{
					str=(char)(str+n); 
				}
				
				
			}else{
				
				if((int)(str+n) > z){
					str='a'; 
					str=(char)(str+(n-1)); 
				}else{
					str=(char)(str+n); 
				}
				
			}
			
			answer+=String.valueOf(str); 
			
		}
		
		System.out.println(answer);
		
		
		
		
		
		


		
		
		
		
		
		
	}
}
