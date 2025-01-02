package day03;

public class Ex20_NestingAlphabet {

	public static void main(String[] args) {
		
		char ch, lastCh='a';
		
		for(lastCh = 'a'; lastCh <= 'z'; lastCh++) {
		
		for(ch = 'a' ; ch <= lastCh ; ch++) {
				System.out.print(ch);
			}
		System.out.println();
		}
		
		System.out.println();
		
		for(char ch1 = 'a' ; ch1 <= 'z' ; ch1++) {
			
			System.out.print(ch1);
						
		}
		System.out.println();
	}
}
