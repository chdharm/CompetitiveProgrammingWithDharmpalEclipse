import java.util.*;
////////////////public class PrintingPathsToLeafNode {
	int arr[]=new int[height()];
       //This function will take root of the tree and 
	public static void printLeafPath(Node root,int []arr,int i){
		if(root==null){
			return;
		}
		arr[i++]=root.data;
		printLeafPath(root.left,arr,i);
		
	}
}
