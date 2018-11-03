import java.util.*;
public class LargestString {

    static int index=0;	
	public static void main(String [] args){
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		String arr[]=new String[N];
		for(int i=0;i<N;i++){
			arr[i]=scan.next();
			//System.out.println(arr[i]);
		}
		//int max=arr[0].length();
		//index=0;
		//int be=1;
		int index=comp(arr,N);
		System.out.println(index+"  "+arr[index]);
		
	}
	
	static int comp(String[] temp,int size){
		int max=0;
    for(int i=1;i<size;i++){
	      if(temp[max].length()<temp[i].length()){
	    	  max=i;
	      }
      }
    return max;
	}
	
}
