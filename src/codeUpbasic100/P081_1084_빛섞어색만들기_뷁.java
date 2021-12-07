package codeUpbasic100;

import java.io.*;

public class P081_1084_빛섞어색만들기_뷁 {
	
	/*
	빨강(red), 초록(green), 파랑(blue) 빛을 섞어
	여러 가지 빛의 색을 만들어 내려고 한다.
	
	빨강(r), 초록(g), 파랑(b) 각각의 빛의 개수가 주어질 때,
	(빛의 강약에 따라 0 ~ n-1 까지 n가지의 빛 색깔을 만들 수 있다.)
	
	주어진 rgb 빛들을 다르게 섞어 만들 수 있는 모든 경우의 조합(r g b)과
	총 가짓 수를 계산해보자.
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
