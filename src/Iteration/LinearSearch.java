package Iteration;
import java.util.*;
public class LinearSearch {

	
	public static void main(String [] args){
		Scanner scan=new Scanner(System.in);
		int size=scan.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++){
			arr[i]=scan.nextInt();
		}
		int num=scan.nextInt();
		System.out.println(linearSearch(arr,num));
	}
	
	public static boolean linearSearch(int [] arr,int num){
		int size=arr.length;
		for(int i=0;i<size;i++){
			if(arr[i]==num){
				return true;
			}
		}
		return false;
	}
}
