package recursion;
import java.util.*;
public class IsArraySortedRecursion {
    public static void main(String args[]) {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        int [] arr=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=scan.nextInt();
        }
        System.out.println(checkSorted(arr,1,num-1));
    }
    
    public static boolean checkSorted(int [] arr,int be,int en){
        if(be>en){
            return true;
        }
        if(arr[be]>arr[en]){
            return false;
        }
        if(arr[be-1]>arr[be]){
            return false;
        }
        return checkSorted(arr,be+1,en);
        
    }
}