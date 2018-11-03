package recursion;
import java.util.*;
public class FactorialRecursion {
      
	
	
	public static void main(String [] args){
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		System.out.println(fact(num));
	}
	
	public static int fact(int num){
		if(num==0||num==1){
			return 1;
		}
		return num*fact(num-1);
	}
}
