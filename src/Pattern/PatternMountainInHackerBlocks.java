package Pattern;-
import java.util.*;
public class PatternMountainInHackerBlocks {
    public static void main(String args[]) {
       Scanner scan=new Scanner(System.in);
       int input=scan.nextInt();
       int in=0;
       int inner=2*input-1;
       for(int i=1;i<=input;i++){
           in=0;
           for(int j=1;j<=inner;j++){
               if(j<=input){
                  if(j<=i)
                      System.out.print((++in)+" ");
                  else{
                      System.out.print("  ");
                      ++in;
                  }
               }else{
            	   --in;
                   if(in<=i)
                       System.out.print((in)+" ");
                   else{
                       System.out.print("  ");
                       //--in;
                   }
               }
           }
           System.out.println();
       }
    }
}