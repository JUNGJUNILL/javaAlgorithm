package javaOOP;

public class P003_다형성 {

	public static void main(String[] args) {

		//묵시적 형변환
		Father f = new Son(); 
		f.xyz();
		
		System.out.println("------------------------------");
		//묵시적 형변환
		GradeFather g = new Son(); //이렇게 함으로써 Father 도 인스턴스화 됨 
		g.abc();
		g.lmn();
		System.out.println("------------------------------");
		
		if(f instanceof GradeFather){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
		
		//에러발생
		//g.xyz();
		//GradeFather 클래스 안에는 xyz() 함수가 없기때문에 애초에 계층추척을 시작조차 하지 못한다. 
		
		Father fff = (Father)g; //다운 캐스팅 , 인스턴스는 변하지 않고 레퍼런스만 바뀐 것이다. 
		fff.xyz(); 
		fff.abc();
		System.out.println("------------------------------");
		
		
		
		Father ff = new Son(); //Father에서 출발하도록 하면 문제가 되지 않을 것이다. 
		ff.abc(); 
		
	}

}

class GradeFather {
	void abc(){
		System.out.println("GradeFather abc()");
	}
	
	void lmn(){
		System.out.println("GradeFather lmn()");
	}

}

class Father extends GradeFather{
	void abc(){
		System.out.println("Father abc()");
	}
	
	void xyz(){
		System.out.println("Father xyz()");
	}
}


class Son extends Father{

	void xyz(){
		System.out.println("Son xyz()");
	}
	
	void lmn(){
		System.out.println("Son lmn()");
	}
}



