package codility;

public class LESSON02_CyclicRotation03 {

	public static void main(String[] args) {
		/*
		 N개의 정수로 구성된 배열 A가 주어집니다. 배열 회전은 각 요소가 인덱스 하나에 의해 오른쪽으로 이동하고 
		 배열의 마지막 요소가 첫 번째 위치로 이동됨을 의미합니다. 
		 예를 들어, 배열 A = [3, 8, 9, 7, 6]의 회전은 [6, 3, 8, 9, 7]이다(지수가 한 개씩 오른쪽으로 이동하고 6은 첫 번째 자리로 이동한다).

		배열 A를 K번 회전하는 것이 목표입니다. 즉, A의 각 원소가 K번 오른쪽으로 이동합니다.
		
		함수 쓰기:
		
		클래스 솔루션 {public int[] solution(int[] A, in K); }
		
		즉, N개의 정수 및 정수 K로 구성된 배열 A가 주어지면 배열 A를 회전 K번 반환합니다.
		
		예를 들어, 주어진
		
		A = [3, 8, 9, 7, 6]
		K = 3
		함수는 [9, 7, 6, 3, 8]을 반환해야 합니다. 세 번의 회전이 이루어졌다.
		
		[3, 8, 9, 7, 6] -> [6, 3, 8, 9, 7]
		[6, 3, 8, 9, 7] -> [7, 6, 3, 8, 9]
		[7, 6, 3, 8, 9] -> [9, 7, 6, 3, 8]
		다른 예로, 주어진 경우
		
		A = [0, 0, 0]
		K = 1
		함수는 [0, 0, 0]을 반환해야 합니다.
		
		주어진
		
		A = [1, 2, 3, 4]
		K = 4
		함수는 [1, 2, 3, 4]를 반환해야 합니다.
		
		다음과 같이 가정한다:
		
		N과 K는 [0..] 범위 내의 정수입니다.100];
		배열 A의 각 요소는 [-1,000..1000] 범위 내의 정수입니다.
		솔루션에서 정확성에 초점을 맞춥니다. 솔루션 성능은 평가의 초점이 아닙니다.
		 */

		//100%
		//https://jobjava00.github.io/algorithm/codility/lesson2/CyclicRotation/
		int[] A = {3, 8, 9, 7, 6}; 
		int K   = 3; 
		
		int length = A.length; 
		int[] temp = new int[length]; 
		for(int i=0; i<length; i++){
			int index = (K+i) % length; 
			System.out.println("index="+index + "  i="+i);
			temp[index] = A[i]; 
			//0
			//	index =3
			//  (ㅁ,ㅁ,ㅁ,3,ㅁ)
			//1
			//	index =4
			// (ㅁ,ㅁ,ㅁ,3,8)
			//2
			//	index =0
			// (9,ㅁ,ㅁ,3,8)
			//3
			//	index =1
			// (9,7,ㅁ,3,8)
			//4
			//	index =2
			// (9,7,4,3,8)
		}
		System.out.println("------------");
		for(int n : temp){
			System.out.print(n);
		}
		
		
		

		
		
	}
}












