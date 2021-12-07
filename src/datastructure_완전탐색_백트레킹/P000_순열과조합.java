package datastructure_완전탐색_백트레킹;

public class P000_순열과조합 {

	//https://coding-factory.tistory.com/607
	
	//5P2
	//순열 - 선택 순서가 결과에 영향을 미치는 경우 
	
	//중국집 메뉴 5개 중 2개의 메뉴를 순서대로 먹는 경우의 수 
	//먼저 첫번째로 먹을 메뉴를 정하려면 이때 첫번째 메뉴가 될 수 있는 경우의 수는
	//5가지 입니다. 그리고 나서 첫번재 메뉴로 지정된 메뉴를 제외한 나머지 4가지의
	//메뉴로 두번째로 먹을 메뉴를 선택한다면 이때의 경우의 수는 4가 됩니다.
	//그러므로 5개의 메뉴 중 2개의 메뉴를 차례대로 먹을 경우의 수는 20(5*4)가지 입니다. 
	
	//이때 메뉴는 a와 b를 결정하였다고 한다면, a,b가 될 수도 있고, b,a가 될수도 있습니다. 
	//먹는 순서가 다르기에 a,b와 b,a는 엄연히 다른 경우이며, 순서를 고려한다는것은 이런 의미입니다.

	
	static int menu=5; 
	static int kind =2; 
	static int[] arr=new int[menu]; 
	static boolean[] visied=new boolean[menu];
	static int temp=0; 
	
	static void Permutation(int k,int kind, int MAX){
		
		if(k==kind){
			for(int i=0; i<kind; i++){
				
				System.out.printf("%c ",arr[i]+65);
			}
			temp++;
			System.out.println();
		}
		
		for(int i=0; i<MAX; i++){
			if(!visied[i]){
				arr[k]=i; 
				visied[i]=true; 
				Permutation(k+1,kind,MAX);
				visied[i]=false; 
			}
		}
		
		
	}
	
	
	
	//조합 - 선택 순서가 결과에 영향을 주지 않는 경우
	//중국집 메뉴 5개 중 2개의 메뉴를 주문하는 경우의 수 
	//중국집에 5개의 메뉴{a,b,c,d,e}가 있다고 해봅시다. 이때 5개의 메뉴{a,b,c,d,e}중 
	//2개의 메뉴를 주문하는 경우의 수는 몇가지가 있을까요?
	//먼저 첫번째 메뉴를 선탁하는 경우의 수는 5가지 입니다. 
	//그리고 나서 첫번째 메뉴로 지정된 메뉴를 제외한 나머지 4가지의 메뉴로
	//두번째로 먹을 메뉴를 선택한다고 가정하면 이때의 경우의 수는 4가 됩니다.
	
	//그러므로, 5개의 메뉴 중 2개의 메뉴를 주문하는 경우는 20(5*4)가지 입니다.
	//이때, 메뉴는 a,b를 결정하였다고 한다면, a,b가될수도 있고 b,a가 될 수도 있습니다.
	//하지만 a,b와 b,a는 서로 같기에 나누기 2!를 해주어 메뉴 5개중 2개의 메뉴를
	//주문할 경우의 수는 10(5*4 / 2)이 됩니다.
	
	
	static boolean[] hello=new boolean[5]; 
	static int temp02=0; 
	static void Combination(int idx, int k, int kind, int[] arr){
		if(k==kind){
			
			for(int i=0; i<arr.length; i++){
				if(hello[i]){
					System.out.printf("%c ",arr[i]+65);
				}
			}
			
			temp02++;
			System.out.println();
		}		
		
		
		for(int i=idx; i<arr.length; i++){
			if(hello[i]) continue; 
			hello[i]=true;
			Combination(i, k+1, kind,arr);
			hello[i]=false; 
		}
		
		
		
	}
	
	
	
	public static void main(String[] args) {

		int[] arr={1,2,3,4,5}; 
	    int[] arr01={0,1,2}; 
		Permutation(0,3,arr.length); 
		System.out.println("temp="+temp);
		System.out.println();
		Combination(0,0,2,arr01); 
		System.out.println("temp02="+temp02);
	}

}
