package Level1;

import java.util.Arrays;

//하샤드 수
public class Solution_12947 {

	public static void main(String[] args) {
		int x = 11;

		Solution_12947 sol = new Solution_12947();
		sol.solution(x);
	}

	public boolean solution(int x) {
		boolean answer = true;
		int sum = 0;

// 근데 점수 or 속도는 이게 더 빠름
//		String str_x = Integer.toString(x);
//		for (int i = 0; i < str_x.length(); i++) {
//			sum += Character.getNumericValue(str_x.charAt(i));
//		}
		
		// 이게 더 낫다
		String[] array_x = String.valueOf(x).split("");
		for (int i = 0; i < array_x.length; i++) {
			sum += Integer.parseInt(array_x[i]);
		}

		if(x % sum != 0) {  
			answer = false;
		}
		
		return answer;
	}

}
