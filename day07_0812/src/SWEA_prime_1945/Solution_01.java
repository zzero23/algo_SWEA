package SWEA_prime_1945;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution_01 {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("./src/SWEA_prime_1945/input.txt");
		Scanner sc = new Scanner(file);
//		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt(); // 테스트 케이스 수
		for (int tc = 1; tc < T+1; tc++) {
			int N = sc.nextInt(); // 소인수 분해 대상
			int[] I = {2, 3, 5, 7, 11};
			
			System.out.printf("#%d ", tc);
			for (int i : I) {
				int count = 0;
				int[] R = prime(N, i, count); // 소인수 분해
				R[0] = N; // 몫
				System.out.print(R[1] + " "); // 결과 출력
			} // for : 2, 3, 5, 7, 11로 나누기
			System.out.println();
			
		} // for : 테스트 결과 출력
	} // main
	
	public static int[] prime(int num, int i, int count) {
		int N = num % i; // 나머지
		int M = num / i; // 몫
		if (N != 0) {
			int[] R = {M, count};
			return R;
		} // if : 탈출조건 (나머지가 0이 아닐 경우)
		count++;
		return prime(M, i, count); // return : 재귀
	} // 소인수 분해 함수
} // Solution_01
