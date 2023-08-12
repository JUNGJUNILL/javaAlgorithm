package javaOOP;

public class P14_this {

	public static void main(String[] args) {
		
		Car car = new Car(); 
		System.out.println(car.color);
		
		Car car2 =new Car("blue");
		System.out.println(car2.color + " : " + car2.gearType);
	}
}

class Car{
	
	String color;
	String gearType;
	int door;
	
	//생성자에서 다른 생성자 호출하기
	Car(){
		this("red");
	}
	
	Car(String color){
		this(color,"auto");
		this.color = color;
	}
	
	Car(String color, String gearType){
		this.color = color;
		this.gearType = gearType;
	}
	
	Car(String color, String gearType,int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;		
	}
	
	
	
	
	
}