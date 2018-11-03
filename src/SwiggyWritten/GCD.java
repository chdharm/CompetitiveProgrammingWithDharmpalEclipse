package SwiggyWritten;
import java.util.Scanner;
public class GCD {
	public static void main(String [] args){
		Scanner scan=new Scanner(System.in);
		int one=scan.nextInt();
		int two=scan.nextInt();
		System.out.println(gcd(one,two));
	}
	public static int gcd(int a, int b) 
	{ 
	    if (a == 0) 
	        return b; 
	    return gcd(b%a, a); 
	}
}
