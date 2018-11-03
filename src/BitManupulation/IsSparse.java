package BitManupulation;
import java.util.*;
public class IsSparse {
	public static boolean issparse(int num){
		//System.out.println("Inside issparse");
        int count=0;
        while(num>0){
            if((num&1)==1){
                if(count>=1){
                    return false;
                }
                count++;
            }
            num=num>>1;
        }
        //System.out.println(count);
        return true;
    }
	public static void main (String[] args)
	 {
	  Scanner scan=new Scanner(System.in);
	  int t=scan.nextInt();
	  while((t--)>0){
	      if(issparse(scan.nextInt())==false){
	          System.out.println(1);
	      }else{
	          System.out.println(0);
	      }
	  }
	 }
}
