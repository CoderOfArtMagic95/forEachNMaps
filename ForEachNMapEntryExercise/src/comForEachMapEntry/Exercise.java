package comForEachMapEntry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Map.Entry;
//import java.util.ArrayList;
//import java.util.Collections;
public class Exercise {
	
	 ArrayList<Integer> numbers = new ArrayList<Integer>();
	 
	 public Exercise(int num1, int num2, int num3, int num4, int num5 ) {
		 numbers.add(num1);  
		 numbers.add(num2);  
		 numbers.add(num3);
		 numbers.add(num4);   
		 numbers.add(num5);
	 }
	 
	public void Sum(int num1, int num2, int num3, int num4, int num5) {
		int sum = 0;
		sum = num1 + num2 + num3 + num4 + num5;
		System.out.println("Total sum: "+ sum);
		  
	}
	
	public void Product(int num1, int num2, int num3, int num4, int num5) {
		int product = 0;
		product = num1 * num2 * num3 * num4 * num5;
		System.out.println("Product result: " + product);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Write a program that does the following:
		 * Asks the user for 5 numbers
		 * Stores them in an array list
		 * Finds the sum, product, largest, and smallest of those numbers*/
		
		Scanner user = new Scanner(System.in);
		System.out.println("Please choose a number:");
		int input = Integer.parseInt(user.nextLine());
		System.out.println("Please choose another number:");
		int input2 = Integer.parseInt(user.nextLine());
		System.out.println("Please choose a 3rd number:");
		int input3 = Integer.parseInt(user.nextLine());
		System.out.println("Please choose a 4th number:");
		int input4 = Integer.parseInt(user.nextLine());
		System.out.println("Please choose one more number:");
		int input5 = Integer.parseInt(user.nextLine());
		System.out.println("What make of car are you looking for");
		String input6 = user.nextLine();
		System.out.println("What model of car are you looking for");
		String input7 = user.nextLine();
		user.close();
		
		
		Exercise run = new Exercise(input,input2,input3,input4,input5);  	 
		
		 ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		 numbers.add(input);
		 numbers.add(input2);
		 numbers.add(input3);
		 numbers.add(input4);
		 numbers.add(input5);
		 
		 System.out.println("Maximum: " + Collections.max(numbers));//prints maximum
		 System.out.println("Minimum: " + Collections.min(numbers)); //prints minimum
		 		  
		  run.Sum(input,input2,input3,input4,input5);
		  run.Product(input,input2,input3,input4,input5);
			
	   }
}
