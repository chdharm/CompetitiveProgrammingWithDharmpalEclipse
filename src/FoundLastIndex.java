import java.util.*;
public class FoundLastIndex {
   
	
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		int[] arr=new int[N];
		for(int i=0;i<N;i++){
			arr[i]=scan.nextInt();
		}
		int num=scan.nextInt();
		int be=0;
		System.out.println(foundLast(arr,num,be,N-1));
	}
	
	public static int foundLast(int [] temp,int num,int be,int en){
		if(be==en){
			if(en==num)
				return en;
			else
				return -1;
		}
		if(temp[en]==num){
			return en;
		}
		else{
			return foundLast(temp,num,be,en-1);
		}
	}
	
}
