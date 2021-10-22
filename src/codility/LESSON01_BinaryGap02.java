package codility;

public class LESSON01_BinaryGap02 {

	public static void main(String[] args) {

		String binaryStr = Integer.toBinaryString(1041); //10000010001
		System.out.println(binaryStr);
		int lenth = binaryStr.length(); 
		int maxSequence = 0; 
		int sequence = 0;
		
		//시퀀스를 새는 문제에서 사용하기 좋은 문제구나
		for(int i=0; i<lenth; i++){
			if('1'==binaryStr.charAt(i)){
				maxSequence = Math.max(sequence, maxSequence); 
				sequence = 0; 
			}else{
				sequence++; 
			}
		}
		System.out.println(maxSequence);
		
	}

}

/*
 
 양의 정수 N 내의 이진 간격은 N의 이진 표현에서 양쪽 끝에 있는 0으로 둘러싸인 연속 0의 최대 수열이다.

예를 들어, 숫자 9는 이진수 표현 1001을 가지며 길이가 2인 이진수를 포함한다. 
숫자 529는 이진법 표현 10 0001 0001을 가지고 있으며 길이 4와 길이 3 중 두 개의 이진법을 포함하고 있다. 
숫자 20은 이진수 표현 1 0100을 가지며 길이가 1인 이진수 간격을 포함한다. 
숫자 15는 이진수 표현 1111을 가지며 이진수 간격은 없다. 숫자 32는 이진수 표현 100000을 가지며 이진수 공백이 없다.

함수 쓰기:

클래스 솔루션 {public int 솔루션(int N); }

양의 정수 N이 주어지면 가장 긴 이진 간격의 길이를 반환합니다. N에 이진 간격이 없으면 함수는 0을 반환해야 합니다.

예를 들어, N = 1041이 주어지면 함수는 5를 반환해야 하는데, 
그 이유는 N은 이진수 표현 100 0001 0001을 가지고 있기 때문에 
가장 긴 이진수 간격은 길이가 5이다. N = 32가 주어지면 함수는 0을 반환해야 하는데, 
이는 N이 이진수 표현 '100000'을 가지고 있어서 이진수 간격이 없기 때문이다.

다음 가정을 위한 효율적인 알고리즘을 작성하십시오.

N은 [1..2,147,483,647] 범위의 정수입니다.

 */
