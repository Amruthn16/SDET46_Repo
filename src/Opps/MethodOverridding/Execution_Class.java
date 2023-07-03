package Opps.MethodOverridding;

public class Execution_Class {

	public static void main(String[] args) {
		
		Class_Parent p= new Class_Parent();
		p.name="amruth";
		p.showMessage();//parent method
		
		Class_Parent ob= new Class_Child(); //upcasting
		ob.name="amr";
		ob.showMessage();//Child Method
		ob.Message(); 
		
		
		Class_Child c= (Class_Child) ob; //downcasting
		c.name="ruth";
		c.address="JP Nagar";
		c.showMessage(); //Child Method
		c.Message();
		c.show();
	}
}
