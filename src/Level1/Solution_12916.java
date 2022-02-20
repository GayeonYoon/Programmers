package Level1;

//문자열 내 p와 y의 개수
public class Solution_12916 {

	public static void main(String[] args) {
		String s = "Pyy";
		Solution_12916 sol = new Solution_12916();
		sol.solution(s);
	}

	public boolean solution(String s) {
		boolean answer = false;
		String tmp_s = s.toUpperCase();

		int count = 0;
		
		String[] tmp_s_array = tmp_s.split("");
		for (int i = 0; i < tmp_s_array.length; i++) {
			if (tmp_s_array[i].equals("P")) {
				count++;
			} else if (tmp_s_array[i].equals("Y")) {
				count--;
			}
		}
		answer = (count == 0 ? true : false);

		return answer;

	}

}
