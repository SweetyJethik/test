package sweety;

import java.util.Scanner;

public class Largest3number {

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter first number");
		int n1=reader.nextInt();
		System.out.println("Enter second number");
		int n2=reader.nextInt();
		System.out.println("Enter Third number");
		int n3=reader.nextInt();
		if((n1>n2)&&(n1>n3))
		{
			System.out.println("N1 is largest number"+n1);
		}
		else if((n2>n3)&&(n2>n1))
		{
			System.out.println("N2 is largest number"+n2);
		}
		else
		{
			System.out.println("N3 is largest number"+n3);
		}
	}

}
