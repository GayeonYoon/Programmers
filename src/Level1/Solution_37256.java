package Level1;

//2020 카카오 인턴십 > 키패드 누르기
public class Solution_37256 {

	public static void main(String[] args) {
		Solution_37256 s = new Solution_37256();
		int[] numbers = { 1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5 };
		String hand = "right";

		s.solution(numbers, hand);
	}

	public String solution(int[] numbers, String hand) {
		String answer = "";
		
		char[][] keypad = {{'1','2', '3'},{'4', '5', '6'},{'7', '8', '9'},{'*', '0', '#'}};
		
		/*
		 * {	 0  1  2
		 * 	 0	{1, 2, 3},
		 * 	 1	{4, 5, 6},
		 * 	 2	{7, 8, 9},
		 * 	 3	{*, 0, #} 
		 * }
		 * */
		
		char number = keypad[0][0];
		
		System.out.println(keypad[0][0]);
		System.out.println(keypad[1][1]);
		System.out.println(keypad[2][0]);
		
		/*   
		 * 오른손	: [i][0]
		 * 
		 * 가까운손 : [i][1]
		 * 
		 * 왼손 : [i][2]
		 * 
		 * 
		 */
		
		
		
		
		
		
		// numbers : 
		for (int i = 0; i < numbers.length; i++) {
			
			// keypad 이중배열을 돌면서 numbers의 값이 keypad의 위치를 찾아서 ..  있다면 
			// 더 가까운 손으로 누르고 (계산 필요함 - 한칸에  + 1 )
			//  어느손으로 눌렀는지 L R을 append 시켜야함
			
			
			
		}
		
		return answer;
	}

}
