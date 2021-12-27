package javaBasic;


//enum
//클래스처럼 보이게 하는 상수
//서로 관련있는 상수들끼리 모아 상수들을 정의하는것
//enum 클래스 형을 기반으로 한 클래스형 선언
public enum P006_enum {
	
	SK("에스케이"),
	LG("엘쥐"),
	KT("케이티"),
	SAMSUNG("삼성"),
	APPLE("에플"); 
	
	private final String value; 
	
	P006_enum(String value){ 
		this.value = value; 
	} 
	
	public String getValue(){ 	
		return value; 
	}

}
