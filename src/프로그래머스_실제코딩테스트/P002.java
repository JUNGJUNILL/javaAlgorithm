package 프로그래머스_실제코딩테스트;

public class P002 {

	
	/*
문제 설명
음식점에서 배달 어플을 통해 주문을 받고 있습니다. 
이때 마지막으로 주문받은 음식이 완성될 시각을 계산하려고 합니다.

음식점에는 n개의 화구가 비치되어 있어서, 최대 n개의 음식까지 동시에 만들 수 있습니다.
음식을 만들 때는 주문받은 순서대로 음식을 만듭니다.
주문받은 시각에 비어있는 화구가 없거나 앞선 주문이 밀려 있다면, 화구가 빌 때까지 기다립니다.
사용할 수 있는 화구가 여러 개라면, 어떤 화구에서나 음식을 조리할 수 있습니다.
한 화구에서 어떤 주문의 조리가 완료됨과 동시에, 다른 주문의 조리를 바로 시작할 수 있습니다.
조리 시간에 따라서 먼저 주문한 음식이 나중에 주문한 음식보다 더 늦게 완성될 수 있습니다.
화구의 개수 n, 조리 시간을 담은 문자열 배열 recipes, 주문 순서를 담은 문자열 배열 orders가 매개변수로 주어집니다. 
이때, 마지막으로 들어온 주문이 완성될 시각을 return 하도록 solution 함수를 완성해주세요.

제한사항
n은 1 이상 10 이하인 자연수입니다.
recipes의 길이는 1 이상 50,000 이하입니다.
recipes의 원소는 “MENU COOKING_TIME” 형식의 문자열입니다. 
MENU와 COOKING_TIME은 하나의 공백으로 구분되어 있습니다.
MENU는 음식 이름을 나타내며, 길이가 1 이상 10 이하인 문자열입니다.
MENU는 중복되지 않고 알파벳 대문자로만 이루어져 있습니다.
COOKING_TIME은 조리 시간(초 단위)을 나타내며, 1 이상 10,000 이하인 자연수입니다.
orders의 길이는 1 이상 50,000 이하입니다.
orders의 원소는 “MENU_NAME ORDER_TIME” 형식의 문자열입니다. 
MENU_NAME과 ORDER_TIME은 하나의 공백으로 구분되어 있습니다.
MENU_NAME는 recipes의 MENU 중 하나입니다.
ORDER_TIME 음식을 주문한 시각(초 단위)을 나타내고, 1 이상 500,000 이하인 자연수입니다.
ORDER_TIME은 중복되지 않습니다. 즉, 주문이 동시에 2개 이상 들어오지 않습니다.
orders는 ORDER_TIME 순서대로 오름차순 정렬되어 있습니다.
COOKING_TIME과 ORDER_TIME은 숫자로만 구성되어 있습니다. 천 단위마다 ,를 넣지 않습니다.
입출력 예
n	recipes	orders	result
2	["A 3","B 2"]	["A 1","A 2","B 3","B 4"]	7
3	["SPAGHETTI 3", "FRIEDRICE 2", "PIZZA 8"]	["PIZZA 1", "FRIEDRICE 2", "SPAGHETTI 4", "SPAGHETTI 6", "PIZZA 7", "SPAGHETTI 8"]	12
1	["COOKIE 10000"]	["COOKIE 300000"]	310000
입출력 예 설명
입출력 예 #1
스크린샷 2021-01-08 오전 11.08.06.png

마지막으로 주문받은 음식 B는 7초에 완성됩니다.

입출력 예 #2
스크린샷 2021-01-08 오전 11.07.49.png편의상, P = PIZZA , F = FRIEDRICE , S = SPAGHETTI 로 간주합니다.

마지막으로 주문받은 음식 SPAGHETTI는 12초에 완성됩니다.
15초에 완성되는 PIZZA도 있지만, 이 피자는 마지막에 들어온 주문이 아니므로 정답이 아님을 유의해야 합니다.

입출력 예 #3
(생략)
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
