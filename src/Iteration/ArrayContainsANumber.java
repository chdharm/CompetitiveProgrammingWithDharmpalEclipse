package Iteration;
import java.util.*;
public class ArrayContainsANumber {

	
	public static void main(String [] args){
		Scanner scan=new Scanner(System.in);
		int size=scan.nextInt();
		int [] arr=new int[size];
		for(int i=0;i<size;i++){
			arr[i]=scan.nextInt();
		}
		int search=scan.nextInt();
        for(int i=0;i<size;i++){
        	if(arr[i]==search){
        		System.out.println("Yes,we got it.");
        		return;
        	}
        }
        System.out.println("No,we didn't get it.");
	}
}
