package DP;
import java.util.*;
public class FibbonacciTopDown {
	static int arr[];
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		arr=new int[num+1];
		Arrays.fill(arr,-1);
		FibbonacciTopDown obj=new FibbonacciTopDown();
		System.out.println(obj.calFib(num));
		
	}
	
	public int calFib(int n){
		if(n<2){
			return n;
		}
		if(arr[n]!=-1){
			return arr[n];
		}else{
			arr[n]=calFib(n-1)+calFib(n-2);
			return arr[n];
		}
	}
}
