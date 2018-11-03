import java.util.*;
public class RotateImage {
     
	public static void main(String [] args){
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		int arr[][]=new int[t][t];
		for(int i=0;i<t;i++){
			for(int j=0;j<t;j++){
				arr[i][j]=scan.nextInt();
			}
		}
		for(int j=t-1;j>=0;j--){
			for(int i=0;i<t;i++){
				System.out.print(arr[i][j]+" ");
			}
			
			
			
			System.out.println();
		}
	}
}
