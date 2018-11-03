import java.util.*;
public class FoundAt {
   
	
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		int[] arr=new int[N];
		for(int i=0;i<N;i++){
			arr[i]=scan.nextInt();
		}
		int num=scan.nextInt();
		int be=0;
		System.out.println(foundat(arr,num,be,N-1));
	}
	
	public static int foundat(int [] temp,int num,int be,int en){
		if(be==en){
			if(temp[be]==num)
				return be;
			else
				return -1;
		}
		if(temp[be]==num){
			return be;
		}
		else{
			return foundat(temp,num,be+1,en);
		}
	}
	
}
