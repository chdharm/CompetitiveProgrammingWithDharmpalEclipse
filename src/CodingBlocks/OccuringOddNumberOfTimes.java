// We can do it using "Check count of all numbers and return whose count is odd"
//Or we can use hashtable for storing count corresponding to key().
//Or we can xor them to get the single occured number
package CodingBlocks;
import java.util.*;
public class OccuringOddNumberOfTimes {
	public static void main(String [] args){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int arr[]=new int[n];
		int i=0;
		while(i<n){
			arr[i]=scan.nextInt();
			i++;
		}
		OccuringOddNumberOfTimes obj=new OccuringOddNumberOfTimes();
		System.out.println(obj.oddOcuured(arr));
	}
	public int oddOcuured(int arr[]){
		int l=arr.length;
		int sum=arr[0];
		for(int i=1;i<l;i++){
			sum^=arr[i];
		}
		return sum;
	}
}
