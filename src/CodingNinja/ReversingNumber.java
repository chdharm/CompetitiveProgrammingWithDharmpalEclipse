package CodingNinja;
import java.util.*;
public class ReversingNumber {
	
		public static void main(String[] args) {
			Scanner scan=new Scanner (System.in);
			int num=scan.nextInt();
			scan.close();
			int result=0;
			while(num>0){
	        result=result*10+num%10;
	        num/=10;
	      }
	      System.out.println(result);
		}
	}

