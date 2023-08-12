package javaOOP;

public class P012_Super {
	
	public static void main(String[] args) {
		
		Point3D point =new Point3D(1, 2, 3);
		System.out.println(point.getLocation());
	
	}

}

class Point {
	
	int x=10;
	int y=20;
	int z=30;
	

	Point(int x, int y,int z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	String getLocation() {
		return "x : "+x+" y : "+y+" z : "+z;
	}
	
}

class Point3D extends Point{
	int x=100;
	int y=200;
	int z=300;
	
	Point3D(int x, int y, int z){
		super(x,y,z); //조상 클래스의 생성자를 호출하는데 사용된다.
		
	}
	
	@Override
	String getLocation() {
		return super.getLocation();
	}
	
	
	
	
	
}