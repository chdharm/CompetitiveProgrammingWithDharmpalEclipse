//This will work for negative numbers too.

package recursion;
import java.util.*;
public class PowerFunctionThirdType {

	
	
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
		}else if(exp>0){
			    return num*temp;
		     }else{
		    	return (temp)/num; 
		     }
	}
	
}
