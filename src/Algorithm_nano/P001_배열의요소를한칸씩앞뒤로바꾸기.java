package Algorithm_nano;

public class P001_�迭�ǿ�Ҹ���ĭ���յڷιٲٱ� {

	public static void main(String[] args) {

		int[] array = {1,2,3,4,5}; 
		

		
		int K = 2;
		
		//Kĭ�� �ڷ� �о��
		
		//K=1;
		//{2,3,4,5,1} 
		
		//K=2;
		//{3,4,5,1,2}
		int[] newArray01 = new int[array.length]; 	

		//K�� �迭�� ������ ��Ҹ� �� ��ҷ� �ٲ㺸��.
		
		//k=1;
		//{5,1,2,3,4}
		
		//k=2;
		//{4,5,1,2,3}
		int[] newArray02 = new int[array.length]; 
		
		for(int i=0; i<array.length; i++){
			
			int index = (K+i) % array.length; 
			newArray01[i] = array[index];
			newArray02[index]=array[i]; 
			
		}
		
		for(int n : newArray01){
			System.out.print(n);
		}
		System.out.println();
		System.out.println("======================");
		
		
		for(int n : newArray02){
			System.out.print(n);
		}
		
	}
}
