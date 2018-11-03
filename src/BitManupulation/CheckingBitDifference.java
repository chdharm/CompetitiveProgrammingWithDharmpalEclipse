package BitManupulation;
import java.util.*;
import java.lang.*;
import java.io.*;
public class CheckingBitDifference {

	public static void main (String[] args)
	 {
	  Scanner scan=new Scanner(System.in);
	  int t=scan.nextInt();
	  while((t--)>0){
	      int a=scan.nextInt();
	      int b=scan.nextInt();
	      if(b>a){
	          a=(a+b)-(b=a);
	      }
	      int differ=0;
	      while(a>0){
	          if(b>0){
	              if((a&1)!=(b&1)){
	                  differ++;
	              }
	              b=b>>1;
	          }else{
	             differ++; 
	          }
	          a=a>>1;
	      }
	      System.out.println(differ);
	  }
	 }
}
