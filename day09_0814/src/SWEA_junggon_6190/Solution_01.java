package SWEA_junggon_6190;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution_01 {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("./src/SWEA_junggon_6190/s_input.txt");
		Scanner sc = new Scanner(file);
//		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt(); // 테스트케이스 수
		for (int tc = 1; tc < T+1; tc++) {
			int N = sc.nextInt(); // 정수
			
			int[] I = new int[N];
			for (int i = 0; i < N; i++) {
				I[i] = sc.nextInt();
			} // for : 정수 배열 생성
			
			int max = -1;
			for (int i = 0; i < I.length; i++) {
				for (int j = i+1; j < I.length; j++) {
					int num = I[i] * I[j];
					
					char[] C = Integer.toString(num).toCharArray();
					if (C.length > 1) {
						for (int k = 0; k < C.length-1; k++) {
							if (C[k] > C[k+1]) {
								num = -1;
								break;
							} // if : 단조 증가가 아닐 경우 -1
						} // for : 각 자리 수 비교
					} // if : 한자리 수가 아닐 경우 실행
					
					if (num > max) {
						max = num;
					} // if : 최대값
				} // for : 정수 배열 (피연산자 2)
			} // for : 정수 배열 (피연산자 1)
			
			System.out.printf("#%d %d\n", tc, max); // 결과 
		} // for : 테스트 결과 출력
	} // main
} // Solution_01
