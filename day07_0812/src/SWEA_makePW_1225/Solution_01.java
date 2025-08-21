package SWEA_makePW_1225;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution_01 {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("./src/SWEA_makePW_1225/input.txt");
		Scanner sc = new Scanner(file);
//		Scanner sc = new Scanner(System.in);
		
		int T = 10; // 테스트 케이스 수
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt(); // 테스트 케이스 번호
			
			Queue<Integer> Q = new LinkedList<>();
			for (int i = 0; i < 8; i++) {
				Q.add(sc.nextInt());
			} // for : 초기 암호 설정
			
			boolean isResult = true;
			int num = 1;
			while(isResult) {
				if (num == 6) {
					num = 1;
				} // if : 뺄 숫자 범위 정의
				if (Q.peek() - num <= 0) {
					Q.poll();
					Q.add(0);
					isResult = false;
					break;
				} // if : 계산했을 때 0보다 작거나 같으면, 0으로 값 추가 후 종료
				Q.add(Q.poll() - num);
				num++;
			} // while : 마지막 숫자가 0이 될 때까지 반복
			
			System.out.printf("#%d ", N);
			for (int i = 0; i < 8; i++) {
				System.out.print(Q.poll() + " ");
			} // for : 결과 출력
			System.out.println();
		} // for : 테스트 결과 출력
	} // main
} // Solution_01
