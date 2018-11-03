package CodingBlocks;
import java.util.*;
public class SumAsKInAArray {
	public static void main(String [] args){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=scan.nextInt();
		}
		int k=scan.nextInt();
		int i=0,j=n-1;
		while(i<j){
			if((arr[i]+arr[j])>k){
				j--;
			}else if((arr[i]+arr[j])<k){
				i++;
			}else{
				System.out.println("Elements are found---> First @: "+i+" and the Second @"+j);
				return;
			}
		}
		System.out.println("Not found");
	}
}
