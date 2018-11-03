import java.util.*;
import java.lang.*;

class ArraySubSpoj
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
	   Scanner scan=new Scanner(System.in);
	   int n=scan.nextInt();
	   int arr[]=new int[n];
	   for(int i=0;i<n;i++){
	   	arr[i]=scan.nextInt();
	   }
	   int k=scan.nextInt();
	   
	   for(int i=0;i<=n-k;i++){
	   	int max=arr[i];
           for(int j=i;j<i+k;j++){
           	  if(arr[j]>max){
           	  	max=arr[j];
           	  }
           }
	   	   System.out.print(max+" ");
	   }
		
	}
}