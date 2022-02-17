package Level1;

//평균 구하기
public class Solution_12944 {

	public static void main(String[] args) {
		Solution_12944 sol = new Solution_12944();
		int[] arr = { 1, 2, 3, 4 };
		sol.solution(arr);
	}

	public double solution(int[] arr) {
		int total = 0;
		double avg = 0;

		for (int i = 0; i < arr.length; i++) {
			total += arr[i];
		}
		avg = (double) total / arr.length;

		System.out.println(avg);
		return avg;
	}

}