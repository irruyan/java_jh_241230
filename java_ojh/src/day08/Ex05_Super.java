package day08;

public class Ex05_Super {

	public static void main(String[] args) {
		
		Parent p = new Parent("hong");
		p.print();
		System.out.println("--------");
		Child c = new Child("dong");
		c.print();

	}

}
class Parent{
	String name;

	public Parent(String name) {
		super();
		this.name = name;
	}
	
	public void print() {
		System.out.println("Printing");
	}
}

class Child extends Parent{
	
	String type;
	
	public Child() {
		super("");
		type = "";
	}
	public Child(String name) {
		super(name);
		type = "normal";
	}
	
	@Override
	public void print() {
		super.print();
		System.out.println(name + " : " + type);
		
	}
}
