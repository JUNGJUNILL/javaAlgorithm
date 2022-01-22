package Algorithm_nano;

public class P023_이상한문자만들기 {

	
	
	
	/*
	 "try hello world"	
	 "TrY HeLlO WoRlD"
	 이렇게 반환하게 만들어야 한다. 
	*/
	
	
	
	
	//https://programmers.co.kr/learn/courses/30/lessons/12930
	public static void main(String[] args) {
		
		
		
		
		
		String str="try hello world"; 
		String temp=""; 
		int count=0; 
		String[] array=str.split(""); 
		
		for(int i=0; i<array.length; i++){
			if(array[i].equals(" ")){
				count++; 
				temp+=" ";
			}else{
				if(count % 2==0){
					temp+=array[count].toUpperCase(); 
				}else{
					temp+=array[count].toLowerCase();  

				}
				count++; 
				
				
				
			}
		}
	
		System.out.println(temp);
		
		String temp02=""; 
		int count02=0; 
		
		for(String s : array){
			count02 = s.contains(" ") ? 0 : count02+1; 
			temp02+= count02 % 2==0 ? s.toLowerCase() : s.toUpperCase(); 
			
		}
		System.out.println(temp02);
		
	
	}
}
