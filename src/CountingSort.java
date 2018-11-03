import java.util.*;
////////////////////public class CountingSort {
    public static void main(String args[]) {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        int arr[]=new int[t];
        for(int i=0;i<t;i++){
           arr[i]=scan.nextInt(); 
         }
        int max=arr[0];
        int min=arr[0];
        for(int i=1;i<t;i++){
        	 if(arr[i]>max){
                 max=arr[i];
             }
             if(arr[i]<min){
                 min=arr[i];
             }
        }
        System.out.println("Min:"+min +"and Max:"+max);
        int count[]=new int[max-min+1];
        for(int i=0;i<t;i++){
            count[arr[i]-min]++;
        }
       for(int i=0;i<t;i++){
          System.out.print(arr[i]+" " ); 
          }
        System.out.println();
        for(int i=0;i<max-min+1;i++){
          System.out.println(count[i] ); 
          }
        for(int i=0;i<max-min+1;i++){
        	while(count[i]>0){
        		System.out.print(arr[i]+" ");
        	}
        }
        
    }
}
