import java.util.*;
/.....................public class TreeUsingPreorderAndInorder {

	
	
	public static void main(String [] args){
		Scanner scan=new Scanner(System.in);
		int size=scan.nextInt();
		int [] pre=new int[size];
		int [] ino=new int[size];
		for(int i=0;i<size;i++){
			pre[i]=scan.nextInt();
		}
		for(int i=0;i<size;i++){
			ino[i]=scan.nextInt();
		}
		Node root=constuctTree(pre,in,size);
	}
	
	public static Node constructTree(int pre[],int in[],int size,int start){
		Node root=new Node(pre[start]);
		if(start==size){
			return null;
		}
		int i=0;
		while(in[i++]!=root.data){
			
		}
		constructTree(pre,int[],);
	}
}
