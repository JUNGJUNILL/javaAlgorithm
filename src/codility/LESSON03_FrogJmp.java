package codility;

public class LESSON03_FrogJmp {

	public static void main(String[] args) {

		
		//시간복잡도 문제. 
		//O(1) 이나 O(log n) 같은 시간복잡도가 작은 로직을 짜야한다. 
		int x=10; 
		int y=85; 
		int d=30; 


		int distance = x-y; //가야할 거리 
		
			
		double jump = distance / (double)d; 
		System.out.println(Math.ceil(jump));
		
	}
	
	
	

}

/*
작은 개구리가 길 반대편으로 가고 싶어 합니다. 개구리는 현재 X 위치에 있으며 Y보다 크거나 같은 위치로 이동하려고 합니다. 
작은 개구리는 항상 일정한 거리인 D를 뛴다.

작은 개구리가 목표에 도달하기 위해 수행해야 하는 최소 점프 횟수를 세어보세요.

함수 쓰기:

클래스 솔루션 {public int 솔루션(int X, int Y, int D); }

즉, 정수 X, Y, D가 주어졌을 때 위치 X에서 Y보다 크거나 같은 최소 점프 수를 반환합니다.

예를 들어, 다음과 같습니다.

X = 10
Y = 85
D = 30
개구리는 다음과 같은 위치에 있으므로 함수가 3을 반환해야 합니다.

첫 번째 점프 후, 10 + 30 = 40 위치에서
두 번째 점프 후 10 + 30 + 30 = 70
10 + 30 + 30 + 30 + 30 = 100
다음 가정을 위한 효율적인 알고리즘을 작성하십시오.

X, Y, D는 [1.1,000,000,000] 범위의 정수입니다.
*/
