package recursion;
import java.util.*;
public class FibbonacciNumberRecursion {

	public static void main(String [] args){
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		System.out.println(fib(num));
	}
	
	public static int fib(int num){
		if(num==0||num==1){
			return num;
		}
		return fib(num-1)+fib(num-2);
	}
}
