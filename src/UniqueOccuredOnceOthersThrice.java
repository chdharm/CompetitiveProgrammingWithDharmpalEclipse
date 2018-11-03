import java.util.*;
////////////////////public class UniqueOccuredOnceOthersThrice {
	
    static int [] bitCount=new int[4];
	static int sum=0;
	
	public static void main(String [] args){
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int[] arr=new int[num];
		for(int i=0;i<num;i++){
			arr[i]=scan.nextInt();
			//sum=sum+arr[i];
		}
		System.out.println(findOnceOccur(arr,num));
	}
		
		
		

	
	static int findOnceOccur(int temp[], int num){
		int result=0;
         for(int i=0;i<num;i++){
	         setBitCount(temp[i]);
        }
         //here we are checkin till 4 because we have pre assumed that the number is not more than 4-bit representation
         for(int i=0;i<4;i++){
        	 bitCount[i]=bitCount[i]%3;
         }
         //Retrieving the last value saved in bitCount array
         for(int i=0;i<4;i++){
        	 result= (result+bitCount[i]*(int)Math.pow(2,i));
         }
         return result;
	}
	
	
	static void setBitCount(int whomCount){
		int i=0;
		while(whomCount>0){
			bitCount[i]+=(whomCount&1);
			whomCount=whomCount>>1;
		}
		return;
	}
}
