package SWEA_beginner_1989;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution_01 {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("src/SWEA_beginner_1989/input.txt");
		Scanner sc = new Scanner(file);
//		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();     // 테스트 케이스 수
		sc.nextLine();
		
		for (int t = 1; t < T+1; t++) {
			boolean isSame = true;    // 회문인지 비교 결과
			String S = sc.nextLine();    // 문자열 입력
			int Len = S.length();          // 문자열 길이
			
			 for (int i = 0; i < (Len/2); i++) {
				 char F = S.charAt(i);              // 대상
				 char L = S.charAt(Len - 1 - i);    // 비교 문자
				 
				 if (F == L) {
					 continue;
				 } else { isSame = false; break; } // if : 회문인지 검사
				 
			 } // for : 회문인지 검사
			 
			 int result = (isSame) ? 1 : 0;
			 System.out.printf("#%d %d \n", t, result);
		} // for : 테스트 케이스 결과 출력
	}

}
