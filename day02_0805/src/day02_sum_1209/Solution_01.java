package day02_sum_1209;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution_01 {

	public static void main(String[] args) throws FileNotFoundException {
//		File file = new File("./src/day02_sum_1209/input.txt");
//		Scanner sc = new Scanner(file);
		Scanner sc = new Scanner(System.in);

		int N = 100;
		int[][] arr = new int[N][N]; // 100X100 배열 선언 및 초기화

		for (int t = 0; t < 10; t++) {
			int tc = sc.nextInt();   // 테스트 케이스 번호
			
			for (int i = 0; i < 100; i++) {
				for (int j = 0; j < 100; j++) {
					arr[i][j] = sc.nextInt();
				} // for : 행의 각 원소에 값 입력
			} // for : 열 (NXN 배열 생성)

			int maxR = Integer.MIN_VALUE; // 행 합 중 최대 값
			int maxC = Integer.MIN_VALUE; // 열 합 중 최대 값
			int result = 0;
			int sumR = 0; // 행 합
			int sumC = 0; // 열 합
			int diag1 = 0; // 대각선1 합
			int diag2 = 0; // 대각선 2 합

			for (int i = 0; i < 100; i++) {
				for (int j = 0; j < 100; j++) {
					sumR += arr[i][j]; // 행 합
					sumC += arr[j][i]; // 열 합
					diag1 += arr[i][N - 1 - i]; // 대각선1 합
					if (i == j) {
						diag2 += arr[i][j];
					} // if : 대각선2 합
				}
				if (maxR < sumR) {
					maxR = sumR;
				} // if : 최대 행 합 구하기

				if (maxC < sumC) {
					maxC = sumC;
				} // if : 최대 열 합 구하기
				sumR = 0; sumC = 0; diag1 = 0; diag2 = 0;
			} // for : 행 합, 열 합, 대각선1 합, 대각선2 합 구하기

			int[] arrR = { maxR, maxC, diag1, diag2 };

			for (int m : arrR) {
				if (result < m) {
					result = m;
				}
			} // for : 최대값 구하기
			System.out.printf("#%d %d\n", tc, result);
		}
	}

}
