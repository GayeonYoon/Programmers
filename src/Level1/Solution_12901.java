package Level1;

import java.util.Calendar;
import java.util.Locale;

//2016년
public class Solution_12901 {

	public static void main(String[] args) {

		int month = 5;
		int day = 24;

		Solution_12901 sol = new Solution_12901();
		sol.solution(month, day);

	}

	public String solution(int month, int day) {
		int year = 2016;
		String answer = "";

		Calendar cal = Calendar.getInstance();
		cal.set(year, month - 1, day); 	// -1을 하는 이유 ** 

		answer = cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.SHORT, new Locale("KR")).toUpperCase();

		System.out.println(answer);

		return answer;
	}

}
