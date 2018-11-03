import java.util.*;
            ////// public class CelebrityProblem {

	
	public static void main(String [] args){
		Scanner scan=new Scanner(System.in);
		int ele=scan.nextInt();
		int [] arr=new int[ele];
		for(int i=0;i<ele;i++){
			arr[i]=scan.nextInt();
		}
		int [] check=new int[ele];
		int currentMax=arr[ele-1];
		check[ele-1]=-1;
		for(int i=ele-1;i>0;i--){
			if(arr[i-1]<arr[i]){
				check[i-1]=arr[i];
			}else{
				if(currentMax>arr[i-1]){
					check[i-1]=check[i];
				}else{
					currentMax=arr[i-1];
					check[i-1]=-1;
				}
				//check[i-1]=check[i];
				
			}
		}
		for(int i=0;i<ele;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i=0;i<ele;i++){
			System.out.print(check[i]+" ");
		}
		
		
	}
}
