package edu.yale.cpsc112_lesson2;

public class Test {

	/**
	 * @param args
	 */
	 public static void main(String[] args){
		    printDesign('#', '*', 1);
		    printDesign('|', '-', 3);
	 }
	 
	 public static void printDesign(char char1, char char2, int int1){
		 for(int i=0; i<4; i++)
		 {
			 System.out.print(char1);
			 for(int j=1; j<=(i*int1); j++){
				 System.out.print(char2);
			 }
			 System.out.println(char1);
		 }
	 }
}
