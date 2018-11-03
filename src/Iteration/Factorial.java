package Iteration;
import java.util.*;
public class Factorial {

	
	
	public static void main(String [] args){
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		System.out.println(fact(num));
	}
	public static int fact(int num){
		int fact=1;
		while(num>0){
			fact=fact*num;
			num=num-1;
		}
		return fact;
	}
}
