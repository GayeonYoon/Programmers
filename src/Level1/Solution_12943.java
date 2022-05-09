package Level1;

// 콜라츠 추측 
public class Solution_12943 {
	public static void main(String[] args) {
		Solution_12943 s = new Solution_12943();

		int n = 626331;

		s.solution(n);
	}

	public int solution(int num) {

		int count = 0;

		while (num != 1) {
			// 짝수
			if (num % 2 == 0) {
				num = num / 2;
			}

			// 홀수
			else if (num % 2 == 1) {
				num = num * 3 + 1;

			}

			count++;

			if (count >= 500) {
				count = -1;
				num = 1; // 얘가 중요하다!!
			}
		}

		System.out.println(count);

		return count;
	}
}
