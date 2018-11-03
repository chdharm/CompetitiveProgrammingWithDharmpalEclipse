package SwiggyWritten;
import java.util.*;
public class FindUniqueCharacterCount {

	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		String input=scan.next();
		//System.out.println(input);
		//System.out.println(input.chars().distinct().count());
		System.out.println(countOfUniqueChar(input));
	}
	public static boolean isValid(String str, int min_length, int max_length,long maxUnique){
		long countofUnique=countOfUniqueChar(str);
		if(countofUnique>maxUnique){
			return false;
		}
		int length_str=str.length();
		if(length_str<min_length || length_str>max_length){
			return false;
		}
		return true;
	}
	public static long countOfUniqueChar(String str){
		return str.chars().distinct().count();
	}
//	public static int countUniqueCharacters(String input) {
//	    String buffer = "";
//	    for (int i = 0; i < input.length(); i++) {
//	        if (!buffer.contains(String.valueOf(input.charAt(i)))) {
//	            buffer += input.charAt(i);
//	        }
//	    }
//	    return buffer.length();
//	}
}
