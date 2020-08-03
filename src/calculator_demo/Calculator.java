package calculator_demo;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		int n1,n2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numbers to perform operations");
		n1=sc.nextInt();
		n2=sc.nextInt();
		System.out.println("Which operation you want to perform ?: ");
		char c= sc.next().charAt(0);
		
		switch(c)
		{
		case '+' :System.out.println("Result of addition :"+(n1+n2));
			      break;
			      
		case '-': System.out.println("Result of Substraction :"+(n1-n2));
	              break;
		
		default : System.out.println("Enter valid operator");
		return;
			       
	}

}
}