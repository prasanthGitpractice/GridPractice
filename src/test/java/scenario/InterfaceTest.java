package scenario;

public interface InterfaceTest 
{
	public interface Vehicle {
	    // Abstract method
	    void start();

	    // Default method
	    default void displayInfo() {
	        System.out.println("This is a vehicle.");
	    }

	    // Static method
	    static void horn() {
	        System.out.println("Beep beep!");
	    }
	}
}
