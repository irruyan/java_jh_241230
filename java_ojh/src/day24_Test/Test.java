package day24_Test;

public class Test {

	public static void main(String[] args) {
		Person[] pArr = new Person[3];
		
		for(int i = 0; i < pArr.length; i++) {
			pArr[i] = new Person();
			System.out.println(pArr[i].getName());
		}

	}

}


class Person{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}