package recursion;
import java.util.*;
public class ArrayContainsANumberUsingRecursion {

	public static void main(String [] args){
		Scanner scan=new Scanner(System.in);
		int size=scan.nextInt();
		int []arr=new int[size];
		for(int i=0;i<size;i++){
			arr[i]=scan.nextInt();
		}
		int num=scan.nextInt();
		System.out.println(isContains(arr,num,0,size-1));
	}
	
	public static boolean isContains(int [] arr, int num,int be,int en){
		if(be>en){ 
			return false;
		}
		if(arr[be]==num){
			return true;
		}
		return isContains(arr,num,be+1,en);
	}
}
