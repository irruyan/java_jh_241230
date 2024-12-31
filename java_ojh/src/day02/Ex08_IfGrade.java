package day02;

public class Ex08_IfGrade {

	public static void main(String[] args) {

		int score = 100;
		
		if(score >= 90 && score <= 100) {
			System.out.println(score + "점은 A입니다.");
		}
		else if(score >= 80 && score < 90){
			System.out.println(score + "점은 B입니다.");
		}
		else if(score >= 70 && score < 80){
			System.out.println(score + "점은 C입니다.");
		}
		else if(score >= 60 && score < 70){
			System.out.println(score + "점은 D입니다.");
		}
		else if(score <= 59 && score > 0){
			System.out.println(score + "점은 F입니다.");
		}
		else {
			System.out.println(score + "점은 잘못된 점수입니다.");
		}
		
	}

}
