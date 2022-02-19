package Level1;

//문자열을 정수로 바꾸기
public class Solution_12925 {
	public static void main(String[] args) {
		String s = "-1234";
		Solution_12925 sol = new Solution_12925();
		sol.solution(s);
	}

	public int solution(String s) {
		int answer = 0;
		answer = Integer.parseInt(s);

		return answer;
	}
}
