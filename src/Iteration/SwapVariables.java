package Iteration;
import java.util.*;
public class SwapVariables {
	
	public static void main(String [] args){
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int num2=scan.nextInt();
		System.out.println(num+"...."+num2);
		num=(num*num2)/(num2=num);
		System.out.println(num+"...."+num2);
		
	}
}
