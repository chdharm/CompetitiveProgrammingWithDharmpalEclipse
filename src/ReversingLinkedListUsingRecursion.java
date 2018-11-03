//But on Hacker blocks I didn't use reverse so I have in this way

import java.util.*;
//////////////////public class ReversingLinkedListUsingRecursion {
   
	public static Stack stack=new Stack();
	public static void main(String [] args){
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		
		while((num--)>0){
			stack.push(scan.nextInt());
		}
		while(stack.empty()==false){
			System.out.println(stack.pop());
		}
		/*reverse();
		while(stack.empty()==false){
			System.out.println(stack.pop());
		}
		*/
	}
	
	public static void reverse(){
		if(stack.empty()==true){
			return;
		}
		int temp=(int) stack.pop();
		reverse();
		pushBack(temp);
		
	}
	public static void pushBack(int temp){
		if(stack.empty()==true){
			stack.push(temp);
			return;
		}
		int temp2=(int) stack.pop();
		pushBack(temp);
		stack.push(temp2);
	}
}
