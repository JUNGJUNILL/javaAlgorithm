package Algorithm_nano;

public class P019_배열요소를앞에서부터뒤에서부터한번에출력 {

	public static void main(String[] args) {

		int[] arr={1,2,3,4,5}; 
		
		for(int i=0; i<arr.length; i++){
			int j=arr.length-i-1; 
			System.out.print(arr[j]);
		}
		
	}
}
