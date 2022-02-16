package Level1;

//핸드폰 번호 가리기

public class Solution_12948 {
	public static void main(String[] args) {
		String phone_number = "01033334444";
		int tmpLength = phone_number.length() - 4;
		String tmpNumber = phone_number.substring(0, tmpLength);
		String answer = ""; 
		
 for(int i = 0; i<phone_number.length(); i++) {
	 System.out.println((phone_number.length() - i) <= 4);
	 answer += (phone_number.length() - i) <= 4 ? phone_number.charAt(i) : '*';
 }
		
		 
		System.out.println(answer);
		

		
		
	}

}
