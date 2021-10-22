package basicAlgorithm;

public class P015_신규아이디추천 {

	public static void main(String[] args) {
			
		
		String abc = "...!@BaT#*..y.abcdefghijklm"; 
		//a는 97
		//z는 122
		
		//-는 45
		//.는 46
		//_는 95
		
		//0은 48
		//9는 57
		//아마 원래는 정규표현식으로 해야하지 않을까 싶다. 
		
	
		//1단계 
		
		//System.out.println(abc.toLowerCase());
		abc =abc.toLowerCase();


		String temp=""; 
	
		
		
		//2단계
		for(int i=0; i<abc.length(); i++){
			
			//알파벳
			if(97 <= abc.charAt(i) && abc.charAt(i) <=122){
				
				temp = temp+String.valueOf(abc.charAt(i)); 
			
			//숫자
			}else if(48 <= abc.charAt(i) && abc.charAt(i) <=57){
				temp = temp+String.valueOf(abc.charAt(i)); 

			//. - _ 특수문자
			}else if(abc.charAt(i)==45||abc.charAt(i)==46||abc.charAt(i)==95){
				
				temp = temp+String.valueOf(abc.charAt(i)); 		
			}
			
		}

		//3단계
		//문자열의 중복값을 어떻게 하면 없앨 수 있을까? 
		//천재적 발상...
		while(temp.contains("..")){
			temp=temp.replace("..", "."); 
		}

		System.out.println(temp);
		
		//4단계
		while(temp.charAt(0)=='.'){
		

		}
		
		
		System.out.println(temp);
		
		
	
	}

}
