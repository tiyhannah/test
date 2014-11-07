package edu.yale.cpsc112_lesson2;

public class ForLoopsXTouchdown {
	public static void main(String[] args)
	{

	    /* this loop initializes i to 1
	     * then does the following:
	     *   (1) checks if i <= 3 
	     *   (2) running everything inside the braces
	     *   (3) does i+=3
	     * until the check in step (1) becomes false
	    */
		for (int i = 1; i <= 3; i+=1)
		{
			makeAnX();
			makeATouchDown();
		}
		System.out.println("I'm done");
	}
	
	public static void makeAnX()
	{
		System.out.println("\\    /");
		System.out.println(" \\  /");
		System.out.println("  \\/");
		System.out.println("  /\\  ");
		System.out.println(" /  \\");
		System.out.println("/    \\");
	}
	
	public static void makeATouchDown()
	{
		for (int i = 1; i <= 6; i+=1)
		{
			System.out.print("|");
			//Below is a nested for loop (a for loop inside another for loop)
			//This nested for loop prints the spaces between the two | symbols
			for (int j = 1; j <=4; j+=1)
			{
				System.out.print(" ");
			}
			System.out.println("|");
		}
	}
}
