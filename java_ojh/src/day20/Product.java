package day20;

import java.util.Objects;

import lombok.Data;

/*
- 제품 코드(6자리, ABC001), 분류, 제품명, 옵션, 가격을 등록
*   - ABC001, 문구, 볼펜, 빨강, 1천원
*   - DEF001, 의류, 셔츠, XL
*   - XYZ001, 식품, 우유, 1L
*   - 분류는 문구, 의류, 식품, 가전, 기타로 고정
*   - 각 분류마다 분류코드가 지정
*     - 문구 : ABC, 의류 : DEF, 식품 : XYZ, 가전 : ELC, 기타 : ETC
*   - 제품 코드는 분류코드에 등록된 순서 3자리를 만들어서 총 6자리로 고정
*/

@Data
public class Product {
	
	private String code;
	private String category;
	private String name;
	private String option;
	private int price;
	private int amount;
	
	
	public Product(String code, String category, String name, String option, int price) {
	
		this.code = code;
		this.category = category;
		this.name = name;
		this.option = option;
		this.price = price;
	}

	@Override
	public String toString() {
		return " [" + category + "] " + name + " " + option +  " - " + code + 
				" : " + price + " 원, 수량 : " + amount;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(code, other.code);
	}

	
	
}
