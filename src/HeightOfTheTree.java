import java.util.*;
////////////////public class HeightOfTheTree {
    
	public static int height(Node root){
		if(root==null){
			return 0;
		}
		int height=Math.max(height(root.left),height(root.right))+1;
		return height;
	}
	
}
