package sweety;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int i,fact=1;
		Scanner reader= new Scanner(System.in);
		System.out.println("Enter a number");
		int num=reader.nextInt();
		//int num=5;
		for(i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of a number is"+fact);
	}

}
