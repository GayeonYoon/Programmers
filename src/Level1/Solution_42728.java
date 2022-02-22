package Level1;

import java.util.Arrays;

// K번째 수
public class Solution_42728 {
	public static void main(String[] args) {
		int[] array = { 1, 5, 2, 6, 3, 7, 4 };
		int[][] commands = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };

		Solution_42728 sol = new Solution_42728();
		sol.solution(array, commands);
	}

	public int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];

		for (int i = 0; i < commands.length; i++) {
			int x = commands[i][0];
			int y = commands[i][1];
			int k = commands[i][2];

			int[] tmp_array = Arrays.copyOfRange(array, x - 1, y);
			Arrays.sort(tmp_array);
			int answer_num = tmp_array[k - 1];
		
			answer[i] = answer_num;
		}

		System.out.println(Arrays.toString(answer));
		return answer;

/*
		  	int[] answer = new int[commands.length];
			for (int i = 0; i < commands.length; i++) {
				int[] temp = new int[commands[i][1] - (commands[i][0] - 1)];
				for (int j = 0; j < temp.length; j++) {
					temp[j] = array[j + (commands[i][0] - 1)];
				}
			    Arrays.sort(temp);
				answer[i] = temp[commands[i][2] - 1];
			} 
			return answer;
 */
	}

}
