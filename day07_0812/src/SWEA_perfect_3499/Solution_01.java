package SWEA_perfect_3499;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Solution_01 {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("./src/SWEA_perfect_3499/sample_input.txt");
		Scanner sc = new Scanner(file);
//		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt(); // 테스트 케이스 수
		for (int tc = 1; tc < T+1; tc++) {
			int N = sc.nextInt(); // 카드 수
			int R = (int)Math.round((double)N /2);
			
			List<String> L = new ArrayList<>();
			for (int i = 0; i < N; i++) {
				L.add(sc.next());
			} // for : 카드 입력 받기
			List<String> L1 = L.subList(0, R);
			List<String> L2 = L.subList(R, N);
			
			Queue<String> Q = new LinkedList<>();
			for (int i = 0; i < R; i++) {
				if (N%2 != 0 && i == R-1) {
					Q.add(L1.get(i));
				} else {
					Q.add(L1.get(i));
					Q.add(L2.get(i));
				} // if : 홀수면 마지막에 하나만 넣기
			} // for : 교대로 카드를 뽑아 새로운 덱 만들기
			
			System.out.printf("#%d ", tc);
			for (int i = 0; i < N; i++) {
				System.out.printf(Q.poll() + " ");
			} // for : 출력
			System.out.println();
		} // for : 테스트 결과 출력
	} // main
} // Solution_01
