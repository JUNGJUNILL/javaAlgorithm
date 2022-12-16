package javaOOP.P003_Stream;

import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

import javax.imageio.ImageIO;

public class P001 {

	public static void main(String[] args) throws Exception{
		
		

		String[] array = {
				"25583540.jpg",
				"1000002.jpg",
				"25855609.jpg",
				"26412351.jpg",
				"26446042.jpg",
				"26449531.jpg",
				"26501833.jpg",
				"26556888.jpg",
				"1000009.jpg",
				"26600475.jpg",
				"1000011.jpg",
				"26666853.jpg",
				"25905717.jpg",
				"26366012.jpg",
				"26367927.jpg",
				"26385495.jpg",
				"26510651.jpg",
				"1000019.jpg",
				"26643380.jpg",
				"25965599.jpg",
				"25009712.jpg",
				"25009729.jpg",
				"25009736.jpg",
				"25795936.jpg",
				"26196756.jpg",
				"26527314.jpg",
				"26527413.jpg",
				"25009248.jpg",
				"25009248_0.jpg",
				"1000031.jpg",
				"26185910.jpg",
				"26205144.jpg",
				"26404059.jpg",
				"26526355.jpg",
				"26527284.jpg",
				"26527321.jpg",
				"26527390.jpg",
				"25010350.jpg",
				"25480131.jpg",
				"26527307.jpg",
				"26527406.jpg",
				"26523965.jpg",
				"25010138.jpg",
				"25010145.jpg",
				"25010206.jpg",
				"25010213.jpg",
				"25189513.jpg",
				"25614404.jpg",
				"25660920.jpg",
				"25664126.jpg",
				"1000052.PNG",
				"26527420.jpg",
				"26527451.jpg",
				"25010237.jpg",
				"25010282.jpg",
				"1000057.jpg",
				"1000058_0.jpg",
				"1000059.jpg",
				"25010183.jpg",
				"25480070.jpg",
				"25672411.jpg",
				"26524238.jpg",
				"26524306.jpg",
				"26524313.jpg",
				"26527291.jpg",
				"26527475.jpg",
				"26640600.jpg",
				"1000069.jpg",
				"26671505.jpg",
				"25480070_0.jpg",
				"1000072.jpg",
				"25009774_0.jpg",
				"25009781.jpg",
				"25009828.jpg",
				"25009828_0.jpg",
				"1000077.jpg",
				"25480940.jpg",
				"25320725.jpg",
				"25327017.jpg",
				"25400566.jpg",
				"25433485.jpg",
				"25477074.jpg",
				"25189483.jpg",
				"25680874.jpg",
				"25701951.jpg",
				"25708240.jpg",
				"25731330.jpg",
				"1000089.jpg",
				"25950113.jpg",
				"25327017_0.jpg",
				"26015903.jpg",
				"20200409_133603.png",
				"26100029.PNG",
				"1000095.jpg",
				"1000096.jpg",
				"26236407.jpg",
				"1000098.jpg",
				"26491615.jpg",
				"26547978.jpg",
				"1000101.jpg"

		}; 
		
	    for(int i=0; i<array.length; i++){
	        String address = "https://www.hubpass.co.kr/external/images/a1531/"+array[i];  // 다운 받을 파일 주소 입력
	        

	          URL url = new URL(address);
	          ReadableByteChannel rbc = Channels.newChannel(url.openStream());
	          FileOutputStream fos = new FileOutputStream("C:\\HELLO\\"+array[i]); //다운받을 경로 설정
	          fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);  // 처음부터 끝까지 다운로드
	          fos.close();
	          
	          System.out.println("파일 다운완료");
	    }
	

	}

}
