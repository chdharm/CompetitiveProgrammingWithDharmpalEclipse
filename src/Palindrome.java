import java.util.*;
public class Palindrome {

	public static void main(String [] args){
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		char[] arr=str.toCharArray();
		//System.out.println(arr.length+"hello");
		int be=0;
		System.out.println(isPalin(arr,be,(arr.length)-1));
	}
	
	static boolean isPalin(char[] temp,int be, int en){
		if(be>en){
			return true;
		}
		if(be==en){
			return true;
		}
		if(temp[be]==temp[en]){
			return isPalin(temp,be+1,en-1);
		}
		else
		    return false;
	}
}
