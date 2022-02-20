package Level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 나누어 떨어지는 숫자 배열
public class Solution_12910 {

	public static void main(String[] args) {
		int[] arr = { 3, 2, 6 };
		int divisor = 10;

		Solution_12910 sol = new Solution_12910();
		sol.solution(arr, divisor);
	}

	public int[] solution(int[] arr, int divisor) {

		int cnt = 0;
		List<Integer> tmp_list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % divisor == 0) {
				tmp_list.add(arr[i]);
				cnt++;
			}
		}

		if (cnt == 0) {
			tmp_list.add(-1);
		}

		int[] answer = new int[tmp_list.size()];
		for (int i = 0; i < tmp_list.size(); i++) {
			answer[i] = tmp_list.get(i);
		}
		Arrays.sort(answer);

		return answer;

	}
}
