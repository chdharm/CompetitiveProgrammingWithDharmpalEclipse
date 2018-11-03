import java.util.*;

public class ReplaceAll {
    // static int count=0;
    public static void main(String args[]) {
        Scanner scan=new Scanner(System.in);
        long num=scan.nextLong();
        if(num==0){
              System.out.println("5");
        } else       
             System.out.println(RTA(num));
        
        
    }
    static long RTA(long num){
        if(num==0){
               return 0;
        }
                if(num%10==0){
            return RTA(num/10)*10+5;
        }
        else{
            return RTA(num/10)*10+(num%10);
        }
        
    }
}