import java.util.*;


public class Practice02 {
	
	static void recursive(int x,int temp){

		if(x==0) return; 
		recursive(x-1, temp);
		temp=temp+x;
		System.out.println(temp);

	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		int a= sc.nextInt(); 
		int temp=0; 
	 
		recursive(a,temp); 
		 
		
	}
}