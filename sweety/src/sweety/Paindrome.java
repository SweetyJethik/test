package sweety;

import java.util.Scanner;

public class Paindrome {

	public static void main(String[] args) {
		int temp,rev,sum=0;
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter a number");
		int numb=reader.nextInt();
		//int numb=121;
		temp =numb;
		while(numb>0)
		{
			rev=numb%10;
			sum=(sum*10)+rev;
			numb=numb/10;
		}
		if(temp==sum)
		{
			System.out.println("palindrome number");
			
		}
		else
		{
			System.out.println("Not a palindrome number");
		}
	}

}

