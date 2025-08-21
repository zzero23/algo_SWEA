package SWEA_parentheses_1218;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class Solution_01 {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("./src/SWEA_parentheses_1218/input.txt");
		Scanner sc = new Scanner(file);

		int T = 10;

		for (int t = 0; t < T; t++) {
			int N = sc.nextInt();
			sc.nextLine();
			String S = sc.nextLine();
			int result = 1;

			char[] arr = { '(', '<', '{', '[' };
			Stack<Character> st = new Stack<>();

			for (int i = 0; i < N; i++) {
				if (S.charAt(i) == '(' || S.charAt(i) == '<' || S.charAt(i) == '[' || S.charAt(i) == '{') {
					st.push(S.charAt(i));
				} else {
					for (char c : arr) {
						if (S.charAt(i) == c) {
							if (st.pop() != c || st.isEmpty()) {
								result = 0;
								break;
							}
						}
					}
				} // if : 괄호 짝 짓기
			} // for : 배열 원소 반복
			
			if (st.isEmpty()) {
				result = 0;
			}
			
			System.out.printf("#%d %d\n", t, result);
		} // for : 테스트 케이스 결과 출력
	}
}
