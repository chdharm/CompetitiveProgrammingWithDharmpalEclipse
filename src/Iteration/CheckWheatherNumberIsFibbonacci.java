package Iteration;
import java.util.*;
public class CheckWheatherNumberIsFibbonacci {

	
	
	public static void main(String [] args){
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int first=0;
		int second=1;
		int fib=0;
		if(num==first||num==second){
			System.out.println("Number is Fibbonacci Number");
			return;
		}
		while(num>fib){
			fib=first+second;
			if(num==fib){
				System.out.println("Number is fibbonacci Number");
				return;
			}
			first=second;
			second=fib;
			
		}
		System.out.println("Number is not a Fibbonacci Number");
	}
}
