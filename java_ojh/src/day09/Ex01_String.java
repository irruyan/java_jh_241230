package day09;

public class Ex01_String {

	public static void main(String[] args) {
		
		// 파일명이 주어졌을 때 파일이 이미지인지 아닌지 확인하는 코드
		String fileName = "test.png";
		String imgs [] = new String[]{"jpg", "bmp", "gif", "png"};
		
				
		//txt를 추출
		int index = fileName.lastIndexOf(".");
		
		if(index < 0) {
			System.out.println(fileName + "은 이미지 파일이 아닙니다.");
			return;
		}
		
		String prefix = fileName.substring(index + 1);
		System.out.println(prefix);
		//반복문을 통해서 추출한 문자열이 배열에 있는지 확인
		
		boolean result = false;
		for(String img : imgs) {
			//이미지 확장자와 추출한 확장자가 같으면
			if(img.equals(prefix)) {
				result = true;
				break;
			}
		}
		if(result) {
			System.out.println(fileName + "은 이미지 파일이 맞습니다.");
		}else {
			System.out.println(fileName + "은 이미지 파일이 아닙니다.");
		}
		
		//있으면 이미지, 없으면 이미지가 아님
	
		
	}

}
