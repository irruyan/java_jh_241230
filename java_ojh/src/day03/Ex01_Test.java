package day03;

import java.util.Scanner;

public class Ex01_Test {

	public static void main(String[] args) {

		// 세 학생의 국어성적을 입력받아 총점과 평균을 구하시오.
		Scanner scan = new Scanner(System.in);
		
		int scr1, scr2, scr3, tot;
		double avg;
		
		System.out.print("학생 1의 점수 입력 : ");
		scr1 = scan.nextInt();
		System.out.print("학생 2의 점수 입력 : ");
		scr2 = scan.nextInt();
		System.out.print("학생 3의 점수 입력 : ");
		scr3 = scan.nextInt();
		
		tot = scr1 + scr2 + scr3;
		avg = tot/3.0;
		
		System.out.println("학생 1, 2, 3의 총점은 : " + tot);
		System.out.println("이에 대한 평균 점수는 : " + avg);
		
		
		
		
	}

}
