package STUDY_intro;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// 열 우선순위 조회

public class Solution_02 {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("./src/STUDY_intro/input.txt");
		Scanner sc = new Scanner(file);
//		Scanner sc = new Scanner(System.in);
		// nextLine으로 읽고, 공백을 사용해서 split
		// 그래도 앵간하면 조심

		// 0을 벽처럼 쌓으셔라

		int T = sc.nextInt(); // 테스트케이스 수
		for (int t = 0; t < T; t++) {
			int N = sc.nextInt(); // NxN 배열
			int[][] arr = new int[N][N];

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					arr[i][j] = sc.nextInt();
				}
			} // for : 배열 생성
			
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					System.out.print(arr[j][i] + " ");
				}
				System.out.println();
			} // for : 배열 생성
		} // for : 테스트 케이스 출력
	}
}
