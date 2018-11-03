package Iteration;
import java.util.*;
public class FibbonacciSeries {

	
	
	public static void main(String [] args){
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int first=0;
		int second=1;
		System.out.print(first+" ");
		System.out.print(second+" ");
		int fib;
		for(int i=2;i<=num;i++){
			fib=first+second;
			System.out.print(fib+" ");// Printing each number
			first=second;
			second=fib;
            
		}
	}
}
