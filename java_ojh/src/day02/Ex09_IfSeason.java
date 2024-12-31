package day02;

public class Ex09_IfSeason {

	public static void main(String[] args) {

		int season = 0;
		
		if(season > 12 || season <= 0)
		{
			System.out.println(season + "월은 잘못된 월");
		}
		
		else if(season >= 9 && season < 12)
		{
			System.out.println(season + "월은 가을");
		}
		else if(season >= 6 && season < 9)
		{
			System.out.println(season + "월은 여름");
		}
		else if(season >= 3 && season < 6)
		{
			System.out.println(season + "월은 봄");
		}
		else
		{
			System.out.println(season + "월은 겨울");
		}
		
	}

}
