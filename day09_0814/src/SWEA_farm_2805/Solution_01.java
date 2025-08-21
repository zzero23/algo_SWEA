package SWEA_farm_2805;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution_01 {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("./src/SWEA_farm_2805/input.txt");
		Scanner sc = new Scanner(file);
//		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt(); // 테스트케이스 수
		for (int tc = 1; tc < T+1; tc++) {
			int N = sc.nextInt(); // 농장 크기
			sc.nextLine();
			
			char[][] I = new char[N][N];
			for (int r = 0; r < N; r++) {
				I[r] = sc.nextLine().toCharArray();
			} // for : 농장 생성
			
			// 좌우 (열)
			int[] dc = {-1, 1};
			
			int num = 0;
			int R = 0;
			for (int r = 0; r < N; r++) {
				if (r <= N/2) {
					num++;
					for (int d = 0; d < dc.length; d++) {
						for (int n = 0; n < num; n++) {
							int nextC = N/2 + dc[d] * n;
							R += I[r][nextC] - '0';
						} // for : 얼마나 더 많이 증가할건지 결정 후 더함
					} // for : 이동 범위 (좌, 우)
				} else if (r > N/2){
					num--;
					for (int d = 0; d < dc.length; d++) {
						for (int n = num-1; n >= 0; n--) {
							int nextC = N/2 + dc[d] * n;
							R += I[r][nextC] - '0';
						} // for : 얼마나 더 많이 증가할건지 결정 후 더함
					} // for : 이동 범위 (좌,우)
				} // if : 절반보다 작으면 증가, 크면 감소
			} // for : 농경지 반복 순회

			for (int r = 0; r < N; r++) {
				int c = N/2;
				R -= I[r][c] - '0';
			} // for : 반복 더해진 중간 열 빼기
			
			System.out.printf("#%d %d\n", tc, R); // 결과
		} // for : 테스트 결과 출력
	} // main
} // Solution_01
