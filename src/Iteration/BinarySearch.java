package Iteration;
import java.util.*;
public class BinarySearch {

	
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
       int mid=0;
       int range=0;
		while(be<=en){
	     range=en-be;
    	  mid=range/2+be;
    	  System.out.println("Mid:"+arr[mid]);
    	  if(arr[mid]==num){
    		  return true;
    	  }else if(arr[mid]>num){
    		  en=mid-1;
    	  }else{
    		  be=mid+1;
    	  }
    	  
       }
		return false;
	}
}
