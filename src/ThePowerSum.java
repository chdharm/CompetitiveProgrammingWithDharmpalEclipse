import java.util.*;
public class ThePowerSum {
    public static int count=0;
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        //System.out.println(num);
        int power=scan.nextInt();
        int size=0;
        int i=1;
        while(Math.pow(i,power)<=num){
            i++;
            size++;
        }
        int [] arr=new int [size];
        for(i=0;i<size;i++){
            arr[i]=(int)Math.pow(i+1,power);
        }
        Arrays.sort(arr);
       // for(i=0;i<size;i++){
        //    System.out.println(arr[i]);
       // }
        //System.out.println(num+"num");
        System.out.println(findCount(arr,num,0,size-1));
        
    }
    static int findCount(int [] arr,int num,int be,int en){
       if(be>en){
    	   System.out.println("hii");
           return count;
       }
       if(arr[be]==num){
           count++;
         findCount(arr,num,be+1,en); 
       }
        if(arr[be]==num){
         count++;
         findCount(arr,num,be,en-1);
       }
       if(arr[be]+arr[en]>num){
    	   //System.out.println("count +>"+count);
           findCount(arr,num,be,en-1);
       }
       if(arr[be]+arr[en]<num){
    	   //System.out.println("count +<"+count);
           findCount(arr,num,be+1,en);
       }
       if(arr[be]+arr[en]==num){
    	   count++;
           findCount(arr,num,be+1,en);
       }
       //System.out.println("count outside"+count);
        return count;
    }
}