package Level1;

//약수의 합
public class Solution_12928 {

	public static void main(String[] args) {
		int n = 5;
		Solution_12928 sol = new Solution_12928();
		sol.solution(n);

	}

	public int solution(int n) {
		int answer = 0;

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				answer += i;
			}
		}

		return answer;
	}
}
