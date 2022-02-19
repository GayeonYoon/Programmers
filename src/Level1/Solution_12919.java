package Level1;

//서울에서 김서방 찾기
public class Solution_12919 {

	public static void main(String[] args) {
		String[] seoul = { "Jane", "Kim" };
		Solution_12919 sol = new Solution_12919();
		sol.solution(seoul);
	}

	public String solution(String[] seoul) {
		String answer = "";
		int x = 0;
		for (int i = 0; i < seoul.length; i++) {
			if (seoul[i].equals("Kim")) {
				x = i;
			}
		}
		answer = "김서방은 " + x + "에 있다";

		return answer;
	}

}
