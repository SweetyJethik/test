package sweety;

import java.util.Scanner;

public class Reversenumb {

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter a number");
		int numb=reader.nextInt();
		int  rev = 0;  
		while(numb != 0)   
		{  
		int r = numb % 10;  
		rev = rev * 10 + r;  
		numb = numb/10;  
		}  
		System.out.println("The reverse of the given number is: " + rev);  
		}  


}
/*number = 1234
remainder = 1234 % 10 = 4
reverse = 0 * 10 + 4 = 0 + 4 = 4
number = 1234 / 10 = 123*/