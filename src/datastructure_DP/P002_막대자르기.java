package datastructure_DP;

//https://www.leafcats.com/95
public class P002_막대자르기 {

	public static void main(String[] args) {
		//길이(i) 1 2 3 4 
		//가격(Pi) 1 5 8 9
		
		//길이가 4일 경우.. 
		//길이 4의 막대로 받을 수 있는 최대값(9원) 
		//길이 3의 막대로 받을 수 있는 최대값(8원)에 길이 1 막대의 값(1원)을 더한 값(9원)
		//길이 2의 막대로 받을 수 있는 최대값(5원)에 길이 2 막대의 값(5원)을 더한 값(10원)
		//길이 1의 막대로 받을 수 있는 최대값(1원)에 길이 3 막대의 값(8원)을 더한 값(1원)
	
		//들 중 최대값 10이 출력이 되야 한다. 
		
		//길이 4 n
		//최대가격 Rn = max(Pi + Rn-1) (n은 1부터 n까지) 
		
		//P1+R3  
		//P2+R2 
		//P3+R1
		//P4+R0  
		
		
		//길이 4의 막대의 최대값을 구하기 위해서 길이 1,2,3 막대의 최대값을 먼저
		//구해 이를 사용하게 된다. 
		
		Cut c01 =new Cut(); 
		System.out.println(c01.cutRod(4));
		
		Cut c02 =new Cut(); 
		System.out.println(c02.cutRod(3));
		
		Cut c03 =new Cut(); 
		System.out.println(c03.cutRod(2));

		
	}

}

//https://www.zerocho.com/category/Algorithm/post/584b979a580277001862f182
class Cut{

	int[] price ={0,1, 5, 8, 9}; 
	int[] r =new int[100]; 
	int q; 
	
	public int cutRod(int length){
		price = this.price;
		for(int j=1; j<=length; j++){
			
			q = -1; 
			
			for(int i=1; i<=j; i++){
				q = Math.max(q, price[i]+r[j-i]); 
			}
			r[j]=q;
			
		}
		return r[length]; 
		
	}
	
}
