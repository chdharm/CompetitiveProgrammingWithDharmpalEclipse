import java.util.*;
public class WaveSort {
	public static void main(String [] args){
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		int [] arr=new int[N];
		for(int i=0;i<N;i++){
			arr[i]=scan.nextInt();
		}
 for(int i=0;i<N-1;i++){
	 int temp=i+1;
	 for(int j=i+1;j<N;j++){
		 if(arr[temp]>arr[j])
			 temp=j;
	 }
	 if(arr[i]>arr[temp]){
		 int swap=arr[i];
		 arr[i]=arr[temp];
		 arr[temp]=swap;
	 }
 }
for(int i=0;i<N-1;i=i+2){
      int aux=arr[i];
      arr[i]=arr[i+1];
      arr[i+1]=aux;
}
for(int i=0;i<N;i++){
	System.out.print(arr[i]+" ");
}
 
 
 
	}
	
	
}
