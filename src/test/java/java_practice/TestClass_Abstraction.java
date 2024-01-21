package java_practice;

public class TestClass_Abstraction {

	public static void main(String[] args) 
	{
		Abstraction_ImplClass v=new Abstraction_ImplClass();
		v.usa();
		v.uk();
		v.canada();
		
		
		Abstraction_interface c = new Abstraction_ImplClass();
		c.usa();
		c.uk();
		c.canada();
	}

}
