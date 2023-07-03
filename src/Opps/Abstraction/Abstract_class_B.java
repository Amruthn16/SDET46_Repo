package Opps.Abstraction;

public class Abstract_class_B extends Abstract_class_A{

	void run() {
		System.out.println("abc");
	}
	
	public static void main(String[] args) {
		Abstract_class_B a2= new Abstract_class_B();
		a2.run();
	}
}
