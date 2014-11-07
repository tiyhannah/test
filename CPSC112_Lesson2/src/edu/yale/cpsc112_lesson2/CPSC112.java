package edu.yale.cpsc112_lesson2;

public class CPSC112 {
	static final int size = 5;
	public static void main(String[] args)
	{
		printHead();
	for (int i = 0; i < 2; i++)
		{
			angleRight();
			angleLeft();
		}
		printTail();
		
	}
	
	public static void printHead()
	{
		//System.out.println("ooo/||\\");
		for (int f=(((size+1)/2)-2); f>0; f--)
		{
			System.out.print(" ");
		}
		System.out.println("/||\\");
		
		//System.out.println("oo/oooo\\");
		//System.out.println("o/oooooo\\");
		
	
		
		
		for (int i=(size-5)/2; i>=1; i--)
		{
			for (int j=1; j<=i; j++)
			{
				System.out.print(" ");
			}
			System.out.print("/");
			for (int w=1; w<=size-(2*i)-1; w+=1)
			{
			System.out.print(" ");
			}
		System.out.println("\\");
		}
		
		
		
		
		
		//System.out.println("/oo|oo|oo\\");
		System.out.print("/");
		for (int n=2; n<=(size-3)/2; n++)
		{
			System.out.print(" ");
		}
		System.out.print("|");
		for( int m=1; m<=2; m++)
		{
			System.out.print(" ");
		}
		System.out.print("|");
		for (int n=2; n<=(size-3)/2; n++)
		{
			System.out.print(" ");
		}
		System.out.println("\\");
		
		
		
		
		//System.out.println("\\oooooooo/");
		
		System.out.print("\\");
		for (int b=1; b<=size-1; b++)
		{
			System.out.print(" ");
		}
		System.out.println("/");
		
		
		
		
		
		//System.out.println("o\\oooooo/");
		
		System.out.print(" ");
		System.out.print("\\");
		for (int b=1; b<=size-3; b++)
		{
			System.out.print(" ");
		}
		System.out.println("/");
		
		
		//System.out.println("o|oooooo|");
		//System.out.println("o|oooooo|");
		for (int n=1; n<=2; n++)
		{
			System.out.print(" ");
			System.out.print("|");
			for (int b=1; b<=size-3; b++)
			{
				System.out.print(" ");
			}
			System.out.println("|");
		}
		
		
		//System.out.print("/ooooooo\\");
		System.out.print("/");
		for (int b=1; b<=size-1; b++)
		{
			System.out.print(" ");
		}
		System.out.println("\\");
	}
	
	public static void angleRight()
	{
		
		System.out.print("\\");
		for (int b=1; b<=size; b++)
		{
			System.out.print(" ");
		}
		System.out.println("\\");
				
		for (int i=1; i<=4; i++)
		{
			for (int j=1; j<=i; j++)
			{
				System.out.print(" ");
			}
		System.out.print("\\");
		for (int b=1; b<=size; b++)
		{
			System.out.print(" ");
		}
		System.out.println("\\");
		}
	}
	
	
	public static void angleLeft()
	{
		
		for (int i=4; i>=1; i--)
		{
			for (int j=1; j<=i; j++)
			{
				System.out.print(" ");
			}
		System.out.print("/");
		for (int w=1; w<=size; w++)
		{
			System.out.print(" ");
		}
		System.out.println("/");
		}
		System.out.print("/");
		for (int w=1; w<=size; w++)
		{
			System.out.print(" ");
		}
		System.out.println("/");
	
	}
	
	public static void printTail()
	{
		
		System.out.print("\\");
		for (int b=1; b<=size-1; b++)
		{
			System.out.print(" ");
		}
		System.out.println("/");
		
		for (int i=1; i<=size-((size+1)/2); i++)
		{
			for( int j=1; j<=i; j++)
			{
				System.out.print(" ");
			}
			System.out.print("\\");
			for (int b=2; b<=size-2*i; b++)
			{
				System.out.print(" ");
				
			}
			System.out.println("/");
		}
		
	}
}