package recursion;
import java.util.*;
public class FindNumberOccurOddNumberOfTimesRecursion {
	public static void main(String [] args){
		   Scanner scan=new Scanner(System.in);
		   int total=scan.nextInt();
		   int [] arr=new int [total];
		   for(int i=0;i<total;i++){
			  arr[i]=scan.nextInt();
		   }
		   System.out.println(oddOccur(arr,0,total-1));
	}
	public static int oddOccur(int [] arr,int be,int en){
		if(be==en)
			return arr[be];
		return arr[be]^oddOccur(arr,be+1,en);
	}
}
