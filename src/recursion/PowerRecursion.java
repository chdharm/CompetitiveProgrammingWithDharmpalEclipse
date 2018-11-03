package recursion;
import java.util.*;
public class PowerRecursion {

	
	
	
	public static void main(String [] args){
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int exp=scan.nextInt();
		System.out.println(pow(num,exp));
	}
	
	public static int pow(int num,int exp){
		if(exp==0){
			return 1;
		}
		return num*pow(num,exp-1);
	}
}
