package Level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//자연수 뒤집어 배열로 만들기
public class Solution_12932 {
	public static void main(String[] args) {
		int n = 12345;
		Solution_12932 sol = new Solution_12932();

		sol.solution(n);
	}

	public int[] solution(long n) {
		String s = Long.toString(n);
		int[] answer = new int[s.length()];

		int i = 0;
		while (n > 0) {
			answer[i] = (int) n % 10;
			n = n / 10;
			i++;
		}

		return answer;
	}

	//List 사용
	public int[] solution_a(long n) {

		String tmp_s = Long.toString(n);
		int[] answer = new int[tmp_s.length()];
		List<String> list = new ArrayList<String>();

		for (int i = 0; i < tmp_s.length(); i++) {
			String s = tmp_s.substring(i, i + 1);
			list.add(s);

		}
		Collections.reverse(list);

		for (int i = 0; i < list.size(); i++) {
			answer[i] = Integer.parseInt(list.get(i));
		}

		return answer;
	}

}
