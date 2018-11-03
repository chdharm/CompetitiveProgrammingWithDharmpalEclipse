//This will give you time complexity of O(n) Because here we are computing 
package recursion;
import java.util.*;
public class PowerRecursionSecond {
    
	
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
		if(exp%2==0){
			return pow(num,exp/2)*pow(num,exp/2);
		}
		else{
			return num*pow(num,exp/2)*pow(num,exp/2);
		}
	}
}
