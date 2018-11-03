import java.util.*;
public class BubbleSortUsingLinkedList {
	  
	 
//method for bubble sort of LinkedList which will take head node and length as parameter	
	public static void sort(Node temp,int length){
		
		/*This is for reusing the ListLength of the Node class
		Node.ListLength(temp);
		*/
		
		for(int i=0;i<length-1;i++){
            while((temp.next.next)!=null){
            	if((temp.data)>(temp.next.data)){
            		head=temp.next;
            		temp.next=temp.next.next;
            		temp.next.next=temp;
            		
            		
            	}
            	temp=temp.next;
            }
		}
		
		Node tempForP=head;
		while(tempForP!=null){
			System.out.println(tempForP.data);
			tempForP=tempForP.next;
		}
		
	}
	
//Here we are going to write main method
	public static void main(String [] args){
		Scanner scan=new Scanner(System.in);
		
	}
	
}
