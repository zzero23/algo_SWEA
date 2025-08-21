package SWEA_GNS_1221;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Solution_01 {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("./src/SWEA_GNS_1221/GNS_test_input.txt");
		Scanner sc = new Scanner(file);
//		Scanner sc = new Scanner(System.in);
		
		String[] S = {"ZRO", "ONE", "TWO", "THR", "FOR", "FIV", "SIX", "SVN", "EGT", "NIN"};
		HashMap<String, Integer> M = new HashMap<>();
		for (int i = 0; i < S.length; i++) {
			M.put(S[i], i+1);
		} // for : 숫자 사전 
		
		int T = sc.nextInt(); // 테스트 케이스 수
		for (int tc = 1; tc < T+1; tc++) {
			String C = sc.next(); // 테스트 케이스 번호
			
			int N = sc.nextInt(); // 단어 수
			System.out.println(N);
			String[] I = new String[N];
			for (int i = 0; i < N; i++) {
				I[i] = sc.next();
			} // for : 단어 -> 숫자로 변환
			
			for (int i = 0; i < N - 1; i++) {
				for (int j = 0; j < N - 1; j++) {
					if (M.get(I[j]) > M.get(I[j+1])) {
						String tmp = I[j+1];
						I[j+1]  = I[j];
						I[j] = tmp;
					}
				}
			} // for : 버블정렬
			
			System.out.println(C);
			for (String s : I) {
				System.out.print(s + " ");
			}
		} // for : 테스트 결과 출력
	}// main
} // Solution_01
