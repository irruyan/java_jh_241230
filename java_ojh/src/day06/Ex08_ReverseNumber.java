package day06;

import java.util.Scanner;

public class Ex08_ReverseNumber {

	public static void main(String[] args) {
		// 4자리의 정수를 입력받아 역순으로 출력
		// 입력 : 1234 -> 결과 : 4321
		/* 1234 / 10 의 몫
		 *  4를 저장
		 * 123 / 10 의 몫
		 *  3을 저장
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("4자리 정수를 입력하세요 : ");
		int num = scan.nextInt();
		
		int tmp = num;
		
		if(!checkNumber(num, 4)) {
			System.out.println("4자리 정수가 아닙니다.");
			return;
		}
		
		//역순으로 출력하는 코드
		while(tmp > 0) {
			System.out.print(tmp % 10);
			tmp /= 10;
		}
		
		
		
		//배열을 이용
		tmp = num;
		int []res = new int [4];
		for(int i = 0; i < res.length; i++) {
			int lastNum = tmp / (int)pow(10, res.length - i - 1);
			res[i] = lastNum;
			tmp = tmp % (int)pow(10, res.length - i - 1);
		}
		System.out.println();
		for(int i = res.length - 1; i >= 0; i--) {
			System.out.print(res[i]);
		}
		

	}
	
	public static boolean checkNumber(int num, int size) {
		int min = 1*(int)pow(10,size-1);
		int max = 1*(int)pow(10,size);
		if(num >= max || num < min) {
			return false;
		}
		return true;
	}
	// a의 n제곱
	public static double pow(int a, int n) {
		if(n == 0) {
			return 1;
		}
		double res = 1;
		
		if(n > 0) {
			for(int i = 0; i < n; i++) {
				res *= a;
			}
			return res;
		}
		//예외처리(음수인 경우)
		n = -n;
		for(int i = 0; i<n; i++) {
			res /= (double)a;
		}
		return res;
	}

}
