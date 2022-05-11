package Level1;

import java.util.ArrayList;
import java.util.List;

// 2019 카카오 개발자 겨울 인턴십 > 크레인 인형뽑기 게임
// 온전히 내 힘으로 풀어따~~~ >3< 오예

public class Solution_64061 {

	public static void main(String[] args) {

		Solution_64061 s = new Solution_64061();

		int[][] board = { { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 3 }, { 0, 2, 5, 0, 1 }, { 4, 2, 4, 4, 2 },
				{ 3, 5, 1, 3, 1 } };
		int[] moves = { 1, 5, 3, 5, 1, 2, 1, 4 };

		s.solution(board, moves);
	}

	public int solution(int[][] board, int[] moves) {

		// 새로 담을 바스켓 list
		List<Integer> list = new ArrayList<Integer>();

		// 바스켓에 넣을 선택된 수
		int select_num = 0;

		// 중복되어 삭제된 총 count
		int count = 0;

		for (int i = 0; i < moves.length; i++) {
			int move_count = 0; // moves 한번 이동할때마다 count 초기화

			// board[반복문 돌면서 0 이 아닌수 하나 찾아내기][num으로 고정]
			for (int j = 0; j < board.length; j++) {
				select_num = board[j][moves[i] - 1];

				if (select_num != 0 && move_count != 1) {
					move_count++; // 이동 count가 1이되면 더이상 진행하지 않음. 즉, 1일때만 진행.
					board[j][moves[i] - 1] = 0; // 기존에 있던 숫자를 0으로 바꿔주기

					// 새로운 바스켓에 a 를 넣어. 인덱스 맞춰서 순서대로.
					if (list.isEmpty()) { // 처음 list가 비어있다면 무조건 add
						list.add(select_num);
					} else { // 바스켓이 비어있지않다면 끝에 있는 값과 넣을 값을 비교하기
						if (list.get(list.size() - 1) != select_num) { // 새로 넣을 수가 마지막 수와 같지 않을때만 add!
							list.add(select_num);
						} else { // 같은 수가 있다면 add하지않고, 기존에 있던 마지막 값도 삭제처리.
							list.remove(list.size() - 1); 
							count += 2;
						}
					}
				}

			}
		}

		return count;
	}

}
