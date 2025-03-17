package day18_T;


//열거형(Enum)이라 함

public enum Bank {
	신한, 국민, 우리;
	
	public static void printBanks() {
		Bank [] list = Bank.values();
		
		for(int i = 0; i < list.length; i++) {
			System.out.println((i == 0 ? "" : ",") +list[i]);
		}
		System.out.println();
	}
	
	public static boolean check(String str) {
		try {
			return Bank.valueOf(str) != null;
		}catch(Exception e) {
			return false;
		}
	}
}
