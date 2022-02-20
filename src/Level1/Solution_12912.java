package Level1;

//두 정수 사이의 합
public class Solution_12912 {

	public static void main(String[] args) {
		int a = 3;
		int b = 3;
		Solution_12912 sol = new Solution_12912();
		sol.solution(a, b);
	}

	public long solution(int a, int b) {
		long answer = 0;

		int min = 0;
		int max = 0;

		if (a > b) {
			min = b;
			max = a;
		} else if (a < b) {
			min = a;
			max = b;
		} else {
			answer = a;
		}

		for (int i = min; i <= max; i++) {
			answer += i;
		}

		return answer;
	}
}
