package CodingNinja;
import java.util.*;
public class CreateSequenceRecursion {
	
	public static void main(String [] args){
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		printSequence(num);
	}
	public static void printSequence(int range){
		for(int i=1;i<=range;i++){
          if(isTrue(i)==true){
            System.out.println(i);
          }
        }
	}
  	public static boolean isTrue(int i){
       while(i>0){
         if(i%10!=2&&i%10!=5){
           return false;
         }
         i/=10;
       }
      return true;
    }

}