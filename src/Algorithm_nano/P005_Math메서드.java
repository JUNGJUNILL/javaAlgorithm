package Algorithm_nano;

public class P005_Math메서드 {

	public static void main(String[] args) {
	
		
		//Math.round 함수는 실수의 소수점 첫번재 자리를 
		//반올림하여 정수반환
		float f1 = 3.4f;
		float f2 = 3.5f;
		float pie=3.141592f; 
		
		System.out.println(Math.round(f1));//반올림
		System.out.println(Math.round(f2));//반올림
		System.out.println(Math.ceil(f1));  //올림
		System.out.println(Math.floor(f1)); //버림
		System.out.println("==============================");
		
		//https://coding-factory.tistory.com/250
		//소수점 n째자리 까지 표현하기
		//n=10    첫째
		//n=100   둘째
		//n=1000  셋째
		System.out.println("pie*10="+(pie*10)+"  :: "+Math.round(pie*10)/10.0);
		
	
		System.out.println("pie*100="+(pie*100)+"  :: "+Math.round(pie*100)/100.0);
		
		
		System.out.println("pie*1000="+(pie*1000)+" :: "+Math.round(pie*1000)/1000.0);
		
	}

}
