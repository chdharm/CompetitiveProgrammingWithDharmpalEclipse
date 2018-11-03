import java.util.*;
public class oddEvenUR {
      
	
	public static void main(String [] args){
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		dec(N);
		//System.out.println("now Even");
		inc(N,1);
	}
	
	public static void dec(int num){
		if(num==0){
			//System.out.println("0");
			return;
		}
		if((num%2)!=0){
			System.out.println(num);
			dec(num-1);
		}else{
			dec(num-1);
		}
	}
	
	public static void inc(int num,int be){
       if(be==num){
    	  if((be%2)==0){
    		  System.out.println(be);
    		  return;
    	  }else{
    		  return;
    	  }
       }
 	  if((be%2)==0){
		  System.out.println(be);
		  inc(num,be+1);
	  }else{
		  inc(num,be+1);
	  }
	}
	
}
