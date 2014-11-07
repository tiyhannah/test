package edu.yale.cpsc112_lesson2;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

import android.view.inputmethod.EditorInfo;

public class ObamaTaxRates {
	  public static void main(String[] args)
	  {

	  }	  
	  
	  //processSalary can be called by MainActivty.java when the user clicks on 'Done' in the input textbox.
	  //To get this to work, you have to change one line of code in MainActivity.java (which was uploaded into the same folder on classes v2 as this file)
	  //Right after: if (actionId == EditorInfo.IME_ACTION_DONE) {
	  //Add the code: ObamaTaxRates.processSalary(v.getText().toString());
	  public static void processSalary(String inputSalary)
	  {
		  System.out.println(inputSalary);
		  
		  //Integer.parseInt takes a String as a parameter
		  //If that String contains a bunch of digits, it will convert them to an integer and return it.
		  //So the line below just converts the String version of the inputSalary to an integer
		  //and stores the result in an int called salary.
		  int salary = Integer.parseInt(inputSalary);
		  if (salary > 250000)
		  {
			  System.out.println("You have a high tax rate.");
			  System.out.println("Obama thinks he's robin hood.");
		  }
		  else if (salary > 50000)
		  {
			  System.out.println("You have an average tax rate.");
			  System.out.println("At least you have a job.");
		  }
		  else if (salary > 0)
		  {
			  System.out.println("You have a low tax rate.");
			  System.out.println("You should have majored in CS");
		  }
		  else
		  {
			  System.out.println("You need to go back to first grade and learn how to read");
			  System.out.println("I asked you for your salary.");
		  }
		  
	  }

	}