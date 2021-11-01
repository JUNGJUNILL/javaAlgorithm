package javaOOP;


//Comparator를 상속 받고 구현하지 않고, 비교 기능만 따로 두고 싶다. 
//익명 클레스를 활용한다. 


public class P007_Comparable_Comparator {

	public static void main(String[] args) {
		
		Rectangle a = new Rectangle(); 
		
		Shape anonymous = new Shape() {
			int depth = 40;
			@Override
			public int get() {
				
				return width*height*depth;
			}
		};
		
		System.out.println(a.get());
		System.out.println(anonymous.get());

	}

}

class Rectangle implements Shape{
	
	int depth=40; 
	
	@Override
	public int get() {
		return width * height * depth;
	}
	
	
}

interface Shape {
	
	int width=10; 
	int height=20; 
	
	int get(); 
	
	
}
