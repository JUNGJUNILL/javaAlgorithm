package Algorithm_nano;

public class P012_���� {

	/*
	  ���� - ���� ������ ����� ������ ��ġ�� ��� 
	  
	  �߱��� �޴� 5���� 2���� �޴��� ������� �Դ� ����� �� 
	 */
	static int temp=0; 
	public static void perm(int[] arr, int pivot,int kind){ 
		if (pivot == kind) { 

			for(int i=0; i<kind; i++){
				System.out.print(arr[i]+" ");
			}
			temp++;
			System.out.println();
			return; 
		} 
		
		for (int i = pivot; i < arr.length; i++){ 
			swap(arr, i, pivot); 
			perm(arr, pivot + 1,kind); 
			swap(arr, i, pivot);
		
		} 
	}
	
	public static void swap(int[] arr, int i, int j) { 
		int temp = arr[i]; 
		arr[i] = arr[j]; 
		arr[j] = temp;
	}



		public static void main(String[] args) {
	
			int[] arr={1,2,3}; 
			  perm(arr, 0,3);
			  System.out.println("hello="+temp);

	}
}
