package javaOOP;

public class P013_Super {
	
	public static void main(String[] args) {
		
		Parent parent =new Child(); 
		String getString  = parent.getLocation();
		System.out.println("getString="+getString);
	}

}

class Parent{
	int x=10;
	int y=20;
	
	String getLocation() {
		return "x : "+x+", y : "+y;
	}
	
}

class Child extends Parent{
	int x=100;
	int y=200;

	@Override
	String getLocation() {
		
		return super.getLocation()+", this.x: "+this.x+" this.y : "+this.y + " super.x : "+super.x + " super.y : "+super.y;
	} 
	

}