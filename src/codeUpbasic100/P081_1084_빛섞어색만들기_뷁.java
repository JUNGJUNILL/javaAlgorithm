package codeUpbasic100;

import java.io.*;

public class P081_1084_������������_�� {
	
	/*
	����(red), �ʷ�(green), �Ķ�(blue) ���� ����
	���� ���� ���� ���� ����� ������ �Ѵ�.
	
	����(r), �ʷ�(g), �Ķ�(b) ������ ���� ������ �־��� ��,
	(���� ���࿡ ���� 0 ~ n-1 ���� n������ �� ������ ���� �� �ִ�.)
	
	�־��� rgb ������ �ٸ��� ���� ���� �� �ִ� ��� ����� ����(r g b)��
	�� ���� ���� ����غ���.
	 */
	
	public static void main(String[] args) throws Exception {
		
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 	
	BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
	
	int temp=0; 
	String a= br.readLine(); 
	String[] arr = a.split(" "); 

	for(int i=0; i<Integer.parseInt(arr[0]); i++){
	for(int j=0; j<Integer.parseInt(arr[1]); j++){
		for(int k=0; k<Integer.parseInt(arr[2]); k++){
			bw.write(i+" "+j+" "+k+"\n");
			temp++;
		}
	}
}
	bw.write(String.valueOf(temp));
	bw.flush();
	

		
	}
}
