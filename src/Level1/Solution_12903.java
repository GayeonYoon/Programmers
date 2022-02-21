package Level1;

// 가운데 글자 가져오기
public class Solution_12903 {

	public static void main(String[] args) {
		String s = "abcde";
		Solution_12903 sol = new Solution_12903();
		sol.solution(s);
	}

	public String solution(String s) {
		String answer = "";
		int start_index = s.length() / 2;

		if (s.length() % 2 == 0) { // 짝수
			answer += s.substring(start_index - 1, start_index + 1);
		} else { // 홀수
			answer += s.substring(start_index, start_index + 1);
		}

		return answer;
	}
}
