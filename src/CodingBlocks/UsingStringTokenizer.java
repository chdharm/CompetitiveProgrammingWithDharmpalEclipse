package CodingBlocks;
import java.util.*;
public class UsingStringTokenizer {
	public static void main(String [] args){
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		StringTokenizer stk=new StringTokenizer(str," ,");
		int count=0;
		while(stk.hasMoreTokens()){
			count++;
			System.out.println(stk.nextToken()+"     The token number is:"+count);
		}
		System.out.println(str);
	}
}
