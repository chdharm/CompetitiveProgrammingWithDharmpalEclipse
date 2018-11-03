package CodingNinja;
import java.util.*;
public class SumOrProduct {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
       int number=scan.nextInt();
       int choice=scan.nextInt();
       long result=0;
       if(choice==1){
         result=0;
         for(int i=1;i<number+1;i++){
           result+=i;
         }
         
       }
      else if(choice==2){
         result=1;
         for(int i=1;i<number+1;i++){
           result*=i;
         }
         
       }
      if(choice==1||choice==2)
        System.out.println(result);
      else
        System.out.println(-1);

	}
}
