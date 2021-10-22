package javaBasic;

public class P002_비트연산자 {

	public static void main(String[] args) {
		
		//9의 i번째 비트값이 0인지 1인지 구해라
		//1 << 3 한후에 원본값과 and 연산을 하면된다. 
		int num=9; // 1001
		int i  =3; 
		// 1 << 3 1000

		if((num & (1<<i)) == 1){
			System.out.println(num+"의 "+i+" 번째 인덱스는 "+ 1+" 이다");
		}else{
			System.out.println(num+"의 "+i+" 번째 인덱스는 "+ 0+" 이다");
		}
		
		System.out.println("===============================");
		
		//num의 i번째 비트값을 1로 세팅하는 방법 
		System.out.println(num | (1<<i));
		
		
		//num의 i번째 비트값을 무조건 0으로 하는 방법 
		System.out.println(num & ~(1<<i));
		
		System.out.println();
		
		
	}

}
