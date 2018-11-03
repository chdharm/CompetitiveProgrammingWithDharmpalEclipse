package BitManupulation;
import java.util.*;
import java.lang.*;
import java.io.*;
public class PowerOf2 {

	public static void main (String[] args)
	 {
	  Scanner scan=new Scanner(System.in);
	  int t=scan.nextInt();
	  int isTrue=1;
	  while((t--)>0){
		  isTrue=1;
	      int count=0;
	      int n=scan.nextInt();
	      while(n>0){
	          if((n&1)==1)
	            count++;
	            n=n>>1;
	           if(count>1){
	        	   isTrue=0;
	               break;
	           }
	      }
	      if(isTrue==0){
	    	  System.out.println("No");
	      }else{
	    	  System.out.println("Yes");
	      }
	  }
	 }
}
