package sweety;

import java.util.Scanner;

public class Armstrongor_not {

	public static void main(String[] args) {
		int  numb, r, result = 0;
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=reader.nextInt();
        numb = n;
        while (numb != 0)
        {
            r = numb % 10;
            result += Math.pow(r, 3);
            numb /= 10;
        }

        if(result == n)
            System.out.println(n + " is an Armstrong number.");
        else
            System.out.println(n + " is not an Armstrong number.");
    
	}

}
