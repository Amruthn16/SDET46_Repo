package Opps.Interface;

public class Multiple_Execution implements Multiple_Printable, Multiple_Showable {

	public void show() {
		System.out.println("Multiple inheritance");
	}
	
	public static void main(String[] args) {

		Multiple_Execution ob= new Multiple_Execution();
		ob.show();
	}
}
