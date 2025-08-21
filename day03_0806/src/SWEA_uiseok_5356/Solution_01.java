package SWEA_uiseok_5356;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution_01 {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("./src/SWEA_uiseok_5356/sample_input.txt");
		Scanner sc = new Scanner(file);
//		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt(); // 테스트 케이스 개수
		int N = 5; 			  // 의석이가 만드는 단어 수 (5개)
		int maxLine = 0;      // 의석이가 만든 단어 중 최대 길이
		
		for (int n = 0; n < T; n++) {
			String[] arr = new String[N]; // 빈 배열
			for (int i = 0; i < N; i++) {
				arr[i] = sc.next();
				
				if (maxLine < arr[i].length()) {
					maxLine = arr[i].length();
				} // if : 최대 단어 길이 계산
			} // for : 의석이가 만든 단어 배열 생성
			
			System.out.printf("#%d ", n);
			
			for (int i = 0; i < maxLine; i++) {
				for (int j = 0; j < N; j++) {
				try {
					System.out.print(arr[j].charAt(i));
				} catch (Exception e) { }
				} // for : 단어 개수만큼 반복 
			} // for : 최대 문자열 길이만큼 반복 (세로로 읽기)
			System.out.println();
		} // for : 테스트 케이스 번호 매기기 

	} // main
} // Solution_01
