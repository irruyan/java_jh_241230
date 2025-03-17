package day23;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

public class Ex07_Class {

	public static void main(String[] args) {
		
		Drink drink = new Drink("coffee", 3000);
		System.out.println(drink.getMenu() + " " + drink.getMoney());

	}

}

@Getter
@Setter
@AllArgsConstructor
class Drink implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2L; //역직렬화?
	private String menu; //private으로 정보를 감추는게 직렬화래
	private int money; 
	
	
	
}