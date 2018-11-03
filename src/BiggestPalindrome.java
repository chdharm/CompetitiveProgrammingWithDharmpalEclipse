import java.util.*;
public class BiggestPalindrome {
	public static void main(String [] args){
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		//System.out.println(str.substring(0,1));
		System.out.println(BiggestPalin(str,0,str.length()-1));
	}
	public static String BiggestPalin(String str,int be,int en){
		if(be==en){
			str.substring(be,be+1);
		}
		if(isPalin(str.substring(be,en+1))==true)
			return str.substring(be,en+1);
		String first= BiggestPalin(str,be,en-1);
		String second= BiggestPalin(str,be+1,en);
		if(first.length()>second.length()){
			return first;
		}
		else{
			return second;
		}
	}
	public static boolean isPalin(String str){
		int length=str.length();
		int i=0;
		int j=length-1;
		while(i<j){
			if(i==j){
				return true;
			}
			if(str.charAt(i)!=str.charAt(j)){
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}
