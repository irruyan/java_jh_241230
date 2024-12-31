package day02;

public class Ex15_SwitchGrade {

	public static void main(String[] args) {

		int score = -9;
		
		switch(score / 10) {
		case 10, 9:
			System.out.println(score + "점 이므로 학점은 A입니다.");
			break;
		case 8:
			System.out.println(score + "점 이므로 학점은 B입니다.");
			break;
		case 7:
			System.out.println(score + "점 이므로 학점은 C입니다.");
			break;
		case 6:
			System.out.println(score + "점 이므로 학점은 D입니다.");
			break;
		case 5, 4, 3, 2, 1, 0, -1:
			System.out.println(score + "점 이므로 학점은 F입니다.");
			break;
		default:
			System.out.println("잘못된 점수 입니다.");
			
		}
	}

}
