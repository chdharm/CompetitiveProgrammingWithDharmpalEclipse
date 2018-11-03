package TechBoost;
import java.util.*;
public class Pangram {
	public static void main(String [] args){
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		int arr[]=new int[26];
		for(int i=1;i<str.length();i++){
			if(arr[str.charAt(i)-97]==0){
				arr[str.charAt(i)-97]=1;
			}
		}
		int matched=1;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==0){
				if(i+97==str.charAt(0)||i+97==str.charAt(0)+32){	
				}
				matched=0;
			}
		}
		if(matched==0){
			System.out.println("False");
		}
		else{
			System.out.println("True");
		}
	}
	
}
