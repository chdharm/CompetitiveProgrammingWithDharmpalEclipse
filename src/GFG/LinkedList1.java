package GFG;
import java.util.*;

import GFG.LinkedList.Node;
class LinkedList {

	Node head;
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
		}
	}
}
public class LinkedList1 {
	
	public static void main(String [] args){
		Scanner scan=new Scanner(System.in);
		LinkedList llist=new LinkedList();
		llist.head=new Node(10);
		Node second=new Node(20);
		Node third=new Node(30);
		second.next=third;
		llist.head.next=second;
		//Printing all elements of the LinkedList
		Node temp=llist.head;
		while(temp!=null){
			System.out.print(temp.data+"-->");
			temp=temp.next;
		}
	}
}
