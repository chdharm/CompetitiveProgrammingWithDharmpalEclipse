package DP;
import java.util.*;
public class FibbonacciBottomUp {
	public static void main(String [] args){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		FibbonacciBottomUp obj=new FibbonacciBottomUp();
		System.out.println(obj.calFibonnaci(n));
	}
	public int calFibonnaci(int num){
		if(num==0||num==1){
			return num;
		}
		int [] arr=new int[num+1];
		arr[0]=0;
		arr[1]=1;
		for(int i=2;i<=num;i++){
			arr[i]=arr[i-1]+arr[i-2];
		}
		return arr[num];
	}
}
