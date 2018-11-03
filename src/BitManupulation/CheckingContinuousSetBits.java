package BitManupulation;
import java.util.Scanner;

public class CheckingContinuousSetBits {
	public static void main (String[] args){
	  Scanner scan=new Scanner(System.in);
	  int t=scan.nextInt();
	  while((t--)>0){
	      int tMax=0;
	      int n=scan.nextInt();
	      int localMax=0;
	      while(n>0){
	    	  //System.out.println("printing value of n="+n);
	          if((n&1)==1){
	             localMax++;
	             if(tMax<localMax){
	            	 tMax=localMax;
	             }
	          }else{
	        	  //System.out.println("hello");
	              if(tMax<localMax){
	            	  //System.out.println("hi");
	                  tMax=localMax;
	              }
	              localMax=0;
	          }
	          //System.out.println("The current tMax="+tMax+" and current localMax="+localMax);
	          n=n>>1;
	      }
	      System.out.println(tMax);
	  }
	  scan.close();
	}
}
