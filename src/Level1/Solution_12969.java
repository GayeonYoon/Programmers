package Level1;

import java.util.Scanner;

//직사각형 별찍기
public class Solution_12969 {
	public static void main(String[] args) {
 
		int x = 5;
		int y = 3;
		
		for (int i = 0; i < y; i++) {
			for (int j = 0; j < x; j++) {
				System.out.print("*");
			}
			 System.out.println();
		}
	}
}
