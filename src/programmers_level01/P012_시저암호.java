package programmers_level01;

public class P012_������ȣ {

	public static void main(String[] args) {

		//�� ��¥..... 
		//https://ivory-room.tistory.com/23
		int a = 'a'+25; //97
		int A='A'; //65
		System.out.println(A);
		String s="a B z"; 
		String answer=""; 
		int n=4; 
		
		for(int i=0; i<s.length(); i++){
			char ch =s.charAt(i); 
			if(ch==' '){
				answer+=" ";
				continue; 
			}
			if(Character.isLowerCase(ch)){
				ch= (char)((ch-'a'+n) % 26 +'a'); 
			}else{
				ch=(char)((ch-'A'+n) % 26+'A'); 
			}
			
			answer+=ch; 
		}

		System.out.println(answer);
		
		
		
		


		
		
		
		
		
		
	}
}
