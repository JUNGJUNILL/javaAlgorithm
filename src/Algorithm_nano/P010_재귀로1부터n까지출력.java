package Algorithm_nano;

public class P010_재귀로1부터n까지출력 {
	
	//재귀는 절차지향적으로 생각하지말고,
	//귀납적으로 생각해야 한다.. 
	
	
	//n부터 1까지 출력
	//print(1)이 1을 출력한다. 
	//print(k)가 k k-1 , k-2 ... 1을 출력한다. 
	//print(k+1)가 k+1 , k , k-1 ...1을 출력한다. 
	static void print(int x){
		
		if(x==0) return;
		System.out.print(x+" ");

		print(x-1);
		/*
		 print(3)
		 	3==0 false 3
		 		print(2)
		 			2==0 false 2 
		 				print(1)
		 					1==0 false 1 
		 						print(0) return; 
		 */
		

		
	}
	
	//1부터 n까지 출력
	static void print02(int x){
		
		if(x==0) return; 
		print02(x-1);
		System.out.print(x+" ");
		
		/*
			print(3)  3 
				3==0 false 
				print(2)  2
					2==0 false          
						print(1)  1            
							1==0 false 
								print(0)
									x==0 true
			
		 
		 */
	}

	public static void main(String[] args) {
		print(10); 
		System.out.println();
		print02(10);
	}

}
