package day02_flattern_1208;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Solution_01 {

	public static void main(String[] args) throws FileNotFoundException {
//		File file = new File("./src/day02_flattern_1208/input.txt");
//		Scanner sc = new Scanner(file);
		Scanner sc = new Scanner(System.in);

		int T = 10; // 테스트 케이스 개수

		for (int tc = 1; tc < T; tc++) {
			int N = sc.nextInt(); // 덤프 횟수
			int[] arr = new int[100]; // 배열 초기화

			for (int i = 0; i < 100; i++) {
				arr[i] = sc.nextInt();
			} // for : 배열 생성
			
			int min = 0; // 최저점
			int max = 0; // 최고점;
			
			while (N > 0) {
				min = 100; max = 1;
				int minNum = 0; int maxNum = 0;
				
				for (int i = 0; i < 100; i++) {
					if (arr[i] <= min) {
						min = arr[i];
						minNum = i;
					} // if : 최저점 찾기
					if (arr[i] >= max) {
						max = arr[i];
						maxNum = i;
					} // if : 최고점 찾기
				} // for : 최저, 최고점 찾기
				
				if (max - min < 2) {
					return;
				} // if : 최고점 - 최저점이 2보다 작으면 평탄화 완료
				
				arr[minNum]++;
				arr[maxNum]--;
				N--;
			} // while : 덤프 횟수만큼 반복

			System.out.printf("#%d %d \n", tc, max - min);
		} // for : 테스트 케이스 결과 출력
	} // main
}
