import java.util.*;
................public class IncredibleHulk{
    public static void main(String args[]) {
     Scanner scan=new Scanner(System.in);
     int t=scan.nextInt();
     while((t--)>0){
         int num=scan.nextInt();
        printS(num);
     }
    }
    public static void printS(int num){
    	if(num<=0){
    		System.out.println(num);
    		return;
    	}
        int count=0;
        int i=0;
        //if((1<<i))
        while((1<<i)<=num){
            i++;
        }
        count=1+(num-(1<<(i-1)));
        System.out.println(count);
    }
}
