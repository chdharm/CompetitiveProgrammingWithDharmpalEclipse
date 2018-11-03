package Iteration;
import java.util.*;
public class StringPalindrome {

	
	
	
	public static void main(String [] args){
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		int length=str.length();
		System.out.println(isPalin(str,0,length-1));
		
		
	} 
	
	public static boolean isPalin(String str,int be,int en){
     char[] arr=str.toCharArray();
     while(be<en)
		if(arr[be++]==arr[en--]){
			
		}
		else{
			return false;
		}
		return true;
	}
}
