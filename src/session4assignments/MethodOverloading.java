package session4assignments; //Package declaration

import java.lang.String; //String file is imported from java.lang package

/**
 * This program demonstrates the use of method overloading.
 *
 */
public class MethodOverloading 
{
	public static void overloading(String phrase1,
			String phrase2) /* This method accepts two parameters of type String */
	{
		System.out.println(phrase1 + phrase2); /* Prints the concatenated output */
	} // method closed

	public static void overloading(String phrase1, String phrase2,
			String phrase3)/*
							 * This method overloads the above method with three parameters of type String
							 */
	{
		System.out.println(phrase1 + phrase2 + phrase3); /* Prints the concatenated output */
	} // method closed

	public static void overloading(
			int phrase1) /* This method overloads the same method with one parameter of type integer */
	{
		System.out.print(phrase1); // Prints the integer output//
	} // method closed

	public static void main(String[] args)/* This is the main method where execution begins */
	{
		overloading("This is", " an example."); // Passing string arguments to method with two parameters
		overloading("This is", " an example ", "of method overloading."); // Passing string arguments to method with
																			// three parameters
		overloading(5); // Passing integer argument to method with single parameter
	} // Main method closed
} // Class closed