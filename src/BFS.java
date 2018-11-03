import java.util.*;
public class BFS {
   	public static void BFPrint(Node root){
		if(root==null){
			return;
		}
		if((root.left)!=null){
			enque(root.left);
		}
		if((root.right)!=null){
			enque(root.right);
		}
		System.out.println(top);
		dequeue(top);
		BFPrint(top);
	}
	
}
