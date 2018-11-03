/////////////import java.util.Scanner;
///////////////////////public class FoundAlIndices {
   
	static int z=0;
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		int[] arr=new int[N];
		for(int i=0;i<N;i++){
			arr[i]=scan.nextInt();
		}
		int num=scan.nextInt();
		int be=0;
		int [] out=new int[N];
		out=foundat(arr,num,be,N-1,out);
		for(int i=0;i<N;i++){
			System.out.println(out[i]);
		}
	}
	
	public static int[] foundat(int [] temp,int num,int be,int en,int temp2[]){
		if(be>en){
			return temp2;
		}
		if(be==en){
			if(temp[be]==num){
				temp[z]=be;
				z++;
				return temp2;
			}
			else
				return temp2;
		}
		if(temp[be]==num){
			temp[z]=be;
			z++;
			return foundat(temp,num,be+1,en,temp2);
		}
		else{
			return foundat(temp,num,be+1,en,temp2);
		}
	}	
}
