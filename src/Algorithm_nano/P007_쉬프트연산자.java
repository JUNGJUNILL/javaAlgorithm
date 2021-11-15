package Algorithm_nano;

public class P007_쉬프트연산자 {

	public static void main(String[] args) {

		//x << n 은 x * 2^n의 결과와 같다. 
		//x >> n 은 x / 2^n의 결과와 같다.
		
		int dec = 8; 
		
		System.out.printf("%d << %d = %4d \t%s%n",dec, 1 , dec<<1, toBinaryString(dec<<1));
		
		System.out.printf("%d >> %d = %4d \t%s%n",dec, 0 , dec>>0, toBinaryString(dec>>0));
		
		System.out.printf("%d >> %d = %4d \t%s%n",dec, 1 , dec>>1, toBinaryString(dec>>1));
		
		
		
	}
	
	static String toBinaryString(int x){
		
		String str = "00000000000000000000000000000000"; 
		String tmp = str + Integer.toBinaryString(x); 
		return tmp.substring(tmp.length()-32); 
	}

}
