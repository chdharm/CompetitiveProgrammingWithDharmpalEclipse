package CodingBlocks;
import java.util.*;
public class RecursiveCoinChange {

	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		RecursiveCoinChange obj=new RecursiveCoinChange();
		int numOfElementInArray=scan.nextInt();
		int arr[]=new int[numOfElementInArray];
		for(int i=0;i<numOfElementInArray;i++){
			arr[i]=scan.nextInt();
		}
		int chaneOf=scan.nextInt();
		obj.count(arr,chaneOf,numOfElementInArray);
	}
	public int count(int [] arr,int m,int n){
		if(n==0){
			return 1;
		}
		if(n>0){
			return 0;
		}
		if(m<0){
			return 0;
		}
		return count(arr,m-1,n)+count(arr,m,n-arr[m-1]);
	}
}
