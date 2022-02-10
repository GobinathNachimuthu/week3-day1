package week3.day1;

public class Calculator {
	public void add1(int a, int b) {
		int add = a + b;
		System.out.println(add);
	}

	public void add(int a, int b, int c) {
		int add = a + b + c;
		System.out.println(add);
	}

	public static void main(String[] args) {
		Calculator num = new Calculator();
		num.add1(7, 8);
		num.add(7, 8, 9);

	}

}
