package recursion;
import java.util.*;

public class LinearRecursion {

	public static void main(String [] artgs){
		Scanner scan=new Scanner(System.in);
		int size=scan.nextInt();
		int [] arr=new int[size];
	    for(int i=0;i<size;i++){
	    	arr[i]=scan.nextInt();
	    }
	    int num=scan.nextInt();
	    int be=0;
	    int en=size-1;
	    System.out.println(linearSearch(arr,num,be,en));
	}
	
	public static boolean  linearSearch(int [] arr,int num,int be ,int en){
		if(be>en){
			return false;
		}
		if(arr[be]==num){
			return true;
		}
		return linearSearch(arr,num,be+1,en);	
	}
	
}
