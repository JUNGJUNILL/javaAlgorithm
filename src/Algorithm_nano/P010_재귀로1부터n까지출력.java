package Algorithm_nano;

public class P010_��ͷ�1����n������� {
	
	//��ʹ� �������������� ������������,
	//�ͳ������� �����ؾ� �Ѵ�.. 
	
	
	//n���� 1���� ���
	//print(1)�� 1�� ����Ѵ�. 
	//print(k)�� k k-1 , k-2 ... 1�� ����Ѵ�. 
	//print(k+1)�� k+1 , k , k-1 ...1�� ����Ѵ�. 
	static void print(int x){
		
		if(x==0) return;
		System.out.print(x+" ");

		print(x-1);
		/*
		 print(3)
		 	3==0 false 3
		 		print(2)
		 			2==0 false 2 
		 				print(1)
		 					1==0 false 1 
		 						print(0) return; 
		 */
		

		
	}
	
	//1���� n���� ���
	static void print02(int x){
		
		if(x==0) return; 
		print02(x-1);
		System.out.print(x+" ");
		
		/*
			print(3)  3 
				3==0 false 
				print(2)  2
					2==0 false          
						print(1)  1            
							1==0 false 
								print(0)
									x==0 true
			
		 
		 */
	}

	public static void main(String[] args) {
		print(10); 
		System.out.println();
		print02(10);
	}

}
