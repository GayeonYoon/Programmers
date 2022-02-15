package Level1;

import java.util.Arrays;

//x만큼 간격이 있는 n개의 숫자
public class Solution_12954 {
	public static void main(String[] args) {
		Solution_12954 sol = new Solution_12954();
		int x = 2;
		int n = 5;

		sol.solution(x, n);
	}

	public Long[] solution(int x, int n) {
		Long[] answer = new Long[n];
		answer[0] = Long.valueOf(x);

		for (int i = 1; i < n; i++) {
			answer[i] = answer[i - 1] + x;
		}

		System.out.println(Arrays.toString(answer));
		return answer;
	}

}