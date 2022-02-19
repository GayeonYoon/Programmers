package Level1;

//이상한 문자 만들기
public class Solution_12930 {
	public static void main(String[] args) {
		String s = "try hello world";
		Solution_12930 sol = new Solution_12930();
		sol.solution(s);
	}

	public String solution(String s) {
		String answer = "";
		String[] str_array = s.split(" ", -1);

		for (int i = 0; i < str_array.length; i++) {
			// String tmp_str = str_array[i];
			for (int j = 0; j < str_array[i].length(); j++) {
				answer += (j % 2 == 0 ? str_array[i].substring(j, j + 1).toUpperCase()
						: str_array[i].substring(j, j + 1).toLowerCase());
			}
			answer += " ";
		}

		answer = answer.substring(0, answer.length() - 1);
		
		return answer;
	}
}
