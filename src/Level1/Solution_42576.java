package Level1;

import java.util.Arrays;

//완주하지 못한 선수
public class Solution_42576 {
	public static void main(String[] args) {
		Solution_42576 sol = new Solution_42576();
		String[] participant = { "leo", "kiki", "eden" };
		String[] completion = { "eden", "kiki" };

		sol.solution(participant, completion);

	}

	public String solution(String[] participant, String[] completion) {

		Arrays.sort(participant);
		Arrays.sort(completion);

		int i;
		for (i = 0; i < completion.length; i++) {
			if (!participant[i].equals(completion[i])) {
				return participant[i];
			}
		}

		return participant[i];
	}

}
