package Algorithm_nano;

import java.util.Arrays;

public class P012_���� {

	/*
	  ���� - ���� ������ ����� ������ ��ġ�� ��� 
	        - �ټ���� ����� �� ,�ڸ��ٲ�, ������ ����
	  
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
	//-------------------------------------------------------------------
	
	
	
	static int[] src={1,2,3}; 
	static int[] tgt=new int[3]; 
	static int tmp=0; 
	static boolean[] select =new boolean[src.length]; 
	
	static void p(int index){
		
		if(index==tgt.length){
			System.out.println(Arrays.toString(tgt));
			tmp++; 
			return; 
		}
		
		for(int i=0; i<src.length; i++){
			
			if(!select[i]){
				tgt[index]=src[i]; 
				select[i]=true; 
				p(index+1);
				select[i]=false; 
			}
		}
		
	}
	



		public static void main(String[] args) {
	
			int[] arr={1,2,3}; 
			  perm(arr, 0,3);
			  System.out.println("hello="+temp);
			  System.out.println("---");
				p(0);
				System.out.println(tmp);


	}
}
