import java.util.Scanner;
public class MinMax {
   
	static int max=0;
	static int min=0;
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		int[] arr=new int[N];
		for(int i=0;i<N;i++){
			arr[i]=scan.nextInt();
		}
		max=arr[0];
		min=arr[0];
		for(int i=0;i<N;i++){
			if(arr[i]<min){
				min=arr[i];
			}
			if(arr[i]>max){
				max=arr[i];
			}			
		}
    System.out.println(max);
    System.out.println(min);		
	}
	
}