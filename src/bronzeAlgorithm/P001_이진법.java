package bronzeAlgorithm;

import java.util.Scanner;

public class P001_������ {

	public static void main(String[] args) {
				
		/*
		����
		���� ���� n�� �־����� ��, �̸� �������� ��Ÿ���� �� 1�� ��ġ�� ��� ã�� ���α׷��� �ۼ��Ͻÿ�. ������ ��Ʈ(least significant bit, lsb)�� ��ġ�� 0�̴�.
		
		�Է�
		ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����. �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� �ְ�, n�� �־�����. (1 �� T �� 10, 1 �� n �� 106)
		
		���
		�� �׽�Ʈ ���̽��� ���ؼ�, 1�� ��ġ�� �������� �����ؼ� �� �ϳ��� ����Ѵ�. ��ġ�� ���� �ͺ��� ����Ѵ�. 
		 */
		     Scanner sc = new Scanner(System.in);
		        
		        int N = sc.nextInt();
		        for(int i=0; i<N; i++){
		        	int Bi = sc.nextInt(); 
		        	String Bin = Integer.toBinaryString(Bi); //2������ �ٲ��ִ� �Լ�
		        	for(int j=Bin.length()-1; j>=0; j--){
		        		if(Bin.charAt(j)=='1'){
		        			System.out.print(Bin.length()-j-1+" ");
		        		}
		        	}
		        	System.out.println();
		        }
	        
	     
	}

}
