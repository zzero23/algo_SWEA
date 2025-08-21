package SWEA_wonjae_1289;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Solution_01 {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("./src/SWEA_wonjae_1289/input.txt");
		Scanner sc = new Scanner(file);
//		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt(); // 테스트케이스 수
		for (int tc = 1; tc < T+1; tc++) {
			char[] C = sc.next().toCharArray();
			Stack<Character> S = new Stack<>();
			
			int count = 0;
			for (char c : C) {
				if (S.isEmpty()) {
					S.push(c);
					if (c == '1') {
						count++;
					} // if : 단, 1일 경우 count
				} else if (!S.isEmpty() && c != S.peek()) {
					S.push(c);
					count++;
				} // if : 스택이 비었거나 이전 값과 값이 다르다면 count
			} // for : 모든 bit 검수
			
			System.out.printf("#%d %d\n", tc, count);
		} // for : 테스트 결과 출력
	} // main
} // Solution_01
