package javaBasic;
import java.util.regex.Pattern;

public class P001_Á¤±ÔÇ¥Çö½Ä {

	public static void main(String[] args) {

		
//		https://highcode.tistory.com/6 [HighCode]
//		1) ¼ıÀÚ¸¸ : ^[0-9]*$
//
//		2) ¿µ¹®ÀÚ¸¸ : ^[a-zA-Z]*$
//
//		3) ÇÑ±Û¸¸ : ^[°¡-ÆR]*$
//
//		4) ¿µ¾î & ¼ıÀÚ¸¸ : ^[a-zA-Z0-9]*$


		  
		  String value01 = "1abc";  
		  boolean regex1 = Pattern.matches("[a-z0-9]*$", value01);
		  boolean regex2 = Pattern.matches("^[a-z]*$", value01);
		  boolean regex2_2 = Pattern.matches("^[a-z0-9]*", value01);

		  System.out.println("value01="+value01.replaceAll("[^0-9]", "")); //¼ıÀÚ¸¸ »¬°Ô 
		  System.out.println("regex1="+regex1); //true
		  System.out.println("regex2="+regex2); //true
		  System.out.println("regex2_2="+regex2); //true

		  System.out.println();
		  System.out.println("=======================================");
		  System.out.println();
		  //Áú¹®1
		  // ^ ÀÌ°Ô ±×³É ¹®ÀÚ¿­ÀÇ ½ÃÀÛ? ÀÌ¶ó´Âµ¥ ^ ÀÖ°í ^ ¾ø°í Â÷ÀÌ°¡ ¾ø´Âµ¥ Á¤È®È÷ ^ ÀÇ ¿ªÇÒÀÌ ¹«¾ùÀÎ°¡¿ä? 
		  //^[a-z] : a ~ z»çÀÌÀÇ ¾ËÆÄºªÀ¸·Î ½ÃÀÛÇÑ´Ù. 
		  // [a-z] : ^±âÈ£°¡ ¾øÀ» °æ¿ì¿¡´Â Ã³À½¿¡ ¹¹·Î ½ÃÀÛÇÏ´ÂÁö »ó°ü¾øÀÌ a~z °¡ Áß°£¿¡¶óµµ ÀÖÀ¸¸é true
		  
		  String value02 ="-_.abc"; 
		  boolean regex3 = Pattern.matches("^[-_.a-z]*$", value02);
		  boolean regex4 = Pattern.matches("^[-_.a-z]*", value02);
		  boolean regex5 = Pattern.matches("^[-_.a-z]", value02);  

		  System.out.println("±Ã±İ=="+"-abcdÁ¤ÁØÀÏ".replaceAll("^[-_.a-z]", ""));
		  // regex5 °¡ falseÀÎ ÀÌÀ¯´Â ^[-_.a-z] Á¤±Ô½Ä¿¡¼­ ½ÃÀÛÀº °ıÈ£¾È¿¡ ¹®ÀÚ ¹× ±âÈ£ Áß¿¡ "ÇÑ°³¸¸" Ç¥ÇöÀÌ µÇ¾ú´Ù¸é true °¡ ³ª¿ÔÀ» °Å¿¡¿ä. 
		  // ¿Ö³ÄÇÏ¸é µÚ¿¡ * °¡ ¾ø±â ¶§¹®¿¡ °ıÈ£¾È¿¡ ÇÑ ¹®ÀÚ¸¸ ÁÖ¾îÁø °æ¿ì¸¦ Ã£´Â ´Ù°í º¸½Ã¸é µÉ °Í °°½À´Ï´Ù.
		  
		  System.out.println("±Ã±İ=="+Pattern.matches("^[-_.a-z]", "-Á¤ÁØÀÏ"));
		  boolean regex6 = Pattern.matches("[-_.a-zA-Z0-9]*$", value02);

		  System.out.println("regex3="+regex3); 
		  System.out.println("regex4="+regex4); 
		  System.out.println("regex5="+regex5); //ÀÌ°Ô false ÀÎ ÀÌÀ¯´Â 
		  System.out.println("regex6="+regex6); 
		  boolean regex5_5 = Pattern.matches("^[-_.a-zA-Z0-9]*$", value02);
		  System.out.println("regex5_5="+regex5_5); 
		  
		  System.out.println("[^a-zA-Z0-9]*$ = "+value02.replaceAll("[^a-zA-Z0-9]*$", "")); //$°¡ ºÙ¾ú±â ¶§¹®¿¡ Æ¯¼ö¹®ÀÚ·Î ³¡³ª´Â ¹®ÀÚ¿­Àº Æ¯¼ö¹®ÀÚ°¡ ´Ù »ç¶óÁü 
		  System.out.println("[^a-zA-Z0-9]*$ = "+"-_.abc!@#abc!@#".replaceAll("[^a-zA-Z0-9]*$", "")); 
		  System.out.println("[^a-zA-Z0-9]*  ="+value02.replaceAll("[^a-zA-Z0-9]*", ""));
		  System.out.println("[^a-zA-Z0-9]   ="+value02.replaceAll("[^a-zA-Z0-9]", ""));
		  
		  
		  
		  
		  //Áú¹®2
		  // * ÀÌ°Ô ¼³¸í¿¡´Â ¾Õ ¹®ÀÚ°¡ ¾øÀ»¼öµµ ¹«ÇÑÁ¤ ¸¹À» ¼öµµ ÀÖÀ½ ÀÌ¶ó´Âµ¥ Á¤È®È÷ ¹«½¼ ¿ªÇÒÀÎÁö ¸ğ¸£°Ú¾î¿ä
		  // [1]* ÀÇ °æ¿ì 1ÀÌ ¾ø¾îµµ true, ÇÑ°³ ÀÖ¾îµµ true, 100°³ ÀÖ¾îµµ true
		  
		  String test="46546"; 
		  boolean regex7 = Pattern.matches("[1]*", test);
		  System.out.println("regex7="+regex7);
		  
		  String test01="abcd";
		  boolean regex8 = Pattern.matches("^[a|b|c]*", test01);
		  System.out.println("regex8="+regex8);

		  
		  
		  
		  // $ ÀÌ°Ô ¼³¸í¿¡´Â ¹®ÀÚ¿­ Á¾·á ¶ó°í ÇÏ´Âµ¥ ÀÖÀ¸³ª ¾øÀ¸³ª °á°ú°ªÀÌ ¶È°°Àºµ¥ ¹«½¼ ¿ªÇÒÀÎ°¡¿ä?
		  // regex5 °¡ falseÀÎ ÀÌÀ¯´Â ¹«¾ùÀÎ°¡¿ä?
		  //https://codechacha.com/ko/java-regex/
		  //https://highcode.tistory.com/6
		  
	


		
	}

}
