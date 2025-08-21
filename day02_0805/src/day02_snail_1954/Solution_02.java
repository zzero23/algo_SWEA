package day02_snail_1954;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Solution_02 {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("./src/day02_snail_1954/input.txt");
		Scanner sc = new Scanner(file);
//		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt(); // 테스트 케이스 수
		System.out.println(T);

		for (int t = 0; t < T; t++) {
			int N = sc.nextInt();
			int[][] arr = new int[N][N]; // NxN
			
			int K = N;
			int r = N-1; // 행 시작 지점
			int c = N; // 열 시작 지점
			int D = -1; // 증감 계산
			int num = 1; // 입력할 숫자
			
			while (true) {
				for (int i = 0; i < K; i++) {
					c += D;
					arr[r][c] = num++;
				} // for : 수평 -> 수직
				K--;

				if (K == 0) {
					break;
				}
				
				for (int i = 0; i < K; i++) {
					r += D;
					arr[r][c] = num++;
				} // for : 수직 -> 수평
				D = -D;
			}
			System.out.println("# " + t);
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					System.out.print(arr[i][j]);
				}
				System.out.println();
			} // for : 달팽이 출력
		} // for : 테스트 케이스 결과 출력
	} // main
}
