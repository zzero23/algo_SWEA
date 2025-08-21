package SWEA_junHong_7102;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Solution_01 {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("./src/SWEA_junHong_7102/sample_input.txt");
		Scanner sc = new Scanner(file);
//		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt(); // 테스트 케이스 수
		for (int tc = 1; tc < T+1; tc++) {
			int N = sc.nextInt(); // 첫번째 카드 세트
			int M = sc.nextInt(); // 두번째 카드 세트
			
			int[] I1 = new int[N];
			int[] I2 = new int[M];
			for (int i = 1; i < N+1; i++) {
				I1[i - 1] = i;
			} // for : 첫번째 카드 세트 완성
			for (int i = 1; i < M+1; i++) {
				I2[i - 1] = i;
			} // for : 두번째 카드 세트 완성
			
			List<Integer> L = new ArrayList<>(); 
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					L.add(I1[i] + I2[j]);
				}
			} // for : 첫번째 카드, 두번째 카드 합
			
			for (int i = 0; i < L.size() -1; i++) {
				for (int j = 0; j < L.size() -1; j++) {
					if (L.get(j) > L.get(j+1)) {
						int tmp = L.get(j + 1);
						L.add(j+1, L.get(j));
						L.remove(j+2);
						L.add(j, tmp);
						L.remove(j+1);
					}
				}
			} // for : 버블 정렬 
			
			List<Integer> MaxN = new ArrayList<>();
			int maxC = 0;
			Stack<Integer> S = new Stack<>();
			for (int i = 0; i < L.size(); i++) {
				int num = 0;
				if (S.isEmpty() || (!S.isEmpty() && S.peek() == L.get(i))) {
					S.push(L.get(i));
				} else {
					int count = 0;
					while (!S.isEmpty()) {
						num = S.pop();
						count++;
					}
					if (count > maxC) {
						maxC = count;
						MaxN.clear();
						MaxN.add(num);
					} else if (count == maxC) {
						MaxN.add(num);
					} // if : 등장할 확률이 가장 높은 숫자면 배열 초기화
				} // if : 이전 값과 같다면 stack에 추가, 아니라면 전부 빼서 counting
			} // for : 오름차순으로 정렬된 배열에서 등장할 확률이 가장 높은 숫자 구하기
			
			System.out.printf("#%d ", tc);
			for (int i : MaxN) {
				System.out.printf("%d ", i);
			} // 결과값 출력
			System.out.println(); // 다음 행에 출력
		} // 테스트 결과 출력
	} // main
} // Solution_01 : Stack, 버블정렬
