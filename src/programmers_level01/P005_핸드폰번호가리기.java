package programmers_level01;

public class P005_핸드폰번호가리기 {

    public static String solution(String phone_number) {
        String answer = "";
        int len=phone_number.length()-4; 
        for(int i=0; i<len; i++){
            answer+="*";
        }
        answer+=phone_number.substring(len);
        return answer;
    }
    //https://programmers.co.kr/learn/courses/30/lessons/12948
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
