import java.util.*;

class Node{
	int data;
	Node left;
	Node right;
	Node(int d){
		data=d;
		left=null;
		right=null;
	}
}
public class BST {
       Node root;
	
	public static Node takeInput(int total){
		if(total<=0){
			return null;
		}
		Scanner scan=new Scanner(System.in);
		Node root=new Node(scan.nextInt());
		total--;
		int next=scan.nextInt();
		if(next>=root.data){
			root.left=new N
		}
		
	}
	
	
	
	public static void main(String [] args){
		Scanner scan=new Scanner(System.in);
		int total=scan.nextInt();
		Node root=takeInput(total);
		int num=scan.nextInt();
		int num2=scan.nextInt();
		Node LCA=getLCA(root,num,num2);
		if(LCA!=null){
			System.out.println(LCA.data);
		}
	}
	
	
	
	public static Node getLCA(Node root,int n1,int n2){
		if(root==null){
			return null;
		}
		
		 if(root.data>n1&&root.data>n2){
			return getLCA(root.left,n1,n2);
		}
		 if(root.data<n1&&root.data<n2){
			 return getLCA(root.right,n1,n2); 
		 }
		 return root;
	}
}
