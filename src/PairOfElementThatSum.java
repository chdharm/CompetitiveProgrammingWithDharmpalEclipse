import java.util.*;
public class PairOfElementThatSum {

	public static void main(String [] args){
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		int arr[]=new int[N];
		for(int i=0;i<N;i++){
			arr[i]=scan.nextInt();
		}	
	    Arrays.sort(arr);
	    int num=scan.nextInt();
	    int be=0;
	    checkSum(arr,num,be,N-1);
	
   }
	
	static void checkSum(int [] temp,int num,int be,int en){
		if(be>=en){
			return;
		}
		if(num>en){
			checkSum(temp,num,be,en-1);
		}
		if((temp[en]+temp[be])<num){
			checkSum(temp,num,be+1,en);
			
		}
		if((temp[en]+temp[be])>num){
			checkSum(temp,num,be,en-1);
			
		}
		if((temp[en]+temp[be])==num){
		    System.out.println(temp[en]+"---------------"+temp[be]);
		    return;
		}
		return;
	}
	
}