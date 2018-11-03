import java.util.*;
class CountBotol{
//	static int max=0;
	static int arr[]={2,3,5,1,4};
	public static void main(String [] args){
		int size=arr.length;
		Scanner scan=new Scanner(System.in);
	    int year=1;
	    System.out.println(countBotol(0,size,year));
	}
	
	
	public static int countBotol(int be,int en,int current){
		if(be>en){
			return 0;
		}
	//	if(be==en){
	//		return arr[be]*current;
	//	}
   int 	max=Math.max(current*arr[en]+countBotol(be,en-1,current+1),current*arr[be]+countBotol(be+1,en,current+1));
	return max;
	}
}