package recursion;
import java.util.*;
public class MaximuxNumber {
	public static void main(String [] args){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=scan.nextInt();
		}
		System.out.println(findMax(arr,0,arr.length-1));
	}
	
	public static int findMax(int [] arr,int be,int en){
		if(be==en)
			return arr[be];
		int first=arr[be];
		int second=findMax(arr,be+1,arr.length-1);
		if(first>second){
			return first;
		}
		else{
			return second;
		}
	}
}
