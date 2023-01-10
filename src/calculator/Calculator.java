package calculator;
import java.util.*;
public class Calculator {
	 // create a Sum method
	  public int sum(int a, int b) {
	    int sum = a + b;
	    // return value
	    return sum;
	  }
	  // create a Substraction method
	  public int sub(int a, int b) {
	    int sub = a - b;
	    // return value
	    return sub;
	  }
	  // create a Multiplication method
	  public int mul(int a, int b) {
	    int mul = a * b;
	    // return value
	    return mul;
	  }
	  // create a Division method
	  public int div(int a, int b) {
	    int div = a / b;
	    // return value
	    return div;
	  }

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	      System.out.println("Enter two values");
	    
	    int num1 = scan.nextInt();
	    int num2 = scan.nextInt();
	    
	    System.out.println("You have entered two values:"+num1+","+num2);
	    // create an object of Calculator
	    Calculator obj = new Calculator();
	    // calling methods
	    int addition = obj.sum(num1, num2);
	    System.out.println("Sum of two numbers is: " + addition+"\n");
	    
	    int substraction=obj.sub(num1,num2);
	     System.out.println("Substraction of two numbers is: " + substraction+"\n");
	     int multiplication=obj.mul(num1,num2);
	     System.out.println("Multiplication of two numbers is: " + multiplication+"\n");
	     int division=obj.div(num1,num2);
	     System.out.println("Division of two numbers is: " + division+"\n");

	}

}
