package sweety;

import java.util.Scanner;

public class Largest2number {

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter first number");
		int n1=reader.nextInt();
		System.out.println("Enter second number");
		int n2=reader.nextInt();
		if(n1>n2)
		{
			System.out.println("N1 is largest number"+n1);
		}
		else
		{
			System.out.println("N2 is largest number"+n2);
		}
	}

}
