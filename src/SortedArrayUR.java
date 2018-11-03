import java.util.*;
public class SortedArrayUR {

	public static void main(String [] args){
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		int [] arr=new int[N];
		
		for(int i=0;i<N;i++){
			arr[i]=scan.nextInt();
		}
		System.out.println(checkS(arr,0,N-1));
	}
	
	public static boolean checkS(int [] temp,int be,int en){
		if(be==en){
			return true;
		}
		if(temp[be]<temp[be+1]){
			return checkS(temp,be+1,en);
		}
		else{
			return false;
		}
	}

}
