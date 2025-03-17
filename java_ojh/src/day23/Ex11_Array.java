package day23;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Data;

public class Ex11_Array {

	public static void main(String[] args) {
		//클래스 배열은 각 번지가 null로 초기화 됨
		//객체 생성해서 넣어주지 않으면 필드랑 메소드 사용 불가
		
		Point2 [] arr = new Point2[5];
		
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = new Point2(1, 1);
			System.out.println(arr[i].getX() + ", " + arr[i].getY());
		}

	}

}

@Data
@AllArgsConstructor
class Point2{
	int x, y;
}