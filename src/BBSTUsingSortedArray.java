import java.util.*;
public class BBSTUsingSortedArray {
       
	
	
	public static Node createBBST(int [] arr, int be, int last){
		//Node emp=null;
		if(be==last){
			
			return new Node(arr[be]);
		}
		int add=last+be;
		int mid=(add%2==0)?add/2:(add/2)+1;
		Node temp=new Node(mid);
		temp.left=createBBST(arr,be,mid-1);
		temp.right=createBBST(arr,mid+1,last);
	}
}
