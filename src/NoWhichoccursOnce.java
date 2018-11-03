import java.util.Scanner;

,,,,,,,,,,,,,,,,,,,,public class NoWhichoccursOnce {

	
	
	
	public static void main(String [] args){
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		int arr[]=new int[N];
		for(int i=0;i<N;i++){
			arr[i]=scan.nextInt();
		}
		int single=arr[0];
		for(int i=1;i<N;i++){
			single=single^arr[i];
		}
		System.out.println(single);
	}
}
