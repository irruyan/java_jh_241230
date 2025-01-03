package day04;

public class Ex06_VariableArgument {

	public static void main(String[] args) {
		System.out.println(sum(1));
		System.out.println(sum(1,2));
		System.out.println(sum(1,2,3));

	}
	//가변 매개변수 예제
	public static int sum(int ...nums) {
		int sum = 0;
		for(int num : nums) {
			sum += num;
		}
		return sum;
	}
	
}
