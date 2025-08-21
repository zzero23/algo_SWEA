package SWEA_bus_6485;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution_01 {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("./src/SWEA_bus_6485/s_input.txt");
		Scanner sc = new Scanner(file);
//		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt(); // 테스트케이스 수
		
		for (int tc = 1; tc < T+1; tc++) {
			int N = sc.nextInt(); // 버스 노선 수
			
			List<Integer> L = new ArrayList<>();
			for (int n = 0; n < N; n++) {
				int A = sc.nextInt();
				int B = sc.nextInt();
				for (int i = A; i < B+1; i++) {
					L.add(i);
				} // for : 한 노선 당, 버스가 지나치는 정류장 기록
			} // for : 각 버스 노선 검사 
			
			int P = sc.nextInt(); // 정류장
			int[] I = new int[P];
			for (int i = 0; i < P; i++) {
				I[i] = sc.nextInt();
			} // for : 버스 정류장 배열 생성
			
			System.out.printf("#%d ", tc);
			for (int i : I) {
				int count = 0;
				for (int l : L) {
					if (i == l) {
						count++;
					} // if : 일치하는 버스 정류장이 있다면 counting
				} // for : 버스들이 지나치는 모든 정류장
				System.out.print(count + " ");
			} // for : 검사할 버스 정류장
			System.out.println();
		} // for : 테스트 결과 출력
	} // main
} // Solution_01
