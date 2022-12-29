package javaOOP.P003_Stream;

import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public class P001 {

	public static void main(String[] args) throws Exception{
		
		
		ArrayList<String> list = new ArrayList<String>(); 
		
		File txtFile = new File("C:\\data.txt");

		
		BufferedReader br = new BufferedReader(new FileReader("C:\\data.txt")); 
		String line=null; 
		int num = 0; 
		while((line = br.readLine()) != null){
			
			//if(num == 100) break; 
			
			list.add(URLEncoder.encode(line,"UTF-8"));
			//System.out.println(URLEncoder.encode(line,"UTF-8"));
			//num++; 
			
		}
		System.out.println("list.size()=>"+list.size());
	    for(int i=0; i<list.size(); i++){
	    	String fileName=list.get(i); 
	        String address = "https://www.hubpass.co.kr/external/images/a1531/"+fileName;  // 다운 받을 파일 주소 입력
	        

	          URL url = new URL(address);
			  HttpURLConnection con =(HttpURLConnection)url.openConnection();
			  if(con.getResponseCode()!=200) continue; 
	          
	          ReadableByteChannel rbc = Channels.newChannel(url.openStream());
	          FileOutputStream fos = new FileOutputStream("D:\\ABC\\"+list.get(i)); //다운받을 경로 설정
	          fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);  // 처음부터 끝까지 다운로드
	          fos.close();
	          
	          System.out.println("파일 다운완료="+fileName);
	    }
	    

	

	}

}
