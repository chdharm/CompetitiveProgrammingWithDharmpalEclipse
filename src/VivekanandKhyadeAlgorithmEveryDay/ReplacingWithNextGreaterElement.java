package VivekanandKhyadeAlgorithmEveryDay;
import java.util.*;
public class ReplacingWithNextGreaterElement {
	//Input : 3,4,20,6,15,2,1,7
	//Output: 20,20,20,15,15,7,7,7
	public static void main(String [] args){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=scan.nextInt();
		}
		printAll(arr);
		int[] res=replaceAllWithNextGreater(arr);
		printAll(res);
	}
	public static int[] replaceAllWithNextGreater(int [] arr){
		int l=arr.length;
		int max=arr[l-1];
		for(int i=l-1;i>=0;i--){
			max=Math.max(arr[i], max);
			arr[i]=Math.max(arr[i], max);
		}
		return arr;
	}
	public static void printAll(int [] arr){
		int l=arr.length;
		System.out.println("Printing array elements:");
		for(int i=0;i<l;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
