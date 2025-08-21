package SWEA_zero_8931;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Solution_01 {

	public static void main(String[] args) throws FileNotFoundException {
//		File file = new File("./src/day04_0807/sample_input.txt");
//		Scanner sc = new Scanner(file);
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt(); // 테스트케이스 수
		
		for (int i = 1; i < T+1; i++) {
			int N = sc.nextInt(); 		// 담길 정수
			int result = 0;             // 결과
			
			Stack<Integer> arr = new Stack<>();
			
			for (int j = 0; j < N; j++) {
				int K = sc.nextInt(); // 재현이가 부르는 값
				if (K == 0) {
					arr.pop();
				} else {
					arr.push(K);
				} // if : 재현이가 0을 불렀을 경우
			} // for : 재현이가 값을 다 부를 때까지 
			
			while (!arr.isEmpty()) {
				result += arr.pop();
			} // while : 비어있으면 재민이가 적은 수의 합 출력
			
			System.out.printf("#%d %d\n", i, result);
		} // for : 테스트 케이스 반복 
	} // main
} // Solution_01
