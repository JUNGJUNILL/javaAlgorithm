package codility;

import java.util.Arrays;

public class LESSON03_PermMissingElem {

	public static void main(String[] args) {
		/*
		N���� ���� �ٸ� ������ ������ �迭 A�� �־����ϴ�. 
		�迭���� [1] ������ ������ ���Ե˴ϴ�.(N + 1)]], ��, ��Ȯ�� �ϳ��� ��Ұ� �����Ǿ� �ֽ��ϴ�.

		��ǥ�� ������ ��Ҹ� ã�� ���Դϴ�.

		�Լ� ����:

		Ŭ���� �ַ�� {public int solution(int[] A); }

		�迭 A�� �����Ǹ� ���� ����� ���� ��ȯ�մϴ�.

		���� ���, �־��� �迭 A�� ������ �����ϴ�.

		A[0] = 2
		A[1] = 3
		A[2] = 1
		A[3] = 5
		�Լ��� ������ ����̹Ƿ� 4�� ��ȯ�ؾ� �մϴ�.

		���� ������ ���� ȿ������ �˰����� �ۼ��Ͻʽÿ�.

		N�� [0..] ���� ���� �����Դϴ�.100,000];
		A�� ��Ҵ� ��� �����ȴ�.
		�迭 A�� �� ��Ҵ� [1] ���� ���� �����Դϴ�.(N + 1)]
		
		//�ٵ� �̰�.. �ð����⵵ ������ ������... 
		*/
		
		// 0%
		int[] arr = new int[4]; 
		arr[0]=2;
		arr[1]=3;
		arr[2]=1;
		arr[3]=5;
		
		int[] newArr = new int[arr.length]; 
		
		for(int j=0; j<arr.length; j++){
			newArr[j] = j+1; 
		}
		
		Arrays.sort(arr); 
		
		for(int i=0; i<newArr.length; i++){
			
			if(arr[i]!=newArr[i]){
				System.out.println(newArr[i]);
			}
			
		}
	
		
		
	}
	
	
	

}

