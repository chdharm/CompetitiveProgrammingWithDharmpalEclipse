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
   //Method for calculating length
   public static int length(Node head){
	   Node temp=head;
	   int length=0;
	   while(temp!=null){
		   length++;
		   temp=temp.next;
	   }
	   ///System.out.println(length);
	   return length;
   }
   
   
   //Method for implementing bubble sorting 
   public static Node sort(Node head,int length){
	   while((length--)>1){
		   
	   }
	   
	   
	   
	   
	   /*
	    if(length==1){
	    	return head;
	    }
	    Node temp1;
	    Node temp2;
	    Node temp3;
	    if(length==2){
            if(head.data<head.next.data){
            	return head;
            }else{
            	temp1=head;
            	head=head.next;
            	head.next=temp1;
            	temp1.next=null;
            	return head;
            }
	    }
	   
		for(int i=0;i<length-1;i++){
			 temp1=head;
			    temp2=head.next;
			    temp3=temp2.next;
             while(temp3!=null){
            	 if(temp2.data>temp3.data){
            		 temp1.next=temp3;
            		 temp2.next=temp3.next;
            		 temp3.next=temp2;
            		 temp3=temp2.next;
            		 
            	 }
            	 temp1=temp1.next;
            	 temp2=temp1.next;
             }
             if(temp2.data>temp3.data){
            	 temp3=temp1.next;
            	 temp1.next=temp2.next;
            	 temp2.next=null;
             }
           
		}
		return head;
		*/
	}  
}


public class SortingUsingBubbleSort{
	public static void main(String [] args){
		Scanner scan=new Scanner(System.in);
		int size=scan.nextInt();
		Node head=LinkedList.takeInput(size);
		LinkedList.print(head);
		head=LinkedList.sort(head, size);
		LinkedList.print(head);
		
	}
}


