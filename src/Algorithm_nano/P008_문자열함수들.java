package Algorithm_nano;

public class P008_문자열함수들 {

	public static void main(String[] args) {

		String str01 ="영일이삼사오육칠팔구십"; 
		System.out.println(str01.substring(4));
		System.out.println(str01.substring(1,9)); //1번 인덱스부터 9-1=8개의 문자을 반환한다.
		
		String str02 = "영일이삼사오육칠팔구십"; 
		String[] str02Arr =str02.split(""); 
		for(String n : str02Arr){
			System.out.print(n);
		}
		System.out.println();
		String str03 = "영일이삼사오육칠팔구십";
		
		if(str03.startsWith("영")){
			System.out.println("영으로 시작하네요");
		}else{
			System.out.println("다른걸로 시작하네요");
		}
		
		if(str03.endsWith("십")){
			System.out.println("십으로 끝나네요");
		}else{
			System.out.println("다른걸로 끝나네요");
		}
		
		
	}
}
