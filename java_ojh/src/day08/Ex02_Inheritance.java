package day08;

import day08.ex02.Car;
import day08.ex02.KiaCar;

public class Ex02_Inheritance {

	public static void main(String[] args) {
		KiaCar kia = new KiaCar();
		//kia.power = true; // 에러 발생 : 다른 클래스에서 private을 사용할 수 없다
		kia.turnOn();
		System.out.println(kia.isPower());
		//kia.speed = 10; // protected는 자기 + 패키지 + 자식
		
	}

}


class HyundaiCar extends Car{
	public String logo = "현대";
	
	public void test() {
		
		
		speed = 0;
		//power = false;
	}
}