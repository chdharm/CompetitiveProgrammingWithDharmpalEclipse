import java.util.Scanner;
import java.util.*;
//Node Implementation
//class Node{
  //These are the Node data
 public  int data;
 public Node next;
 
 //constructor for Node executed when only Data passed
  public Node(int data){
      this.data=data;
      next=null;
  }
  //constructor for Node executed when data and nextNode both passed
  public Node(int data,Node next){
      this.data=data;
      this.next=next;
  }
  	//method for setting data value
	public void setData(int data){
		this.data=data;
	}
	//method for getting data value
	public int getData(){
		return data;
	}
	//method for setting node next reference 
	public void setNext(Node next){
		this.next=next;
	}
	//method for getting node next reference 
	public Node getNext(){
		return this.next;
  
}
}

//LinkedList Implementation
//class LinkedList{
 
//Method for taking Input for LinkedList
 public static Node takeInput(){
  Node head=null;;
  Scanner scan=new Scanner(System.in);
   while(scan.hasNextInt()){
    int newData=scan.nextInt();
    if(newData==-1){
       break; 
    }
   head= addToBack(head,newData);
 }
 return head;
 }
//method for adding Node to the front of LinkedList  
public static Node addToFront(Node head,int newData){
    Node temp;
	  if(head==null){
        return new Node(newData);
    }
   
        temp=head;
        head=new Node(newData);
        head.next=temp;
        return head;
     }  

//method for adding Node to the back of LinkedList  
public static Node addToBack(Node head,int newData){
	  if(head==null){
		  return new Node(newData);
	  }
     Node temp=head;
     while(temp.next!=null){
  	   temp=temp.next;
     }
     temp.next=new Node(newData);
     return head;
     }

}

public class KthElementFromLast {
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    Node head=LinkedList.takeInput();
    Node temp=head;
    
   /* 
    while(temp.next!=null){
  	  System.out.print(temp.data+"----->");
  	  temp=temp.next;
    }
    System.out.println(temp.data+"-->||");
    
    */
    Node temp1=head;
    int fromLast=scan.nextInt();
    Node temp2=head;
    while(temp2!=null&&fromLast!=0){
  	  fromLast--;
  	  //System.out.print(temp2.data+" ");
  	  temp2=temp2.next;
    }
    while(temp2!=null){
  	  temp2=temp2.next;
  	  temp1=temp1.next;
    }
    System.out.println(temp1.data);
    
  
  }
}