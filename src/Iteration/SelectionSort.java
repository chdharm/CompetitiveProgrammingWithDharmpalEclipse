package Iteration;
import java.util.*;
public class SelectionSort {

	public static void main(String [] args){
		Scanner scan=new Scanner(System.in);
		int size=scan.nextInt();
		int [] arr=new int[size];
		for(int i=0;i<size;i++){
			arr[i]=scan.nextInt();
		}
		arr=selectionSort(arr);
	}
	public static int[] selectionSort(int [] arr){
		int size=arr.length;
		for(int i=0;i<size-2;i++){
			int max=0;
			for(int j=i+1;j<size-1;j++){
				if(arr[j]>max)
					 max=arr[j];
			}
			if(max>arr[i]){
				arr[i]=(max+arr[i])-(max=arr[i]);
			}
		}
		return arr;
	}
}
