package javaOOP.P003_Stream;
import java.io.*;
public class P002 {
	//파일 이름 바꾸기
	public static void main(String[] args) throws Exception{

        File file = new File("D:\\HELLO\\0.JPG");
        
        File newFile = new File("D:\\HELLO\\good.JPG");
        
        boolean result = file.renameTo(newFile); 
        System.out.println(result);

	}

}
