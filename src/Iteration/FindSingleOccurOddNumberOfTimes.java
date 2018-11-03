package Iteration;
import java.util.Scanner;
public class FindSingleOccurOddNumberOfTimes {
	public static void main(String [] args){
		   Scanner scan=new Scanner(System.in);
		   int total=scan.nextInt();
		   int [] arr=new int [total];
		   int result=0;
		   for(int i=0;i<total;i++){
			   result=result^scan.nextInt();
		   }
		   System.out.println(result);
	   }
}
