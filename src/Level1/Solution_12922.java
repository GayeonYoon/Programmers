package Level1;

public class Solution_12922 {
	public static void main(String[] args) {
		int n = 4;
		Solution_12922 sol = new Solution_12922();
		sol.solution(n);
	}

	public String solution(int n) {
		String answer = "";

		for (int i = 0; i < n; i++) {
			answer += (i % 2 == 0 ? "수" : "박");

		}
		System.out.println(answer);

		return answer;
	}
}
