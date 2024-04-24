package sweety;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		double result;
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter first number");
		int n1=reader.nextInt();
		System.out.println("Enter second number");
		int n2=reader.nextInt();
		System.out.print("Enter an operator (+, -, *, /): ");
        char operator = reader.next().charAt(0);
		switch(operator)
		{
		case '+':
			result=n1+n2;
			System.out.println(n1+ "+" +n2+ "=" +result);
			break;
		case '-':
			result=n1-n2;
			System.out.println(n1+"-"+n2+"="+result);
			break;
		case '*':
			result=n1*n2;
			System.out.println(n1+"*"+n2+"="+result);
			break;
		case '/':
			result=n1/n2;
			System.out.println(n1+"/"+n2+"="+result);
			break;
		 default:
		        System.out.println("Invalid operator!");
		        break;
		}
		
	}

}
