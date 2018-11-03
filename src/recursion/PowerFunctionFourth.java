//This will give us time complexity of O(Log n) unlike PowerRecursionSecond we are not computing it every time;
package recursion;
import java.util.*;
public class PowerFunctionFourth {
    
	
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
		int temp=pow(num,exp/2)*pow(num,exp/2);
		if(exp%2==0){
			return temp;
		}
		else{
			return num*temp;
		}
	}
}