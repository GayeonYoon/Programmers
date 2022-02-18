package Level1;

public class Solution_12931 {
	public static void main(String[] args) {
		int n = 987;
		Solution_12931 sol = new Solution_12931();
		sol.solution(n);
	}

	public int solution(int n) {
		int answer = 0;

		while (n > 0) {
			int cnt = 0;
			answer += n % 10;
			n /= 10;
			cnt++;
		}

		return answer;
	}

}
