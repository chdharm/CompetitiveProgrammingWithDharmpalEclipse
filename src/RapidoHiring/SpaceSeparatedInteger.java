package RapidoHiring;
import java.util.*;
public class SpaceSeparatedInteger {

	public static void main(String [] args[]){
		Scanner scan=new Scanner(System.in);
		String input=scan.next();
		//System.out.println(input);
		//System.out.println(input.chars().distinct().count());
		System.out.println(countUniqueCharacters(input));
	}
	public static int countUniqueCharacters(String input) {
	    String buffer = "";
	    for (int i = 0; i < input.length(); i++) {
	        if (!buffer.contains(String.valueOf(input.charAt(i)))) {
	            buffer += input.charAt(i);
	        }
	    }
	    return buffer.length();
	}
}
