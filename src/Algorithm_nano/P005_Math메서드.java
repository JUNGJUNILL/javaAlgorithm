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
		System.out.println(Math.ceil(f1));  //무조건 올림
		System.out.println(Math.floor(f1)); //무조건 버림
		System.out.println("==============================");
		
		//https://coding-factory.tistory.com/250
		//소수점 n째자리 까지 표현하기
		//n=10    첫째
		//n=100   둘째
		//n=1000  셋째
		System.out.println("pie*10="+(pie*10)+"  :: "+Math.round(pie*10)/10.0);
		
	
		System.out.println("pie*100="+(pie*100)+"  :: "+Math.round(pie*100)/100.0);
		
		
		System.out.println("pie*1000="+(pie*1000)+" :: "+Math.round(pie*1000)/1000.0);
		
		
		//Math.abs 절대값을 반환하는 함수 
		int initValue=-1004; 
		double doubleValue=-3.14; 
		float floatValue=-15; 
		
		System.out.println("initValue="+Math.abs(initValue));
		System.out.println("doubleValue="+Math.abs(doubleValue));
		System.out.println("floatValue="+Math.abs(floatValue));
	
	
		 
		
		//100의 제곱근
		int number01=(int)Math.sqrt(100); 
		
		//10의 제곱 
		int number02=(int)Math.pow(10,2); 
		System.out.println("제곱근="+number01);
		System.out.println("제곱="+number02);
		
	}

}
