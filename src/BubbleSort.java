import java.util.*;
public class BubbleSort {
	public static void main(String [] args){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=scan.nextInt();
		}
		for(int i=0;i<n-2;i++){
			for(int j=0;j<n-2;j++){
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=arr[j];
				}
			}
		}
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+"   ");
		}
		
	}
}
