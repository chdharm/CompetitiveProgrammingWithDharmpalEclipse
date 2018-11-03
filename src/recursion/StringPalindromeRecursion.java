package recursion;
import java.util.Scanner;

public class StringPalindromeRecursion {

	public static void main(String [] args){
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		int length=str.length();
		System.out.println(isPalin(str,0,length-1));	
	} 

	public static boolean isPalin(String str,int be,int en){
		if(be==en||be>en){
			return true;
		}
		if(str.charAt(be)!=str.charAt(en)){
			return false;
		}
		return isPalin(str,be+1,en-1);
	}

}
