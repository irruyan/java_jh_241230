package day02;

public class Ex13_SwitchSeason {

	public static void main(String[] args) {

		int season = 4;
		
		switch (season) {
		case 3,4,5 :
			System.out.println(season + "월은 봄 ");
			break;
		
		case 6,7,8 :
			System.out.println(season + "월은 여름 ");
			break;
			
		case 9,10,11 :
			System.out.println(season + "월은 가을 ");
			break;
			
		case 12,1,2 :
			System.out.println(season + "월은 겨울 ");
			break;
			
		default:
			System.out.println(season + "월은 잘못된 계절입니다.");
		}
		
	}

}
