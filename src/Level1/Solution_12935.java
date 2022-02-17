package Level1;

import java.util.ArrayList;
import java.util.List;

//제일 작은 수 제거하기
public class Solution_12935 {
	public static void main(String args[]) {
		int[] arr = { 4, 3, 2, 1 };

		Solution_12935 sol = new Solution_12935();
		sol.solution(arr);

	}

	public int[] solution(int[] arr) {
		int[] answer = { -1 };

		List<Integer> list = new ArrayList<Integer>();
		for (Integer i : arr) {
			list.add(i);
		}

		int min = arr[0];

		for (Integer i : list) {
			if (min > i) {
				min = i;
			}
		}
		list.remove(list.indexOf(min));

		if (list.size() > 0) {
			answer = new int[list.size()];
			for (int i = 0; i < list.size(); i++) {
				answer[i] = list.get(i);

			}
		}

		//System.out.println(Arrays.toString(answer));

		return answer;
	}

}
