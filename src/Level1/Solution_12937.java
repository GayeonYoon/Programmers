package Level1;

public class Solution_12937 {
	
	public static void main(String[] args) {
		Solution_12937 sol = new Solution_12937();
		sol.solution(4);
	}

	public String solution(int num) {
		String result = "";
		
		if (num % 2 == 0) { // 짝수
			result = "Even";
		} else {
			result = "Odd";
		}

		return result;
	}
	
}
