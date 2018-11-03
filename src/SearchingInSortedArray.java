
import java.util.*;
public class SearchingInSortedArray {
	
	public int binarySearchRotated(int [] arr,int be,int en,int key){
		if(be>en){
			return -1;
		}
		//Check if array is sorted
		if(arr[be]<arr[en]){
			/*Then we will apply same binary search algo*/
			int range=en-be;
			int middle=range+be;
			if(key==arr[middle]){
				return middle; 
			}else if(key>arr[middle]){
				return binarySearchRotated(arr,middle+1,en,key);
			}else{
				return binarySearchRotated(arr,be,middle-1,key);
			}
		}else{//Array is not sorted
			int range=en-be;
			int middle=range/2+be;
			if(arr[middle]>arr[en]){//left side is sorted
				
			}else{//right side is sorted
				
			}
		}
	}

	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int arr[]=new int[n];
		for(int i=0; i<n;i++){
			arr[i]=scan.nextInt();
		}
		int key=scan.nextInt();
		SearchingInSortedArray obj=new SearchingInSortedArray();
		int result=obj.binarySearchRotated(arr,0,n-1,key);
		if(result==-1){
			System.out.println("Element not found");
		}else{
			System.out.println("Element is found at index :"+result);
		}
		
		scan.close();
	}
}
