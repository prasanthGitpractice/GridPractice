package java_practice;

public class Abstraction_ImplClass implements Abstraction_interface
{

	@Override
	public void usa() {
		System.out.println("visa permitted to usa");
	}

	@Override
	public void uk() {
		System.out.println("visa permitted to uk");
		
	}

	@Override
	public void canada() {
		System.out.println("visa permitted to canada");
		
	}
	
}
