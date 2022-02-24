package Level1;

import java.util.Arrays;

// 행렬의 덧셈
public class Solution_12950 {
	public static void main(String[] args) {
		int[][] arr1 = { { 1, 2 }, { 2, 3 } };
		int[][] arr2 = { { 3, 4 }, { 5, 6 } };

		Solution_12950 sol = new Solution_12950();
		sol.solution(arr1, arr2);
	}

	public int[][] solution(int[][] arr1, int[][] arr2) {

		int num = 0;
		int array_size = arr1.length;
		int array_index_size = arr1[0].length;
		int[][] answer = new int[array_size][array_index_size];

		for (int i = 0; i < array_size; i++) {
			for (int j = 0; j < array_index_size; j++) {
				num = arr1[i][j] + arr2[i][j];

				answer[i][j] = num;
			}
		}

		// 2중배열 출력시 deepToString  사용하기!
		System.out.println(Arrays.deepToString(answer));

		return answer;
	}
}
