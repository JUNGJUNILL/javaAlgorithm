package javaOOP;

public class P003_������ {

	public static void main(String[] args) {

		//������ ����ȯ
		Father f = new Son(); 
		f.xyz();
		
		System.out.println("------------------------------");
		//������ ����ȯ
		GradeFather g = new Son(); //�̷��� �����ν� Father �� �ν��Ͻ�ȭ �� 
		g.abc();
		g.lmn();
		System.out.println("------------------------------");
		
		if(f instanceof GradeFather){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
		
		//�����߻�
		//g.xyz();
		//GradeFather Ŭ���� �ȿ��� xyz() �Լ��� ���⶧���� ���ʿ� ������ô�� �������� ���� ���Ѵ�. 
		
		Father fff = (Father)g; //�ٿ� ĳ���� , �ν��Ͻ��� ������ �ʰ� ���۷����� �ٲ� ���̴�. 
		fff.xyz(); 
		fff.abc();
		System.out.println("------------------------------");
		
		
		
		Father ff = new Son(); //Father���� ����ϵ��� �ϸ� ������ ���� ���� ���̴�. 
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



