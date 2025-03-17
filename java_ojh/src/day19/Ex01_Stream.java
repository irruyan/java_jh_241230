package day19;

public class Ex01_Stream {

	public static void main(String[] args) {
		// 주어진 문자열에서 검색어가 몇 번 들어가 있는지 확인하는 코드
		
		String str = "asavpowrasndklwqnlgkpgasiisipmasdaoisfuwkasqnnf";
		String search = "as";
		
		//tmp에 str을 저장
		String tmp = str;
		int index = -1, count = 0;
		
		do {
			index = tmp.indexOf(search);
			if(index != -1) {
				count ++;
				int pos = index + search.length();
				
				if(pos >= tmp.length()) {
					index = -1;
					continue;
				}
				 
				tmp = tmp.substring(pos);
			}
			
		}while(index != -1);
		System.out.println(str + "에 " + search + "가 " + count + "번 있습니다");
		
	}

}
