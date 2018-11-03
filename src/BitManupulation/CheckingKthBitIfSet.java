package BitManupulation;
import java.util.*;
import java.lang.*;
import java.io.*;
public class CheckingKthBitIfSet {
	public static void main (String[] args)
	 {
	  Scanner scan=new Scanner(System.in);
	  int t=scan.nextInt();
	  while((t--)>0){
	      int n=scan.nextInt();
	      int pos=scan.nextInt();
	      System.out.println(pos);
	      int mask=(int)Math.pow(2,pos);
	      System.out.println(mask);
	      if((mask&n)>0)
	        System.out.println("Yes");
	      else
	        System.out.println("No");
	  }
	 }
}