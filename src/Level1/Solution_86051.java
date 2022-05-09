package Level1;

//없는 숫자 더하기
// numbers의 길이 : 1 ≤ numbers의 길이 ≤ 9
//  0 ≤ numbers의 모든 원소 ≤ 9
public class Solution_86051 {

	public static void main(String[] args) {
		Solution_86051 s = new Solution_86051();

		// int[] numbers = { 1, 2, 3, 4, 6, 7, 8, 0 };
		int[] numbers = { 5, 8, 4, 0, 6, 7, 9 };

		s.solution(numbers);

	}

	public int solution(int[] numbers) {
		int answer = 0;
		
		
		// 1. 범위에 속한 수의 총합을 구함.
		for (int i = 0; i <= 9; i++) {
			answer += i;
		}
		
		// 2. 총합에서 int[] 안에 있는 수를 뺌.
		for(int number : numbers) {
			answer -= number;
		}
		 

		return answer;
	}

}
