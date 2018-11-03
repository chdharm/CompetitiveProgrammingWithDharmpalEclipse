 import java.util.*;
import java.util.Scanner;
class Node{
	public int data;
	public Node left;
	public Node right;
	

	public Node(int data){
		this.data=data;
		this.left=null;
		this.right=null;
	}
}

 class BinaryTree{
	 public Node root;
	 
	 public BinaryTree(int nodeData){
		 root=new Node(nodeData);
		 //this.root.data=nodeData;
		 root.left=null;
		 root.right=null;
	 }
	 //Method for taking input for the Tree from Input Console.
	public static Node takeInput(){
		Scanner scan=new Scanner(System.in);
		int data=scan.nextInt();
		if(data==-1){
			return null;
		}
		System.out.println("Test case 1");
		Node temp=new Node(data);
		System.out.println("Test case 3");
		temp.left=BinaryTree.takeInput();
		System.out.println("Test case 2");
		temp.right=BinaryTree.takeInput();
		return temp;	
	}
	//Method for taking input(Level wise) for the Tree from Input Console.	
	public static Node takeInputLevel(){
		Scanner scan=new Scanner(System.in);
		int data=scan.nextInt();
		if(data==(-1)){
			return null;
		}
		Node root=new Node(data);
		Queue<Node> q = new LinkedList<Node>();	
		q.add(root);
		while(q.isEmpty()==false){
			Node currentP=q.remove();
			int leftData=scan.nextInt();
			if(leftData!=-1){
				Node temp=new Node(leftData);
				currentP.left=temp;
				q.add(temp);
			}
			int rightData=scan.nextInt();
			if(rightData!=-1){
				Node temp=new Node(rightData);
				currentP.right=temp;
				q.add(temp);
			}
			
			
		}
		return root;
	}
	//Printing tree level wise
	public static void printLevel(Node root){
		Queue<Node> q=new LinkedList<>();
		q.add(root);
		q.add(null);
		while(q.isEmpty()==false){
			Node current=q.remove();
			if(current==null){
				System.out.println();
				if(q.isEmpty()==false){
					q.remove(null);
				}
				continue;
			}
			System.out.print(current.data+" ");
			if(current.left!=null){
				q.add(current.left);
			}
			if(current.right!=null){
				q.add(current.right);
				
			}
		}	
	}
	
	
	
//These three methods preorder, postorder and inorder are given for printing too.
	//Method for preorder traversal
	public static void preorder(Node root){
		if(root==null){
			return;
		}
		System.out.println(root.data);
		preorder(root.left);
		preorder(root.right);
	}
	//Method for postorder traversal	
	public static void postorder(Node root){
		if(root==null){
			return;
		}
		preorder(root.left);
		preorder(root.right);
		System.out.println(root.data);
	}
	//Method for inorder traversal	
	public static void inorder(Node root){
		if(root==null){
			return;
		}
		inorder(root.left);
		System.out.println(root.data);
		inorder(root.right);
	}
	
	//For counting number of nodes
	public static int count(Node root){
		if(root==null){
			return 0;
		}
		int leftCount=count(root.left);
		int rightCount=count(root.right);
		return leftCount+1+rightCount;
	}
	
//For getting the sum of nodes of tree
	public static int sumTree(Node root){
		if(root==null){
			return 0;
		}
		int leftsum=sumTree(root.left);
		int rightsum=sumTree(root.right);
		int sumToSend=leftsum+rightsum+root.data;
		root.data=leftsum+rightsum;
		return sumToSend;
	}
	
//Main method which will work for everything.
	public static void main(String [] args){
		//System.out.println("I love you");
		Node root=takeInput();
		//System.out.println("I love you");
		//preorder(root);
		//System.out.println("Number of nodes in Tree:"+count(root));
	}
}