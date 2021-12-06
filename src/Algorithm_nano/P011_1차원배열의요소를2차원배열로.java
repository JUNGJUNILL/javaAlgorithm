package Algorithm_nano;

public class P011_1차원배열의요소를2차원배열로 {

	public static void main(String[] args) {
		

		String[] arr = {"######",
							">#*###",
							"####*#",
							"#<#>>#",
							">#*#*<",
							"######"};
		
		char[][] newArr = new char[arr.length][arr.length]; 
		
		for(int i=0; i<newArr.length; i++){
			for(int j=0; j<newArr[i].length; j++){
				newArr[i][j]=arr[i].charAt(j); 
			}
		}
		
		for(int i=0; i<newArr.length; i++){
			for(int j=0; j<newArr[i].length; j++){
				System.out.print(newArr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
