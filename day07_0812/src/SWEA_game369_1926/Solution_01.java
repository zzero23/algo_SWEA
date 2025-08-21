package SWEA_game369_1926;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution_01 {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("./src/SWEA_game369_1926/input.txt");
		Scanner sc = new Scanner(file);
//		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // 임의의 정수
		
		for (int n = 1; n < N+1; n++) {
			boolean isNot3 = true;
			char[] C = Integer.toString(n).toCharArray();
			for (char c : C) {
				if (c == '3' || c == '6' || c == '9') {
					isNot3 = false;
					System.out.print('-');
				} // if : 369에 해당하면 - 출력
			} // for : 한자리 수가 아닐경우 대비
			if (isNot3) {
				System.out.print(n);
			} // if : 369에 해당하지 않으면 숫자 출력
			System.out.print(" ");
		} // for : 369 게임 시작
	} // main
} // Solution_01
