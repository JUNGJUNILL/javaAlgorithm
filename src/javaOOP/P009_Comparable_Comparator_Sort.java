package javaOOP;

import java.util.Arrays;

//Java�� �Ϲ����� ���ı��ؿ� ���� �˰��� �� �ʿ䰡 �ִ�. 
//��κ��� �� ������������, Java�� ������ Ư���� ���ǰ� �Ǿ����� ���� �� '��������'�� �������� �Ѵ�. 

//������� {1,3,2} �迭�� �ִٰ� ������ ����. 
//�츮�� ���������� ������ �迭 {1.2.3}�� ��� ���� ���� �˰����� ����ϰ� �� ���̴�. 
//�� ��, ������ �ϱ� ���� �� ���Ҹ� �� �ϰ� �� �� �ƴѰ�? ���� �޼ҵ忡�� �� ���� ���ϱ� ����
//index 0 , index 1 ���Ҹ� ���Ѵٰ� ���� �� ����. 
//���� ������ 1�� ���� ������ 3�� ��� ��� ����� 1<3�̴�. 

//�ռ� ���� ���ҿ� ���� ���Ҹ� �� �� ��, ��ŭ ���̰� �������� ��ȯ�Ѵٰ� �ߴ�. 
//return o1 - o2 
//return  1  - 3   ����

//�� ��, �ڹٿ����� ���������� ����Ʈ �������� ��� �ִٰ� �ߴ�. �� ���� ���� ���Ұ� ���� ���Һ��� '�۴�'�� ���̴�. 
//��, compareTo(o1) , compare(o1,o2)�� ����Ͽ� ��ü�� �� �� ��� "������ ������ �� ������ ��ġ�� �ٲ��� �ʴ´ٴ� ��" �̴�. 

//index 1, index 2 ���Ҹ� �� �� ����. 
//return 3 > 2   ��� 
//�� ���� ���� ���Ұ� ���� ���� ���� ũ�ٴ� �ǹ��̴�. 
//��, compareTo(o1) , compare(o1,o2) �� ����Ͽ� ��ü�� �� �� ��� "����� ������ �� ������ ��ġ�� �ٲ۴ٴ� ��" �̴�. 
//�׷��� {1,2,3} ���� ������������ ���� �� ���̴�. 

//��
//���� �� ��� : �� ������ ��ġ�� ��ȯ ���� 
//��� �� ��� : �� ������ ��ġ�� ��ȯ ��

public class P009_Comparable_Comparator_Sort {

	public static void main(String[] args) {
		
		MyInteger01[] arr = new MyInteger01[10]; 
		
		for(int i=0; i<arr.length; i++){
			arr[i] =new MyInteger01((int)(Math.random()*100)); 
		}
		
		System.out.print("���� �� ");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i].value+" ");
		}
		
		System.out.println();
		Arrays.sort(arr);
		System.out.print("���� �� ");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i].value+" ");
		}
		
		
		

	}

}

class MyInteger01 implements Comparable<MyInteger01>{
	
	int value; 
	
	public MyInteger01(int value){
		this.value = value; 
	}
	
	
	@Override
	public int compareTo(MyInteger01 o) {
		return this.value - o.value;
	}
	
}
