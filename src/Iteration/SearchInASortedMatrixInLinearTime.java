package Iteration;
import java.util.*;
public class SearchInASortedMatrixInLinearTime {
	public static void main(String [] args){
		Scanner scan=new Scanner(System.in);
		int size=scan.nextInt();
		int arr[][]=new int[size][size];
		for(int i=0;i<size;i++){
			for(int j=0;j<size;j++){
				arr[i][j]=scan.nextInt();
			}
		}
		int num=scan.nextInt();
		System.out.println(search(arr,num,size-1,size-1,0));
	}
	public static boolean search(int arr[][],int num,int range,int be,int en){
		while(be>=0&&range>=en){
			if(arr[be][en]==num){
				return true;
			}
			if(arr[be][en]>num){
				be--;
			}
			if(arr[be][en]<num){
				en++;
			}
		}
		return false;
		
	}
}
