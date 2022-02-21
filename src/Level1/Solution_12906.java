package Level1;

import java.util.ArrayList;
import java.util.List;

// 같은 숫자는 싫어
public class Solution_12906 {
	public static void main(String[] args) {
		int[] arr = { 4, 4, 4, 3, 3 };
		Solution_12906 sol = new Solution_12906();
		sol.solution(arr);
	}

	public int[] solution(int[] arr) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(arr[0]);

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != arr[i - 1]) {
				list.add(arr[i]);
			}
		}

		int[] answer = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}

		// stream 사용
		// int[] answer = list.stream().mapToInt(i -> i).toArray();

		return answer;
	}

}
