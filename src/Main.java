import java.util.Scanner;
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
public static Node takeInput(int total){
Node head=null;;
Scanner scan=new Scanner(System.in);
 while((total--)>0){
  int newData=scan.nextInt();

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
//Method for printing LinkedList Element
public static void print(Node head){
	
	while(head.next!=null&&head!=null){
		System.out.print(head.data+" ");
		head=head.next;
	}
	System.out.println(head.data+"");
	return;
}

//Method for deleting given Index
   public static Node delIndex(Node head,int index){
	   if(index==0){
		  head=head.next;
		  return head;
	   }
	   Node temp1=head;
	   Node temp2=head;
	   while(temp1!=null&&(index--)>1){
		  temp1=temp1.next;
		  
	   }
	  
		   temp2=temp1.next;
		   
		   temp1.next=(temp2==null)?null:temp2.next;
		   return head;		   
	  

	   

   }

}
public class Main{
	public static void main(String [] args){
		Scanner scan=new Scanner(System.in);
		int total=scan.nextInt();
		int quer=scan.nextInt();
        if(total==0){
        	return;
        }
        
        Node head=LinkedList.takeInput(total);
		/*
        Node temp=head;
        while(temp.next!=null){
      	  System.out.print(temp.data+"----->");
      	  temp=temp.next;
        }
        System.out.println(temp.data+"-->||");
		*/
        //LinkedList.print(head);
        while((quer--)>0){
        	int index=scan.nextInt();
        	head=LinkedList.delIndex(head,index);
        	//LinkedList.print(head);
        	System.out.println();
        	
        }
	}
}