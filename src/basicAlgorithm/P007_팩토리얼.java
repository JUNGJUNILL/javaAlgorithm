package basicAlgorithm;

import java.util.Scanner;

public class P007_���丮�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//�±� ������ �����⿡�� �Ĵ� �ڵ尰��...
		Scanner sc = new Scanner(System.in); 
		int input=sc.nextInt();
		int temp = input;
		int index=1;
		
		if(input==0){
			temp = index;
		}else{
			for(int i=input; i>=1; i--){
				
				if(i==1){
					index=0;
				}
				temp=temp*(i-index);
			}
		}

		System.out.println(temp);		
	}

}
