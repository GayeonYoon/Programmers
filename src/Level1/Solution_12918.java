package Level1;

// 문자열 다루기 기본
public class Solution_12918 {

	public static void main(String[] args) {
		String s = "1234";
		Solution_12918 sol = new Solution_12918();
		sol.solution(s);
	}

	public boolean solution(String s) {
		boolean answer = false;

		if (s.length() == 4 || s.length() == 6) {
			try {
				int x = Integer.parseInt(s);
				answer = true;
			} catch (NumberFormatException e) {
				answer = false;
			}
		}

		return answer;
	}

}
