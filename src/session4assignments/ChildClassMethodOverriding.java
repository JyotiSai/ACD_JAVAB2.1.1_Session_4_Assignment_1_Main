package session4assignments; //Package declaration

/**
 * This is the child class demonstrates the use of method overriding
 *
 */
public class ChildClassMethodOverriding extends MethodOverriding 
{
	@Override
	public void methodToOverride() /* This is the method from parent class which is overridden in child class */
	{
		System.out.println("methodToOverride() method of child class"); /* Prints the output of child class */
	} // Method closed

	public static void main(String[] args) // This is the main method where execution begins
	{
		MethodOverriding object = new MethodOverriding(); // object of parent class created
		object.methodToOverride(); // methodToOverride() of parent class is called

		MethodOverriding objectOne = new ChildClassMethodOverriding(); // object of child class created
		objectOne.methodToOverride(); // methodToOverride() of child class is called
	} // main method closed

} // class closed
