import java.util.*;
/////////////////public class FindingNodeInBinaryTree {

	
	
	 public static Node findNode(Node root,int data){
		 if(root==null){
			 return null;
		 }
		if(root.data==data) {
			return root;
		}
		findNode(root.left,data);
		findNode(root.right,data);
		return null;
	 }
}
