package recursion;
import java.util.*;
public class EliminatingDuplicatesInAString {
	static int arr[]=new int[26];
	public static void main(String [] args){
		Scanner scan=new Scanner (System.in);
		String str=scan.nextLine();
		System.out.println(removeConsecutiveDuplicates2(str));
		
	}
	public static void removeConsecutiveDuplicates(String s) {
      	for(int i=0;i<s.length();i++){
      		if(arr[s.charAt(i)-97]==0){
      			System.out.print(s.charAt(i));
      			arr[s.charAt(i)-97]=1;
      		}
      	}
	}
	
	public static String removeConsecutiveDuplicates2(String s) {
      String result="";
      	for(int i=0;i<s.length();i++){
      		if(arr[s.charAt(i)-97]==0){
              result+=s.charAt(i);
      			arr[s.charAt(i)-97]=1;
      		}
      	}
      return result;
	}	
}
