package Level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//정수 내림차순으로 배치하기
public class Solution_12933 {

	public static void main(String[] args) {
		Solution_12933 sol = new Solution_12933();
		long n = 118372;
		sol.solution(n);
	}

	public long solution(long n) {
		long answer = 0;
		String tmp_n = Long.toString(n);
		List<String> list = new ArrayList<String>();

		for (int i = 0; i < tmp_n.length(); i++) {
			String s = tmp_n.substring(i, i + 1);
			list.add(s);
		}

		Collections.sort(list);
		Collections.reverse(list);

		String tmp_s = "";
		for (int i = 0; i < list.size(); i++) {
			tmp_s += list.get(i);
		}
		answer = Long.parseLong(tmp_s);

		return answer;
	}

}
