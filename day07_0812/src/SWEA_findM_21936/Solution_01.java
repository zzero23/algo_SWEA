package SWEA_findM_21936;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution_01 {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("./src/SWEA_findM_21936/sample_in.txt");
		Scanner sc = new Scanner(file);
//		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt(); // 테스트 케이스 수
		for (int tc = 1; tc < T+1; tc++) {
			int N = sc.nextInt(); // 길이가 N인 문자열
			int M = sc.nextInt(); // 길이가 M인 문자열
			String S = sc.next(); // 회문
			
			boolean isResult = true;
			String S1 = null;
			
			System.out.printf("#%d ", tc);
			for (int i = 0; i < M; i++) {
				isResult = true;
				S1 = S.substring(i, i + M);
				for (int j = 0; j <M/2; j++) {
					if (S1.charAt(j) != S1.charAt(M-1-j)) {
						isResult = false;
						break;
					}
				} // for : substring으로 비교
				if (isResult)
					break; // if : isResult가 true이면 멈추기
			} // for :길이가 M인 회문 찾기 
			
			String R = isResult ? S1 : "NONE";
			System.out.print(R + "\n"); // 출력
		} // for : 테스트 케이스 결과 출력
	} // main
} // Solution_01
