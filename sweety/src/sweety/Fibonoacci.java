package sweety;

public class Fibonoacci {

	public static void main(String[] args) {
		int n=10,f=0,s=1;
	    System.out.println("Fibonacci Series");

	    for (int i=1;i<=n;++i) {
	      System.out.print(f + ", ");

	      // compute the next term
	      int nt = f+s;
	      f = s;
	      s = nt;
	    }

	}
}
