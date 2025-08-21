package day02_twoString_1959;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Solution_01 {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("./src/day02_twoString_1959/input.txt");
		Scanner sc = new Scanner(file);
//		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt(); // 테스트 케이스 수
		
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt(); // 첫번째 배열 수
			int M = sc.nextInt(); // 두번째 배열 수

			if (M < N) {
				int tmp = M;
				M = N;
				N = M;
			}
			
			int[] arrN = new int[N]; // 첫번째 배열 초기화
			int[] arrM = new int[M]; // 두번째 배열 초기화
			
			for (int i = 0; i < N; i++) {
				arrN[i] = sc.nextInt();
			} // for : 첫번째 배열 생성
			System.out.println(N);
			System.out.println(Arrays.toString(arrN));
			
			for (int i = 0; i < M; i++) {
				arrM[i] = sc.nextInt();
			} // for : 두번째 배열 생성
			
			int n = 0;
			int max = 0;
			
			while (N - n < arrM.length) {
				int sum = 0;
				int m = 0;
				for (int i = n; i < N; i++) {
					if (N - n < arrM.length) {
						break;
					}
					sum += arrN[i] * arrM[m];
					m++;
				}
				if (sum > max) {
					max = sum;
				}
				n++;
			}
			
			System.out.printf("#%d %d\n", tc, max);
		} // for : 테스트케이스 결과 출력
	}

}
