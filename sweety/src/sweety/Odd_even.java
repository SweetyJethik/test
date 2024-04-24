package sweety;

import java.util.Scanner;

public class Odd_even {

	public static void main(String[] args) {
		Scanner reader= new Scanner(System.in);
		System.out.println("Enter a number");
		int num=reader.nextInt();
		if(num%2==0)
		{
			System.out.println(num+ "Number is even");
		}
		else
		{
			System.out.println(num+ "Number is odd");
		}

	}

}
