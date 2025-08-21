package SWEA_twoInt_1959;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Solution_01 {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("./src/SWEA_twoInt_1959/input.txt");
		Scanner sc = new Scanner(file);
//		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt(); // 테스트케이스 수
		for (int tc = 1; tc < T+1; tc++) {
			int N = sc.nextInt(); // 첫번째 숫자열
			int M = sc.nextInt(); // 두번째 숫자열
			
			int[] NI = new int[N];
			int[] MI = new int[M];
			for (int i = 0; i < N; i++) {
				NI[i] = sc.nextInt();
			} // for : 첫번째 숫자열
			for (int i = 0; i < M; i++) {
				MI[i] = sc.nextInt();
			} // for : 두번째 숫자열
			
			int[] L; int[] S;
			if (NI.length < MI.length) {
				L = MI; S = NI;
			} else { L = NI; S = MI; }// if : 더 긴 숫자열 판별
			
			int max = 0;
			for (int i = 0; i < (L.length - S.length) + 1; i++) {
				int R = 0;
				int num = 0;
				for (int j = i; j < i + S.length; j++) {
					R += L[j] * S[num++];
				} // for : 곱한 총 합
				if (R > max) {
					max = R;
				} // if : 최대 값
			} // for : 문자열 비교
			
			System.out.printf("#%d %d\n", tc, max); // 결과
		} // for : 테스트 결과 출력
	} // main
} // Solution_01
