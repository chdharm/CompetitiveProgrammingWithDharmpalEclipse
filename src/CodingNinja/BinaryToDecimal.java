package CodingNinja;
import java.util.*;
public class BinaryToDecimal {
		public static void main(String[] args) {
		 Scanner scan=new Scanner(System.in);
	      int num=scan.nextInt();
	      decimal(num);

		}
	  	public static void decimal(int num){
	  	  //System.out.println(num);
	      int result=0;
	      int i=0;
	      while(num>0){
	    	  //System.out.println(i);
	        result+=((num&1)==1)?(Math.pow(2,i)):0;
	        //System.out.println(result);
	        //System.out.println(result);
	        num=num>>1;
	       System.out.println(num);
	        i++;
	      }
	      System.out.println(result	);
	    }
	}
