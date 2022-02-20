package Level1;

import java.util.Arrays;
import java.util.Collections;

//문자열 내림차순으로 배치하기
public class Solution_12917 {
	public static void main(String[] args) {
		String s = "Zbcdefg";
		Solution_12917 sol = new Solution_12917();
		sol.solution(s);
	}

	public String solution(String s) {
		String answer = "";
		String[] tmp_array = s.split("");

		Arrays.sort(tmp_array, Collections.reverseOrder());
		answer = String.join("", tmp_array);

		return answer;
	}

}
