package Iteration;
import java.util.*;
public class ReverseDigitIteration {
    
	
	
	public static void main(String [] args){
		Scanner scan=new Scanner(System.in);
		int rev=0;
		int num=scan.nextInt();
		while(num>0){
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println(rev);
		
	}
}
