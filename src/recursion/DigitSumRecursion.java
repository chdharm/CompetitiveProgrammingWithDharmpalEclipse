package recursion;
import java.util.*;
public class DigitSumRecursion {
	
	public static void main(String [] args){
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		System.out.println(digitSum(num));
	}
	
	public static int digitSum(int num){
		if(num==0){
			return 0;
		}
		return num%10+digitSum(num/10);
	}
}
