package recursion;
import java.util.*;
public class BinarySearchRecursion {

	
	public static void main(String [] args){
		Scanner scan=new Scanner(System.in);
		int size=scan.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++){
			arr[i]=scan.nextInt();
		}
		int num=scan.nextInt();
		int be=0;
		int en=size-1;
		System.out.println(binarySearch(arr,num,be,en));
	}
	
	public static boolean binarySearch(int[] arr,int num,int be,int en){
		int range=en-be;
		if(be>en){
			return false;
		}
		if(arr[be]>arr[en]){
			System.out.println("Array is not sorted");
			return false;
		}
		int mid=range/2+be;;
		if(arr[mid]==num){
			return true;
		}else if(arr[mid]>num){
			return binarySearch(arr,num,be,mid-1);
		}else{
			return binarySearch(arr,num,mid+1,en);
		}
	}
}
