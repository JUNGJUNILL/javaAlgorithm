package codeUpbasic100;

import java.util.*;

public class P081_1084_������������_�� {
	
	/*
	����(red), �ʷ�(green), �Ķ�(blue) ���� ����
	���� ���� ���� ���� ����� ������ �Ѵ�.
	
	����(r), �ʷ�(g), �Ķ�(b) ������ ���� ������ �־��� ��,
	(���� ���࿡ ���� 0 ~ n-1 ���� n������ �� ������ ���� �� �ִ�.)
	
	�־��� rgb ������ �ٸ��� ���� ���� �� �ִ� ��� ����� ����(r g b)��
	�� ���� ���� ����غ���.
	 */
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in); 
		int a=sc.nextInt();
		int b=sc.nextInt(); 
		int c=sc.nextInt(); 
		int temp=0; 
		
		for(int i=0; i<a; i++){
			for(int j=0; j<b; j++){
				for(int k=0; k<c; k++){
					temp++; 
					System.out.println(i+" "+j+" "+k);

				}
			}
		}
		System.out.println(temp);
		

	}
}
