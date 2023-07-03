package Opps.MethodOverloading;

public class Class_A {

	public static void main(String[] args) {
		add();
		add(1,2);
		add(1,3,2);
	}

	public static void add() {
		System.out.println("adding method");
	}

	public static void add(int i, int j, int k) {
		System.out.println(i+j+k);
	}

	public static void add(int i, int j) {
		System.out.println(i+j);
	}
}
