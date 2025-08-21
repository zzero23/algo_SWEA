package SWEA_string_1213;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Solution_01 {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("./src/SWEA_string_1213/test_input.txt");
		Scanner sc = new Scanner(file);
//		Scanner sc = new Scanner(System.in);
		
		int T = 10; // 테스트 케이스 개수
		
		for (int t = 0; t < T; t++) {
			int tc = sc.nextInt();
			sc.nextLine();
			
			String S1 = sc.nextLine();       // 검색할 문자열
			String S2 = sc.nextLine();       // 문장
			
			
			int count = 0;                   // 존재하는 검색할 문자 개수
			
			for (int i = 0; i < S2.length() - S1.length(); i++) {
				if (S2.substring(i, i + S1.length()).equals(S1)) {
					count++;
				} // if : 비교
			} // for : 검색할 단어 수
			
			System.out.printf("#%d %d\n", tc, count);
		} // for : 테스트 케이스 결과 출력

	}

}
